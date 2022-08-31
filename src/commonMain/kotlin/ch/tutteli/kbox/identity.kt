package ch.tutteli.kbox

/**
 * An identity function which inlines if possible.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T> identity(t: T): T = t
