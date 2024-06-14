// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

/**
 * Represents a tuple like data structure which has 7 components.
 *
 * @since 2.1.0
 */
interface Tuple7Like<A1, A2, A3, A4, A5, A6, A7> {
    /**
     * Returns the 1st component of this Tuple7Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component1(): A1

    /**
     * Returns the 2nd component of this Tuple7Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component2(): A2

    /**
     * Returns the 3rd component of this Tuple7Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component3(): A3

    /**
     * Returns the 4th component of this Tuple7Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component4(): A4

    /**
     * Returns the 5th component of this Tuple7Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component5(): A5

    /**
     * Returns the 6th component of this Tuple7Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component6(): A6

    /**
     * Returns the 7th component of this Tuple7Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component7(): A7

    /**
     * Turns this class into a [Tuple7].
     *
     * @since 2.1.0
     */
    fun toTuple(): Tuple7<A1, A2, A3, A4, A5, A6, A7> = Tuple7(
        component1(),
        component2(),
        component3(),
        component4(),
        component5(),
        component6(),
        component7()
    )
}
