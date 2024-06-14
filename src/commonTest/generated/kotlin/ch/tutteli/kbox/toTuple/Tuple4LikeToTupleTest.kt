// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.toTuple

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple4LikeToTupleTest {

    @Test
    fun toTuple__returns_Tuple4_in_correct_order() {
       val dataClass = Dummy4("string", 1, 2L, 3F)
       expect(dataClass.toTuple()).toBeAnInstanceOf<Tuple4<String, Int, Long, Float>> {
           feature { f(it::component1) }.toEqual("string")
           feature { f(it::component2) }.toEqual(1)
           feature { f(it::component3) }.toEqual(2L)
           feature { f(it::component4) }.toEqual(3F)
       }
    }

    data class Dummy4(
        val a1: String,
        val a2: Int,
        val a3: Long,
        val a4: Float
    ): Tuple4Like<String, Int, Long, Float>
}