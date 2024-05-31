package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.group
import ch.tutteli.atrium.api.fluent.en_GB.toBeEmpty
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.test.Test

class AppendToStringBuilderTest {

    private val separator = ", "
    private val lastSeparator = " and "

    private fun append(i: Int, sb: StringBuilder) {
        sb.append("a number: $i")
    }

    @Test
    fun appendToStringBuilder_without_lastSeparator() {
        expectGrouped {
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
                group("empty $type - does not append anything to the given StringBuilder") {
                    val result = StringBuilder()
                    function(result, arrayOf())
                    expect(result).toBeEmpty()
                }

                group("$type with one element - returns a string according to the given append function") {
                    val result = StringBuilder()
                    function(result, arrayOf(1))
                    expect(result.toString()).toEqual("a number: 1")
                }

                group("$type with two elements - returns a string according to the given append function and uses the separator") {
                    val result = StringBuilder()
                    function(result, arrayOf(1, 2))
                    expect(result.toString()).toEqual("a number: 1, a number: 2")
                }

                group("$type with three elements - returns a string according to the given append function and uses the separator") {
                    val result = StringBuilder()
                    function(result, arrayOf(1, 3, 2))
                    expect(result.toString()).toEqual("a number: 1, a number: 3, a number: 2")
                }
            }
        }
    }

    @Test
    fun appendToStringBuilder_with_lastSeparator() {
        expectGrouped {
            group("empty List - does not append anything to the given StringBuilder") {
                val result = StringBuilder()
                listOf<Int>().appendToStringBuilder(result, separator, lastSeparator) { append(it, result) }
                expect(result).toBeEmpty()
            }

            group("list with one element - returns a string according to the given append function") {
                val result = StringBuilder()
                listOf(1).appendToStringBuilder(result, separator, lastSeparator) { append(it, result) }
                expect(result.toString()).toEqual("a number: 1")
            }

            group("a list with two elements - returns a string according to the given append function and uses the lastSeparator") {
                val result = StringBuilder()
                listOf(1, 2).appendToStringBuilder(result, separator, lastSeparator) { append(it, result) }
                expect(result.toString()).toEqual("a number: 1 and a number: 2")
            }

            group("a list with three elements - returns a string according to the given append function and uses the separator and lastSeparator") {
                val result = StringBuilder()
                listOf(1, 3, 2).appendToStringBuilder(result, separator, lastSeparator) { append(it, result) }
                expect(result.toString()).toEqual("a number: 1, a number: 3 and a number: 2")
            }
        }
    }
}
