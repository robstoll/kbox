// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.map

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple7MapTest {

    @Test
    fun mapA1__identity__returns_equal_Tuple7() {
        expect(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
                .mapA1(::identity)
        ).toEqual(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
        )
    }

    @Test
    fun mapA1__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())
        expect(
            Tuple7(a1, a2, a3, a4, a5, a6, a7)
                .mapA1 { it.first() }
        ) {
            toEqual(Tuple7("string", a2, a3, a4, a5, a6, a7))
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
            feature { f(it::a6) }.toBeTheInstance(a6)
            feature { f(it::a7) }.toBeTheInstance(a7)
        }
    }

    @Test
    fun mapA2__identity__returns_equal_Tuple7() {
        expect(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
                .mapA2(::identity)
        ).toEqual(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
        )
    }

    @Test
    fun mapA2__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())
        expect(
            Tuple7(a1, a2, a3, a4, a5, a6, a7)
                .mapA2 { it.first() }
        ) {
            toEqual(Tuple7(a1, 1, a3, a4, a5, a6, a7))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
            feature { f(it::a6) }.toBeTheInstance(a6)
            feature { f(it::a7) }.toBeTheInstance(a7)
        }
    }

    @Test
    fun mapA3__identity__returns_equal_Tuple7() {
        expect(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
                .mapA3(::identity)
        ).toEqual(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
        )
    }

    @Test
    fun mapA3__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())
        expect(
            Tuple7(a1, a2, a3, a4, a5, a6, a7)
                .mapA3 { it.first() }
        ) {
            toEqual(Tuple7(a1, a2, 2L, a4, a5, a6, a7))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
            feature { f(it::a6) }.toBeTheInstance(a6)
            feature { f(it::a7) }.toBeTheInstance(a7)
        }
    }

    @Test
    fun mapA4__identity__returns_equal_Tuple7() {
        expect(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
                .mapA4(::identity)
        ).toEqual(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
        )
    }

    @Test
    fun mapA4__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())
        expect(
            Tuple7(a1, a2, a3, a4, a5, a6, a7)
                .mapA4 { it.first() }
        ) {
            toEqual(Tuple7(a1, a2, a3, 3F, a5, a6, a7))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a5) }.toBeTheInstance(a5)
            feature { f(it::a6) }.toBeTheInstance(a6)
            feature { f(it::a7) }.toBeTheInstance(a7)
        }
    }

    @Test
    fun mapA5__identity__returns_equal_Tuple7() {
        expect(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
                .mapA5(::identity)
        ).toEqual(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
        )
    }

    @Test
    fun mapA5__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())
        expect(
            Tuple7(a1, a2, a3, a4, a5, a6, a7)
                .mapA5 { it.first() }
        ) {
            toEqual(Tuple7(a1, a2, a3, a4, 4.0, a6, a7))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a6) }.toBeTheInstance(a6)
            feature { f(it::a7) }.toBeTheInstance(a7)
        }
    }

    @Test
    fun mapA6__identity__returns_equal_Tuple7() {
        expect(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
                .mapA6(::identity)
        ).toEqual(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
        )
    }

    @Test
    fun mapA6__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())
        expect(
            Tuple7(a1, a2, a3, a4, a5, a6, a7)
                .mapA6 { it.first() }
        ) {
            toEqual(Tuple7(a1, a2, a3, a4, a5, 'c', a7))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
            feature { f(it::a7) }.toBeTheInstance(a7)
        }
    }

    @Test
    fun mapA7__identity__returns_equal_Tuple7() {
        expect(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
                .mapA7(::identity)
        ).toEqual(
            Tuple7("string", 1, 2L, 3F, 4.0, 'c', 1.toShort())
        )
    }

    @Test
    fun mapA7__transformation_does_not_touch_other_properties() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val a4 = listOf(3F)
        val a5 = listOf(4.0)
        val a6 = listOf('c')
        val a7 = listOf(1.toShort())
        expect(
            Tuple7(a1, a2, a3, a4, a5, a6, a7)
                .mapA7 { it.first() }
        ) {
            toEqual(Tuple7(a1, a2, a3, a4, a5, a6, 1.toShort()))
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
            feature { f(it::a3) }.toBeTheInstance(a3)
            feature { f(it::a4) }.toBeTheInstance(a4)
            feature { f(it::a5) }.toBeTheInstance(a5)
            feature { f(it::a6) }.toBeTheInstance(a6)
        }
    }

}