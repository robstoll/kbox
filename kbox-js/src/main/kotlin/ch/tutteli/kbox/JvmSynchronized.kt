package ch.tutteli.kbox

/**
 * Without any effects on the JS Platform.
 */
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.SOURCE)
actual annotation class JvmSynchronized actual constructor()
