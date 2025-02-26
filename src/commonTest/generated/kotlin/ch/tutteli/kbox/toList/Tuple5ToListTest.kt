// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.toList

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple5ToListTest {

    @Test
    fun toList__Ints_returns_int_List_in_correct_order() {
        val tuple = Tuple5(0, 1, 2, 3, 4)
        val l : List<Int> = tuple.toList()

        expect(l).toContainExactly(0, 1, 2, 3, 4)
    }

    @Test
    fun toList__IntsAndString_returns_Comparable_List_in_correct_order() {
        val tuple = Tuple5(0, 1, 2, 3, "a")
        val l : List<Comparable<*>> = tuple.toList()

        expect(l).toContainExactly(0, 1, 2, 3, "a")
    }

}