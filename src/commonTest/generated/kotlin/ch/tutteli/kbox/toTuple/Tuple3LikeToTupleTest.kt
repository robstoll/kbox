// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.toTuple

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple3LikeToTupleTest {

    @Test
    fun toTuple__returns_Triple_in_correct_order() {
       val dataClass = Dummy3("string", 1, 2L)
       expect(dataClass.toTuple()).toBeAnInstanceOf<Triple<String, Int, Long>> {
           feature { f(it::component1) }.toEqual("string")
           feature { f(it::component2) }.toEqual(1)
           feature { f(it::component3) }.toEqual(2L)
       }
    }

    data class Dummy3(
        val a1: String,
        val a2: Int,
        val a3: Long
    ): Tuple3Like<String, Int, Long>
}