package ch.tutteli.kbox

/**
 * Applies [action] to `this` and to each entry in [iterable].
 */
inline fun <E> E.forThisAndForEachIn(iterable: Iterable<E>, action: (E) -> Unit) {
    action(this)
    iterable.forEach(action)
}

/**
 * Applies [action] to `this` and to each entry in [sequence].
 */
inline fun <E> E.forThisAndForEachIn(sequence: Sequence<E>, action: (E) -> Unit) {
    action(this)
    sequence.forEach(action)
}
