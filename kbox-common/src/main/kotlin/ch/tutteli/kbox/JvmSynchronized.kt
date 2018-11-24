package ch.tutteli.kbox

/**
 * Stands for `kotlin.jvm.Synchronized` on the JVM platform and a dummy annotation on the other platforms.
 */
@Suppress("EmptyDefaultConstructor"
    //TODO remove as soon as https://github.com/arturbosch/detekt/issues/1362 is fixed
)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.SOURCE)
expect annotation class JvmSynchronized()
