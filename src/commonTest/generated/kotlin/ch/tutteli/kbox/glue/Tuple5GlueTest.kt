// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.glue

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple5GlueTest {

    @Test
    fun glue_Pair__results_in_a_Tuple7() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .glue(Pair('c', 1.toShort()))
        ).toEqual(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
        )
    }

    @Test
    fun glue_Triple__results_in_a_Tuple8() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .glue(Triple('c', 1.toShort(), 2.toByte()))
        ).toEqual(
            Tuple8("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte())
        )
    }

    @Test
    fun glue_Tuple4__results_in_a_Tuple9() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .glue(Tuple4('c', 1.toShort(), 2.toByte(), listOf(1, 2)))
        ).toEqual(
            Tuple9("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte(), listOf(1, 2))
        )
    }

}