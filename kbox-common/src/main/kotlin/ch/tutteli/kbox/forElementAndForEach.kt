package ch.tutteli.kbox

/**
 * Applies [action] to `this` and to each entry in [iterable].
 */
inline fun <E> forElementAndForEachIn(element: E, iterable: Array<E>, action: (E) -> Unit) {
    action(element)
    iterable.forEach(action)
}

/**
 * Applies [action] to `this` and to each entry in [arr1] and in [arr2].
 */
inline fun <E> forElementAndForEachIn(element: E, arr1: Array<E>, arr2: Array<E>, action: (E) -> Unit) {
    action(element)
    forEachIn(arr1, arr2, action)
}

/**
 * Applies [action] to `this` and to each entry in [arr1], [arr2] and each entry of [Iterable] in [arrays].
 */
inline fun <E> forElementAndForEachIn(element: E, arr1: Array<E>, arr2: Array<E>, vararg arrays: Array<E>, action: (E) -> Unit) {
    action(element)
    forEachIn(arr1, arr2, action)
    arrays.forEach { it.forEach(action) }
}


/**
 * Applies [action] to `this` and to each entry in [iterable].
 */
inline fun <E> forElementAndForEachIn(element: E, iterable: Iterable<E>, action: (E) -> Unit) {
    action(element)
    iterable.forEach(action)
}

/**
 * Applies [action] to `this` and to each entry in [iterable1] and in [iterable2].
 */
inline fun <E> forElementAndForEachIn(element: E, iterable1: Iterable<E>, iterable2: Iterable<E>, action: (E) -> Unit) {
    action(element)
    forEachIn(iterable1, iterable2, action)
}

/**
 * Applies [action] to `this` and to each entry in [iterable1], [iterable2] and each entry of [Iterable] in [iterables].
 */
inline fun <E> forElementAndForEachIn(element: E, iterable1: Iterable<E>, iterable2: Iterable<E>, vararg iterables: Iterable<E>, action: (E) -> Unit) {
    action(element)
    forEachIn(iterable1, iterable2, action)
    iterables.forEach { it.forEach(action) }
}

/**
 * Applies [action] to `this` and to each entry in [sequence].
 */
inline fun <E> forElementAndForEachIn(element: E, sequence: Sequence<E>, action: (E) -> Unit) {
    action(element)
    sequence.forEach(action)
}

/**
 * Applies [action] to `this` and to each entry in [sequence1] and in [sequence2].
 */
inline fun <E> forElementAndForEachIn(element: E, sequence1: Sequence<E>, sequence2: Sequence<E>, action: (E) -> Unit) {
    action(element)
    forEachIn(sequence1, sequence2, action)
}

/**
 * Applies [action] to `this` and to each entry in in  [sequence1], [sequence2] and each entry of [Sequence] in [sequences].
 */
inline fun <E> forElementAndForEachIn(element: E, sequence1: Sequence<E>, sequence2: Sequence<E>, vararg sequences: Sequence<E>, action: (E) -> Unit) {
    action(element)
    forEachIn(sequence1, sequence2, action)
    sequences.forEach { it.forEach(action) }
}
