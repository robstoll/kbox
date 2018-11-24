package ch.tutteli.kbox

/**
 * Without any effects on the JS Platform.
 */
@Suppress("EmptyDefaultConstructor"
    //TODO remove as soon as https://github.com/arturbosch/detekt/issues/1362 is fixed
)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.SOURCE)
actual annotation class JvmSynchronized actual constructor()
