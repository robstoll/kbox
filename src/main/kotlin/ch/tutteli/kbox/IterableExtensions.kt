package ch.tutteli.kbox

/**
 * Joins all elements of this [Iterable] by calling [append] and separates the elements with the given [separator].
 */
inline fun <T> Iterable<T>.joinToString(separator: String, append: (it: T, sb: StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    appendToStringBuilder(sb, separator, append)
    return sb.toString()
}

/**
 * Appends all elements of this [Iterable] to the given [sb] by calling [append] and separates the elements with
 * the given [separator].
 */
inline fun <T> Iterable<T>.appendToStringBuilder(
    sb: StringBuilder,
    separator: String,
    append: (it: T, sb: StringBuilder) -> Unit
) {
    val itr = this.iterator()
    if (itr.hasNext()) {
        append(itr.next(), sb)
    }
    while (itr.hasNext()) {
        sb.append(separator)
        append(itr.next(), sb)
    }
}

/**
 * Maps the values to [WithIndex], containing the index next to the value itself.
 */
fun <T> Iterable<T>.mapWithIndex(): List<WithIndex<T>> = this.mapIndexed { index, t -> WithIndex(index, t)}
