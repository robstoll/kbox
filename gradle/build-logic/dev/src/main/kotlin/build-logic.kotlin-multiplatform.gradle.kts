plugins {
    id("build-logic.kotlin-multiplatform-conventions")
    id("build-logic.kotlin-jvm-conventions")
}

kotlin {
    jvm {
        // for module-info.java
        withJava()
    }

    js(IR) { nodejs() }

    sourceSets {
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
