package ch.tutteli.kbox

/**
 * Applies [action] to `this` and to each entry in [iterable].
 */
inline fun <E> E.forThisAndForEachIn(iterable: Iterable<E>, action: (E) -> Unit) {
    action(this)
    iterable.forEach(action)
}

/**
 * Applies [action] to `this` and to each entry in [iterable1] and to each entry in [iterable2].
 */
inline fun <E> E.forThisAndForEachIn(iterable1: Iterable<E>, iterable2: Iterable<E>, action: (E) -> Unit) {
    action(this)
    iterable1.forEach(action)
    iterable2.forEach(action)
}

/**
 * Applies [action] to `this` and to each entry in [Iterable] in [iterables].
 */
inline fun <E> E.forThisAndForEachIn(vararg iterables: Iterable<E>, action: (E) -> Unit) {
    action(this)
    iterables.forEach { it.forEach(action) }
}

/**
 * Applies [action] to `this` and to each entry in [sequence].
 */
inline fun <E> E.forThisAndForEachIn(sequence: Sequence<E>, action: (E) -> Unit) {
    action(this)
    sequence.forEach(action)
}

/**
 * Applies [action] to `this` and to each entry in [sequence1] and to each entry in [sequence2].
 */
inline fun <E> E.forThisAndForEachIn(sequence1: Sequence<E>, sequence2: Sequence<E>, action: (E) -> Unit) {
    action(this)
    sequence1.forEach(action)
    sequence2.forEach(action)
}

/**
 * Applies [action] to `this` and to each entry in [Sequence] in [sequences].
 */
inline fun <E> E.forThisAndForEachIn(vararg sequences: Sequence<E>, action: (E) -> Unit) {
    action(this)
    sequences.forEach { it.forEach(action) }
}
