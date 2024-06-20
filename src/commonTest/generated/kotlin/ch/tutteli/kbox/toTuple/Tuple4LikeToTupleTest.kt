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
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val dataClass = Dummy4(a1, a2, a3, a4)

        expect(dataClass.toTuple()).toBeAnInstanceOf<Tuple4<List<String>, List<Int>, List<Long>, List<Float>>> {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
        }
    }

    data class Dummy4(
        val a1: List<String>,
        val a2: List<Int>,
        val a3: List<Long>,
        val a4: List<Float>
    ): Tuple4Like<List<String>, List<Int>, List<Long>, List<Float>>
}