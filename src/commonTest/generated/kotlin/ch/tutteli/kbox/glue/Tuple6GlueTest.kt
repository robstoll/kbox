// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.glue

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple6GlueTest {

    @Test
    fun glue_Pair__results_in_a_Tuple8() {
        expect(
            Tuple6("string", 1, 2L, 3F, 4.0, 'c')
                .glue(Pair(1.toShort(), 2.toByte()))
        ).toEqual(
            Tuple8("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte())
        )
    }

    @Test
    fun glue_Triple__results_in_a_Tuple9() {
        expect(
            Tuple6("string", 1, 2L, 3F, 4.0, 'c')
                .glue(Triple(1.toShort(), 2.toByte(), listOf(1, 2)))
        ).toEqual(
            Tuple9("string", 1, 2L, 3F, 4.0, 'c', 1.toShort(), 2.toByte(), listOf(1, 2))
        )
    }

}