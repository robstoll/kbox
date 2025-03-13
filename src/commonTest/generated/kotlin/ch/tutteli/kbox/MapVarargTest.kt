// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class MapVarargTest {

    @Test
    fun mapVararg_strings_to_strings() {
        val arr = arrayOf("a", "b")
        val pair = mapVararg("c", arr) { "_$it" }

        expect(pair) {
           first.toEqual("_c")
           second.asList().toContainExactly("_a", "_b")
        }
    }

    @Test
    fun mapVararg_strings_to_Boolean() {
        val targetTypeArr = arrayOf(true, false, true)
        var i = 0
        val pair = mapVararg("c", arrayOf("a", "b")) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_single_Boolean() {
        // we use this test mainly to be sure we don't hit https://youtrack.jetbrains.com/issue/KT-75935
        val pair = mapVararg("c", arrayOf("a", "b")) { false }

        expect(pair) {
           first.toEqual(false)
           second.asList().toContainExactly(false, false)
        }
    }

    @Test
    fun mapVararg_Boolean_to_string() {
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { "${i++}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

    @Test
    fun mapBooleanVararg_Boolean_to_string() {
        var i = 0
        val pair = mapVararg(false, booleanArrayOf(true)) { "${i++}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

    @Test
    fun mapVararg_Boolean_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVararg_Boolean_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        var i = 0
        val pair = mapVararg(false, booleanArrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Boolean_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVararg_Boolean_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        var i = 0
        val pair = mapVararg(false, booleanArrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Boolean_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVararg_Boolean_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        var i = 0
        val pair = mapVararg(false, booleanArrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Boolean_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVararg_Boolean_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        var i = 0
        val pair = mapVararg(false, booleanArrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Boolean_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVararg_Boolean_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        var i = 0
        val pair = mapVararg(false, booleanArrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Boolean_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVararg_Boolean_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        var i = 0
        val pair = mapVararg(false, booleanArrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

}
