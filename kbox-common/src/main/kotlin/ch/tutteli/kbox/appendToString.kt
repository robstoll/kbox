@file:Suppress("MethodOverloading"
//TODO remove once https://github.com/arturbosch/detekt/issues/1238 is fixed
)
package ch.tutteli.kbox

/**
 * Appends all elements of this list to the given [sb] by calling [append] and separates the elements with the given
 * [separator].
 */
inline fun <T> Array<T>.appendToStringBuilder(sb: StringBuilder, separator: String, append: (it: T) -> Unit) =
    this.asList().appendToStringBuilder(sb, separator, separator, append)

/**
 * Appends all elements of this list to the given [sb] by calling [append] and separates the elements with the given
 * [separator] whereas [lastSeparator] is used to separate the last and the second last element.
 */
inline fun <T> Array<T>.appendToStringBuilder(
    sb: StringBuilder,
    separator: String,
    lastSeparator: String,
    append: (it: T) -> Unit
) = this.asList().appendToStringBuilder(sb, separator, lastSeparator, append)


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

/**
* Appends all elements of this [Iterable] to the given [sb] by calling [append] and separates the elements with
* the given [separator].
*/
inline fun <T> Iterable<T>.appendToStringBuilder(
    sb: StringBuilder,
    separator: String,
    append: (it: T) -> Unit
) {
    val itr = this.iterator()
    if (itr.hasNext()) {
        append(itr.next())
    }
    while (itr.hasNext()) {
        sb.append(separator)
        append(itr.next())
    }
}

/**
 * Appends all elements of this [Sequence] to the given [sb] by calling [append] and separates the elements with
 * the given [separator].
 */
inline fun <T> Sequence<T>.appendToStringBuilder(
    sb: StringBuilder,
    separator: String,
    append: (it: T) -> Unit
) {
    val itr = this.iterator()
    if (itr.hasNext()) {
        append(itr.next())
    }
    while (itr.hasNext()) {
        sb.append(separator)
        append(itr.next())
    }
}

