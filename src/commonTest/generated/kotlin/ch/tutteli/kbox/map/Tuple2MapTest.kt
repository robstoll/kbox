// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.map

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple2MapTest {

    @Test
    fun mapA1__identity__returns_equal_Tuple2() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Tuple2(a1, a2)
                .mapA1(::identity)
        ) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun mapA1__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Tuple2(a1, a2)
                .mapA1 { it.first() }
        ) {
            toEqual(Tuple2("string", a2))
            feature { f(it::a2) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun mapFirst__identity__returns_equal_Tuple2() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Tuple2(a1, a2)
                .mapFirst(::identity)
        ) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun mapFirst__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Tuple2(a1, a2)
                .mapFirst { it.first() }
        ) {
            toEqual(Tuple2("string", a2))
            feature { f(it::a2) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun mapA2__identity__returns_equal_Tuple2() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Tuple2(a1, a2)
                .mapA2(::identity)
        ) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun mapA2__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Tuple2(a1, a2)
                .mapA2 { it.first() }
        ) {
            toEqual(Tuple2(a1, 1))
            feature { f(it::a1) }.toBeTheInstance(a1)
        }
    }

    @Test
    fun mapSecond__identity__returns_equal_Tuple2() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Tuple2(a1, a2)
                .mapSecond(::identity)
        ) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun mapSecond__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Tuple2(a1, a2)
                .mapSecond { it.first() }
        ) {
            toEqual(Tuple2(a1, 1))
            feature { f(it::a1) }.toBeTheInstance(a1)
        }
    }

}