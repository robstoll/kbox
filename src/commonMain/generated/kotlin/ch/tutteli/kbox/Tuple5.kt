// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

/**
 * Represents a simple data structure to hold 5 values.
 *
 * @param A1 The type of the 1st component of this Tuple5.
 * @param A2 The type of the 2nd component of this Tuple5.
 * @param A3 The type of the 3rd component of this Tuple5.
 * @param A4 The type of the 4th component of this Tuple5.
 * @param A5 The type of the 5th component of this Tuple5.
 *
 * @param a1 the 1st component of this Tuple5.
 * @param a2 the 2nd component of this Tuple5.
 * @param a3 the 3rd component of this Tuple5.
 * @param a4 the 4th component of this Tuple5.
 * @param a5 the 5th component of this Tuple5.
 *
 * @since 2.0.0
 */
data class Tuple5<out A1, out A2, out A3, out A4, out A5>(
    val a1: A1,
    val a2: A2,
    val a3: A3,
    val a4: A4,
    val a5: A5,
)
