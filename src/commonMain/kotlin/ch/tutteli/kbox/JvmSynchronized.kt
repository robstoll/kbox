package ch.tutteli.kbox

/**
 * Stands for `kotlin.jvm.Synchronized` on the JVM platform and a dummy annotation on the other platforms.
 */
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.SOURCE)
expect annotation class JvmSynchronized()
