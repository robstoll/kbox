package ch.tutteli.kbox

/**
 * Joins all elements of this list by calling [append] and separates the elements with the given [separator].
 */
inline fun <T> Array<T>.joinToString(separator: String, append: (it: T, sb: StringBuilder) -> Unit): String =
    this.asList().joinToString(separator, separator, append)

/**
 * Joins all elements of this list by calling [append] and separates the elements with the given [separator] whereas
 * [lastSeparator] is used to separate the last and the second last element.
 */
inline fun <T> Array<T>.joinToString(
    separator: String,
    lastSeparator: String,
    append: (it: T, sb: StringBuilder) -> Unit
): String = this.asList().joinToString(separator, lastSeparator, append)

/**
 * Joins all elements of this [List] by calling [append] and separates the elements with the given [separator].
 */
inline fun <T> List<T>.joinToString(
    separator: String,
    append: (it: T, sb: StringBuilder) -> Unit
): String = this.asIterable().joinToString(separator, append)

/**
 * Joins all elements of this [List] by calling [append] and separates the elements with the given [separator] whereas
 * [lastSeparator] is used to separate the last and the second last element.
 */
inline fun <T> List<T>.joinToString(
    separator: String,
    lastSeparator: String,
    append: (it: T, sb: StringBuilder) -> Unit
): String {

    val sb = StringBuilder(size * 4)
    appendToStringBuilder(sb, separator, lastSeparator) { append(it, sb) }
    return sb.toString()
}

/**
 * Joins all elements of this [Iterable] by calling [append] and separates the elements with the given [separator].
 */
inline fun <T> Iterable<T>.joinToString(separator: String, append: (it: T, sb: StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    appendToStringBuilder(sb, separator) { append(it, sb) }
    return sb.toString()
}

/**
 * Joins all elements of this [Sequence] by calling [append] and separates the elements with the given [separator].
 */
inline fun <T> Sequence<T>.joinToString(separator: String, append: (it: T, sb: StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    appendToStringBuilder(sb, separator) { append(it, sb) }
    return sb.toString()
}
