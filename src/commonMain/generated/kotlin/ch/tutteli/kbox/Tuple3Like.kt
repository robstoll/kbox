// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

/**
 * Represents a tuple like data structure which has 3 components.
 *
 * @since 2.1.0
 */
interface Tuple3Like<A1, A2, A3> {
    /**
     * Returns the 1st component of this Tuple3Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component1(): A1

    /**
     * Returns the 2nd component of this Tuple3Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component2(): A2

    /**
     * Returns the 3rd component of this Tuple3Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component3(): A3

    /**
     * Turns this class into a [Tuple3].
     *
     * @since 2.1.0
     */
    fun toTuple(): Tuple3<A1, A2, A3> = Tuple3(
        component1(),
        component2(),
        component3()
    )
}
