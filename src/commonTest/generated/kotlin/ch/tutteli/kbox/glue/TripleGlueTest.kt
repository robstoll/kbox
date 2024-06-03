// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.glue

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class TripleGlueTest {

    @Test
    fun glue_Pair__results_in_a_Tuple5() {
        expect(
            Triple("string", 1, 2L)
                .glue(Pair(3F, 4.0))
        ).toEqual(
            Tuple5("string", 1, 2L, 3F, 4.0)
        )
    }

    @Test
    fun glue_Triple__results_in_a_Tuple6() {
        expect(
            Triple("string", 1, 2L)
                .glue(Triple(3F, 4.0, 'c'))
        ).toEqual(
            Tuple6("string", 1, 2L, 3F, 4.0, 'c')
        )
    }

    @Test
    fun glue_Tuple4__results_in_a_Tuple7() {
        expect(
            Triple("string", 1, 2L)
                .glue(Tuple4(3F, 4.0, 'c', 1.toShort()))
        ).toEqual(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
        )
    }

    @Test
    fun glue_Tuple5__results_in_a_Tuple8() {
        expect(
            Triple("string", 1, 2L)
                .glue(Tuple5(3F, 4.0, 'c', 1.toShort(), 2.toByte()))
        ).toEqual(
            Tuple8("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte())
        )
    }

    @Test
    fun glue_Tuple6__results_in_a_Tuple9() {
        expect(
            Triple("string", 1, 2L)
                .glue(Tuple6(3F, 4.0, 'c', 1.toShort(), 2.toByte(), listOf(1, 2)))
        ).toEqual(
            Tuple9("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte(), listOf(1, 2))
        )
    }

}