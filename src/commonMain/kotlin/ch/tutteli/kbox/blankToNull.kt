package ch.tutteli.kbox

/**
 * Returns this [CharSequence] if it is not blank, null otherwise.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T: CharSequence> T.blankToNull(): T? = this.ifBlank { null }
