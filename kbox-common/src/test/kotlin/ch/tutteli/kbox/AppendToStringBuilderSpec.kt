package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.isEmpty
import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.kbox.atrium.assert
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.reflect.KFunction4

object AppendToStringBuilderSpec : Spek({
    val append: (i: Int, sb: StringBuilder) -> Unit = { i, sb -> sb.append("a number: $i") }
    val separator = ", "

    val appendToStringBuilder: KFunction4<List<Int>, StringBuilder, String, (Int) -> Unit, Unit> =
        List<Int>::appendToStringBuilder

    mapOf(
        "Array" to { sb: StringBuilder, ints: Array<Int> ->
            ints.appendToStringBuilder(sb, separator) {
                append(it, sb)
            }
        },
        "List" to { sb: StringBuilder, ints: Array<Int> ->
            listOf(*ints).appendToStringBuilder(sb, separator) {
                append(it, sb)
            }
        },
        "Iterable" to { sb: StringBuilder, ints: Array<Int> ->
            listOf(*ints).asIterable().appendToStringBuilder(sb, separator) { append(it, sb) }
        },
        "Sequence" to { sb: StringBuilder, ints: Array<Int> ->
            listOf(*ints).asSequence().appendToStringBuilder(sb, separator) { append(it, sb) }
        }
    ).forEach { (type, function) ->

        describe("$type.${appendToStringBuilder.name}") {
            context("empty $type") {
                it("does not append anything to the given StringBuilder") {
                    val result = StringBuilder()
                    function(result, arrayOf())
                    assert(result).isEmpty()
                }
            }

            context("$type with one item") {
                it("returns a string according to the given append function") {
                    val result = StringBuilder()
                    function(result, arrayOf(1))
                    assert(result.toString()).toBe("a number: 1")
                }
            }

            context("$type with two items") {
                it("returns a string according to the given append function and uses the separator") {
                    val result = StringBuilder()
                    function(result, arrayOf(1, 2))
                    assert(result.toString()).toBe("a number: 1, a number: 2")
                }
            }
            context("$type with three items") {
                it("returns a string according to the given append function and uses the separator") {
                    val result = StringBuilder()
                    function(result, arrayOf(1, 3, 2))
                    assert(result.toString()).toBe("a number: 1, a number: 3, a number: 2")
                }
            }
        }
    }

    val lastSeparator = " and "
    describe("List.${appendToStringBuilder.name} with lastSeparator") {
        context("empty list") {
            it("does not append anything to the given StringBuilder") {
                val result = StringBuilder()
                listOf<Int>().appendToStringBuilder(result, separator, lastSeparator) { append(it, result) }
                assert(result).isEmpty()
            }
        }

        context("a list with one item") {
            it("returns a string according to the given append function") {
                val result = StringBuilder()
                listOf(1).appendToStringBuilder(result, separator, lastSeparator) { append(it, result) }
                assert(result.toString()).toBe("a number: 1")
            }
        }

        context("a list with two items") {
            it("returns a string according to the given append function and uses the lastSeparator") {
                val result = StringBuilder()
                listOf(1, 2).appendToStringBuilder(result, separator, lastSeparator) { append(it, result) }
                assert(result.toString()).toBe("a number: 1 and a number: 2")
            }
        }
        context("a list with three items") {
            it("returns a string according to the given append function and uses the separator and lastSeparator") {
                val result = StringBuilder()
                listOf(1, 3, 2).appendToStringBuilder(result, separator, lastSeparator) { append(it, result) }
                assert(result.toString()).toBe("a number: 1, a number: 3 and a number: 2")
            }
        }
    }
})
