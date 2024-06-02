pluginManagement {
    repositories {
//        mavenLocal()
        gradlePluginPortal()
    }
    includeBuild("gradle/build-logic")
    includeBuild("gradle/build-logic-conventions")
}

dependencyResolutionManagement {
    // kotlinNodeJsSetup configures ivy repository 'Node Distributions at https://nodejs.org/dist'
    // repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
    }
}

rootProject.name = "kbox"
