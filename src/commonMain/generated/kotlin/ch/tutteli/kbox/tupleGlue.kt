// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
@file:Suppress("MethodOverloading")
package ch.tutteli.kbox

/**
* Glues the given [pair] to this [Pair] and thus results in a [Tuple4].
*
* You can also think of it as all values of the given [pair] are [Pair.append]ed to this [Pair].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4> Pair<A1, A2>.glue(
    pair: Pair<A3, A4>
): Tuple4<A1, A2, A3, A4> =
    Tuple4(first, second, pair.first, pair.second)

/**
* Glues the given [triple] to this [Pair] and thus results in a [Tuple5].
*
* You can also think of it as all values of the given [triple] are [Pair.append]ed to this [Pair].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5> Pair<A1, A2>.glue(
    triple: Triple<A3, A4, A5>
): Tuple5<A1, A2, A3, A4, A5> =
    Tuple5(first, second, triple.first, triple.second, triple.third)

/**
* Glues the given [tuple4] to this [Pair] and thus results in a [Tuple6].
*
* You can also think of it as all values of the given [tuple4] are [Pair.append]ed to this [Pair].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6> Pair<A1, A2>.glue(
    tuple4: Tuple4<A3, A4, A5, A6>
): Tuple6<A1, A2, A3, A4, A5, A6> =
    Tuple6(first, second, tuple4.a1, tuple4.a2, tuple4.a3, tuple4.a4)

/**
* Glues the given [tuple5] to this [Pair] and thus results in a [Tuple7].
*
* You can also think of it as all values of the given [tuple5] are [Pair.append]ed to this [Pair].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Pair<A1, A2>.glue(
    tuple5: Tuple5<A3, A4, A5, A6, A7>
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(first, second, tuple5.a1, tuple5.a2, tuple5.a3, tuple5.a4, tuple5.a5)

/**
* Glues the given [tuple6] to this [Pair] and thus results in a [Tuple8].
*
* You can also think of it as all values of the given [tuple6] are [Pair.append]ed to this [Pair].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Pair<A1, A2>.glue(
    tuple6: Tuple6<A3, A4, A5, A6, A7, A8>
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(first, second, tuple6.a1, tuple6.a2, tuple6.a3, tuple6.a4, tuple6.a5, tuple6.a6)

/**
* Glues the given [tuple7] to this [Pair] and thus results in a [Tuple9].
*
* You can also think of it as all values of the given [tuple7] are [Pair.append]ed to this [Pair].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Pair<A1, A2>.glue(
    tuple7: Tuple7<A3, A4, A5, A6, A7, A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(first, second, tuple7.a1, tuple7.a2, tuple7.a3, tuple7.a4, tuple7.a5, tuple7.a6, tuple7.a7)

/**
* Glues the given [pair] to this [Triple] and thus results in a [Tuple5].
*
* You can also think of it as all values of the given [pair] are [Triple.append]ed to this [Triple].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5> Triple<A1, A2, A3>.glue(
    pair: Pair<A4, A5>
): Tuple5<A1, A2, A3, A4, A5> =
    Tuple5(first, second, third, pair.first, pair.second)

/**
* Glues the given [triple] to this [Triple] and thus results in a [Tuple6].
*
* You can also think of it as all values of the given [triple] are [Triple.append]ed to this [Triple].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6> Triple<A1, A2, A3>.glue(
    triple: Triple<A4, A5, A6>
): Tuple6<A1, A2, A3, A4, A5, A6> =
    Tuple6(first, second, third, triple.first, triple.second, triple.third)

/**
* Glues the given [tuple4] to this [Triple] and thus results in a [Tuple7].
*
* You can also think of it as all values of the given [tuple4] are [Triple.append]ed to this [Triple].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Triple<A1, A2, A3>.glue(
    tuple4: Tuple4<A4, A5, A6, A7>
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(first, second, third, tuple4.a1, tuple4.a2, tuple4.a3, tuple4.a4)

/**
* Glues the given [tuple5] to this [Triple] and thus results in a [Tuple8].
*
* You can also think of it as all values of the given [tuple5] are [Triple.append]ed to this [Triple].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Triple<A1, A2, A3>.glue(
    tuple5: Tuple5<A4, A5, A6, A7, A8>
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(first, second, third, tuple5.a1, tuple5.a2, tuple5.a3, tuple5.a4, tuple5.a5)

/**
* Glues the given [tuple6] to this [Triple] and thus results in a [Tuple9].
*
* You can also think of it as all values of the given [tuple6] are [Triple.append]ed to this [Triple].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Triple<A1, A2, A3>.glue(
    tuple6: Tuple6<A4, A5, A6, A7, A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(first, second, third, tuple6.a1, tuple6.a2, tuple6.a3, tuple6.a4, tuple6.a5, tuple6.a6)

/**
* Glues the given [pair] to this [Tuple4] and thus results in a [Tuple6].
*
* You can also think of it as all values of the given [pair] are [Tuple4.append]ed to this [Tuple4].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6> Tuple4<A1, A2, A3, A4>.glue(
    pair: Pair<A5, A6>
): Tuple6<A1, A2, A3, A4, A5, A6> =
    Tuple6(a1, a2, a3, a4, pair.first, pair.second)

/**
* Glues the given [triple] to this [Tuple4] and thus results in a [Tuple7].
*
* You can also think of it as all values of the given [triple] are [Tuple4.append]ed to this [Tuple4].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Tuple4<A1, A2, A3, A4>.glue(
    triple: Triple<A5, A6, A7>
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(a1, a2, a3, a4, triple.first, triple.second, triple.third)

/**
* Glues the given [tuple4] to this [Tuple4] and thus results in a [Tuple8].
*
* You can also think of it as all values of the given [tuple4] are [Tuple4.append]ed to this [Tuple4].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple4<A1, A2, A3, A4>.glue(
    tuple4: Tuple4<A5, A6, A7, A8>
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, a3, a4, tuple4.a1, tuple4.a2, tuple4.a3, tuple4.a4)

/**
* Glues the given [tuple5] to this [Tuple4] and thus results in a [Tuple9].
*
* You can also think of it as all values of the given [tuple5] are [Tuple4.append]ed to this [Tuple4].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple4<A1, A2, A3, A4>.glue(
    tuple5: Tuple5<A5, A6, A7, A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, tuple5.a1, tuple5.a2, tuple5.a3, tuple5.a4, tuple5.a5)

/**
* Glues the given [pair] to this [Tuple5] and thus results in a [Tuple7].
*
* You can also think of it as all values of the given [pair] are [Tuple5.append]ed to this [Tuple5].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Tuple5<A1, A2, A3, A4, A5>.glue(
    pair: Pair<A6, A7>
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(a1, a2, a3, a4, a5, pair.first, pair.second)

/**
* Glues the given [triple] to this [Tuple5] and thus results in a [Tuple8].
*
* You can also think of it as all values of the given [triple] are [Tuple5.append]ed to this [Tuple5].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple5<A1, A2, A3, A4, A5>.glue(
    triple: Triple<A6, A7, A8>
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, a3, a4, a5, triple.first, triple.second, triple.third)

/**
* Glues the given [tuple4] to this [Tuple5] and thus results in a [Tuple9].
*
* You can also think of it as all values of the given [tuple4] are [Tuple5.append]ed to this [Tuple5].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple5<A1, A2, A3, A4, A5>.glue(
    tuple4: Tuple4<A6, A7, A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, tuple4.a1, tuple4.a2, tuple4.a3, tuple4.a4)

/**
* Glues the given [pair] to this [Tuple6] and thus results in a [Tuple8].
*
* You can also think of it as all values of the given [pair] are [Tuple6.append]ed to this [Tuple6].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple6<A1, A2, A3, A4, A5, A6>.glue(
    pair: Pair<A7, A8>
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, a3, a4, a5, a6, pair.first, pair.second)

/**
* Glues the given [triple] to this [Tuple6] and thus results in a [Tuple9].
*
* You can also think of it as all values of the given [triple] are [Tuple6.append]ed to this [Tuple6].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple6<A1, A2, A3, A4, A5, A6>.glue(
    triple: Triple<A7, A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, a6, triple.first, triple.second, triple.third)

/**
* Glues the given [pair] to this [Tuple7] and thus results in a [Tuple9].
*
* You can also think of it as all values of the given [pair] are [Tuple7.append]ed to this [Tuple7].
*
* @since 1.3.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple7<A1, A2, A3, A4, A5, A6, A7>.glue(
    pair: Pair<A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, a6, a7, pair.first, pair.second)

