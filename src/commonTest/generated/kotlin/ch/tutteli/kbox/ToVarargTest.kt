// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class ToVarargTest {

    fun expectString(s: String, vararg others: String) {}
    fun expectBoolean(first: Boolean, vararg others: Boolean) {}
    fun expectByte(first: Byte, vararg others: Byte) {}
    fun expectChar(first: Char, vararg others: Char) {}
    fun expectShort(first: Short, vararg others: Short) {}
    fun expectInt(first: Int, vararg others: Int) {}
    fun expectLong(first: Long, vararg others: Long) {}
    fun expectFloat(first: Float, vararg others: Float) {}
    fun expectDouble(first: Double, vararg others: Double) {}

    @Test
    fun toVararg_array() {
        val arr = arrayOf("a", "b")
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectString(first, *rest)

        expect(pair) {
           this.first.toEqual("a")
           second.asList().toContainExactly("b")
        }
    }

    @Test
    fun toVararg_booleanArray() {
        val arr = booleanArrayOf(false, true)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectBoolean(first, *rest)

        expect(pair) {
           this.first.toEqual(false)
           second.asList().toContainExactly(true)
        }
    }

    @Test
    fun toVararg_Iterable_of_Boolean_returns_booleanArray() {
        val arr: Iterable<Boolean> = listOf(false, true)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectBoolean(first, *rest)

        expect(pair) {
           this.first.toEqual(false)
           second.asList().toContainExactly(true)
        }
    }

    @Test
    fun toVararg_Sequence_of_Boolean_returns_booleanArray() {
        val arr: Sequence<Boolean> = sequenceOf(false, true)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectBoolean(first, *rest)

        expect(pair) {
           this.first.toEqual(false)
           second.asList().toContainExactly(true)
        }
    }

    @Test
    fun toVararg_byteArray() {
        val arr = byteArrayOf(1.toByte(), 2.toByte())
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectByte(first, *rest)

        expect(pair) {
           this.first.toEqual(1.toByte())
           second.asList().toContainExactly(2.toByte())
        }
    }

    @Test
    fun toVararg_Iterable_of_Byte_returns_byteArray() {
        val arr: Iterable<Byte> = listOf(1.toByte(), 2.toByte())
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectByte(first, *rest)

        expect(pair) {
           this.first.toEqual(1.toByte())
           second.asList().toContainExactly(2.toByte())
        }
    }

    @Test
    fun toVararg_Sequence_of_Byte_returns_byteArray() {
        val arr: Sequence<Byte> = sequenceOf(1.toByte(), 2.toByte())
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectByte(first, *rest)

        expect(pair) {
           this.first.toEqual(1.toByte())
           second.asList().toContainExactly(2.toByte())
        }
    }

    @Test
    fun toVararg_charArray() {
        val arr = charArrayOf('a', 'b', 'c', 'd')
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectChar(first, *rest)

        expect(pair) {
           this.first.toEqual('a')
           second.asList().toContainExactly('b', 'c', 'd')
        }
    }

    @Test
    fun toVararg_Iterable_of_Char_returns_charArray() {
        val arr: Iterable<Char> = listOf('a', 'b', 'c', 'd')
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectChar(first, *rest)

        expect(pair) {
           this.first.toEqual('a')
           second.asList().toContainExactly('b', 'c', 'd')
        }
    }

    @Test
    fun toVararg_Sequence_of_Char_returns_charArray() {
        val arr: Sequence<Char> = sequenceOf('a', 'b', 'c', 'd')
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectChar(first, *rest)

        expect(pair) {
           this.first.toEqual('a')
           second.asList().toContainExactly('b', 'c', 'd')
        }
    }

    @Test
    fun toVararg_shortArray() {
        val arr = shortArrayOf(1.toShort(), 2.toShort())
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectShort(first, *rest)

        expect(pair) {
           this.first.toEqual(1.toShort())
           second.asList().toContainExactly(2.toShort())
        }
    }

    @Test
    fun toVararg_Iterable_of_Short_returns_shortArray() {
        val arr: Iterable<Short> = listOf(1.toShort(), 2.toShort())
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectShort(first, *rest)

        expect(pair) {
           this.first.toEqual(1.toShort())
           second.asList().toContainExactly(2.toShort())
        }
    }

    @Test
    fun toVararg_Sequence_of_Short_returns_shortArray() {
        val arr: Sequence<Short> = sequenceOf(1.toShort(), 2.toShort())
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectShort(first, *rest)

        expect(pair) {
           this.first.toEqual(1.toShort())
           second.asList().toContainExactly(2.toShort())
        }
    }

    @Test
    fun toVararg_intArray() {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectInt(first, *rest)

        expect(pair) {
           this.first.toEqual(1)
           second.asList().toContainExactly(2, 3, 4, 5, 6, 7)
        }
    }

    @Test
    fun toVararg_Iterable_of_Int_returns_intArray() {
        val arr: Iterable<Int> = listOf(1, 2, 3, 4, 5, 6, 7)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectInt(first, *rest)

        expect(pair) {
           this.first.toEqual(1)
           second.asList().toContainExactly(2, 3, 4, 5, 6, 7)
        }
    }

    @Test
    fun toVararg_Sequence_of_Int_returns_intArray() {
        val arr: Sequence<Int> = sequenceOf(1, 2, 3, 4, 5, 6, 7)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectInt(first, *rest)

        expect(pair) {
           this.first.toEqual(1)
           second.asList().toContainExactly(2, 3, 4, 5, 6, 7)
        }
    }

    @Test
    fun toVararg_longArray() {
        val arr = longArrayOf(1L, 2L)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectLong(first, *rest)

        expect(pair) {
           this.first.toEqual(1L)
           second.asList().toContainExactly(2L)
        }
    }

    @Test
    fun toVararg_Iterable_of_Long_returns_longArray() {
        val arr: Iterable<Long> = listOf(1L, 2L)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectLong(first, *rest)

        expect(pair) {
           this.first.toEqual(1L)
           second.asList().toContainExactly(2L)
        }
    }

    @Test
    fun toVararg_Sequence_of_Long_returns_longArray() {
        val arr: Sequence<Long> = sequenceOf(1L, 2L)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectLong(first, *rest)

        expect(pair) {
           this.first.toEqual(1L)
           second.asList().toContainExactly(2L)
        }
    }

    @Test
    fun toVararg_floatArray() {
        val arr = floatArrayOf(1.0f, 2.0f)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectFloat(first, *rest)

        expect(pair) {
           this.first.toEqual(1.0f)
           second.asList().toContainExactly(2.0f)
        }
    }

    @Test
    fun toVararg_Iterable_of_Float_returns_floatArray() {
        val arr: Iterable<Float> = listOf(1.0f, 2.0f)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectFloat(first, *rest)

        expect(pair) {
           this.first.toEqual(1.0f)
           second.asList().toContainExactly(2.0f)
        }
    }

    @Test
    fun toVararg_Sequence_of_Float_returns_floatArray() {
        val arr: Sequence<Float> = sequenceOf(1.0f, 2.0f)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectFloat(first, *rest)

        expect(pair) {
           this.first.toEqual(1.0f)
           second.asList().toContainExactly(2.0f)
        }
    }

    @Test
    fun toVararg_doubleArray() {
        val arr = doubleArrayOf(1.0, 2.0, 3.0)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectDouble(first, *rest)

        expect(pair) {
           this.first.toEqual(1.0)
           second.asList().toContainExactly(2.0, 3.0)
        }
    }

    @Test
    fun toVararg_Iterable_of_Double_returns_doubleArray() {
        val arr: Iterable<Double> = listOf(1.0, 2.0, 3.0)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectDouble(first, *rest)

        expect(pair) {
           this.first.toEqual(1.0)
           second.asList().toContainExactly(2.0, 3.0)
        }
    }

    @Test
    fun toVararg_Sequence_of_Double_returns_doubleArray() {
        val arr: Sequence<Double> = sequenceOf(1.0, 2.0, 3.0)
        val pair = arr.toVararg()

        val (first, rest) = pair
        expectDouble(first, *rest)

        expect(pair) {
           this.first.toEqual(1.0)
           second.asList().toContainExactly(2.0, 3.0)
        }
    }

}