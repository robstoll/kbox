// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.glue

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple3GlueTest {

    @Test
    fun glue_Tuple2__results_in_a_Tuple5() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)

        expect(
            Tuple3(a1, a2, a3)
                .glue(Tuple2(a4, a5))
        ).toBeAnInstanceOf<Tuple5<List<String>, List<Int>, List<Long>, List<Float>, List<Double>>> {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
        }
    }

    @Test
    fun glue_Tuple3__results_in_a_Tuple6() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')

        expect(
            Tuple3(a1, a2, a3)
                .glue(Tuple3(a4, a5, a6))
        ).toBeAnInstanceOf<Tuple6<List<String>, List<Int>, List<Long>, List<Float>, List<Double>, List<Char>>> {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
            feature { f(it::a6) }.toBeTheInstance(a6)
        }
    }

    @Test
    fun glue_Tuple4__results_in_a_Tuple7() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())

        expect(
            Tuple3(a1, a2, a3)
                .glue(Tuple4(a4, a5, a6, a7))
        ).toBeAnInstanceOf<Tuple7<List<String>, List<Int>, List<Long>, List<Float>, List<Double>, List<Char>, List<Short>>> {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
            feature { f(it::a6) }.toBeTheInstance(a6)
            feature { f(it::a7) }.toBeTheInstance(a7)
        }
    }

    @Test
    fun glue_Tuple5__results_in_a_Tuple8() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())
        val a8 = listOf(2.toByte())

        expect(
            Tuple3(a1, a2, a3)
                .glue(Tuple5(a4, a5, a6, a7, a8))
        ).toBeAnInstanceOf<Tuple8<List<String>, List<Int>, List<Long>, List<Float>, List<Double>, List<Char>, List<Short>, List<Byte>>> {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
            feature { f(it::a6) }.toBeTheInstance(a6)
            feature { f(it::a7) }.toBeTheInstance(a7)
            feature { f(it::a8) }.toBeTheInstance(a8)
        }
    }

    @Test
    fun glue_Tuple6__results_in_a_Tuple9() {
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
            Tuple3(a1, a2, a3)
                .glue(Tuple6(a4, a5, a6, a7, a8, a9))
        ).toBeAnInstanceOf<Tuple9<List<String>, List<Int>, List<Long>, List<Float>, List<Double>, List<Char>, List<Short>, List<Byte>, List<List<Int>>>> {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
            feature { f(it::a6) }.toBeTheInstance(a6)
            feature { f(it::a7) }.toBeTheInstance(a7)
            feature { f(it::a8) }.toBeTheInstance(a8)
            feature { f(it::a9) }.toBeTheInstance(a9)
        }
    }

}