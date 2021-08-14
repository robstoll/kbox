package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.toBeEmpty
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.kbox.atrium.expect
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.reflect.KFunction3

object JoinToStringSpec : Spek({
    val append: (i: Int, sb: StringBuilder) -> Unit = { i, sb -> sb.append("a number: $i") }
    val separator = ", "

    val joinToString: KFunction3<List<Int>, String, (Int, StringBuilder) -> Unit, String> = Iterable<Int>::joinToString

    mapOf(
        "Array" to { ints: Array<Int> -> ints.joinToString(separator, append) },
        "List" to { ints: Array<Int> -> listOf(*ints).joinToString(separator, append) },
        "Iterable" to { ints: Array<Int> -> listOf(*ints).asIterable().joinToString(separator, append) },
        "Sequence" to { ints: Array<Int> -> listOf(*ints).asSequence().joinToString(separator, append) }
    ).forEach { (type, function) ->

        describe("$type.${joinToString.name}") {
            context("empty $type") {
                it("returns an empty string") {
                    val result = function(arrayOf())
                    expect(result).toBeEmpty()
                }
            }

            context("$type with one item") {
                it("returns a string according to the given append function") {
                    val result = function(arrayOf(1))
                    expect(result).toEqual("a number: 1")
                }
            }

            context("$type with two items") {
                it("returns a string according to the given append function and uses the separator") {
                    val result = function(arrayOf(1, 2))
                    expect(result).toEqual("a number: 1, a number: 2")
                }
            }
            context("$type with three items") {
                it("returns a string according to the given append function and uses the separator") {
                    val result = function(arrayOf(1, 2, 3))
                    expect(result).toEqual("a number: 1, a number: 2, a number: 3")
                }
            }
        }
    }


    val lastSeparator = " and "
    describe("List.${joinToString.name} with lastSeparator") {
        context("empty list") {
            it("returns an empty string") {
                val result = listOf<Int>().joinToString(separator, lastSeparator, append)
                expect(result).toBeEmpty()
            }
        }

        context("a list with one item") {
            it("returns a string according to the given append function") {
                val result = listOf(1).joinToString(separator, lastSeparator, append)
                expect(result).toEqual("a number: 1")
            }
        }

        context("a list with two items") {
            it("returns a string according to the given append function and uses the lastSeparator") {
                val result = listOf(1, 2).joinToString(separator, lastSeparator, append)
                expect(result).toEqual("a number: 1 and a number: 2")
            }
        }
        context("a list with three items") {
            it("returns a string according to the given append function and uses the separator as well as the lastSeparator") {
                val result = listOf(1, 2, 3).joinToString(separator, lastSeparator, append)
                expect(result).toEqual("a number: 1, a number: 2 and a number: 3")
            }
        }
    }
})
