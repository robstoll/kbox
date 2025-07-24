// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

/**
 * Represents a tuple like data structure which has 2 components.
 *
 * @since 2.1.0
 */
interface Tuple2Like<A1, A2> {
    /**
     * Returns the 1st component of this Tuple2Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component1(): A1

    /**
     * Returns the 2nd component of this Tuple2Like data structure.
     *
     * @since 2.1.0
     */
    operator fun component2(): A2

    /**
     * Turns this class into a [Tuple2].
     *
     * @since 2.1.0
     */
    fun toTuple(): Tuple2<A1, A2> = Tuple2(
        component1(),
        component2()
    )
}
