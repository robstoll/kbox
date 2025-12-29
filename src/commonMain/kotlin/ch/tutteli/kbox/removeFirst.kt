package ch.tutteli.kbox

/**
 * Removes the first element from this collection which matches the given [predicate] and returns `true` if a match
 * was found, `false` otherwise.
 *
 * @since 3.4.0
 */
fun <T> MutableCollection<T>.removeFirst(predicate: (T) -> Boolean): Boolean {
    val itr = iterator()
    while (itr.hasNext()) {
        if (predicate(itr.next())) {
            itr.remove()
            return true
        }
    }
    return false
}

