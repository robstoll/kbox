package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_UK.isEmpty
import ch.tutteli.atrium.api.cc.en_UK.toBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.reflect.KFunction3
import kotlin.reflect.KFunction4

object IterableExtensionsSpec: Spek({
    val append: (it: Int, sb: StringBuilder) -> Unit = { it, sb -> sb.append("a number: $it") }
    val separator = ", "

    val joinToString: KFunction3<List<Int>, String, (Int, StringBuilder) -> Unit, String> = Iterable<Int>::joinToString

    describe("fun ${joinToString.name}") {
        on("empty list") {
            it("returns an empty string") {
                val result = listOf<Int>().asIterable().joinToString(separator, append)
                ch.tutteli.atrium.assert(result).isEmpty()
            }
        }

        on("a list with one item") {
            it("returns a string according to the given append function") {
                val result = listOf(1).asIterable().joinToString(separator, append)
                ch.tutteli.atrium.assert(result).toBe("a number: 1")
            }
        }

        on("a list with two items") {
            it("returns a string according to the given append function and uses the separator") {
                val result = listOf(1, 2).asIterable().joinToString(separator, append)
                ch.tutteli.atrium.assert(result).toBe("a number: 1, a number: 2")
            }
        }
        on("a list with three items") {
            it("returns a string according to the given append function and uses the separator") {
                val result = listOf(1, 2, 3).asIterable().joinToString(separator, append)
                ch.tutteli.atrium.assert(result).toBe("a number: 1, a number: 2, a number: 3")
            }
        }
    }

    val appendToStringBuilder: KFunction4<List<Int>, StringBuilder, String, (Int, StringBuilder) -> Unit, Unit> = List<Int>::appendToStringBuilder
    describe("fun ${appendToStringBuilder.name}") {
        on("empty list") {
            it("does not append anything to the given StringBuilder") {
                val result = StringBuilder()
                listOf<Int>().asIterable().appendToStringBuilder(result, separator, append)
                ch.tutteli.atrium.assert(result).isEmpty()
            }
        }

        on("a list with one item") {
            it("returns a string according to the given append function") {
                val result = StringBuilder()
                listOf(1).asIterable().appendToStringBuilder(result, separator, append)
                ch.tutteli.atrium.assert(result.toString()).toBe("a number: 1")
            }
        }

        on("a list with two items") {
            it("returns a string according to the given append function and uses the separator") {
                val result = StringBuilder()
                listOf(1, 2).asIterable().appendToStringBuilder(result, separator, append)
                ch.tutteli.atrium.assert(result.toString()).toBe("a number: 1, a number: 2")
            }
        }
        on("a list with three items") {
            it("returns a string according to the given append function and uses the separator") {
                val result = StringBuilder()
                listOf(1, 3, 2).asIterable().appendToStringBuilder(result, separator, append)
                ch.tutteli.atrium.assert(result.toString()).toBe("a number: 1, a number: 3, a number: 2")
            }
        }
    }

})
