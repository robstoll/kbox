// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.drop

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple6DropTest {

    @Test
    fun dropA1() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val tuple = Tuple6(a1, a2, a3, a4, a5, a6)

        expect(tuple.dropA1()) {
            feature { f(it::a1) }.toBeTheInstance(a2)
            feature { f(it::a2) }.toBeTheInstance(a3)
            feature { f(it::a3) }.toBeTheInstance(a4)
            feature { f(it::a4) }.toBeTheInstance(a5)
            feature { f(it::a5) }.toBeTheInstance(a6)
        }
    }

    @Test
    fun dropA2() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val tuple = Tuple6(a1, a2, a3, a4, a5, a6)

        expect(tuple.dropA2()) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a3)
            feature { f(it::a3) }.toBeTheInstance(a4)
            feature { f(it::a4) }.toBeTheInstance(a5)
            feature { f(it::a5) }.toBeTheInstance(a6)
        }
    }

    @Test
    fun dropA3() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val tuple = Tuple6(a1, a2, a3, a4, a5, a6)

        expect(tuple.dropA3()) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a4)
            feature { f(it::a4) }.toBeTheInstance(a5)
            feature { f(it::a5) }.toBeTheInstance(a6)
        }
    }

    @Test
    fun dropA4() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val tuple = Tuple6(a1, a2, a3, a4, a5, a6)

        expect(tuple.dropA4()) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a5)
            feature { f(it::a5) }.toBeTheInstance(a6)
        }
    }

    @Test
    fun dropA5() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val tuple = Tuple6(a1, a2, a3, a4, a5, a6)

        expect(tuple.dropA5()) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a6)
        }
    }

    @Test
    fun dropA6() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val tuple = Tuple6(a1, a2, a3, a4, a5, a6)

        expect(tuple.dropA6()) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
        }
    }

}