// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.toTuple

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple9LikeToTupleTest {

    @Test
    fun toTuple__returns_Tuple9_in_correct_order() {
       val dataClass = Dummy9("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte(), listOf(1, 2))
       expect(dataClass.toTuple()).toBeAnInstanceOf<Tuple9<String, Int, Long, Float, Double, Char, Short, Byte, List<Int>>> {
           feature { f(it::component1) }.toEqual("string")
           feature { f(it::component2) }.toEqual(1)
           feature { f(it::component3) }.toEqual(2L)
           feature { f(it::component4) }.toEqual(3F)
           feature { f(it::component5) }.toEqual(4.0)
           feature { f(it::component6) }.toEqual('c')
           feature { f(it::component7) }.toEqual(1.toShort())
           feature { f(it::component8) }.toEqual(2.toByte())
           feature { f(it::component9) }.toEqual(listOf(1, 2))
       }
    }

    data class Dummy9(
        val a1: String,
        val a2: Int,
        val a3: Long,
        val a4: Float,
        val a5: Double,
        val a6: Char,
        val a7: Short,
        val a8: Byte,
        val a9: List<Int>
    ): Tuple9Like<String, Int, Long, Float, Double, Char, Short, Byte, List<Int>>
}