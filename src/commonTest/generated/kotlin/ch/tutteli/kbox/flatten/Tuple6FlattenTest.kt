// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.flatten

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple6FlattenTest {

    @Test
    fun flatten__Ints_returns_int_List_in_correct_order() {
        val tuple = Tuple6(0, 1, 2, 3, 4, 5)
        val l : List<Int> = tuple.flatten()

        expect(l).toContainExactly(0, 1, 2, 3, 4, 5)
    }

    @Test
    fun flatten__IntsAndString_returns_Comparable_List_in_correct_order() {
        val tuple = Tuple6(0, 1, 2, 3, 4, "a")
        val l : List<Comparable<*>> = tuple.flatten()

        expect(l).toContainExactly(0, 1, 2, 3, 4, "a")
    }

}