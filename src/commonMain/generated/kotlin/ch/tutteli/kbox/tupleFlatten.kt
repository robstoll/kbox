// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

/**
* Flattens [Pair] into a [List].
*
* @since 2.2.0
*/
fun <A1 : SuperT, A2 : SuperT, SuperT> Pair<A1, A2>.flatten(): List<SuperT> =
    listOf(first, second)

/**
* Flattens [Triple] into a [List].
*
* @since 2.2.0
*/
fun <A1 : SuperT, A2 : SuperT, A3 : SuperT, SuperT> Triple<A1, A2, A3>.flatten(): List<SuperT> =
    listOf(first, second, third)

/**
* Flattens [Tuple4] into a [List].
*
* @since 2.2.0
*/
fun <A1 : SuperT, A2 : SuperT, A3 : SuperT, A4 : SuperT, SuperT> Tuple4<A1, A2, A3, A4>.flatten(): List<SuperT> =
    listOf(a1, a2, a3, a4)

/**
* Flattens [Tuple5] into a [List].
*
* @since 2.2.0
*/
fun <A1 : SuperT, A2 : SuperT, A3 : SuperT, A4 : SuperT, A5 : SuperT, SuperT> Tuple5<A1, A2, A3, A4, A5>.flatten(): List<SuperT> =
    listOf(a1, a2, a3, a4, a5)

/**
* Flattens [Tuple6] into a [List].
*
* @since 2.2.0
*/
fun <A1 : SuperT, A2 : SuperT, A3 : SuperT, A4 : SuperT, A5 : SuperT, A6 : SuperT, SuperT> Tuple6<A1, A2, A3, A4, A5, A6>.flatten(): List<SuperT> =
    listOf(a1, a2, a3, a4, a5, a6)

/**
* Flattens [Tuple7] into a [List].
*
* @since 2.2.0
*/
fun <A1 : SuperT, A2 : SuperT, A3 : SuperT, A4 : SuperT, A5 : SuperT, A6 : SuperT, A7 : SuperT, SuperT> Tuple7<A1, A2, A3, A4, A5, A6, A7>.flatten(): List<SuperT> =
    listOf(a1, a2, a3, a4, a5, a6, a7)

/**
* Flattens [Tuple8] into a [List].
*
* @since 2.2.0
*/
fun <A1 : SuperT, A2 : SuperT, A3 : SuperT, A4 : SuperT, A5 : SuperT, A6 : SuperT, A7 : SuperT, A8 : SuperT, SuperT> Tuple8<A1, A2, A3, A4, A5, A6, A7, A8>.flatten(): List<SuperT> =
    listOf(a1, a2, a3, a4, a5, a6, a7, a8)

/**
* Flattens [Tuple9] into a [List].
*
* @since 2.2.0
*/
fun <A1 : SuperT, A2 : SuperT, A3 : SuperT, A4 : SuperT, A5 : SuperT, A6 : SuperT, A7 : SuperT, A8 : SuperT, A9 : SuperT, SuperT> Tuple9<A1, A2, A3, A4, A5, A6, A7, A8, A9>.flatten(): List<SuperT> =
    listOf(a1, a2, a3, a4, a5, a6, a7, a8, a9)

