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

    @Test
    fun mapVarargIndexed_Boolean_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        val pair = mapVarargIndexed(false, arrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVarargIndexed_Boolean_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        val pair = mapVarargIndexed(false, booleanArrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Boolean_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        val pair = mapVarargIndexed(false, arrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVarargIndexed_Boolean_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        val pair = mapVarargIndexed(false, booleanArrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Boolean_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        val pair = mapVarargIndexed(false, arrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVarargIndexed_Boolean_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        val pair = mapVarargIndexed(false, booleanArrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Boolean_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        val pair = mapVarargIndexed(false, arrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVarargIndexed_Boolean_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        val pair = mapVarargIndexed(false, booleanArrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Boolean_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        val pair = mapVarargIndexed(false, arrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVarargIndexed_Boolean_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        val pair = mapVarargIndexed(false, booleanArrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Boolean_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        val pair = mapVarargIndexed(false, arrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVarargIndexed_Boolean_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        val pair = mapVarargIndexed(false, booleanArrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Boolean_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        val pair = mapVarargIndexed(false, arrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVarargIndexed_Boolean_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        val pair = mapVarargIndexed(false, booleanArrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Boolean_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0)
        val pair = mapVarargIndexed(false, arrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapBooleanVarargIndexed_Boolean_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0)
        val pair = mapVarargIndexed(false, booleanArrayOf(true)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_strings_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte(), 2.toByte())
        val pair = mapVarargIndexed("c", arrayOf("a", "b")) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Byte_to_string() {
        val pair = mapVarargIndexed(1.toByte(), arrayOf(2.toByte())) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

    @Test
    fun mapByteVarargIndexed_Byte_to_string() {
        val pair = mapVarargIndexed(1.toByte(), byteArrayOf(2.toByte())) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

    @Test
    fun mapVarargIndexed_Byte_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        val pair = mapVarargIndexed(1.toByte(), arrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapByteVarargIndexed_Byte_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        val pair = mapVarargIndexed(1.toByte(), byteArrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Byte_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        val pair = mapVarargIndexed(1.toByte(), arrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapByteVarargIndexed_Byte_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        val pair = mapVarargIndexed(1.toByte(), byteArrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Byte_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        val pair = mapVarargIndexed(1.toByte(), arrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapByteVarargIndexed_Byte_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        val pair = mapVarargIndexed(1.toByte(), byteArrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Byte_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        val pair = mapVarargIndexed(1.toByte(), arrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapByteVarargIndexed_Byte_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        val pair = mapVarargIndexed(1.toByte(), byteArrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Byte_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        val pair = mapVarargIndexed(1.toByte(), arrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapByteVarargIndexed_Byte_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        val pair = mapVarargIndexed(1.toByte(), byteArrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Byte_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        val pair = mapVarargIndexed(1.toByte(), arrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapByteVarargIndexed_Byte_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        val pair = mapVarargIndexed(1.toByte(), byteArrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Byte_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        val pair = mapVarargIndexed(1.toByte(), arrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapByteVarargIndexed_Byte_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        val pair = mapVarargIndexed(1.toByte(), byteArrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Byte_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0)
        val pair = mapVarargIndexed(1.toByte(), arrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapByteVarargIndexed_Byte_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0)
        val pair = mapVarargIndexed(1.toByte(), byteArrayOf(2.toByte())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_strings_to_Char() {
        val targetTypeArr = arrayOf('b', 'c', 'd')
        val pair = mapVarargIndexed("c", arrayOf("a", "b")) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Char_to_string() {
        val pair = mapVarargIndexed('a', arrayOf('b', 'c', 'd')) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_", "2_", "3_")
        }
    }

    @Test
    fun mapCharVarargIndexed_Char_to_string() {
        val pair = mapVarargIndexed('a', charArrayOf('b', 'c', 'd')) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_", "2_", "3_")
        }
    }

    @Test
    fun mapVarargIndexed_Char_to_Boolean() {
        val targetTypeArr = arrayOf(true, false, true, false)
        val pair = mapVarargIndexed('a', arrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapCharVarargIndexed_Char_to_Boolean() {
        val targetTypeArr = arrayOf(true, false, true, false)
        val pair = mapVarargIndexed('a', charArrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Char_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte(), 2.toByte(), 1.toByte())
        val pair = mapVarargIndexed('a', arrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapCharVarargIndexed_Char_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte(), 2.toByte(), 1.toByte())
        val pair = mapVarargIndexed('a', charArrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Char_to_Char() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a')
        val pair = mapVarargIndexed('a', arrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapCharVarargIndexed_Char_to_Char() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a')
        val pair = mapVarargIndexed('a', charArrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Char_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort(), 2.toShort(), 1.toShort())
        val pair = mapVarargIndexed('a', arrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapCharVarargIndexed_Char_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort(), 2.toShort(), 1.toShort())
        val pair = mapVarargIndexed('a', charArrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Char_to_Int() {
        val targetTypeArr = arrayOf(2, 3, 4, 5)
        val pair = mapVarargIndexed('a', arrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapCharVarargIndexed_Char_to_Int() {
        val targetTypeArr = arrayOf(2, 3, 4, 5)
        val pair = mapVarargIndexed('a', charArrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Char_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L, 2L, 1L)
        val pair = mapVarargIndexed('a', arrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapCharVarargIndexed_Char_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L, 2L, 1L)
        val pair = mapVarargIndexed('a', charArrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Char_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f, 2.0f, 1.0f)
        val pair = mapVarargIndexed('a', arrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapCharVarargIndexed_Char_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f, 2.0f, 1.0f)
        val pair = mapVarargIndexed('a', charArrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Char_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0, 2.0)
        val pair = mapVarargIndexed('a', arrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapCharVarargIndexed_Char_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0, 2.0)
        val pair = mapVarargIndexed('a', charArrayOf('b', 'c', 'd')) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_strings_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort(), 2.toShort())
        val pair = mapVarargIndexed("c", arrayOf("a", "b")) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Short_to_string() {
        val pair = mapVarargIndexed(1.toShort(), arrayOf(2.toShort())) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

    @Test
    fun mapShortVarargIndexed_Short_to_string() {
        val pair = mapVarargIndexed(1.toShort(), shortArrayOf(2.toShort())) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

    @Test
    fun mapVarargIndexed_Short_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        val pair = mapVarargIndexed(1.toShort(), arrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapShortVarargIndexed_Short_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        val pair = mapVarargIndexed(1.toShort(), shortArrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Short_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        val pair = mapVarargIndexed(1.toShort(), arrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapShortVarargIndexed_Short_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        val pair = mapVarargIndexed(1.toShort(), shortArrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Short_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        val pair = mapVarargIndexed(1.toShort(), arrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapShortVarargIndexed_Short_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        val pair = mapVarargIndexed(1.toShort(), shortArrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Short_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        val pair = mapVarargIndexed(1.toShort(), arrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapShortVarargIndexed_Short_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        val pair = mapVarargIndexed(1.toShort(), shortArrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Short_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        val pair = mapVarargIndexed(1.toShort(), arrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapShortVarargIndexed_Short_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        val pair = mapVarargIndexed(1.toShort(), shortArrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Short_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        val pair = mapVarargIndexed(1.toShort(), arrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapShortVarargIndexed_Short_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        val pair = mapVarargIndexed(1.toShort(), shortArrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Short_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        val pair = mapVarargIndexed(1.toShort(), arrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapShortVarargIndexed_Short_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        val pair = mapVarargIndexed(1.toShort(), shortArrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Short_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0)
        val pair = mapVarargIndexed(1.toShort(), arrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapShortVarargIndexed_Short_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0)
        val pair = mapVarargIndexed(1.toShort(), shortArrayOf(2.toShort())) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_strings_to_Int() {
        val targetTypeArr = arrayOf(2, 3, 4)
        val pair = mapVarargIndexed("c", arrayOf("a", "b")) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Int_to_string() {
        val pair = mapVarargIndexed(1, arrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_", "2_", "3_", "4_", "5_", "6_")
        }
    }

    @Test
    fun mapIntVarargIndexed_Int_to_string() {
        val pair = mapVarargIndexed(1, intArrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_", "2_", "3_", "4_", "5_", "6_")
        }
    }

    @Test
    fun mapVarargIndexed_Int_to_Boolean() {
        val targetTypeArr = arrayOf(true, false, true, false, true, false, true)
        val pair = mapVarargIndexed(1, arrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapIntVarargIndexed_Int_to_Boolean() {
        val targetTypeArr = arrayOf(true, false, true, false, true, false, true)
        val pair = mapVarargIndexed(1, intArrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Int_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte(), 2.toByte(), 1.toByte(), 2.toByte(), 1.toByte(), 2.toByte())
        val pair = mapVarargIndexed(1, arrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapIntVarargIndexed_Int_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte(), 2.toByte(), 1.toByte(), 2.toByte(), 1.toByte(), 2.toByte())
        val pair = mapVarargIndexed(1, intArrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Int_to_Char() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a', 'b', 'c', 'd')
        val pair = mapVarargIndexed(1, arrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapIntVarargIndexed_Int_to_Char() {
        val targetTypeArr = arrayOf('b', 'c', 'd', 'a', 'b', 'c', 'd')
        val pair = mapVarargIndexed(1, intArrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Int_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort(), 2.toShort(), 1.toShort(), 2.toShort(), 1.toShort(), 2.toShort())
        val pair = mapVarargIndexed(1, arrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapIntVarargIndexed_Int_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort(), 2.toShort(), 1.toShort(), 2.toShort(), 1.toShort(), 2.toShort())
        val pair = mapVarargIndexed(1, intArrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Int_to_Int() {
        val targetTypeArr = arrayOf(2, 3, 4, 5, 6, 7, 1)
        val pair = mapVarargIndexed(1, arrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapIntVarargIndexed_Int_to_Int() {
        val targetTypeArr = arrayOf(2, 3, 4, 5, 6, 7, 1)
        val pair = mapVarargIndexed(1, intArrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Int_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L, 2L, 1L, 2L, 1L, 2L)
        val pair = mapVarargIndexed(1, arrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapIntVarargIndexed_Int_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L, 2L, 1L, 2L, 1L, 2L)
        val pair = mapVarargIndexed(1, intArrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Int_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f, 2.0f, 1.0f, 2.0f, 1.0f, 2.0f)
        val pair = mapVarargIndexed(1, arrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapIntVarargIndexed_Int_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f, 2.0f, 1.0f, 2.0f, 1.0f, 2.0f)
        val pair = mapVarargIndexed(1, intArrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Int_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0, 2.0, 3.0, 1.0, 2.0)
        val pair = mapVarargIndexed(1, arrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapIntVarargIndexed_Int_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0, 2.0, 3.0, 1.0, 2.0)
        val pair = mapVarargIndexed(1, intArrayOf(2, 3, 4, 5, 6, 7)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_strings_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L, 2L)
        val pair = mapVarargIndexed("c", arrayOf("a", "b")) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Long_to_string() {
        val pair = mapVarargIndexed(1L, arrayOf(2L)) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

    @Test
    fun mapLongVarargIndexed_Long_to_string() {
        val pair = mapVarargIndexed(1L, longArrayOf(2L)) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

    @Test
    fun mapVarargIndexed_Long_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        val pair = mapVarargIndexed(1L, arrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapLongVarargIndexed_Long_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        val pair = mapVarargIndexed(1L, longArrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Long_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        val pair = mapVarargIndexed(1L, arrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapLongVarargIndexed_Long_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        val pair = mapVarargIndexed(1L, longArrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Long_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        val pair = mapVarargIndexed(1L, arrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapLongVarargIndexed_Long_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        val pair = mapVarargIndexed(1L, longArrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Long_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        val pair = mapVarargIndexed(1L, arrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapLongVarargIndexed_Long_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        val pair = mapVarargIndexed(1L, longArrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Long_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        val pair = mapVarargIndexed(1L, arrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapLongVarargIndexed_Long_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        val pair = mapVarargIndexed(1L, longArrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Long_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        val pair = mapVarargIndexed(1L, arrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapLongVarargIndexed_Long_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        val pair = mapVarargIndexed(1L, longArrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Long_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        val pair = mapVarargIndexed(1L, arrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapLongVarargIndexed_Long_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        val pair = mapVarargIndexed(1L, longArrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Long_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0)
        val pair = mapVarargIndexed(1L, arrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapLongVarargIndexed_Long_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0)
        val pair = mapVarargIndexed(1L, longArrayOf(2L)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_strings_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f, 2.0f)
        val pair = mapVarargIndexed("c", arrayOf("a", "b")) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Float_to_string() {
        val pair = mapVarargIndexed(1.0f, arrayOf(2.0f)) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

    @Test
    fun mapFloatVarargIndexed_Float_to_string() {
        val pair = mapVarargIndexed(1.0f, floatArrayOf(2.0f)) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_")
        }
    }

    @Test
    fun mapVarargIndexed_Float_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        val pair = mapVarargIndexed(1.0f, arrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapFloatVarargIndexed_Float_to_Boolean() {
        val targetTypeArr = arrayOf(true, false)
        val pair = mapVarargIndexed(1.0f, floatArrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Float_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        val pair = mapVarargIndexed(1.0f, arrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapFloatVarargIndexed_Float_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte())
        val pair = mapVarargIndexed(1.0f, floatArrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Float_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        val pair = mapVarargIndexed(1.0f, arrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapFloatVarargIndexed_Float_to_Char() {
        val targetTypeArr = arrayOf('b', 'c')
        val pair = mapVarargIndexed(1.0f, floatArrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Float_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        val pair = mapVarargIndexed(1.0f, arrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapFloatVarargIndexed_Float_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort())
        val pair = mapVarargIndexed(1.0f, floatArrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Float_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        val pair = mapVarargIndexed(1.0f, arrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapFloatVarargIndexed_Float_to_Int() {
        val targetTypeArr = arrayOf(2, 3)
        val pair = mapVarargIndexed(1.0f, floatArrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Float_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        val pair = mapVarargIndexed(1.0f, arrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapFloatVarargIndexed_Float_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L)
        val pair = mapVarargIndexed(1.0f, floatArrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Float_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        val pair = mapVarargIndexed(1.0f, arrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapFloatVarargIndexed_Float_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f)
        val pair = mapVarargIndexed(1.0f, floatArrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Float_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0)
        val pair = mapVarargIndexed(1.0f, arrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapFloatVarargIndexed_Float_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0)
        val pair = mapVarargIndexed(1.0f, floatArrayOf(2.0f)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_strings_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        val pair = mapVarargIndexed("c", arrayOf("a", "b")) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Double_to_string() {
        val pair = mapVarargIndexed(1.0, arrayOf(2.0, 3.0)) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_", "2_")
        }
    }

    @Test
    fun mapDoubleVarargIndexed_Double_to_string() {
        val pair = mapVarargIndexed(1.0, doubleArrayOf(2.0, 3.0)) { index, _ -> "${index}_" }

        expect(pair) {
           first.toEqual("0_")
           second.asList().toContainExactly("1_", "2_")
        }
    }

    @Test
    fun mapVarargIndexed_Double_to_Boolean() {
        val targetTypeArr = arrayOf(true, false, true)
        val pair = mapVarargIndexed(1.0, arrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapDoubleVarargIndexed_Double_to_Boolean() {
        val targetTypeArr = arrayOf(true, false, true)
        val pair = mapVarargIndexed(1.0, doubleArrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Double_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte(), 2.toByte())
        val pair = mapVarargIndexed(1.0, arrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapDoubleVarargIndexed_Double_to_Byte() {
        val targetTypeArr = arrayOf(2.toByte(), 1.toByte(), 2.toByte())
        val pair = mapVarargIndexed(1.0, doubleArrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Double_to_Char() {
        val targetTypeArr = arrayOf('b', 'c', 'd')
        val pair = mapVarargIndexed(1.0, arrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapDoubleVarargIndexed_Double_to_Char() {
        val targetTypeArr = arrayOf('b', 'c', 'd')
        val pair = mapVarargIndexed(1.0, doubleArrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Double_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort(), 2.toShort())
        val pair = mapVarargIndexed(1.0, arrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapDoubleVarargIndexed_Double_to_Short() {
        val targetTypeArr = arrayOf(2.toShort(), 1.toShort(), 2.toShort())
        val pair = mapVarargIndexed(1.0, doubleArrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Double_to_Int() {
        val targetTypeArr = arrayOf(2, 3, 4)
        val pair = mapVarargIndexed(1.0, arrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapDoubleVarargIndexed_Double_to_Int() {
        val targetTypeArr = arrayOf(2, 3, 4)
        val pair = mapVarargIndexed(1.0, doubleArrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Double_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L, 2L)
        val pair = mapVarargIndexed(1.0, arrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapDoubleVarargIndexed_Double_to_Long() {
        val targetTypeArr = arrayOf(2L, 1L, 2L)
        val pair = mapVarargIndexed(1.0, doubleArrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Double_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f, 2.0f)
        val pair = mapVarargIndexed(1.0, arrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapDoubleVarargIndexed_Double_to_Float() {
        val targetTypeArr = arrayOf(2.0f, 1.0f, 2.0f)
        val pair = mapVarargIndexed(1.0, doubleArrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapVarargIndexed_Double_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        val pair = mapVarargIndexed(1.0, arrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

    @Test
    fun mapDoubleVarargIndexed_Double_to_Double() {
        val targetTypeArr = arrayOf(2.0, 3.0, 1.0)
        val pair = mapVarargIndexed(1.0, doubleArrayOf(2.0, 3.0)) { index, _ -> targetTypeArr[index] }

        expect(pair) {
           first.toEqual(targetTypeArr[0])
           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
        }
    }

}