import ch.tutteli.gradle.plugins.dokka.GhPages
import org.jetbrains.dokka.gradle.AbstractDokkaLeafTask

plugins {
    id("build-logic.gradle-conventions")
    id("ch.tutteli.gradle.plugins.dokka")
}

tasks.configureEach<AbstractDokkaLeafTask> {
	moduleName.set("KBox")
    dokkaSourceSets.configureEach {
		reportUndocumented.set(true)
        jdkVersion.set(buildParameters.defaultJdkVersion)
    }
    configurePlugins()
}
