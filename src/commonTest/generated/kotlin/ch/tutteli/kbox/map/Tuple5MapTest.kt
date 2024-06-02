// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.map

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple5MapTest {

    @Test
    fun mapA1__identity__returns_equal_Tuple5() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .mapA1(::identity)
        ).toEqual(
            Tuple5("string", 1, 2L, 3F, 4.0)
        )
    }

    @Test
    fun mapA1__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        expect(
            Tuple5(a1, a2, a3, a4, a5)
                .mapA1 { it.first() }
        ) {
            toEqual(Tuple5("string", a2, a3, a4, a5))
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
        }
    }

    @Test
    fun mapA2__identity__returns_equal_Tuple5() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .mapA2(::identity)
        ).toEqual(
            Tuple5("string", 1, 2L, 3F, 4.0)
        )
    }

    @Test
    fun mapA2__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        expect(
            Tuple5(a1, a2, a3, a4, a5)
                .mapA2 { it.first() }
        ) {
            toEqual(Tuple5(a1, 1, a3, a4, a5))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
        }
    }

    @Test
    fun mapA3__identity__returns_equal_Tuple5() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .mapA3(::identity)
        ).toEqual(
            Tuple5("string", 1, 2L, 3F, 4.0)
        )
    }

    @Test
    fun mapA3__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        expect(
            Tuple5(a1, a2, a3, a4, a5)
                .mapA3 { it.first() }
        ) {
            toEqual(Tuple5(a1, a2, 2L, a4, a5))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
        }
    }

    @Test
    fun mapA4__identity__returns_equal_Tuple5() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .mapA4(::identity)
        ).toEqual(
            Tuple5("string", 1, 2L, 3F, 4.0)
        )
    }

    @Test
    fun mapA4__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        expect(
            Tuple5(a1, a2, a3, a4, a5)
                .mapA4 { it.first() }
        ) {
            toEqual(Tuple5(a1, a2, a3, 3F, a5))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a5) }.toBeTheInstance(a5)
        }
    }

    @Test
    fun mapA5__identity__returns_equal_Tuple5() {
        expect(
            Tuple5("string", 1, 2L, 3F, 4.0)
                .mapA5(::identity)
        ).toEqual(
            Tuple5("string", 1, 2L, 3F, 4.0)
        )
    }

    @Test
    fun mapA5__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        expect(
            Tuple5(a1, a2, a3, a4, a5)
                .mapA5 { it.first() }
        ) {
            toEqual(Tuple5(a1, a2, a3, a4, 4.0))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
        }
    }

}