// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
@file:Suppress("MethodOverloading")
package ch.tutteli.kbox

/**
* Transforms this [Pair] into a [Triple] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3> Pair<A1, A2>.append(
    a3: A3
): Triple<A1, A2, A3> =
    Triple(first, second, a3)

/**
* Transforms this [Pair] into a [Tuple4] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4> Pair<A1, A2>.append(
    a3: A3, a4: A4
): Tuple4<A1, A2, A3, A4> =
    Tuple4(first, second, a3, a4)

/**
* Transforms this [Pair] into a [Tuple5] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5> Pair<A1, A2>.append(
    a3: A3, a4: A4, a5: A5
): Tuple5<A1, A2, A3, A4, A5> =
    Tuple5(first, second, a3, a4, a5)

/**
* Transforms this [Pair] into a [Tuple6] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6> Pair<A1, A2>.append(
    a3: A3, a4: A4, a5: A5, a6: A6
): Tuple6<A1, A2, A3, A4, A5, A6> =
    Tuple6(first, second, a3, a4, a5, a6)

/**
* Transforms this [Pair] into a [Tuple7] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Pair<A1, A2>.append(
    a3: A3, a4: A4, a5: A5, a6: A6, a7: A7
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(first, second, a3, a4, a5, a6, a7)

/**
* Transforms this [Pair] into a [Tuple8] by appending the given arguments.
*
* @since 1.3.0
*/
@Suppress("LongParameterList")
fun <A1, A2, A3, A4, A5, A6, A7, A8> Pair<A1, A2>.append(
    a3: A3, a4: A4, a5: A5, a6: A6, a7: A7, a8: A8
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(first, second, a3, a4, a5, a6, a7, a8)

/**
* Transforms this [Pair] into a [Tuple9] by appending the given arguments.
*
* @since 1.3.0
*/
@Suppress("LongParameterList")
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Pair<A1, A2>.append(
    a3: A3, a4: A4, a5: A5, a6: A6, a7: A7, a8: A8, a9: A9
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(first, second, a3, a4, a5, a6, a7, a8, a9)

/**
* Transforms this [Triple] into a [Tuple4] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4> Triple<A1, A2, A3>.append(
    a4: A4
): Tuple4<A1, A2, A3, A4> =
    Tuple4(first, second, third, a4)

/**
* Transforms this [Triple] into a [Tuple5] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5> Triple<A1, A2, A3>.append(
    a4: A4, a5: A5
): Tuple5<A1, A2, A3, A4, A5> =
    Tuple5(first, second, third, a4, a5)

/**
* Transforms this [Triple] into a [Tuple6] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6> Triple<A1, A2, A3>.append(
    a4: A4, a5: A5, a6: A6
): Tuple6<A1, A2, A3, A4, A5, A6> =
    Tuple6(first, second, third, a4, a5, a6)

/**
* Transforms this [Triple] into a [Tuple7] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Triple<A1, A2, A3>.append(
    a4: A4, a5: A5, a6: A6, a7: A7
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(first, second, third, a4, a5, a6, a7)

/**
* Transforms this [Triple] into a [Tuple8] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Triple<A1, A2, A3>.append(
    a4: A4, a5: A5, a6: A6, a7: A7, a8: A8
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(first, second, third, a4, a5, a6, a7, a8)

/**
* Transforms this [Triple] into a [Tuple9] by appending the given arguments.
*
* @since 1.3.0
*/
@Suppress("LongParameterList")
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Triple<A1, A2, A3>.append(
    a4: A4, a5: A5, a6: A6, a7: A7, a8: A8, a9: A9
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(first, second, third, a4, a5, a6, a7, a8, a9)

/**
* Transforms this [Tuple4] into a [Tuple5] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5> Tuple4<A1, A2, A3, A4>.append(
    a5: A5
): Tuple5<A1, A2, A3, A4, A5> =
    Tuple5(a1, a2, a3, a4, a5)

/**
* Transforms this [Tuple4] into a [Tuple6] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6> Tuple4<A1, A2, A3, A4>.append(
    a5: A5, a6: A6
): Tuple6<A1, A2, A3, A4, A5, A6> =
    Tuple6(a1, a2, a3, a4, a5, a6)

/**
* Transforms this [Tuple4] into a [Tuple7] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Tuple4<A1, A2, A3, A4>.append(
    a5: A5, a6: A6, a7: A7
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(a1, a2, a3, a4, a5, a6, a7)

/**
* Transforms this [Tuple4] into a [Tuple8] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple4<A1, A2, A3, A4>.append(
    a5: A5, a6: A6, a7: A7, a8: A8
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, a3, a4, a5, a6, a7, a8)

/**
* Transforms this [Tuple4] into a [Tuple9] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple4<A1, A2, A3, A4>.append(
    a5: A5, a6: A6, a7: A7, a8: A8, a9: A9
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, a6, a7, a8, a9)

/**
* Transforms this [Tuple5] into a [Tuple6] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6> Tuple5<A1, A2, A3, A4, A5>.append(
    a6: A6
): Tuple6<A1, A2, A3, A4, A5, A6> =
    Tuple6(a1, a2, a3, a4, a5, a6)

/**
* Transforms this [Tuple5] into a [Tuple7] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Tuple5<A1, A2, A3, A4, A5>.append(
    a6: A6, a7: A7
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(a1, a2, a3, a4, a5, a6, a7)

/**
* Transforms this [Tuple5] into a [Tuple8] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple5<A1, A2, A3, A4, A5>.append(
    a6: A6, a7: A7, a8: A8
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, a3, a4, a5, a6, a7, a8)

/**
* Transforms this [Tuple5] into a [Tuple9] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple5<A1, A2, A3, A4, A5>.append(
    a6: A6, a7: A7, a8: A8, a9: A9
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, a6, a7, a8, a9)

/**
* Transforms this [Tuple6] into a [Tuple7] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Tuple6<A1, A2, A3, A4, A5, A6>.append(
    a7: A7
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(a1, a2, a3, a4, a5, a6, a7)

/**
* Transforms this [Tuple6] into a [Tuple8] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple6<A1, A2, A3, A4, A5, A6>.append(
    a7: A7, a8: A8
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, a3, a4, a5, a6, a7, a8)

/**
* Transforms this [Tuple6] into a [Tuple9] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple6<A1, A2, A3, A4, A5, A6>.append(
    a7: A7, a8: A8, a9: A9
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, a6, a7, a8, a9)

/**
* Transforms this [Tuple7] into a [Tuple8] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple7<A1, A2, A3, A4, A5, A6, A7>.append(
    a8: A8
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, a3, a4, a5, a6, a7, a8)

/**
* Transforms this [Tuple7] into a [Tuple9] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple7<A1, A2, A3, A4, A5, A6, A7>.append(
    a8: A8, a9: A9
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, a6, a7, a8, a9)

/**
* Transforms this [Tuple8] into a [Tuple9] by appending the given arguments.
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.append(
    a9: A9
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, a6, a7, a8, a9)

