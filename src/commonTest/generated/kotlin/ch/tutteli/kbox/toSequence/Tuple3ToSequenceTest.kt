// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.toSequence

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple3ToSequenceTest {

    @Test
    fun toSequence__Ints_returns_int_List_in_correct_order() {
        val tuple = Tuple3(0, 1, 2)
        val l : Sequence<Int> = tuple.toSequence()

        expect(l).asList().toContainExactly(0, 1, 2)
    }

    @Test
    fun toSequence__IntsAndString_returns_Comparable_List_in_correct_order() {
        val tuple = Tuple3(0, 1, "a")
        val l : Sequence<Comparable<*>> = tuple.toSequence()

        expect(l).asList().toContainExactly(0, 1, "a")
    }

}