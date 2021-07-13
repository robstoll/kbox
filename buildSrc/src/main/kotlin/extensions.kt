import org.gradle.api.Project
import org.gradle.api.artifacts.ExternalModuleDependency
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

fun Project.prefixedProject(name: String): Project = project(":${rootProject.name}-$name")
fun KotlinDependencyHandler.apiWithExclude(dep: String) = api(dep) { defaultExclude() }
fun KotlinDependencyHandler.runtimeOnlyWithExclude(dep: String) = api(dep) { defaultExclude() }
fun KotlinDependencyHandler.implementationWithExclude(dep: String) = api(dep) { defaultExclude() }

fun ExternalModuleDependency.defaultExclude() {
    exclude(mapOf("group" to "org.jetbrains.kotlin"))
    exclude(mapOf("group" to "ch.tutteli.kbox"))
}
