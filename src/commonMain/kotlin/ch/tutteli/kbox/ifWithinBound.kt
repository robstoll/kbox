package ch.tutteli.kbox

/**
 * Checks if the given [index] is within the bound of this [List] ([index] < [List.size]) and correspondingly
 * executes the [thenBlock] or the [elseBlock].
 *
 * Use [getOrElse] in case you want to retrieve the element at position [index] or a default value.
 * This function is meant for other things such as check if upper bound of range is within bound and return a sublist or
 * return an empty list etc.
 *
 * @param index The index which is used for the bound check.
 * @param thenBlock The block which is executed if the [index] is within the bound.
 * @param elseBlock The block which is executed if the [index] is outside of the bound.
 *
 * @return The result of the [thenBlock] or the [elseBlock].
 */
inline fun <E, R> List<E>.ifWithinBound(index: Int, thenBlock: () -> R, elseBlock: () -> R): R =
    if (index < size) thenBlock()
    else elseBlock()

/**
 * Checks if the given [index] is within the bound of this [List] ([index] < [List.size]) and correspondingly
 * executes the [thenBlock] or the [elseBlock].
 *
 * Use [getOrElse] in case you want to retrieve the element at position [index] or a default value.
 * This function is meant for other things such as check if upper bound of range is within bound and return a sublist or
 * return an empty list etc.
 *
 * @param index The index which is used for the bound check.
 * @param thenBlock The block which is executed if the [index] is within the bound.
 * @param elseBlock The block which is executed if the [index] is outside of the bound.
 *
 * @return The result of the [thenBlock] or the [elseBlock].
 */
inline fun <E, R> Array<E>.ifWithinBound(index: Int, thenBlock: () -> R, elseBlock: () -> R): R =
    if (index < size) thenBlock()
    else elseBlock()
