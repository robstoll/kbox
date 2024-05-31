package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.group
import ch.tutteli.atrium.api.fluent.en_GB.toBeEmpty
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.test.Test

class JoinToStringTest {
    private fun append(i: Int, sb: StringBuilder) {
        sb.append("a number: $i")
    }

    private val separator = ", "
    private val lastSeparator = " and "

    @Test
    fun joinToString_without_lastSeparator() {
        expectGrouped {
            mapOf(
                "Array" to { ints: Array<Int> ->
                    ints.joinToString(separator) { it, sb -> append(it, sb) }
                },
                "List" to { ints: Array<Int> ->
                    listOf(*ints).joinToString(separator) { it, sb -> append(it, sb) }
                },
                "Iterable" to { ints: Array<Int> ->
                    listOf(*ints).asIterable().joinToString(separator) { it, sb -> append(it, sb) }
                },
                "Sequence" to { ints: Array<Int> ->
                    listOf(*ints).asSequence().joinToString(separator) { it, sb -> append(it, sb) }
                }
            ).forEach { (type, function) ->

                group("empty $type") {
                    group("returns an empty string") {
                        val result = function(arrayOf())
                        expect(result).toBeEmpty()
                    }
                }

                group("$type with one item") {
                    group("returns a string according to the given append function") {
                        val result = function(arrayOf(1))
                        expect(result).toEqual("a number: 1")
                    }
                }

                group("$type with two items") {
                    group("returns a string according to the given append function and uses the separator") {
                        val result = function(arrayOf(1, 2))
                        expect(result).toEqual("a number: 1, a number: 2")
                    }
                }

                group("$type with three items") {
                    group("returns a string according to the given append function and uses the separator") {
                        val result = function(arrayOf(1, 2, 3))
                        expect(result).toEqual("a number: 1, a number: 2, a number: 3")
                    }
                }
            }
        }
    }

    @Test
    fun joinToString_wit_lastSeparator() {
        expectGrouped {
            group("empty list") {
                group("returns an empty string") {
                    val result = listOf<Int>().joinToString(separator, lastSeparator) { it, sb -> append(it, sb) }
                    expect(result).toBeEmpty()
                }
            }

            group("a list with one item") {
                group("returns a string according to the given append function") {
                    val result = listOf(1).joinToString(separator, lastSeparator) { it, sb -> append(it, sb) }
                    expect(result).toEqual("a number: 1")
                }
            }

            group("a list with two items") {
                group("returns a string according to the given append function and uses the lastSeparator") {
                    val result = listOf(1, 2).joinToString(separator, lastSeparator) { it, sb -> append(it, sb) }
                    expect(result).toEqual("a number: 1 and a number: 2")
                }
            }
            group("a list with three items") {
                group("returns a string according to the given append function and uses the separator as well as the lastSeparator") {
                    val result = listOf(1, 2, 3).joinToString(separator, lastSeparator) { it, sb -> append(it, sb) }
                    expect(result).toEqual("a number: 1, a number: 2 and a number: 3")
                }
            }
        }
    }
}
