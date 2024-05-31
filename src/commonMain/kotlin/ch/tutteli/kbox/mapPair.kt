package ch.tutteli.kbox

/**
 * Maps the first element of this [Pair] with the given function [transform].
 *
 * @return A new pair with the result of the transformation as first and the existing second as second element.
 *
 * @since 1.3.0
 */
fun <FirstT, SecondT, R> Pair<FirstT, SecondT>.mapFirst(transform: (FirstT) -> R): Pair<R, SecondT> =
    Pair(transform(first), second)

/**
 * Maps the second element of this [Pair] with the given function [transform].
 *
 * @return A new pair with the existing first element as first and the result of the transformation as second element.
 *
 * @since 1.3.0
 */
fun <FirstT, SecondT, R> Pair<FirstT, SecondT>.mapSecond(transform: (SecondT) -> R): Pair<FirstT, R> =
    Pair(first, transform(second))
