// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

/**
* Maps [Pair.a1] with the given [transform] function and returns a new [Pair].
*
* @since 2.0.0
*/
fun <A1, A2, A1New> Pair<A1, A2>.mapA1(
    transform: (A1) -> A1New
): Pair<A1New, A2> =
    Pair(transform(a1), a2)

/**
* Maps [Pair.first] with the given [transform] function and returns a new [Pair].
*
* @since 2.0.0
*/
fun <A1, A2, A1New> Pair<A1, A2>.mapFirst(
    transform: (A1) -> A1New
): Pair<A1New, A2> =
    Pair(transform(a1), a2)

/**
* Maps [Pair.a2] with the given [transform] function and returns a new [Pair].
*
* @since 2.0.0
*/
fun <A1, A2, A2New> Pair<A1, A2>.mapA2(
    transform: (A2) -> A2New
): Pair<A1, A2New> =
    Pair(a1, transform(a2))

/**
* Maps [Pair.second] with the given [transform] function and returns a new [Pair].
*
* @since 2.0.0
*/
fun <A1, A2, A2New> Pair<A1, A2>.mapSecond(
    transform: (A2) -> A2New
): Pair<A1, A2New> =
    Pair(a1, transform(a2))

/**
* Maps [Triple.a1] with the given [transform] function and returns a new [Triple].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A1New> Triple<A1, A2, A3>.mapA1(
    transform: (A1) -> A1New
): Triple<A1New, A2, A3> =
    Triple(transform(a1), a2, a3)

/**
* Maps [Triple.first] with the given [transform] function and returns a new [Triple].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A1New> Triple<A1, A2, A3>.mapFirst(
    transform: (A1) -> A1New
): Triple<A1New, A2, A3> =
    Triple(transform(a1), a2, a3)

/**
* Maps [Triple.a2] with the given [transform] function and returns a new [Triple].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A2New> Triple<A1, A2, A3>.mapA2(
    transform: (A2) -> A2New
): Triple<A1, A2New, A3> =
    Triple(a1, transform(a2), a3)

/**
* Maps [Triple.second] with the given [transform] function and returns a new [Triple].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A2New> Triple<A1, A2, A3>.mapSecond(
    transform: (A2) -> A2New
): Triple<A1, A2New, A3> =
    Triple(a1, transform(a2), a3)

/**
* Maps [Triple.a3] with the given [transform] function and returns a new [Triple].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A3New> Triple<A1, A2, A3>.mapA3(
    transform: (A3) -> A3New
): Triple<A1, A2, A3New> =
    Triple(a1, a2, transform(a3))

/**
* Maps [Triple.third] with the given [transform] function and returns a new [Triple].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A3New> Triple<A1, A2, A3>.mapThird(
    transform: (A3) -> A3New
): Triple<A1, A2, A3New> =
    Triple(a1, a2, transform(a3))

/**
* Maps [Tuple4.a1] with the given [transform] function and returns a new [Tuple4].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A1New> Tuple4<A1, A2, A3, A4>.mapA1(
    transform: (A1) -> A1New
): Tuple4<A1New, A2, A3, A4> =
    Tuple4(transform(a1), a2, a3, a4)

/**
* Maps [Tuple4.a2] with the given [transform] function and returns a new [Tuple4].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A2New> Tuple4<A1, A2, A3, A4>.mapA2(
    transform: (A2) -> A2New
): Tuple4<A1, A2New, A3, A4> =
    Tuple4(a1, transform(a2), a3, a4)

/**
* Maps [Tuple4.a3] with the given [transform] function and returns a new [Tuple4].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A3New> Tuple4<A1, A2, A3, A4>.mapA3(
    transform: (A3) -> A3New
): Tuple4<A1, A2, A3New, A4> =
    Tuple4(a1, a2, transform(a3), a4)

/**
* Maps [Tuple4.a4] with the given [transform] function and returns a new [Tuple4].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A4New> Tuple4<A1, A2, A3, A4>.mapA4(
    transform: (A4) -> A4New
): Tuple4<A1, A2, A3, A4New> =
    Tuple4(a1, a2, a3, transform(a4))

/**
* Maps [Tuple5.a1] with the given [transform] function and returns a new [Tuple5].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A1New> Tuple5<A1, A2, A3, A4, A5>.mapA1(
    transform: (A1) -> A1New
): Tuple5<A1New, A2, A3, A4, A5> =
    Tuple5(transform(a1), a2, a3, a4, a5)

/**
* Maps [Tuple5.a2] with the given [transform] function and returns a new [Tuple5].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A2New> Tuple5<A1, A2, A3, A4, A5>.mapA2(
    transform: (A2) -> A2New
): Tuple5<A1, A2New, A3, A4, A5> =
    Tuple5(a1, transform(a2), a3, a4, a5)

/**
* Maps [Tuple5.a3] with the given [transform] function and returns a new [Tuple5].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A3New> Tuple5<A1, A2, A3, A4, A5>.mapA3(
    transform: (A3) -> A3New
): Tuple5<A1, A2, A3New, A4, A5> =
    Tuple5(a1, a2, transform(a3), a4, a5)

/**
* Maps [Tuple5.a4] with the given [transform] function and returns a new [Tuple5].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A4New> Tuple5<A1, A2, A3, A4, A5>.mapA4(
    transform: (A4) -> A4New
): Tuple5<A1, A2, A3, A4New, A5> =
    Tuple5(a1, a2, a3, transform(a4), a5)

/**
* Maps [Tuple5.a5] with the given [transform] function and returns a new [Tuple5].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A5New> Tuple5<A1, A2, A3, A4, A5>.mapA5(
    transform: (A5) -> A5New
): Tuple5<A1, A2, A3, A4, A5New> =
    Tuple5(a1, a2, a3, a4, transform(a5))

/**
* Maps [Tuple6.a1] with the given [transform] function and returns a new [Tuple6].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A1New> Tuple6<A1, A2, A3, A4, A5, A6>.mapA1(
    transform: (A1) -> A1New
): Tuple6<A1New, A2, A3, A4, A5, A6> =
    Tuple6(transform(a1), a2, a3, a4, a5, a6)

/**
* Maps [Tuple6.a2] with the given [transform] function and returns a new [Tuple6].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A2New> Tuple6<A1, A2, A3, A4, A5, A6>.mapA2(
    transform: (A2) -> A2New
): Tuple6<A1, A2New, A3, A4, A5, A6> =
    Tuple6(a1, transform(a2), a3, a4, a5, a6)

/**
* Maps [Tuple6.a3] with the given [transform] function and returns a new [Tuple6].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A3New> Tuple6<A1, A2, A3, A4, A5, A6>.mapA3(
    transform: (A3) -> A3New
): Tuple6<A1, A2, A3New, A4, A5, A6> =
    Tuple6(a1, a2, transform(a3), a4, a5, a6)

/**
* Maps [Tuple6.a4] with the given [transform] function and returns a new [Tuple6].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A4New> Tuple6<A1, A2, A3, A4, A5, A6>.mapA4(
    transform: (A4) -> A4New
): Tuple6<A1, A2, A3, A4New, A5, A6> =
    Tuple6(a1, a2, a3, transform(a4), a5, a6)

/**
* Maps [Tuple6.a5] with the given [transform] function and returns a new [Tuple6].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A5New> Tuple6<A1, A2, A3, A4, A5, A6>.mapA5(
    transform: (A5) -> A5New
): Tuple6<A1, A2, A3, A4, A5New, A6> =
    Tuple6(a1, a2, a3, a4, transform(a5), a6)

/**
* Maps [Tuple6.a6] with the given [transform] function and returns a new [Tuple6].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A6New> Tuple6<A1, A2, A3, A4, A5, A6>.mapA6(
    transform: (A6) -> A6New
): Tuple6<A1, A2, A3, A4, A5, A6New> =
    Tuple6(a1, a2, a3, a4, a5, transform(a6))

/**
* Maps [Tuple7.a1] with the given [transform] function and returns a new [Tuple7].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A1New> Tuple7<A1, A2, A3, A4, A5, A6, A7>.mapA1(
    transform: (A1) -> A1New
): Tuple7<A1New, A2, A3, A4, A5, A6, A7> =
    Tuple7(transform(a1), a2, a3, a4, a5, a6, a7)

/**
* Maps [Tuple7.a2] with the given [transform] function and returns a new [Tuple7].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A2New> Tuple7<A1, A2, A3, A4, A5, A6, A7>.mapA2(
    transform: (A2) -> A2New
): Tuple7<A1, A2New, A3, A4, A5, A6, A7> =
    Tuple7(a1, transform(a2), a3, a4, a5, a6, a7)

/**
* Maps [Tuple7.a3] with the given [transform] function and returns a new [Tuple7].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A3New> Tuple7<A1, A2, A3, A4, A5, A6, A7>.mapA3(
    transform: (A3) -> A3New
): Tuple7<A1, A2, A3New, A4, A5, A6, A7> =
    Tuple7(a1, a2, transform(a3), a4, a5, a6, a7)

/**
* Maps [Tuple7.a4] with the given [transform] function and returns a new [Tuple7].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A4New> Tuple7<A1, A2, A3, A4, A5, A6, A7>.mapA4(
    transform: (A4) -> A4New
): Tuple7<A1, A2, A3, A4New, A5, A6, A7> =
    Tuple7(a1, a2, a3, transform(a4), a5, a6, a7)

/**
* Maps [Tuple7.a5] with the given [transform] function and returns a new [Tuple7].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A5New> Tuple7<A1, A2, A3, A4, A5, A6, A7>.mapA5(
    transform: (A5) -> A5New
): Tuple7<A1, A2, A3, A4, A5New, A6, A7> =
    Tuple7(a1, a2, a3, a4, transform(a5), a6, a7)

/**
* Maps [Tuple7.a6] with the given [transform] function and returns a new [Tuple7].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A6New> Tuple7<A1, A2, A3, A4, A5, A6, A7>.mapA6(
    transform: (A6) -> A6New
): Tuple7<A1, A2, A3, A4, A5, A6New, A7> =
    Tuple7(a1, a2, a3, a4, a5, transform(a6), a7)

/**
* Maps [Tuple7.a7] with the given [transform] function and returns a new [Tuple7].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A7New> Tuple7<A1, A2, A3, A4, A5, A6, A7>.mapA7(
    transform: (A7) -> A7New
): Tuple7<A1, A2, A3, A4, A5, A6, A7New> =
    Tuple7(a1, a2, a3, a4, a5, a6, transform(a7))

/**
* Maps [Tuple8.a1] with the given [transform] function and returns a new [Tuple8].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A1New> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.mapA1(
    transform: (A1) -> A1New
): Tuple8<A1New, A2, A3, A4, A5, A6, A7, A8> =
    Tuple8(transform(a1), a2, a3, a4, a5, a6, a7, a8)

/**
* Maps [Tuple8.a2] with the given [transform] function and returns a new [Tuple8].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A2New> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.mapA2(
    transform: (A2) -> A2New
): Tuple8<A1, A2New, A3, A4, A5, A6, A7, A8> =
    Tuple8(a1, transform(a2), a3, a4, a5, a6, a7, a8)

/**
* Maps [Tuple8.a3] with the given [transform] function and returns a new [Tuple8].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A3New> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.mapA3(
    transform: (A3) -> A3New
): Tuple8<A1, A2, A3New, A4, A5, A6, A7, A8> =
    Tuple8(a1, a2, transform(a3), a4, a5, a6, a7, a8)

/**
* Maps [Tuple8.a4] with the given [transform] function and returns a new [Tuple8].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A4New> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.mapA4(
    transform: (A4) -> A4New
): Tuple8<A1, A2, A3, A4New, A5, A6, A7, A8> =
    Tuple8(a1, a2, a3, transform(a4), a5, a6, a7, a8)

/**
* Maps [Tuple8.a5] with the given [transform] function and returns a new [Tuple8].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A5New> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.mapA5(
    transform: (A5) -> A5New
): Tuple8<A1, A2, A3, A4, A5New, A6, A7, A8> =
    Tuple8(a1, a2, a3, a4, transform(a5), a6, a7, a8)

/**
* Maps [Tuple8.a6] with the given [transform] function and returns a new [Tuple8].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A6New> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.mapA6(
    transform: (A6) -> A6New
): Tuple8<A1, A2, A3, A4, A5, A6New, A7, A8> =
    Tuple8(a1, a2, a3, a4, a5, transform(a6), a7, a8)

/**
* Maps [Tuple8.a7] with the given [transform] function and returns a new [Tuple8].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A7New> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.mapA7(
    transform: (A7) -> A7New
): Tuple8<A1, A2, A3, A4, A5, A6, A7New, A8> =
    Tuple8(a1, a2, a3, a4, a5, a6, transform(a7), a8)

/**
* Maps [Tuple8.a8] with the given [transform] function and returns a new [Tuple8].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A8New> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.mapA8(
    transform: (A8) -> A8New
): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8New> =
    Tuple8(a1, a2, a3, a4, a5, a6, a7, transform(a8))

/**
* Maps [Tuple9.a1] with the given [transform] function and returns a new [Tuple9].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9, A1New> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.mapA1(
    transform: (A1) -> A1New
): Tuple9<A1New, A2, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(transform(a1), a2, a3, a4, a5, a6, a7, a8, a9)

/**
* Maps [Tuple9.a2] with the given [transform] function and returns a new [Tuple9].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9, A2New> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.mapA2(
    transform: (A2) -> A2New
): Tuple9<A1, A2New, A3, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, transform(a2), a3, a4, a5, a6, a7, a8, a9)

/**
* Maps [Tuple9.a3] with the given [transform] function and returns a new [Tuple9].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9, A3New> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.mapA3(
    transform: (A3) -> A3New
): Tuple9<A1, A2, A3New, A4, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, transform(a3), a4, a5, a6, a7, a8, a9)

/**
* Maps [Tuple9.a4] with the given [transform] function and returns a new [Tuple9].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9, A4New> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.mapA4(
    transform: (A4) -> A4New
): Tuple9<A1, A2, A3, A4New, A5, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, transform(a4), a5, a6, a7, a8, a9)

/**
* Maps [Tuple9.a5] with the given [transform] function and returns a new [Tuple9].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9, A5New> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.mapA5(
    transform: (A5) -> A5New
): Tuple9<A1, A2, A3, A4, A5New, A6, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, transform(a5), a6, a7, a8, a9)

/**
* Maps [Tuple9.a6] with the given [transform] function and returns a new [Tuple9].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9, A6New> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.mapA6(
    transform: (A6) -> A6New
): Tuple9<A1, A2, A3, A4, A5, A6New, A7, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, transform(a6), a7, a8, a9)

/**
* Maps [Tuple9.a7] with the given [transform] function and returns a new [Tuple9].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9, A7New> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.mapA7(
    transform: (A7) -> A7New
): Tuple9<A1, A2, A3, A4, A5, A6, A7New, A8, A9> =
    Tuple9(a1, a2, a3, a4, a5, a6, transform(a7), a8, a9)

/**
* Maps [Tuple9.a8] with the given [transform] function and returns a new [Tuple9].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9, A8New> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.mapA8(
    transform: (A8) -> A8New
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8New, A9> =
    Tuple9(a1, a2, a3, a4, a5, a6, a7, transform(a8), a9)

/**
* Maps [Tuple9.a9] with the given [transform] function and returns a new [Tuple9].
*
* @since 2.0.0
*/
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9, A9New> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.mapA9(
    transform: (A9) -> A9New
): Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9New> =
    Tuple9(a1, a2, a3, a4, a5, a6, a7, a8, transform(a9))

