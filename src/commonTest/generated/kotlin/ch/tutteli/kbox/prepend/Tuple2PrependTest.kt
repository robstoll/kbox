// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.append

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple2PrependTest {

    @Test
    fun prepend_1_values__results_in_a_Tuple3() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple2(a1, a2)
                .prepend(a3)
        ).toBeAnInstanceOf<Tuple3<List<Long>, List<String>, List<Int>>> {
            feature { f(it::a1) }.toBeTheInstance(a3)
            feature { f(it::a2) }.toBeTheInstance(a1)
            feature { f(it::a3) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun prepend_2_values__results_in_a_Tuple4() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)

        expect(
            Tuple2(a1, a2)
                .prepend(a3, a4)
        ).toBeAnInstanceOf<Tuple4<List<Long>, List<Float>, List<String>, List<Int>>> {
            feature { f(it::a1) }.toBeTheInstance(a3)
            feature { f(it::a2) }.toBeTheInstance(a4)
            feature { f(it::a3) }.toBeTheInstance(a1)
            feature { f(it::a4) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun prepend_3_values__results_in_a_Tuple5() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)

        expect(
            Tuple2(a1, a2)
                .prepend(a3, a4, a5)
        ).toBeAnInstanceOf<Tuple5<List<Long>, List<Float>, List<Double>, List<String>, List<Int>>> {
            feature { f(it::a1) }.toBeTheInstance(a3)
            feature { f(it::a2) }.toBeTheInstance(a4)
            feature { f(it::a3) }.toBeTheInstance(a5)
            feature { f(it::a4) }.toBeTheInstance(a1)
            feature { f(it::a5) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun prepend_4_values__results_in_a_Tuple6() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')

        expect(
            Tuple2(a1, a2)
                .prepend(a3, a4, a5, a6)
        ).toBeAnInstanceOf<Tuple6<List<Long>, List<Float>, List<Double>, List<Char>, List<String>, List<Int>>> {
            feature { f(it::a1) }.toBeTheInstance(a3)
            feature { f(it::a2) }.toBeTheInstance(a4)
            feature { f(it::a3) }.toBeTheInstance(a5)
            feature { f(it::a4) }.toBeTheInstance(a6)
            feature { f(it::a5) }.toBeTheInstance(a1)
            feature { f(it::a6) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun prepend_5_values__results_in_a_Tuple7() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())

        expect(
            Tuple2(a1, a2)
                .prepend(a3, a4, a5, a6, a7)
        ).toBeAnInstanceOf<Tuple7<List<Long>, List<Float>, List<Double>, List<Char>, List<Short>, List<String>, List<Int>>> {
            feature { f(it::a1) }.toBeTheInstance(a3)
            feature { f(it::a2) }.toBeTheInstance(a4)
            feature { f(it::a3) }.toBeTheInstance(a5)
            feature { f(it::a4) }.toBeTheInstance(a6)
            feature { f(it::a5) }.toBeTheInstance(a7)
            feature { f(it::a6) }.toBeTheInstance(a1)
            feature { f(it::a7) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun prepend_6_values__results_in_a_Tuple8() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())
        val a8 = listOf(2.toByte())

        expect(
            Tuple2(a1, a2)
                .prepend(a3, a4, a5, a6, a7, a8)
        ).toBeAnInstanceOf<Tuple8<List<Long>, List<Float>, List<Double>, List<Char>, List<Short>, List<Byte>, List<String>, List<Int>>> {
            feature { f(it::a1) }.toBeTheInstance(a3)
            feature { f(it::a2) }.toBeTheInstance(a4)
            feature { f(it::a3) }.toBeTheInstance(a5)
            feature { f(it::a4) }.toBeTheInstance(a6)
            feature { f(it::a5) }.toBeTheInstance(a7)
            feature { f(it::a6) }.toBeTheInstance(a8)
            feature { f(it::a7) }.toBeTheInstance(a1)
            feature { f(it::a8) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun prepend_7_values__results_in_a_Tuple9() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())
        val a8 = listOf(2.toByte())
        val a9 = listOf(listOf(1, 2))

        expect(
            Tuple2(a1, a2)
                .prepend(a3, a4, a5, a6, a7, a8, a9)
        ).toBeAnInstanceOf<Tuple9<List<Long>, List<Float>, List<Double>, List<Char>, List<Short>, List<Byte>, List<List<Int>>, List<String>, List<Int>>> {
            feature { f(it::a1) }.toBeTheInstance(a3)
            feature { f(it::a2) }.toBeTheInstance(a4)
            feature { f(it::a3) }.toBeTheInstance(a5)
            feature { f(it::a4) }.toBeTheInstance(a6)
            feature { f(it::a5) }.toBeTheInstance(a7)
            feature { f(it::a6) }.toBeTheInstance(a8)
            feature { f(it::a7) }.toBeTheInstance(a9)
            feature { f(it::a8) }.toBeTheInstance(a1)
            feature { f(it::a9) }.toBeTheInstance(a2)
        }
    }

}