package ch.tutteli.kbox

/**
 * Checks if this collection is empty and if not applies the given [transformation].
 *
 * @param transformation the function which transforms this collection into [SuperTypeOfT] (at least an
 *   [Iterable])
 *
 * @param T The type of the receiver -- a [Collection] or one of its subtypes
 * @param SuperTypeOfT The result type can also be a super type of [T] as long as it doesn't go
 *   beyond [Iterable]. In theory, we would not need to establish this constraint but in all cases we came across
 *   so far we never wanted to end up with [Any]. E.g. if [T] = [List] then we don't want that the
 *   [transformation] returns an [Array] as otherwise we have a [List] in case it is empty and an [Array] otherwise and
 *   the least upper bound of those two types is [Any], i.e. we would end up with [SuperTypeOfT] = [Any].
 *
 * @return `this` if the given collection is empty, otherwise the result of applying this collection to the given
 *   [transformation].
 *
 * @since 1.2.0
 */
@Suppress("BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER")
inline fun <T, SuperTypeOfT> T.ifNotEmpty(
    transformation: (T) -> SuperTypeOfT
): SuperTypeOfT where T : Collection<*>, SuperTypeOfT : Iterable<*>, T : SuperTypeOfT =
    if (this.isNotEmpty()) transformation(this) else this
