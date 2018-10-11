@file:Suppress("MethodOverloading")
package ch.tutteli.kbox

/**
 * Applies [action] to each entry in [arr1] and in [arr2].
 */
inline fun <T> forEachIn(arr1: Array<T>, arr2: Array<T>, action: (T) -> Unit) {
    arr1.forEach(action)
    arr2.forEach(action)
}

/**
 * Applies [action] to each entry in [arr1], [arr2] and in [arr3].
 */
inline fun <T> forEachIn(arr1: Array<T>, arr2: Array<T>, arr3: Array<T>, action: (T) -> Unit) {
    arr1.forEach(action)
    arr2.forEach(action)
    arr3.forEach(action)
}

/**
 * Applies [action] to each entry in [arr1], [arr2], [arr3] and to each entry of [Array] in [arrays].
 */
inline fun <T> forEachIn(arr1: Array<T>, arr2: Array<T>, arr3: Array<T>, vararg arrays: Array<T>, action: (T) -> Unit) {
    arr1.forEach(action)
    arr2.forEach(action)
    arr3.forEach(action)
    arrays.forEach { it.forEach(action) }
}


/**
 * Applies [action] to each entry in [iterable1] and in [iterable2].
 */
inline fun <T> forEachIn(iterable1: Iterable<T>, iterable2: Iterable<T>, action: (T) -> Unit) {
    iterable1.forEach(action)
    iterable2.forEach(action)
}

/**
 * Applies [action] to each entry in [iterable1], [iterable2] and in [iterable3].
 */
inline fun <T> forEachIn(iterable1: Iterable<T>, iterable2: Iterable<T>, iterable3: Iterable<T>, action: (T) -> Unit) {
    iterable1.forEach(action)
    iterable2.forEach(action)
    iterable3.forEach(action)
}

/**
 * Applies [action] to each entry in [iterable1], [iterable2], [iterable3] and to each entry of [Iterable] in [iterables].
 */
inline fun <T> forEachIn(iterable1: Iterable<T>, iterable2: Iterable<T>, iterable3: Iterable<T>, vararg iterables: Iterable<T>, action: (T) -> Unit) {
    iterable1.forEach(action)
    iterable2.forEach(action)
    iterable3.forEach(action)
    iterables.forEach { it.forEach(action) }
}


/**
 * Applies [action] to each entry in [sequence1] and to each entry in [sequence2].
 */
inline fun <T> forEachIn(sequence1: Sequence<T>, sequence2: Sequence<T>, action: (T) -> Unit) {
    sequence1.forEach(action)
    sequence2.forEach(action)
}

/**
 * Applies [action] to each entry in [sequence1], [sequence2] and in [sequence3].
 */
inline fun <T> forEachIn(sequence1: Sequence<T>, sequence2: Sequence<T>, sequence3: Sequence<T>, action: (T) -> Unit) {
    sequence1.forEach(action)
    sequence2.forEach(action)
    sequence3.forEach(action)
}

/**
 * Applies [action] to each entry in [sequence1], [sequence2], [sequence3] and to each entry of [Sequence] in [sequences].
 */
inline fun <T> forEachIn(sequence1: Sequence<T>, sequence2: Sequence<T>, sequence3: Sequence<T>, vararg sequences: Sequence<T>, action: (T) -> Unit) {
    sequence1.forEach(action)
    sequence2.forEach(action)
    sequence3.forEach(action)
    sequences.forEach { it.forEach(action) }
}
