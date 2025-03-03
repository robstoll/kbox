// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class VarargToListTest {

    @Test
    fun varArgToList_array_of_strings() {
        val arr = arrayOf("a", "b")
        val list = varargToList("c", arr)

        expect(list).toContainExactly("c", "a", "b")
    }

    @Test
    fun glue_array_of_strings() {
        val arr = arrayOf("a", "b")
        val list = "c" glue arr

        expect(list).toContainExactly("c", "a", "b")
    }

    @Test
    fun varArgToList_booleanArray() {
        val arr = booleanArrayOf(true)
        val list = varargToList(false, arr)

        expect(list).toContainExactly(false, true)
    }

    @Test
    fun glue_booleanArray() {
        val arr = booleanArrayOf(true)
        val list = false glue arr

        expect(list).toContainExactly(false, true)
    }

    @Test
    fun varArgToList_byteArray() {
        val arr = byteArrayOf(2.toByte())
        val list = varargToList(1.toByte(), arr)

        expect(list).toContainExactly(1.toByte(), 2.toByte())
    }

    @Test
    fun glue_byteArray() {
        val arr = byteArrayOf(2.toByte())
        val list = 1.toByte() glue arr

        expect(list).toContainExactly(1.toByte(), 2.toByte())
    }

    @Test
    fun varArgToList_charArray() {
        val arr = charArrayOf('b', 'c', 'd')
        val list = varargToList('a', arr)

        expect(list).toContainExactly('a', 'b', 'c', 'd')
    }

    @Test
    fun glue_charArray() {
        val arr = charArrayOf('b', 'c', 'd')
        val list = 'a' glue arr

        expect(list).toContainExactly('a', 'b', 'c', 'd')
    }

    @Test
    fun varArgToList_shortArray() {
        val arr = shortArrayOf(2.toShort())
        val list = varargToList(1.toShort(), arr)

        expect(list).toContainExactly(1.toShort(), 2.toShort())
    }

    @Test
    fun glue_shortArray() {
        val arr = shortArrayOf(2.toShort())
        val list = 1.toShort() glue arr

        expect(list).toContainExactly(1.toShort(), 2.toShort())
    }

    @Test
    fun varArgToList_intArray() {
        val arr = intArrayOf(2, 3, 4, 5, 6, 7)
        val list = varargToList(1, arr)

        expect(list).toContainExactly(1, 2, 3, 4, 5, 6, 7)
    }

    @Test
    fun glue_intArray() {
        val arr = intArrayOf(2, 3, 4, 5, 6, 7)
        val list = 1 glue arr

        expect(list).toContainExactly(1, 2, 3, 4, 5, 6, 7)
    }

    @Test
    fun varArgToList_longArray() {
        val arr = longArrayOf(2L)
        val list = varargToList(1L, arr)

        expect(list).toContainExactly(1L, 2L)
    }

    @Test
    fun glue_longArray() {
        val arr = longArrayOf(2L)
        val list = 1L glue arr

        expect(list).toContainExactly(1L, 2L)
    }

    @Test
    fun varArgToList_floatArray() {
        val arr = floatArrayOf(2.0f)
        val list = varargToList(1.0f, arr)

        expect(list).toContainExactly(1.0f, 2.0f)
    }

    @Test
    fun glue_floatArray() {
        val arr = floatArrayOf(2.0f)
        val list = 1.0f glue arr

        expect(list).toContainExactly(1.0f, 2.0f)
    }

    @Test
    fun varArgToList_doubleArray() {
        val arr = doubleArrayOf(2.0, 3.0)
        val list = varargToList(1.0, arr)

        expect(list).toContainExactly(1.0, 2.0, 3.0)
    }

    @Test
    fun glue_doubleArray() {
        val arr = doubleArrayOf(2.0, 3.0)
        val list = 1.0 glue arr

        expect(list).toContainExactly(1.0, 2.0, 3.0)
    }

}