// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.toTuple

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple2LikeToTupleTest {

    @Test
    fun toTuple__returns_Pair_in_correct_order() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val dataClass = Dummy2(a1, a2)

        expect(dataClass.toTuple()).toBeAnInstanceOf<Pair<List<String>, List<Int>>> {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
        }
    }

    data class Dummy2(
        val a1: List<String>,
        val a2: List<Int>
    ): Tuple2Like<List<String>, List<Int>>
}