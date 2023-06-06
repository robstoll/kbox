package ch.tutteli.kbox

/**
 * It is assumed that the [Map] represents a child parent relation where this function returns
 * a [LinkedHashSet] with all collected parents.
 *
 * A key represent a child and the value its parent.
 *
 * @param T Key and value type of the [Map].
 * @param child Defines the starting point of the search.
 * @param failIfCyclic `false` per default but can be set to `true` in which case it throws an [IllegalStateException]
 *   if a cycle is detected.
 *
 *
 * @throws IllegalStateException In case [failIfCyclic] is `true` and a cycle is detected.
 *
 * @return The collected parents in order.
 */
fun <T> Map<T, T>.mapParents(child: T, failIfCyclic: Boolean = false): LinkedHashSet<T> {
    val set = linkedSetOf<T>()
    var parent = this[child]
    while (parent != null) {
        if (hasCycle(parent, child, set, failIfCyclic)) break
        set.add(parent)
        parent = this[parent]
    }
    return set
}

@Suppress("UseCheckOrError")
private fun <T> hasCycle(parent: T, child: T, set: LinkedHashSet<T>, failIfCyclic: Boolean): Boolean {
    return if (parent == child || set.contains(parent)) {
        if (failIfCyclic) {
            val steps = if (set.isEmpty()) "->" else set.joinToString(" -> ", prefix = "-> ", postfix = " ->")
            throw IllegalStateException("cycle detected: $child $steps $parent")
        }
        true
    } else {
        false
    }
}
