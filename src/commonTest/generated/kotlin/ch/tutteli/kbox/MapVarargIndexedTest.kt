// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class MapVarargIndexedTest {

    @Test
    fun mapVarargIndexed_strings_to_strings() {
        val arr = arrayOf("a", "b")
        val pair = mapVarargIndexed("c", arr) { index, s -> "${index}_$s" }

        expect(pair) {
           first.toEqual("0_c")
           second.asList().toContainExactly("1_a", "2_b")
        }
    }

    @Test
    fun mapVarargIndexed_strings_to_Boolean() {
        val targetTypeArr = arrayOf(true, false, true)
        val pair = mapVarargIndexed("c", arrayOf("a", "b")) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Boolean_to_string() {
        val pair = mapVarargIndexed(false, arrayOf(true)) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

    @Test
    fun mapBooleanVarargIndexed_Boolean_to_string() {
        val pair = mapVarargIndexed(false, booleanArrayOf(true)) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

}
