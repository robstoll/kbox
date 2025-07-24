// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

/**
 * Creates a new [Tuple2] by copying `this` [Tuple3] but dropping its 1st component ([Tuple3.a1]).
 *
 * @return The newly created [Tuple2].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3> Tuple3<A1, A2, A3>.dropA1(): Tuple2<A2, A3> =
	Tuple(a2, a3)

/**
 * Creates a new [Tuple2] by copying `this` [Triple] but dropping its 1st component ([Triple.first]).
 *
 * @return The newly created [Tuple2].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3> Triple<A1, A2, A3>.dropFirst(): Tuple2<A2, A3> =
	Tuple(a2, a3)

/**
 * Creates a new [Tuple2] by copying `this` [Tuple3] but dropping its 2nd component ([Tuple3.a2]).
 *
 * @return The newly created [Tuple2].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3> Tuple3<A1, A2, A3>.dropA2(): Tuple2<A1, A3> =
	Tuple(a1, a3)

/**
 * Creates a new [Tuple2] by copying `this` [Triple] but dropping its 2nd component ([Triple.second]).
 *
 * @return The newly created [Tuple2].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3> Triple<A1, A2, A3>.dropSecond(): Tuple2<A1, A3> =
	Tuple(a1, a3)

/**
 * Creates a new [Tuple2] by copying `this` [Tuple3] but dropping its 3rd component ([Tuple3.a3]).
 *
 * @return The newly created [Tuple2].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3> Tuple3<A1, A2, A3>.dropA3(): Tuple2<A1, A2> =
	Tuple(a1, a2)

/**
 * Creates a new [Tuple2] by copying `this` [Triple] but dropping its 3rd component ([Triple.third]).
 *
 * @return The newly created [Tuple2].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3> Triple<A1, A2, A3>.dropThird(): Tuple2<A1, A2> =
	Tuple(a1, a2)

/**
 * Creates a new [Tuple3] by copying `this` [Tuple4] but dropping its 1st component ([Tuple4.a1]).
 *
 * @return The newly created [Tuple3].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4> Tuple4<A1, A2, A3, A4>.dropA1(): Tuple3<A2, A3, A4> =
	Tuple(a2, a3, a4)

/**
 * Creates a new [Tuple3] by copying `this` [Tuple4] but dropping its 2nd component ([Tuple4.a2]).
 *
 * @return The newly created [Tuple3].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4> Tuple4<A1, A2, A3, A4>.dropA2(): Tuple3<A1, A3, A4> =
	Tuple(a1, a3, a4)

/**
 * Creates a new [Tuple3] by copying `this` [Tuple4] but dropping its 3rd component ([Tuple4.a3]).
 *
 * @return The newly created [Tuple3].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4> Tuple4<A1, A2, A3, A4>.dropA3(): Tuple3<A1, A2, A4> =
	Tuple(a1, a2, a4)

/**
 * Creates a new [Tuple3] by copying `this` [Tuple4] but dropping its 4th component ([Tuple4.a4]).
 *
 * @return The newly created [Tuple3].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4> Tuple4<A1, A2, A3, A4>.dropA4(): Tuple3<A1, A2, A3> =
	Tuple(a1, a2, a3)

/**
 * Creates a new [Tuple4] by copying `this` [Tuple5] but dropping its 1st component ([Tuple5.a1]).
 *
 * @return The newly created [Tuple4].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5> Tuple5<A1, A2, A3, A4, A5>.dropA1(): Tuple4<A2, A3, A4, A5> =
	Tuple(a2, a3, a4, a5)

/**
 * Creates a new [Tuple4] by copying `this` [Tuple5] but dropping its 2nd component ([Tuple5.a2]).
 *
 * @return The newly created [Tuple4].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5> Tuple5<A1, A2, A3, A4, A5>.dropA2(): Tuple4<A1, A3, A4, A5> =
	Tuple(a1, a3, a4, a5)

/**
 * Creates a new [Tuple4] by copying `this` [Tuple5] but dropping its 3rd component ([Tuple5.a3]).
 *
 * @return The newly created [Tuple4].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5> Tuple5<A1, A2, A3, A4, A5>.dropA3(): Tuple4<A1, A2, A4, A5> =
	Tuple(a1, a2, a4, a5)

/**
 * Creates a new [Tuple4] by copying `this` [Tuple5] but dropping its 4th component ([Tuple5.a4]).
 *
 * @return The newly created [Tuple4].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5> Tuple5<A1, A2, A3, A4, A5>.dropA4(): Tuple4<A1, A2, A3, A5> =
	Tuple(a1, a2, a3, a5)

/**
 * Creates a new [Tuple4] by copying `this` [Tuple5] but dropping its 5th component ([Tuple5.a5]).
 *
 * @return The newly created [Tuple4].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5> Tuple5<A1, A2, A3, A4, A5>.dropA5(): Tuple4<A1, A2, A3, A4> =
	Tuple(a1, a2, a3, a4)

/**
 * Creates a new [Tuple5] by copying `this` [Tuple6] but dropping its 1st component ([Tuple6.a1]).
 *
 * @return The newly created [Tuple5].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6> Tuple6<A1, A2, A3, A4, A5, A6>.dropA1(): Tuple5<A2, A3, A4, A5, A6> =
	Tuple(a2, a3, a4, a5, a6)

/**
 * Creates a new [Tuple5] by copying `this` [Tuple6] but dropping its 2nd component ([Tuple6.a2]).
 *
 * @return The newly created [Tuple5].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6> Tuple6<A1, A2, A3, A4, A5, A6>.dropA2(): Tuple5<A1, A3, A4, A5, A6> =
	Tuple(a1, a3, a4, a5, a6)

/**
 * Creates a new [Tuple5] by copying `this` [Tuple6] but dropping its 3rd component ([Tuple6.a3]).
 *
 * @return The newly created [Tuple5].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6> Tuple6<A1, A2, A3, A4, A5, A6>.dropA3(): Tuple5<A1, A2, A4, A5, A6> =
	Tuple(a1, a2, a4, a5, a6)

/**
 * Creates a new [Tuple5] by copying `this` [Tuple6] but dropping its 4th component ([Tuple6.a4]).
 *
 * @return The newly created [Tuple5].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6> Tuple6<A1, A2, A3, A4, A5, A6>.dropA4(): Tuple5<A1, A2, A3, A5, A6> =
	Tuple(a1, a2, a3, a5, a6)

/**
 * Creates a new [Tuple5] by copying `this` [Tuple6] but dropping its 5th component ([Tuple6.a5]).
 *
 * @return The newly created [Tuple5].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6> Tuple6<A1, A2, A3, A4, A5, A6>.dropA5(): Tuple5<A1, A2, A3, A4, A6> =
	Tuple(a1, a2, a3, a4, a6)

/**
 * Creates a new [Tuple5] by copying `this` [Tuple6] but dropping its 6th component ([Tuple6.a6]).
 *
 * @return The newly created [Tuple5].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6> Tuple6<A1, A2, A3, A4, A5, A6>.dropA6(): Tuple5<A1, A2, A3, A4, A5> =
	Tuple(a1, a2, a3, a4, a5)

/**
 * Creates a new [Tuple6] by copying `this` [Tuple7] but dropping its 1st component ([Tuple7.a1]).
 *
 * @return The newly created [Tuple6].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7> Tuple7<A1, A2, A3, A4, A5, A6, A7>.dropA1(): Tuple6<A2, A3, A4, A5, A6, A7> =
	Tuple(a2, a3, a4, a5, a6, a7)

/**
 * Creates a new [Tuple6] by copying `this` [Tuple7] but dropping its 2nd component ([Tuple7.a2]).
 *
 * @return The newly created [Tuple6].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7> Tuple7<A1, A2, A3, A4, A5, A6, A7>.dropA2(): Tuple6<A1, A3, A4, A5, A6, A7> =
	Tuple(a1, a3, a4, a5, a6, a7)

/**
 * Creates a new [Tuple6] by copying `this` [Tuple7] but dropping its 3rd component ([Tuple7.a3]).
 *
 * @return The newly created [Tuple6].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7> Tuple7<A1, A2, A3, A4, A5, A6, A7>.dropA3(): Tuple6<A1, A2, A4, A5, A6, A7> =
	Tuple(a1, a2, a4, a5, a6, a7)

/**
 * Creates a new [Tuple6] by copying `this` [Tuple7] but dropping its 4th component ([Tuple7.a4]).
 *
 * @return The newly created [Tuple6].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7> Tuple7<A1, A2, A3, A4, A5, A6, A7>.dropA4(): Tuple6<A1, A2, A3, A5, A6, A7> =
	Tuple(a1, a2, a3, a5, a6, a7)

/**
 * Creates a new [Tuple6] by copying `this` [Tuple7] but dropping its 5th component ([Tuple7.a5]).
 *
 * @return The newly created [Tuple6].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7> Tuple7<A1, A2, A3, A4, A5, A6, A7>.dropA5(): Tuple6<A1, A2, A3, A4, A6, A7> =
	Tuple(a1, a2, a3, a4, a6, a7)

/**
 * Creates a new [Tuple6] by copying `this` [Tuple7] but dropping its 6th component ([Tuple7.a6]).
 *
 * @return The newly created [Tuple6].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7> Tuple7<A1, A2, A3, A4, A5, A6, A7>.dropA6(): Tuple6<A1, A2, A3, A4, A5, A7> =
	Tuple(a1, a2, a3, a4, a5, a7)

/**
 * Creates a new [Tuple6] by copying `this` [Tuple7] but dropping its 7th component ([Tuple7.a7]).
 *
 * @return The newly created [Tuple6].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7> Tuple7<A1, A2, A3, A4, A5, A6, A7>.dropA7(): Tuple6<A1, A2, A3, A4, A5, A6> =
	Tuple(a1, a2, a3, a4, a5, a6)

/**
 * Creates a new [Tuple7] by copying `this` [Tuple8] but dropping its 1st component ([Tuple8.a1]).
 *
 * @return The newly created [Tuple7].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.dropA1(): Tuple7<A2, A3, A4, A5, A6, A7, A8> =
	Tuple(a2, a3, a4, a5, a6, a7, a8)

/**
 * Creates a new [Tuple7] by copying `this` [Tuple8] but dropping its 2nd component ([Tuple8.a2]).
 *
 * @return The newly created [Tuple7].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.dropA2(): Tuple7<A1, A3, A4, A5, A6, A7, A8> =
	Tuple(a1, a3, a4, a5, a6, a7, a8)

/**
 * Creates a new [Tuple7] by copying `this` [Tuple8] but dropping its 3rd component ([Tuple8.a3]).
 *
 * @return The newly created [Tuple7].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.dropA3(): Tuple7<A1, A2, A4, A5, A6, A7, A8> =
	Tuple(a1, a2, a4, a5, a6, a7, a8)

/**
 * Creates a new [Tuple7] by copying `this` [Tuple8] but dropping its 4th component ([Tuple8.a4]).
 *
 * @return The newly created [Tuple7].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.dropA4(): Tuple7<A1, A2, A3, A5, A6, A7, A8> =
	Tuple(a1, a2, a3, a5, a6, a7, a8)

/**
 * Creates a new [Tuple7] by copying `this` [Tuple8] but dropping its 5th component ([Tuple8.a5]).
 *
 * @return The newly created [Tuple7].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.dropA5(): Tuple7<A1, A2, A3, A4, A6, A7, A8> =
	Tuple(a1, a2, a3, a4, a6, a7, a8)

/**
 * Creates a new [Tuple7] by copying `this` [Tuple8] but dropping its 6th component ([Tuple8.a6]).
 *
 * @return The newly created [Tuple7].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.dropA6(): Tuple7<A1, A2, A3, A4, A5, A7, A8> =
	Tuple(a1, a2, a3, a4, a5, a7, a8)

/**
 * Creates a new [Tuple7] by copying `this` [Tuple8] but dropping its 7th component ([Tuple8.a7]).
 *
 * @return The newly created [Tuple7].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.dropA7(): Tuple7<A1, A2, A3, A4, A5, A6, A8> =
	Tuple(a1, a2, a3, a4, a5, a6, a8)

/**
 * Creates a new [Tuple7] by copying `this` [Tuple8] but dropping its 8th component ([Tuple8.a8]).
 *
 * @return The newly created [Tuple7].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.dropA8(): Tuple7<A1, A2, A3, A4, A5, A6, A7> =
	Tuple(a1, a2, a3, a4, a5, a6, a7)

/**
 * Creates a new [Tuple8] by copying `this` [Tuple9] but dropping its 1st component ([Tuple9.a1]).
 *
 * @return The newly created [Tuple8].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.dropA1(): Tuple8<A2, A3, A4, A5, A6, A7, A8, A9> =
	Tuple(a2, a3, a4, a5, a6, a7, a8, a9)

/**
 * Creates a new [Tuple8] by copying `this` [Tuple9] but dropping its 2nd component ([Tuple9.a2]).
 *
 * @return The newly created [Tuple8].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.dropA2(): Tuple8<A1, A3, A4, A5, A6, A7, A8, A9> =
	Tuple(a1, a3, a4, a5, a6, a7, a8, a9)

/**
 * Creates a new [Tuple8] by copying `this` [Tuple9] but dropping its 3rd component ([Tuple9.a3]).
 *
 * @return The newly created [Tuple8].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.dropA3(): Tuple8<A1, A2, A4, A5, A6, A7, A8, A9> =
	Tuple(a1, a2, a4, a5, a6, a7, a8, a9)

/**
 * Creates a new [Tuple8] by copying `this` [Tuple9] but dropping its 4th component ([Tuple9.a4]).
 *
 * @return The newly created [Tuple8].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.dropA4(): Tuple8<A1, A2, A3, A5, A6, A7, A8, A9> =
	Tuple(a1, a2, a3, a5, a6, a7, a8, a9)

/**
 * Creates a new [Tuple8] by copying `this` [Tuple9] but dropping its 5th component ([Tuple9.a5]).
 *
 * @return The newly created [Tuple8].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.dropA5(): Tuple8<A1, A2, A3, A4, A6, A7, A8, A9> =
	Tuple(a1, a2, a3, a4, a6, a7, a8, a9)

/**
 * Creates a new [Tuple8] by copying `this` [Tuple9] but dropping its 6th component ([Tuple9.a6]).
 *
 * @return The newly created [Tuple8].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.dropA6(): Tuple8<A1, A2, A3, A4, A5, A7, A8, A9> =
	Tuple(a1, a2, a3, a4, a5, a7, a8, a9)

/**
 * Creates a new [Tuple8] by copying `this` [Tuple9] but dropping its 7th component ([Tuple9.a7]).
 *
 * @return The newly created [Tuple8].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.dropA7(): Tuple8<A1, A2, A3, A4, A5, A6, A8, A9> =
	Tuple(a1, a2, a3, a4, a5, a6, a8, a9)

/**
 * Creates a new [Tuple8] by copying `this` [Tuple9] but dropping its 8th component ([Tuple9.a8]).
 *
 * @return The newly created [Tuple8].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.dropA8(): Tuple8<A1, A2, A3, A4, A5, A6, A7, A9> =
	Tuple(a1, a2, a3, a4, a5, a6, a7, a9)

/**
 * Creates a new [Tuple8] by copying `this` [Tuple9] but dropping its 9th component ([Tuple9.a9]).
 *
 * @return The newly created [Tuple8].
 *
 * @since 3.2.0
 */
fun <A1, A2, A3, A4, A5, A6, A7, A8, A9> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.dropA9(): Tuple8<A1, A2, A3, A4, A5, A6, A7, A8> =
	Tuple(a1, a2, a3, a4, a5, a6, a7, a8)

