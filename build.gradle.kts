import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

buildscript {
    // needs to be defined in here because otherwise tutteli-publish plugin does not have this information when applied
    // and we want that it to apply the ch.tutteli conventions
    rootProject.version = "1.2.0-SNAPSHOT"
    rootProject.group = "ch.tutteli.kbox"
    rootProject.description = "A utility library for Kotlin "
}

plugins {
    kotlin("multiplatform") version "1.9.24"
    id("org.jetbrains.dokka") version "1.9.20"
    val tutteliGradleVersion = "5.0.1"
    id("ch.tutteli.gradle.plugins.dokka") version tutteliGradleVersion
    id("ch.tutteli.gradle.plugins.kotlin.module.info") version tutteliGradleVersion
    id("ch.tutteli.gradle.plugins.publish") version tutteliGradleVersion
    id("ch.tutteli.gradle.plugins.spek") version tutteliGradleVersion
    id("io.gitlab.arturbosch.detekt") version "1.23.6"
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
}
val atriumVersion by extra("1.2.0")
val spekVersion by extra("2.0.15")

the<ch.tutteli.gradle.plugins.junitjacoco.JunitJacocoPluginExtension>()
    .allowedTestTasksWithoutTests.set(listOf("jsNodeTest"))

repositories { mavenCentral() }

kotlin {
    jvm { withJava() }
    js(IR) { nodejs() }

    targets.all {
        compilations.all {
            kotlinOptions {
                apiVersion = "1.4"
                languageVersion = "1.4"
            }
        }
    }

    sourceSets {
        val excludeKboxAndKotlin: ExternalModuleDependency.() -> Unit = {
            exclude(group = "ch.tutteli.kbox")
            exclude(group = "org.jetbrains.kotlin")
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation("ch.tutteli.atrium:atrium-fluent:$atriumVersion", excludeKboxAndKotlin)
            }
        }
    }
}
kotlin {
    // reading JAVA_VERSION from env to enable jdk17 build in CI
    val jdkVersion = System.getenv("JAVA_VERSION")?.toIntOrNull() ?: 11
    jvmToolchain(jdkVersion)
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
tasks.withType<JavaCompile> {
    sourceCompatibility = "11"
    targetCompatibility = "11"
}
tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions {
        with(freeCompilerArgs) {
            add("-opt-in=kotlin.RequiresOptIn")
            add("-Xexpect-actual-classes")
        }
    }
}

detekt {
    allRules = true
    config.from(files("${rootProject.projectDir}/gradle/scripts/detekt.yml"))
}

val detektTasks = tasks.withType<io.gitlab.arturbosch.detekt.Detekt>()

fun Task.reportXml(): Path {
    val fileName = if (name == "detekt") "detekt" else name.substring("detekt".length)
    return project.layout.buildDirectory.file("reports/detekt/$fileName.xml").get().asFile.toPath()
}

// not provided by detekt itself so far, might change in the future
val allDetekt = tasks.register("allDetekt") {
    detektTasks.forEach {
        it.reports {
            xml.required.set(true)
            html.required.set(false)
            txt.required.set(false)
            sarif.required.set(false)
            md.required.set(false)
        }
        dependsOn(it)
    }
}
tasks.named("check").configure {
    dependsOn(allDetekt)
}
detektTasks.forEach {

    it.exclude("**/org/spekframework/**") // exclude fake spek

    val reportXml = it.reportXml()
    it.doLast {
        // necessary as currently detekt writes main.xml for each platform and overrides when doing so
        Files.move(
            project.project.layout.buildDirectory.file("reports/detekt/main.xml").get().asFile.toPath(),
            reportXml,
            StandardCopyOption.REPLACE_EXISTING
        )
    }
    // as we change name of the output file, we need to let gradle know about it
    it.outputs.file(reportXml)
}

nexusPublishing {
    repositories {
        sonatype()
    }
}

/*

Release & deploy a commit
--------------------------------
1. search for X.Y.Z-SNAPSHOT and replace with X.Y.Z
2. update main:
    a) point to the tag, search for `tree/main` and replace it with `tree/vX.Y.Z` (README.md)
    b) update badges
    c) commit (modified docs/index.md, build.gradle.kts, README.md)
    c) git tag vX.Y.Z
    d) git push origin vX.Y.Z
4. deploy to maven-central:
    a) echo "enter the sonatype user token"
	   read SONATYPE_PW
       java -version 2>&1 | grep "version \"11" && ORG_GRADLE_PROJECT_sonatypePassword="$SONATYPE_PW" PUB=true CI=true gr clean publishToSonatype
    b) Log into https://oss.sonatype.org/#stagingRepositories
    c) check if staging repo is ok
    d) close repo
    e) release repo
5. create release on github

Prepare next dev cycle
-----------------------
1. point to main, search for `tree/vX.Y.Z` and replace it with `tree/main`
2. Replace badges
3. search for X.Y.Z and replace with X.Y.Z-SNAPSHOT
4. commit & push changes

*/

