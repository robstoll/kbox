// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.map

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple3MapTest {

    @Test
    fun mapA1__identity__returns_equal_Tuple3() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapA1(::identity)
        ) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapA1__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapA1 { it.first() }
        ) {
            toEqual(Tuple3("string", a2, a3))
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapFirst__identity__returns_equal_Tuple3() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapFirst(::identity)
        ) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapFirst__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapFirst { it.first() }
        ) {
            toEqual(Tuple3("string", a2, a3))
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapA2__identity__returns_equal_Tuple3() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapA2(::identity)
        ) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapA2__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapA2 { it.first() }
        ) {
            toEqual(Tuple3(a1, 1, a3))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a3) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapSecond__identity__returns_equal_Tuple3() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapSecond(::identity)
        ) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapSecond__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapSecond { it.first() }
        ) {
            toEqual(Tuple3(a1, 1, a3))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a3) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapA3__identity__returns_equal_Tuple3() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapA3(::identity)
        ) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapA3__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapA3 { it.first() }
        ) {
            toEqual(Tuple3(a1, a2, 2L))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun mapThird__identity__returns_equal_Tuple3() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapThird(::identity)
        ) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapThird__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)

        expect(
            Tuple3(a1, a2, a3)
                .mapThird { it.first() }
        ) {
            toEqual(Tuple3(a1, a2, 2L))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
        }
    }

}