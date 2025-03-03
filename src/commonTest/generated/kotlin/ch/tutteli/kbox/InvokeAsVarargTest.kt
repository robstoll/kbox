// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class InvokeAsVarargTest {

    @Test
    fun invokeAsVararg_Array() {
        val arr = arrayOf("a", "b")
        val list = ::expectString.invokeAsVararg(arr)

        expect(list).toContainExactly("a", "b")
    }

    @Test
    fun invokeAsVararg_Iterable() {
        val arr = listOf("a", "b")
        val list = ::expectString.invokeAsVararg(arr)

        expect(list).toContainExactly("a", "b")
    }

    @Test
    fun invokeAsVararg_Sequence() {
        val arr = sequenceOf("a", "b")
        val list = ::expectString.invokeAsVararg(arr)

        expect(list).toContainExactly("a", "b")
    }

    @Test
    fun invokeAsVararg_booleanArray() {
        val arr = booleanArrayOf(false, true)
        val list = ::expectBoolean.invokeAsVararg(arr)

        expect(list).toContainExactly(false, true)
    }

    @Test
    fun invokeAsVararg_Array_of_Boolean() {
        val arr: Array<Boolean> = arrayOf(false, true)
        val list = ::expectBoolean.invokeAsVararg(arr)

        expect(list).toContainExactly(false, true)
    }

    @Test
    fun invokeAsVararg_Iterable_of_Boolean() {
        val arr: Iterable<Boolean> = listOf(false, true)
        val list = ::expectBoolean.invokeAsVararg(arr)

        expect(list).toContainExactly(false, true)
    }

    @Test
    fun invokeAsVararg_Sequence_of_Boolean() {
        val arr: Sequence<Boolean> = sequenceOf(false, true)
        val list = ::expectBoolean.invokeAsVararg(arr)

        expect(list).toContainExactly(false, true)
    }

    @Test
    fun invokeAsVararg_byteArray() {
        val arr = byteArrayOf(1.toByte(), 2.toByte())
        val list = ::expectByte.invokeAsVararg(arr)

        expect(list).toContainExactly(1.toByte(), 2.toByte())
    }

    @Test
    fun invokeAsVararg_Array_of_Byte() {
        val arr: Array<Byte> = arrayOf(1.toByte(), 2.toByte())
        val list = ::expectByte.invokeAsVararg(arr)

        expect(list).toContainExactly(1.toByte(), 2.toByte())
    }

    @Test
    fun invokeAsVararg_Iterable_of_Byte() {
        val arr: Iterable<Byte> = listOf(1.toByte(), 2.toByte())
        val list = ::expectByte.invokeAsVararg(arr)

        expect(list).toContainExactly(1.toByte(), 2.toByte())
    }

    @Test
    fun invokeAsVararg_Sequence_of_Byte() {
        val arr: Sequence<Byte> = sequenceOf(1.toByte(), 2.toByte())
        val list = ::expectByte.invokeAsVararg(arr)

        expect(list).toContainExactly(1.toByte(), 2.toByte())
    }

    @Test
    fun invokeAsVararg_charArray() {
        val arr = charArrayOf('a', 'b', 'c', 'd')
        val list = ::expectChar.invokeAsVararg(arr)

        expect(list).toContainExactly('a', 'b', 'c', 'd')
    }

    @Test
    fun invokeAsVararg_Array_of_Char() {
        val arr: Array<Char> = arrayOf('a', 'b', 'c', 'd')
        val list = ::expectChar.invokeAsVararg(arr)

        expect(list).toContainExactly('a', 'b', 'c', 'd')
    }

    @Test
    fun invokeAsVararg_Iterable_of_Char() {
        val arr: Iterable<Char> = listOf('a', 'b', 'c', 'd')
        val list = ::expectChar.invokeAsVararg(arr)

        expect(list).toContainExactly('a', 'b', 'c', 'd')
    }

    @Test
    fun invokeAsVararg_Sequence_of_Char() {
        val arr: Sequence<Char> = sequenceOf('a', 'b', 'c', 'd')
        val list = ::expectChar.invokeAsVararg(arr)

        expect(list).toContainExactly('a', 'b', 'c', 'd')
    }

    @Test
    fun invokeAsVararg_shortArray() {
        val arr = shortArrayOf(1.toShort(), 2.toShort())
        val list = ::expectShort.invokeAsVararg(arr)

        expect(list).toContainExactly(1.toShort(), 2.toShort())
    }

    @Test
    fun invokeAsVararg_Array_of_Short() {
        val arr: Array<Short> = arrayOf(1.toShort(), 2.toShort())
        val list = ::expectShort.invokeAsVararg(arr)

        expect(list).toContainExactly(1.toShort(), 2.toShort())
    }

    @Test
    fun invokeAsVararg_Iterable_of_Short() {
        val arr: Iterable<Short> = listOf(1.toShort(), 2.toShort())
        val list = ::expectShort.invokeAsVararg(arr)

        expect(list).toContainExactly(1.toShort(), 2.toShort())
    }

    @Test
    fun invokeAsVararg_Sequence_of_Short() {
        val arr: Sequence<Short> = sequenceOf(1.toShort(), 2.toShort())
        val list = ::expectShort.invokeAsVararg(arr)

        expect(list).toContainExactly(1.toShort(), 2.toShort())
    }

    @Test
    fun invokeAsVararg_intArray() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val list = ::expectInt.invokeAsVararg(arr)

        expect(list).toContainExactly(1, 2, 3, 4, 5, 6, 7)
    }

    @Test
    fun invokeAsVararg_Array_of_Int() {
        val arr: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7)
        val list = ::expectInt.invokeAsVararg(arr)

        expect(list).toContainExactly(1, 2, 3, 4, 5, 6, 7)
    }

    @Test
    fun invokeAsVararg_Iterable_of_Int() {
        val arr: Iterable<Int> = listOf(1, 2, 3, 4, 5, 6, 7)
        val list = ::expectInt.invokeAsVararg(arr)

        expect(list).toContainExactly(1, 2, 3, 4, 5, 6, 7)
    }

    @Test
    fun invokeAsVararg_Sequence_of_Int() {
        val arr: Sequence<Int> = sequenceOf(1, 2, 3, 4, 5, 6, 7)
        val list = ::expectInt.invokeAsVararg(arr)

        expect(list).toContainExactly(1, 2, 3, 4, 5, 6, 7)
    }

    @Test
    fun invokeAsVararg_longArray() {
        val arr = longArrayOf(1L, 2L)
        val list = ::expectLong.invokeAsVararg(arr)

        expect(list).toContainExactly(1L, 2L)
    }

    @Test
    fun invokeAsVararg_Array_of_Long() {
        val arr: Array<Long> = arrayOf(1L, 2L)
        val list = ::expectLong.invokeAsVararg(arr)

        expect(list).toContainExactly(1L, 2L)
    }

    @Test
    fun invokeAsVararg_Iterable_of_Long() {
        val arr: Iterable<Long> = listOf(1L, 2L)
        val list = ::expectLong.invokeAsVararg(arr)

        expect(list).toContainExactly(1L, 2L)
    }

    @Test
    fun invokeAsVararg_Sequence_of_Long() {
        val arr: Sequence<Long> = sequenceOf(1L, 2L)
        val list = ::expectLong.invokeAsVararg(arr)

        expect(list).toContainExactly(1L, 2L)
    }

    @Test
    fun invokeAsVararg_floatArray() {
        val arr = floatArrayOf(1.0f, 2.0f)
        val list = ::expectFloat.invokeAsVararg(arr)

        expect(list).toContainExactly(1.0f, 2.0f)
    }

    @Test
    fun invokeAsVararg_Array_of_Float() {
        val arr: Array<Float> = arrayOf(1.0f, 2.0f)
        val list = ::expectFloat.invokeAsVararg(arr)

        expect(list).toContainExactly(1.0f, 2.0f)
    }

    @Test
    fun invokeAsVararg_Iterable_of_Float() {
        val arr: Iterable<Float> = listOf(1.0f, 2.0f)
        val list = ::expectFloat.invokeAsVararg(arr)

        expect(list).toContainExactly(1.0f, 2.0f)
    }

    @Test
    fun invokeAsVararg_Sequence_of_Float() {
        val arr: Sequence<Float> = sequenceOf(1.0f, 2.0f)
        val list = ::expectFloat.invokeAsVararg(arr)

        expect(list).toContainExactly(1.0f, 2.0f)
    }

    @Test
    fun invokeAsVararg_doubleArray() {
        val arr = doubleArrayOf(1.0, 2.0, 3.0)
        val list = ::expectDouble.invokeAsVararg(arr)

        expect(list).toContainExactly(1.0, 2.0, 3.0)
    }

    @Test
    fun invokeAsVararg_Array_of_Double() {
        val arr: Array<Double> = arrayOf(1.0, 2.0, 3.0)
        val list = ::expectDouble.invokeAsVararg(arr)

        expect(list).toContainExactly(1.0, 2.0, 3.0)
    }

    @Test
    fun invokeAsVararg_Iterable_of_Double() {
        val arr: Iterable<Double> = listOf(1.0, 2.0, 3.0)
        val list = ::expectDouble.invokeAsVararg(arr)

        expect(list).toContainExactly(1.0, 2.0, 3.0)
    }

    @Test
    fun invokeAsVararg_Sequence_of_Double() {
        val arr: Sequence<Double> = sequenceOf(1.0, 2.0, 3.0)
        val list = ::expectDouble.invokeAsVararg(arr)

        expect(list).toContainExactly(1.0, 2.0, 3.0)
    }

}