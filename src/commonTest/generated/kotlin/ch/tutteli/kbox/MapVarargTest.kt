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
    fun mapVararg_Boolean_to_Byte() {
        val targetTypeArr = arrayOf(true, false)
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Boolean_to_Char() {
        val targetTypeArr = arrayOf(true, false)
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Boolean_to_Short() {
        val targetTypeArr = arrayOf(true, false)
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Boolean_to_Int() {
        val targetTypeArr = arrayOf(true, false)
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Boolean_to_Long() {
        val targetTypeArr = arrayOf(true, false)
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Boolean_to_Float() {
        val targetTypeArr = arrayOf(true, false)
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Boolean_to_Double() {
        val targetTypeArr = arrayOf(true, false)
        var i = 0
        val pair = mapVararg(false, arrayOf(true)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte(), 2.toByte())
        var i = 0
        val pair = mapVararg("c", arrayOf("a", "b")) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_single_Byte() {
        // we use this test mainly to be sure we don't hit https://youtrack.jetbrains.com/issue/KT-75935
        val pair = mapVararg("c", arrayOf("a", "b")) { 1.toByte() }

        expect(pair) {
           first.toEqual(1.toByte())
           second.asList().toContainExactly(1.toByte(), 1.toByte())
        }
    }

    @Test
    fun mapVararg_Byte_to_Boolean() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        var i = 0
        val pair = mapVararg(1.toByte(), arrayOf(2.toByte())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Byte_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        var i = 0
        val pair = mapVararg(1.toByte(), arrayOf(2.toByte())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Byte_to_Char() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        var i = 0
        val pair = mapVararg(1.toByte(), arrayOf(2.toByte())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Byte_to_Short() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        var i = 0
        val pair = mapVararg(1.toByte(), arrayOf(2.toByte())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Byte_to_Int() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        var i = 0
        val pair = mapVararg(1.toByte(), arrayOf(2.toByte())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Byte_to_Long() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        var i = 0
        val pair = mapVararg(1.toByte(), arrayOf(2.toByte())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Byte_to_Float() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        var i = 0
        val pair = mapVararg(1.toByte(), arrayOf(2.toByte())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Byte_to_Double() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        var i = 0
        val pair = mapVararg(1.toByte(), arrayOf(2.toByte())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_Char() {
        val targetTypeArr = arrayOf('b', 'c', 'd')
        var i = 0
        val pair = mapVararg("c", arrayOf("a", "b")) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_single_Char() {
        // we use this test mainly to be sure we don't hit https://youtrack.jetbrains.com/issue/KT-75935
        val pair = mapVararg("c", arrayOf("a", "b")) { 'a' }

        expect(pair) {
           first.toEqual('a')
           second.asList().toContainExactly('a', 'a')
        }
    }

    @Test
    fun mapVararg_Char_to_Boolean() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a')
        var i = 0
        val pair = mapVararg('a', arrayOf('b', 'c', 'd')) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Char_to_Byte() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a')
        var i = 0
        val pair = mapVararg('a', arrayOf('b', 'c', 'd')) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Char_to_Char() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a')
        var i = 0
        val pair = mapVararg('a', arrayOf('b', 'c', 'd')) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Char_to_Short() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a')
        var i = 0
        val pair = mapVararg('a', arrayOf('b', 'c', 'd')) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Char_to_Int() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a')
        var i = 0
        val pair = mapVararg('a', arrayOf('b', 'c', 'd')) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Char_to_Long() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a')
        var i = 0
        val pair = mapVararg('a', arrayOf('b', 'c', 'd')) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Char_to_Float() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a')
        var i = 0
        val pair = mapVararg('a', arrayOf('b', 'c', 'd')) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Char_to_Double() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a')
        var i = 0
        val pair = mapVararg('a', arrayOf('b', 'c', 'd')) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort(), 2.toShort())
        var i = 0
        val pair = mapVararg("c", arrayOf("a", "b")) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_single_Short() {
        // we use this test mainly to be sure we don't hit https://youtrack.jetbrains.com/issue/KT-75935
        val pair = mapVararg("c", arrayOf("a", "b")) { 1.toShort() }

        expect(pair) {
           first.toEqual(1.toShort())
           second.asList().toContainExactly(1.toShort(), 1.toShort())
        }
    }

    @Test
    fun mapVararg_Short_to_Boolean() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        var i = 0
        val pair = mapVararg(1.toShort(), arrayOf(2.toShort())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Short_to_Byte() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        var i = 0
        val pair = mapVararg(1.toShort(), arrayOf(2.toShort())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Short_to_Char() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        var i = 0
        val pair = mapVararg(1.toShort(), arrayOf(2.toShort())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Short_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        var i = 0
        val pair = mapVararg(1.toShort(), arrayOf(2.toShort())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Short_to_Int() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        var i = 0
        val pair = mapVararg(1.toShort(), arrayOf(2.toShort())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Short_to_Long() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        var i = 0
        val pair = mapVararg(1.toShort(), arrayOf(2.toShort())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Short_to_Float() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        var i = 0
        val pair = mapVararg(1.toShort(), arrayOf(2.toShort())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Short_to_Double() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        var i = 0
        val pair = mapVararg(1.toShort(), arrayOf(2.toShort())) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_Int() {
        val targetTypeArr = arrayOf(2, 3, 4)
        var i = 0
        val pair = mapVararg("c", arrayOf("a", "b")) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_single_Int() {
        // we use this test mainly to be sure we don't hit https://youtrack.jetbrains.com/issue/KT-75935
        val pair = mapVararg("c", arrayOf("a", "b")) { 1 }

        expect(pair) {
           first.toEqual(1)
           second.asList().toContainExactly(1, 1)
        }
    }

    @Test
    fun mapVararg_Int_to_Boolean() {
        val targetTypeArr = arrayOf(2, 3, 4, 5, 6, 7, 1)
        var i = 0
        val pair = mapVararg(1, arrayOf(2, 3, 4, 5, 6, 7)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Int_to_Byte() {
        val targetTypeArr = arrayOf(2, 3, 4, 5, 6, 7, 1)
        var i = 0
        val pair = mapVararg(1, arrayOf(2, 3, 4, 5, 6, 7)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Int_to_Char() {
        val targetTypeArr = arrayOf(2, 3, 4, 5, 6, 7, 1)
        var i = 0
        val pair = mapVararg(1, arrayOf(2, 3, 4, 5, 6, 7)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Int_to_Short() {
        val targetTypeArr = arrayOf(2, 3, 4, 5, 6, 7, 1)
        var i = 0
        val pair = mapVararg(1, arrayOf(2, 3, 4, 5, 6, 7)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Int_to_Int() {
        val targetTypeArr = arrayOf(2, 3, 4, 5, 6, 7, 1)
        var i = 0
        val pair = mapVararg(1, arrayOf(2, 3, 4, 5, 6, 7)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Int_to_Long() {
        val targetTypeArr = arrayOf(2, 3, 4, 5, 6, 7, 1)
        var i = 0
        val pair = mapVararg(1, arrayOf(2, 3, 4, 5, 6, 7)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Int_to_Float() {
        val targetTypeArr = arrayOf(2, 3, 4, 5, 6, 7, 1)
        var i = 0
        val pair = mapVararg(1, arrayOf(2, 3, 4, 5, 6, 7)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Int_to_Double() {
        val targetTypeArr = arrayOf(2, 3, 4, 5, 6, 7, 1)
        var i = 0
        val pair = mapVararg(1, arrayOf(2, 3, 4, 5, 6, 7)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L, 2L)
        var i = 0
        val pair = mapVararg("c", arrayOf("a", "b")) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_single_Long() {
        // we use this test mainly to be sure we don't hit https://youtrack.jetbrains.com/issue/KT-75935
        val pair = mapVararg("c", arrayOf("a", "b")) { 1L }

        expect(pair) {
           first.toEqual(1L)
           second.asList().toContainExactly(1L, 1L)
        }
    }

    @Test
    fun mapVararg_Long_to_Boolean() {
        val targetTypeArr = arrayOf(2L, 1L)
        var i = 0
        val pair = mapVararg(1L, arrayOf(2L)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Long_to_Byte() {
        val targetTypeArr = arrayOf(2L, 1L)
        var i = 0
        val pair = mapVararg(1L, arrayOf(2L)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Long_to_Char() {
        val targetTypeArr = arrayOf(2L, 1L)
        var i = 0
        val pair = mapVararg(1L, arrayOf(2L)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Long_to_Short() {
        val targetTypeArr = arrayOf(2L, 1L)
        var i = 0
        val pair = mapVararg(1L, arrayOf(2L)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Long_to_Int() {
        val targetTypeArr = arrayOf(2L, 1L)
        var i = 0
        val pair = mapVararg(1L, arrayOf(2L)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Long_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        var i = 0
        val pair = mapVararg(1L, arrayOf(2L)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Long_to_Float() {
        val targetTypeArr = arrayOf(2L, 1L)
        var i = 0
        val pair = mapVararg(1L, arrayOf(2L)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Long_to_Double() {
        val targetTypeArr = arrayOf(2L, 1L)
        var i = 0
        val pair = mapVararg(1L, arrayOf(2L)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f, 2.0f)
        var i = 0
        val pair = mapVararg("c", arrayOf("a", "b")) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_single_Float() {
        // we use this test mainly to be sure we don't hit https://youtrack.jetbrains.com/issue/KT-75935
        val pair = mapVararg("c", arrayOf("a", "b")) { 1.0f }

        expect(pair) {
           first.toEqual(1.0f)
           second.asList().toContainExactly(1.0f, 1.0f)
        }
    }

    @Test
    fun mapVararg_Float_to_Boolean() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        var i = 0
        val pair = mapVararg(1.0f, arrayOf(2.0f)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Float_to_Byte() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        var i = 0
        val pair = mapVararg(1.0f, arrayOf(2.0f)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Float_to_Char() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        var i = 0
        val pair = mapVararg(1.0f, arrayOf(2.0f)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Float_to_Short() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        var i = 0
        val pair = mapVararg(1.0f, arrayOf(2.0f)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Float_to_Int() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        var i = 0
        val pair = mapVararg(1.0f, arrayOf(2.0f)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Float_to_Long() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        var i = 0
        val pair = mapVararg(1.0f, arrayOf(2.0f)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Float_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        var i = 0
        val pair = mapVararg(1.0f, arrayOf(2.0f)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Float_to_Double() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        var i = 0
        val pair = mapVararg(1.0f, arrayOf(2.0f)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        var i = 0
        val pair = mapVararg("c", arrayOf("a", "b")) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_strings_to_single_Double() {
        // we use this test mainly to be sure we don't hit https://youtrack.jetbrains.com/issue/KT-75935
        val pair = mapVararg("c", arrayOf("a", "b")) { 1.0 }

        expect(pair) {
           first.toEqual(1.0)
           second.asList().toContainExactly(1.0, 1.0)
        }
    }

    @Test
    fun mapVararg_Double_to_Boolean() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        var i = 0
        val pair = mapVararg(1.0, arrayOf(2.0, 3.0)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Double_to_Byte() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        var i = 0
        val pair = mapVararg(1.0, arrayOf(2.0, 3.0)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Double_to_Char() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        var i = 0
        val pair = mapVararg(1.0, arrayOf(2.0, 3.0)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Double_to_Short() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        var i = 0
        val pair = mapVararg(1.0, arrayOf(2.0, 3.0)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Double_to_Int() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        var i = 0
        val pair = mapVararg(1.0, arrayOf(2.0, 3.0)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Double_to_Long() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        var i = 0
        val pair = mapVararg(1.0, arrayOf(2.0, 3.0)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Double_to_Float() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        var i = 0
        val pair = mapVararg(1.0, arrayOf(2.0, 3.0)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVararg_Double_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        var i = 0
        val pair = mapVararg(1.0, arrayOf(2.0, 3.0)) { targetTypeArr[i++] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

}