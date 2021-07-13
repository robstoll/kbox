package ch.tutteli.kbox

/**
 * An idendity function which inlines if possible.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T> identity(t: T): T = t
