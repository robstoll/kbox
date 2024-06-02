// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.map

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class TripleMapTest {

    @Test
    fun mapFirst__identity__returns_equal_Triple() {
        expect(
            Triple("string", 1, 2L)
                .mapFirst(::identity)
        ).toEqual(
            Triple("string", 1, 2L)
        )
    }

    @Test
    fun mapFirst__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        expect(
            Triple(a1, a2, a3)
                .mapFirst { it.first() }
        ) {
            toEqual(Triple("string", a2, a3))
            feature { f(it::second) }.toBeTheInstance(a2)
            feature { f(it::third) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapSecond__identity__returns_equal_Triple() {
        expect(
            Triple("string", 1, 2L)
                .mapSecond(::identity)
        ).toEqual(
            Triple("string", 1, 2L)
        )
    }

    @Test
    fun mapSecond__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        expect(
            Triple(a1, a2, a3)
                .mapSecond { it.first() }
        ) {
            toEqual(Triple(a1, 1, a3))
            feature { f(it::first) }.toBeTheInstance(a1)
            feature { f(it::third) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun mapThird__identity__returns_equal_Triple() {
        expect(
            Triple("string", 1, 2L)
                .mapThird(::identity)
        ).toEqual(
            Triple("string", 1, 2L)
        )
    }

    @Test
    fun mapThird__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        expect(
            Triple(a1, a2, a3)
                .mapThird { it.first() }
        ) {
            toEqual(Triple(a1, a2, 2L))
            feature { f(it::first) }.toBeTheInstance(a1)
            feature { f(it::second) }.toBeTheInstance(a2)
        }
    }

}