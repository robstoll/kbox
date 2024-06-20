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
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())
        val a8 = listOf(2.toByte())
        val a9 = listOf(listOf(1, 2))
        val dataClass = Dummy9(a1, a2, a3, a4, a5, a6, a7, a8, a9)

        expect(dataClass.toTuple()).toBeAnInstanceOf<Tuple9<List<String>, List<Int>, List<Long>, List<Float>, List<Double>, List<Char>, List<Short>, List<Byte>, List<List<Int>>>> {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
            feature { f(it::a6) }.toBeTheInstance(a6)
            feature { f(it::a7) }.toBeTheInstance(a7)
            feature { f(it::a8) }.toBeTheInstance(a8)
            feature { f(it::a9) }.toBeTheInstance(a9)
        }
    }

    data class Dummy9(
        val a1: List<String>,
        val a2: List<Int>,
        val a3: List<Long>,
        val a4: List<Float>,
        val a5: List<Double>,
        val a6: List<Char>,
        val a7: List<Short>,
        val a8: List<Byte>,
        val a9: List<List<Int>>
    ): Tuple9Like<List<String>, List<Int>, List<Long>, List<Float>, List<Double>, List<Char>, List<Short>, List<Byte>, List<List<Int>>>
}