// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.flatten

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple2FlattenTest {

    @Test
    fun flatten__onList_Ints_returns_int_List_in_correct_order() {
        val tuple = listOf(Tuple2(0, 1), Tuple2(0, 1))
        val l : List<Int> = tuple.flatten()

        expect(l).toContainExactly(0, 1, 0, 1)
    }

    @Test
    fun flatten__onList_IntsAndString_returns_Comparable_List_in_correct_order() {
        val tuple = listOf(Tuple2(0, "a"), Tuple2(0, "a"))
        val l : List<Comparable<*>> = tuple.flatten()

        expect(l).toContainExactly(0, "a", 0, "a")
    }

    @Test
    fun flatten__onSequence_Ints_returns_int_List_in_correct_order() {
        val tuple = sequenceOf(Tuple2(0, 1), Tuple2(0, 1))
        val l : Sequence<Int> = tuple.flatten()

        expect(l).asList().toContainExactly(0, 1, 0, 1)
    }

    @Test
    fun flatten__onSequence_IntsAndString_returns_Comparable_List_in_correct_order() {
        val tuple = sequenceOf(Tuple2(0, "a"), Tuple2(0, "a"))
        val l : Sequence<Comparable<*>> = tuple.flatten()

        expect(l).asList().toContainExactly(0, "a", 0, "a")
    }

}