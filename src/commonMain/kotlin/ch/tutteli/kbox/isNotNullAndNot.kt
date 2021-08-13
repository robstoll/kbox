package ch.tutteli.kbox

/**
 * Returns true if this [CharSequence] is neither `null` nor empty.
 */
fun CharSequence?.isNotNullAndNotEmpty() = this != null && this.isNotEmpty()

/**
 * Returns true if this [CharSequence] is neither `null` nor blank.
 */
fun CharSequence?.isNotNullAndNotBlank() = this != null && this.isNotBlank()
