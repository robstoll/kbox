import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

buildscript {
    // needs to be defined in here because otherwise tutteli-publish plugin does not have this information when applied
    rootProject.version = "0.16.0-SNAPSHOT"
    rootProject.group = "ch.tutteli.kbox"
    rootProject.description = "A utility library for Kotlin "
}

plugins {
    kotlin("multiplatform") version "1.6.21"
    id("org.jetbrains.dokka") version "1.6.21"
    val tutteliGradleVersion = "4.2.1"
    id("ch.tutteli.gradle.plugins.dokka") version tutteliGradleVersion
    id("ch.tutteli.gradle.plugins.kotlin.module.info") version tutteliGradleVersion
    id("ch.tutteli.gradle.plugins.publish") version tutteliGradleVersion
    id("ch.tutteli.gradle.plugins.spek") version tutteliGradleVersion
    id("io.gitlab.arturbosch.detekt") version "1.20.0"
    id("org.sonarqube") version "3.4.0.2513"
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
}
val atriumVersion by extra("0.17.0-RC1")
val spekVersion by extra("2.0.15")

the<ch.tutteli.gradle.plugins.junitjacoco.JunitJacocoPluginExtension>()
    .allowedTestTasksWithoutTests.set(listOf("jsNodeTest"))

repositories { mavenCentral() }

kotlin {
    jvm {
        withJava()
        compilations.all {
            //TODO change to jdk 11 with 1.0.0
            kotlinOptions.jvmTarget = "1.6"
        }
    }
    js(LEGACY) { nodejs() }

    targets.all {
        compilations.all {

            kotlinOptions {
                //TODO change to 1.5 with 1.0.0
                // so that consumers of this library using 1.3 are still happy, we don't use specific features of 1.5
                apiVersion = "1.4"
                languageVersion = "1.4"

                //TODO activate again with 1.0.0
//                allWarningsAsErrors = true
            }
        }
    }

    sourceSets {
        val excludeKboxAndKotlin: ExternalModuleDependency.() -> Unit = {
            exclude(group = "ch.tutteli.kbox")
            exclude(group = "org.jetbrains.kotlin")
        }

        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation("ch.tutteli.atrium:atrium-fluent-en_GB-common:$atriumVersion", excludeKboxAndKotlin)
            }
        }
        val jvmMain by getting
        val jvmTest by getting {
            dependencies {
                implementation("ch.tutteli.atrium:atrium-fluent-en_GB:$atriumVersion", excludeKboxAndKotlin)
            }
        }
        val jsMain by getting
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))

                implementation(
                    "ch.tutteli.atrium:atrium-fluent-en_GB-js:$atriumVersion"
                    // cannot exclude as the module name changed in this version (from kbox-js to kbox)
                    // TODO add again once atrium uses new kbox version
                    //, excludeKboxAndKotlin
                )
            }
        }
    }
}

detekt {
    allRules = true
    config = files("${rootProject.projectDir}/gradle/scripts/detekt.yml")
    reports {
        xml.enabled = true
        html.enabled = false
        sarif.enabled = false
        txt.enabled = false
    }
}

project.afterEvaluate {
    project.afterEvaluate {

        val detektTasks = tasks.filterIsInstance<io.gitlab.arturbosch.detekt.Detekt>()

        fun Task.reportXml(): Path {
            val fileName = if (name == "detekt") "detekt" else name.substring("detekt".length)
            return project.buildDir.resolve("reports/detekt/$fileName.xml").toPath()
        }

        // not provided by detekt itself so far, might change in the future
        val allDetekt = tasks.register("allDetekt") {
            detektTasks.forEach {
                dependsOn(it)
            }
        }
        tasks.named("check").configure {
            dependsOn(allDetekt)
        }
        detektTasks.forEach {
            val reportXml = it.reportXml()
            it.doLast {
                // necessary as currently detekt writes main.xml for each platform and overrides when doing so
                Files.move(
                    project.buildDir.resolve("reports/detekt/main.xml").toPath(),
                    reportXml,
                    StandardCopyOption.REPLACE_EXISTING
                )
            }
            // as we change name of the output file, we need to let gradle know about it
            it.outputs.file(reportXml)
        }
        tasks.named("sonarqube").configure {
            dependsOn(allDetekt)
            doFirst {
                sonarqube {
                    properties {
                        val reportPaths = detektTasks
                            .map { it.reportXml() }
                            .filter { Files.exists(it) }
                            .joinToString(",")
                        property("sonar.kotlin", "detekt.reportPaths=$reportPaths")
                    }
                }
            }
        }

        fun sonarqubeSourceSets(endsWith: String) : String =
            kotlin.sourceSets.asSequence()
                .filter { it.name.endsWith(endsWith) }
                .map { "src/${it.name}" }
                .filter { file(it).exists() }
                .joinToString(",")

        // here due to detekt
        sonarqube {
            properties {
                property("sonar.host.url", "https://sonarcloud.io")
                property("sonar.organization", "robstoll-github")
                property("sonar.projectKey", "robstoll_${rootProject.name}")
                property("sonar.projectVersion", rootProject.version)
                property("sonar.sources", sonarqubeSourceSets("Main"))
                property("sonar.tests", sonarqubeSourceSets("Test"))
                property("sonar.coverage", "jacoco.xmlReportPaths=build/reports/jacoco/report.xml")
                property("sonar.verbose", "true")
            }
        }
    }
}

/*

Release & deploy a commit
--------------------------------
1. search for X.Y.Z-SNAPSHOT and replace with X.Y.Z
2. update main:
    a) point to the tag, search for `tree/main` and replace it with `tree/vX.Y.Z` (README.md)
    b) commit (modified .travis.yml, build.gradle, README.md)
    c) git tag vX.Y.Z
    d) git push origin vX.Y.Z
4. deploy to bintray:
    a) java -version 2>&1 | grep "version \"9" && CI=true ./gradlew clean publishToBintray
    b) Log in to bintray, check that there are 26 artifacts and publish them
    c) synchronise to maven central
5. create release on github

Prepare next dev cycle
-----------------------
1. point to main, search for `tree/vX.Y.Z` and replace it with `tree/main`
2. Replace badges
3. search for X.Y.Z and replace with X.Y.Z-SNAPSHOT
4. commit & push changes

*/

