package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_UK.isEmpty
import ch.tutteli.atrium.api.cc.en_UK.toBe
import ch.tutteli.atrium.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.reflect.KFunction3

object JoinToStringSpec : Spek({
    val append: (it: Int, sb: StringBuilder) -> Unit = { it, sb -> sb.append("a number: $it") }
    val separator = ", "

    val joinToString: KFunction3<List<Int>, String, (Int, StringBuilder) -> Unit, String> = Iterable<Int>::joinToString

    mapOf(
        "Array" to { ints: Array<Int> -> ints.joinToString(separator, append) },
        "List" to { ints: Array<Int> -> listOf(*ints).joinToString(separator, append) },
        "Iterable" to { ints: Array<Int> -> listOf(*ints).asIterable().joinToString(separator, append) },
        "Sequence" to { ints: Array<Int> -> listOf(*ints).asSequence().joinToString(separator, append) }
    ).forEach { (type, function) ->

        describe("$type.${joinToString.name}") {
            given("empty $type") {
                it("returns an empty string") {
                    val result = function(arrayOf())
                    assert(result).isEmpty()
                }
            }

            given("$type with one item") {
                it("returns a string according to the given append function") {
                    val result = function(arrayOf(1))
                    assert(result).toBe("a number: 1")
                }
            }

            given("$type with two items") {
                it("returns a string according to the given append function and uses the separator") {
                    val result = function(arrayOf(1, 2))
                    assert(result).toBe("a number: 1, a number: 2")
                }
            }
            given("$type with three items") {
                it("returns a string according to the given append function and uses the separator") {
                    val result = function(arrayOf(1, 2, 3))
                    assert(result).toBe("a number: 1, a number: 2, a number: 3")
                }
            }
        }
    }


    val lastSeparator = " and "
    describe("List.${joinToString.name} with lastSeparator") {
        given("empty list") {
            it("returns an empty string") {
                val result = listOf<Int>().joinToString(separator, lastSeparator, append)
                assert(result).isEmpty()
            }
        }

        given("a list with one item") {
            it("returns a string according to the given append function") {
                val result = listOf(1).joinToString(separator, lastSeparator, append)
                assert(result).toBe("a number: 1")
            }
        }

        given("a list with two items") {
            it("returns a string according to the given append function and uses the lastSeparator") {
                val result = listOf(1, 2).joinToString(separator, lastSeparator, append)
                assert(result).toBe("a number: 1 and a number: 2")
            }
        }
        given("a list with three items") {
            it("returns a string according to the given append function and uses the separator as well as the lastSeparator") {
                val result = listOf(1, 2, 3).joinToString(separator, lastSeparator, append)
                assert(result).toBe("a number: 1, a number: 2 and a number: 3")
            }
        }
    }
})
