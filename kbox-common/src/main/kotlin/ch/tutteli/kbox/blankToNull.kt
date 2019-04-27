package ch.tutteli.kbox

/**
 * Returns this [String] if it is not blank, null otherwise.
 */
@Suppress("NOTHING_TO_INLINE")
inline fun <T: CharSequence> T.blankToNull(): T? = if(this.isNotBlank()) this else null
