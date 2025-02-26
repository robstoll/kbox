// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

/**
* Converts this [Pair] into a [Sequence].
*
* @since 3.0.0
*/
fun <T> Pair<T, T>.toSequence(): Sequence<T> =
    sequenceOf(first, second)

/**
* Converts this [Triple] into a [Sequence].
*
* @since 3.0.0
*/
fun <T> Triple<T, T, T>.toSequence(): Sequence<T> =
    sequenceOf(first, second, third)

/**
* Converts this [Tuple4] into a [Sequence].
*
* @since 3.0.0
*/
fun <T> Tuple4<T, T, T, T>.toSequence(): Sequence<T> =
    sequenceOf(a1, a2, a3, a4)

/**
* Converts this [Tuple5] into a [Sequence].
*
* @since 3.0.0
*/
fun <T> Tuple5<T, T, T, T, T>.toSequence(): Sequence<T> =
    sequenceOf(a1, a2, a3, a4, a5)

/**
* Converts this [Tuple6] into a [Sequence].
*
* @since 3.0.0
*/
fun <T> Tuple6<T, T, T, T, T, T>.toSequence(): Sequence<T> =
    sequenceOf(a1, a2, a3, a4, a5, a6)

/**
* Converts this [Tuple7] into a [Sequence].
*
* @since 3.0.0
*/
fun <T> Tuple7<T, T, T, T, T, T, T>.toSequence(): Sequence<T> =
    sequenceOf(a1, a2, a3, a4, a5, a6, a7)

/**
* Converts this [Tuple8] into a [Sequence].
*
* @since 3.0.0
*/
fun <T> Tuple8<T, T, T, T, T, T, T, T>.toSequence(): Sequence<T> =
    sequenceOf(a1, a2, a3, a4, a5, a6, a7, a8)

/**
* Converts this [Tuple9] into a [Sequence].
*
* @since 3.0.0
*/
fun <T> Tuple9<T, T, T, T, T, T, T, T, T>.toSequence(): Sequence<T> =
    sequenceOf(a1, a2, a3, a4, a5, a6, a7, a8, a9)

