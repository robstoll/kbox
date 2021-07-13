package ch.tutteli.kbox

/**
 * Performs the given [operation] on each remaining element.
 *
 * It corresponds to the default implementation introduced in jdk8 but is `inline`d.
 * It is meant jvm targets < jdk8 or other platforms.
 */
inline fun <T> Iterator<T>.forEachRemaining(operation: (T) -> Unit) {
    while (hasNext()) operation(next())
}
