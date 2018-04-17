package ch.tutteli.kbox

/**
 * Maps the values to [WithIndex], containing the index next to the value itself.
 */
fun <T> Iterable<T>.mapWithIndex(): List<WithIndex<T>> = this.mapIndexed { index, t -> WithIndex(index, t) }

/**
 * Maps the values to [WithIndex], containing the index next to the value itself.
 */
fun <T> Sequence<T>.mapWithIndex(): Sequence<WithIndex<T>> = this.mapIndexed { index, t -> WithIndex(index, t) }
