// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox.drop

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.kbox.*
import kotlin.test.Test

class Tuple3DropTest {

    @Test
    fun dropFirst() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val tuple = Tuple3(a1, a2, a3)

        expect(tuple.dropFirst()) {
            feature { f(it::a1) }.toBeTheInstance(a2)
            feature { f(it::a2) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun dropSecond() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val tuple = Tuple3(a1, a2, a3)

        expect(tuple.dropSecond()) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a3)
        }
    }

    @Test
    fun dropThird() {
        val a1 = listOf("string")
        val a2 = listOf(1)
        val a3 = listOf(2L)
        val tuple = Tuple3(a1, a2, a3)

        expect(tuple.dropThird()) {
            feature { f(it::a1) }.toBeTheInstance(a1)
            feature { f(it::a2) }.toBeTheInstance(a2)
        }
    }

}