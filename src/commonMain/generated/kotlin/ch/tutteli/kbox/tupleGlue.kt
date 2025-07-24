// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
@file:Suppress("MethodOverloading")
package ch.tutteli.kbox

/**
* Glues the given [tuple2] to this [Tuple2] and thus results in a [Tuple4].
*
* You can also think of it as all values of the given [tuple2] are [Tuple2.append]ed to this [Tuple2].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4> Tuple2<A1, A2>.glue(
    tuple2: Tuple2<A3, A4>
): Tuple4<A1, A2, A3, A4> =
    Tuple4(a1, a2, tuple2.a1, tuple2.a2)

/**
* Glues the given [tuple3] to this [Tuple2] and thus results in a [Tuple5].
*
* You can also think of it as all values of the given [tuple3] are [Tuple2.append]ed to this [Tuple2].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5> Tuple2<A1, A2>.glue(
    tuple3: Tuple3<A3, A4, A5>
): Tuple5<A1, A2, A3, A4, A5> =
    Tuple5(a1, a2, tuple3.a1, tuple3.a2, tuple3.a3)

/**
* Glues the given [tuple4] to this [Tuple2] and thus results in a [Tuple6].
*
* You can also think of it as all values of the given [tuple4] are [Tuple2.append]ed to this [Tuple2].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6> Tuple2<A1, A2>.glue(
    tuple4: Tuple4<A3, A4, A5, A6>
): Tuple6<A1, A2, A3, A4, A5, A6> =
    Tuple6(a1, a2, tuple4.a1, tuple4.a2, tuple4.a3, tuple4.a4)

/**
* Glues the given [tuple5] to this [Tuple2] and thus results in a [Tuple7].
*
* You can also think of it as all values of the given [tuple5] are [Tuple2.append]ed to this [Tuple2].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Tuple2<A1, A2>.glue(
    tuple5: Tuple5<A3, A4, A5, A6, A7>
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(a1, a2, tuple5.a1, tuple5.a2, tuple5.a3, tuple5.a4, tuple5.a5)

/**
* Glues the given [tuple6] to this [Tuple2] and thus results in a [Tuple8].
*
* You can also think of it as all values of the given [tuple6] are [Tuple2.append]ed to this [Tuple2].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple2<A1, A2>.glue(
    tuple6: Tuple6<A3, A4, A5, A6, A7, A8>
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, tuple6.a1, tuple6.a2, tuple6.a3, tuple6.a4, tuple6.a5, tuple6.a6)

/**
* Glues the given [tuple7] to this [Tuple2] and thus results in a [Tuple9].
*
* You can also think of it as all values of the given [tuple7] are [Tuple2.append]ed to this [Tuple2].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple2<A1, A2>.glue(
    tuple7: Tuple7<A3, A4, A5, A6, A7, A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, tuple7.a1, tuple7.a2, tuple7.a3, tuple7.a4, tuple7.a5, tuple7.a6, tuple7.a7)

/**
* Glues the given [tuple2] to this [Tuple3] and thus results in a [Tuple5].
*
* You can also think of it as all values of the given [tuple2] are [Tuple3.append]ed to this [Tuple3].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5> Tuple3<A1, A2, A3>.glue(
    tuple2: Tuple2<A4, A5>
): Tuple5<A1, A2, A3, A4, A5> =
    Tuple5(a1, a2, a3, tuple2.a1, tuple2.a2)

/**
* Glues the given [tuple3] to this [Tuple3] and thus results in a [Tuple6].
*
* You can also think of it as all values of the given [tuple3] are [Tuple3.append]ed to this [Tuple3].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6> Tuple3<A1, A2, A3>.glue(
    tuple3: Tuple3<A4, A5, A6>
): Tuple6<A1, A2, A3, A4, A5, A6> =
    Tuple6(a1, a2, a3, tuple3.a1, tuple3.a2, tuple3.a3)

/**
* Glues the given [tuple4] to this [Tuple3] and thus results in a [Tuple7].
*
* You can also think of it as all values of the given [tuple4] are [Tuple3.append]ed to this [Tuple3].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Tuple3<A1, A2, A3>.glue(
    tuple4: Tuple4<A4, A5, A6, A7>
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(a1, a2, a3, tuple4.a1, tuple4.a2, tuple4.a3, tuple4.a4)

/**
* Glues the given [tuple5] to this [Tuple3] and thus results in a [Tuple8].
*
* You can also think of it as all values of the given [tuple5] are [Tuple3.append]ed to this [Tuple3].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple3<A1, A2, A3>.glue(
    tuple5: Tuple5<A4, A5, A6, A7, A8>
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, a3, tuple5.a1, tuple5.a2, tuple5.a3, tuple5.a4, tuple5.a5)

/**
* Glues the given [tuple6] to this [Tuple3] and thus results in a [Tuple9].
*
* You can also think of it as all values of the given [tuple6] are [Tuple3.append]ed to this [Tuple3].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple3<A1, A2, A3>.glue(
    tuple6: Tuple6<A4, A5, A6, A7, A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, tuple6.a1, tuple6.a2, tuple6.a3, tuple6.a4, tuple6.a5, tuple6.a6)

/**
* Glues the given [tuple2] to this [Tuple4] and thus results in a [Tuple6].
*
* You can also think of it as all values of the given [tuple2] are [Tuple4.append]ed to this [Tuple4].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6> Tuple4<A1, A2, A3, A4>.glue(
    tuple2: Tuple2<A5, A6>
): Tuple6<A1, A2, A3, A4, A5, A6> =
    Tuple6(a1, a2, a3, a4, tuple2.a1, tuple2.a2)

/**
* Glues the given [tuple3] to this [Tuple4] and thus results in a [Tuple7].
*
* You can also think of it as all values of the given [tuple3] are [Tuple4.append]ed to this [Tuple4].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Tuple4<A1, A2, A3, A4>.glue(
    tuple3: Tuple3<A5, A6, A7>
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(a1, a2, a3, a4, tuple3.a1, tuple3.a2, tuple3.a3)

/**
* Glues the given [tuple4] to this [Tuple4] and thus results in a [Tuple8].
*
* You can also think of it as all values of the given [tuple4] are [Tuple4.append]ed to this [Tuple4].
*
* @since 2.0.0
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
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple4<A1, A2, A3, A4>.glue(
    tuple5: Tuple5<A5, A6, A7, A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, tuple5.a1, tuple5.a2, tuple5.a3, tuple5.a4, tuple5.a5)

/**
* Glues the given [tuple2] to this [Tuple5] and thus results in a [Tuple7].
*
* You can also think of it as all values of the given [tuple2] are [Tuple5.append]ed to this [Tuple5].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7> Tuple5<A1, A2, A3, A4, A5>.glue(
    tuple2: Tuple2<A6, A7>
): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
    Tuple7(a1, a2, a3, a4, a5, tuple2.a1, tuple2.a2)

/**
* Glues the given [tuple3] to this [Tuple5] and thus results in a [Tuple8].
*
* You can also think of it as all values of the given [tuple3] are [Tuple5.append]ed to this [Tuple5].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple5<A1, A2, A3, A4, A5>.glue(
    tuple3: Tuple3<A6, A7, A8>
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, a3, a4, a5, tuple3.a1, tuple3.a2, tuple3.a3)

/**
* Glues the given [tuple4] to this [Tuple5] and thus results in a [Tuple9].
*
* You can also think of it as all values of the given [tuple4] are [Tuple5.append]ed to this [Tuple5].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple5<A1, A2, A3, A4, A5>.glue(
    tuple4: Tuple4<A6, A7, A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, tuple4.a1, tuple4.a2, tuple4.a3, tuple4.a4)

/**
* Glues the given [tuple2] to this [Tuple6] and thus results in a [Tuple8].
*
* You can also think of it as all values of the given [tuple2] are [Tuple6.append]ed to this [Tuple6].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple6<A1, A2, A3, A4, A5, A6>.glue(
    tuple2: Tuple2<A7, A8>
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, a3, a4, a5, a6, tuple2.a1, tuple2.a2)

/**
* Glues the given [tuple3] to this [Tuple6] and thus results in a [Tuple9].
*
* You can also think of it as all values of the given [tuple3] are [Tuple6.append]ed to this [Tuple6].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple6<A1, A2, A3, A4, A5, A6>.glue(
    tuple3: Tuple3<A7, A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, a6, tuple3.a1, tuple3.a2, tuple3.a3)

/**
* Glues the given [tuple2] to this [Tuple7] and thus results in a [Tuple9].
*
* You can also think of it as all values of the given [tuple2] are [Tuple7.append]ed to this [Tuple7].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple7<A1, A2, A3, A4, A5, A6, A7>.glue(
    tuple2: Tuple2<A8, A9>
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, a6, a7, tuple2.a1, tuple2.a2)

