// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.toTuple

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple6LikeToTupleTest {

    @Test
    fun toTuple__returns_Tuple6_in_correct_order() {
       val dataClass = Dummy6("string", 1, 2L, 3F, 4.0, 'c')
       expect(dataClass.toTuple()).toBeAnInstanceOf<Tuple6<String, Int, Long, Float, Double, Char>> {
           feature { f(it::component1) }.toEqual("string")
           feature { f(it::component2) }.toEqual(1)
           feature { f(it::component3) }.toEqual(2L)
           feature { f(it::component4) }.toEqual(3F)
           feature { f(it::component5) }.toEqual(4.0)
           feature { f(it::component6) }.toEqual('c')
       }
    }

    data class Dummy6(
        val a1: String,
        val a2: Int,
        val a3: Long,
        val a4: Float,
        val a5: Double,
        val a6: Char
    ): Tuple6Like<String, Int, Long, Float, Double, Char>
}