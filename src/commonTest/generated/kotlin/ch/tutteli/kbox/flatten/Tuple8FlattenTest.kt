// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.flatten

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple8FlattenTest {

    @Test
    fun flatten__onList_Ints_returns_int_List_in_correct_order() {
        val tuple = listOf(Tuple8(0, 1, 2, 3, 4, 5, 6, 7), Tuple8(0, 1, 2, 3, 4, 5, 6, 7))
        val l : List<Int> = tuple.flatten()

        expect(l).toContainExactly(0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7)
    }

    @Test
    fun flatten__onList_IntsAndString_returns_Comparable_List_in_correct_order() {
        val tuple = listOf(Tuple8(0, 1, 2, 3, 4, 5, 6, "a"), Tuple8(0, 1, 2, 3, 4, 5, 6, "a"))
        val l : List<Comparable<*>> = tuple.flatten()

        expect(l).toContainExactly(0, 1, 2, 3, 4, 5, 6, "a", 0, 1, 2, 3, 4, 5, 6, "a")
    }

    @Test
    fun flatten__onSequence_Ints_returns_int_List_in_correct_order() {
        val tuple = sequenceOf(Tuple8(0, 1, 2, 3, 4, 5, 6, 7), Tuple8(0, 1, 2, 3, 4, 5, 6, 7))
        val l : Sequence<Int> = tuple.flatten()

        expect(l).asList().toContainExactly(0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7)
    }

    @Test
    fun flatten__onSequence_IntsAndString_returns_Comparable_List_in_correct_order() {
        val tuple = sequenceOf(Tuple8(0, 1, 2, 3, 4, 5, 6, "a"), Tuple8(0, 1, 2, 3, 4, 5, 6, "a"))
        val l : Sequence<Comparable<*>> = tuple.flatten()

        expect(l).asList().toContainExactly(0, 1, 2, 3, 4, 5, 6, "a", 0, 1, 2, 3, 4, 5, 6, "a")
    }

}