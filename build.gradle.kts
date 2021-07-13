plugins {
    kotlin("multiplatform") version "1.4.32"
}


version = "0.16.0-SNAPSHOT"
group = "ch.tutteli.kbox"

val atriumVersion by extra("0.16.0")
val spekVersion by extra("2.0.15")

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        testRuns["test"].executionTask.configure {
            useJUnit()
        }
    }
    js { nodejs() }
//    val hostOs = System.getProperty("os.name")
//    val isMingwX64 = hostOs.startsWith("Windows")
//    val nativeTarget = when {
//        hostOs == "Mac OS X" -> macosX64("native")
//        hostOs == "Linux" -> linuxX64("native")
//        isMingwX64 -> mingwX64("native")
//        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
//    }

    targets.all {
        compilations.all {
            kotlinOptions.allWarningsAsErrors = true
        }
    }

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation("ch.tutteli.atrium:atrium-fluent-en_GB-common:$atriumVersion")
                implementation("org.spekframework.spek2:spek-dsl-metadata:$spekVersion")
            }
        }
        val jvmMain by getting
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("ch.tutteli.atrium:atrium-fluent-en_GB:$atriumVersion")
                implementation("org.spekframework.spek2:spek-dsl-jvm:$spekVersion")
                runtimeOnly("org.spekframework.spek2:spek-runner-junit5:$spekVersion")
                implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
                implementation("org.jetbrains.kotlin:kotlin-reflect")
            }
        }
        val jsMain by getting
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
                implementation("ch.tutteli.atrium:atrium-fluent-en_GB-js:$atriumVersion")
                implementation("org.spekframework.spek2:spek-dsl-js:$spekVersion")
            }
        }
//        val nativeMain by getting
//        val nativeTest by getting
    }
}

/*

buildscript {
    ext {
        kotlin_version = '1.4.32'

        atrium_version = '0.16.0'
        spek_version = '2.0.15'

        // gradle plugins
        tutteli_plugins_version = '0.33.1'
        detekt_version = '1.17.0'
    }

    repositories {
        jcenter()
        maven { url "https://plugins.gradle.org/m2/" }
    }

    dependencies {
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        classpath "ch.tutteli:tutteli-gradle-dokka:${tutteli_plugins_version}"
        classpath("ch.tutteli:tutteli-gradle-kotlin-module-info:$tutteli_plugins_version")
        classpath "ch.tutteli:tutteli-gradle-kotlin-utils:${tutteli_plugins_version}"
        classpath "ch.tutteli:tutteli-gradle-project-utils:${tutteli_plugins_version}"
        classpath "ch.tutteli:tutteli-gradle-publish:${tutteli_plugins_version}"
        classpath "ch.tutteli:tutteli-gradle-spek:${tutteli_plugins_version}"
        classpath "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:$detekt_version"
    }
}

apply plugin: 'ch.tutteli.project.utils'
apply plugin: 'ch.tutteli.kotlin.utils'
kotlinutils.kotlinVersion = kotlin_version

repositories {
    mavenCentral()
    jcenter()
}
apply plugin: "io.gitlab.arturbosch.detekt"
detekt {
    failFast = true
    input = files(subprojects*.collect { it.projectDir })
    config = files("$rootProject.projectDir/gradle/scripts/detekt.yml")
    reports {
        xml.enabled = true
    }
}

configureCommonProjects()
configureJsProjects()
configureJvmProjects()
configureAndroidProjects()

configure(getJvmProjects()) {
    apply plugin: 'ch.tutteli.kotlin.module.info'

    apply plugin: 'ch.tutteli.spek'
    spek.version = spek_version
    apply plugin: 'ch.tutteli.dokka'
}

subprojects { subproject ->
    repositories { jcenter() }
    apply plugin: 'ch.tutteli.publish'
}

/*

Release & deploy a commit
--------------------------------
1. search for X.Y.Z-SNAPSHOT and replace with X.Y.Z
2. update master:
    a) point to the tag, search for `tree/master` and replace it with `tree/vX.Y.Z` (README.md)
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
1. point to master, search for `tree/vX.Y.Z` and replace it with `tree/master`
2. Replace badges
3. search for X.Y.Z and replace with X.Y.Z-SNAPSHOT
4. commit & push changes

*/

