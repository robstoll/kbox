package ch.tutteli.kbox

/**
 * It is assumed that the [Map] represents a child parent relation where this function returns
 * a [LinkedHashSet] with all collected parents.
 *
 * A key represent a child and the value its parent.
 *
 * @return The collected parents in order.
 */
fun <T> Map<T, T>.mapParents(child: T): LinkedHashSet<T> {
    val set = linkedSetOf<T>()
    var parent = this[child]
    while (parent != null) {
        set.add(parent)
        parent = this[parent]
    }
    return set
}
