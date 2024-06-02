// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.append

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple5AppendTest {

    @Test
    fun append_1_values__results_in_a_Tuple6() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .append('c')
        ).toEqual(
            Tuple6("string", 1, 2L, 3F, 4.0, 'c')
        )
    }

    @Test
    fun append_2_values__results_in_a_Tuple7() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .append('c', 1.toShort())
        ).toEqual(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
        )
    }

    @Test
    fun append_3_values__results_in_a_Tuple8() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .append('c', 1.toShort(), 2.toByte())
        ).toEqual(
            Tuple8("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte())
        )
    }

    @Test
    fun append_4_values__results_in_a_Tuple9() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .append('c', 1.toShort(), 2.toByte(), listOf(1, 2))
        ).toEqual(
            Tuple9("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte(), listOf(1, 2))
        )
    }

}