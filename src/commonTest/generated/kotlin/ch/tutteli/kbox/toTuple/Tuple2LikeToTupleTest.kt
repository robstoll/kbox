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
       val dataClass = Dummy2("string", 1)
       expect(dataClass.toTuple()).toBeAnInstanceOf<Pair<String, Int>> {
           feature { f(it::component1) }.toEqual("string")
           feature { f(it::component2) }.toEqual(1)
       }
    }

    data class Dummy2(
        val a1: String,
        val a2: Int
    ): Tuple2Like<String, Int>
}