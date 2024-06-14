// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.toTuple

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple8LikeToTupleTest {

    @Test
    fun toTuple__returns_Tuple8_in_correct_order() {
       val dataClass = Dummy8("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte())
       expect(dataClass.toTuple()).toBeAnInstanceOf<Tuple8<String, Int, Long, Float, Double, Char, Short, Byte>> {
           feature { f(it::component1) }.toEqual("string")
           feature { f(it::component2) }.toEqual(1)
           feature { f(it::component3) }.toEqual(2L)
           feature { f(it::component4) }.toEqual(3F)
           feature { f(it::component5) }.toEqual(4.0)
           feature { f(it::component6) }.toEqual('c')
           feature { f(it::component7) }.toEqual(1.toShort())
           feature { f(it::component8) }.toEqual(2.toByte())
       }
    }

    data class Dummy8(
        val a1: String,
        val a2: Int,
        val a3: Long,
        val a4: Float,
        val a5: Double,
        val a6: Char,
        val a7: Short,
        val a8: Byte
    ): Tuple8Like<String, Int, Long, Float, Double, Char, Short, Byte>
}