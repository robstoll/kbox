package ch.tutteli.kbox

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
 * Appends all elements of this [List] to the given [sb] by calling [append] and separates the elements with the given
 * [separator].
 */
inline fun <T> List<T>.appendToStringBuilder(
    sb: StringBuilder,
    separator: String,
    append: (it: T) -> Unit
) = this.asIterable().appendToStringBuilder(sb, separator, append)

/**
 * Appends all elements of this [List] to the given [sb] by calling [append] and separates the elements with the given
 * [separator] whereas [lastSeparator] is used to separate the last and the second last element.
 */
inline fun <T> List<T>.appendToStringBuilder(
    sb: StringBuilder,
    separator: String,
    lastSeparator: String,
    append: (it: T) -> Unit
) {
    val size = this.size
    if (size > 0) {
        append(this[0])
    }
    for (i in 1 until size - 1) {
        sb.append(separator)
        append(this[i])
    }
    if (size > 1) {
        sb.append(lastSeparator)
        append(this[size - 1])
    }
}
