package ch.tutteli.kbox

/**
 * Checks if the given [index] is within the bound of this [List] ([index] < [List.size]) and correspondingly
 * executes the [thenBlock] or the [elseBlock].
 *
 * @param index The index which is used for the bound check.
 * @param thenBlock The block which is executed if the [index] is within the bound.
 * @param elseBlock The block which is executed if the [index] is outside of the bound.
 *
 * @return The result of the [thenBlock] or the [elseBlock].
 */
inline fun <E, R> List<E>.ifWithinBound(index: Int, thenBlock: () -> R, elseBlock: () -> R): R {
    return if (index < size) {
        thenBlock()
    } else {
        elseBlock()
    }
}

/**
 * Checks if the given [index] is within the bound of this [List] ([index] < [List.size]) and correspondingly
 * executes the [thenBlock] or the [elseBlock].
 *
 * @param index The index which is used for the bound check.
 * @param thenBlock The block which is executed if the [index] is within the bound.
 * @param elseBlock The block which is executed if the [index] is outside of the bound.
 *
 * @return The result of the [thenBlock] or the [elseBlock].
 */
inline fun <E, R> Array<E>.ifWithinBound(index: Int, thenBlock: () -> R, elseBlock: () -> R): R {
    return if (index < size) {
        thenBlock()
    } else {
        elseBlock()
    }
}
