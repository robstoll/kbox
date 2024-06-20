// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.map

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class PairMapTest {

    @Test
    fun mapFirst__identity__returns_equal_Pair() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Pair(a1, a2)
                .mapFirst(::identity)
        ) {
            feature { f(it::first) }.toBeTheInstance(a1)
            feature { f(it::second) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun mapFirst__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Pair(a1, a2)
                .mapFirst { it.first() }
        ) {
            toEqual(Pair("string", a2))
            feature { f(it::second) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun mapSecond__identity__returns_equal_Pair() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Pair(a1, a2)
                .mapSecond(::identity)
        ) {
            feature { f(it::first) }.toBeTheInstance(a1)
            feature { f(it::second) }.toBeTheInstance(a2)
        }
    }

    @Test
    fun mapSecond__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)

        expect(
            Pair(a1, a2)
                .mapSecond { it.first() }
        ) {
            toEqual(Pair(a1, 1))
            feature { f(it::first) }.toBeTheInstance(a1)
        }
    }

}