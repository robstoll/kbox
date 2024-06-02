rootProject.name = "code-generation"

pluginManagement {
    includeBuild("../build-logic-conventions")
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        gradlePluginPortal()
    }
	versionCatalogs {
		create("libs") {
			from(files("../libs.versions.toml"))
		}
	}
	versionCatalogs {
		create("buildLibs") {
			from(files("../buildLibs.versions.toml"))
		}
	}
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
