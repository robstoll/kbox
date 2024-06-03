// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.append

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class PairAppendTest {

    @Test
    fun append_1_values__results_in_a_Triple() {
        expect(
            Pair("string", 1)
                .append(2L)
        ).toEqual(
            Triple("string", 1, 2L)
        )
    }

    @Test
    fun append_2_values__results_in_a_Tuple4() {
        expect(
            Pair("string", 1)
                .append(2L, 3F)
        ).toEqual(
            Tuple4("string", 1, 2L, 3F)
        )
    }

    @Test
    fun append_3_values__results_in_a_Tuple5() {
        expect(
            Pair("string", 1)
                .append(2L, 3F, 4.0)
        ).toEqual(
            Tuple5("string", 1, 2L, 3F, 4.0)
        )
    }

    @Test
    fun append_4_values__results_in_a_Tuple6() {
        expect(
            Pair("string", 1)
                .append(2L, 3F, 4.0, 'c')
        ).toEqual(
            Tuple6("string", 1, 2L, 3F, 4.0, 'c')
        )
    }

    @Test
    fun append_5_values__results_in_a_Tuple7() {
        expect(
            Pair("string", 1)
                .append(2L, 3F, 4.0, 'c', 1.toShort())
        ).toEqual(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
        )
    }

    @Test
    fun append_6_values__results_in_a_Tuple8() {
        expect(
            Pair("string", 1)
                .append(2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte())
        ).toEqual(
            Tuple8("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte())
        )
    }

    @Test
    fun append_7_values__results_in_a_Tuple9() {
        expect(
            Pair("string", 1)
                .append(2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte(), listOf(1, 2))
        ).toEqual(
            Tuple9("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte(), listOf(1, 2))
        )
    }

}