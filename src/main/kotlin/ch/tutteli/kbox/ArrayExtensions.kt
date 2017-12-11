package ch.tutteli.kbox

/**
 * Joins all elements of this list by calling [append] and separates the elements with the given [separator].
 */
inline fun <T> Array<T>.joinToString(separator: String, append: (it: T, sb: StringBuilder) -> Unit): String
    = this.asList().joinToString(separator, separator, append)

/**
 * Joins all elements of this list by calling [append] and separates the elements with the given [separator] whereas
 * [lastSeparator] is used to separate the last and the second last element.
 */
inline fun <T> Array<T>.joinToString(separator: String, lastSeparator: String, append: (it: T, sb: StringBuilder) -> Unit): String
    = this.asList().joinToString(separator, lastSeparator, append)

/**
 * Appends all elements of this list to the given [sb] by calling [append] and separates the elements with the given
 * [separator].
 */
inline fun <T> Array<T>.appendToStringBuilder(sb: StringBuilder, separator: String, append: (it: T, sb: StringBuilder) -> Unit)
    = this.asList().appendToStringBuilder(sb, separator, separator, append)

/**
 * Appends all elements of this list to the given [sb] by calling [append] and separates the elements with the given
 * [separator] whereas [lastSeparator] is used to separate the last and the second last element.
 */
inline fun <T> Array<T>.appendToStringBuilder(
    sb: StringBuilder, separator: String, lastSeparator: String, append: (it: T, sb: StringBuilder) -> Unit)
    = this.asList().appendToStringBuilder(sb, separator, lastSeparator, append)
