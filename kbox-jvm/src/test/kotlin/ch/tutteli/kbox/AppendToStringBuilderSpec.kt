package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.isEmpty
import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.reflect.KFunction4

object AppendToStringBuilderSpec : Spek({
    val append: (it: Int, sb: StringBuilder) -> Unit = { it, sb -> sb.append("a number: $it") }
    val separator = ", "

    val appendToStringBuilder: KFunction4<List<Int>, StringBuilder, String, (Int) -> Unit, Unit> = List<Int>::appendToStringBuilder

    mapOf(
        "Array" to { sb: StringBuilder, ints: Array<Int> -> ints.appendToStringBuilder(sb, separator) {append(it, sb)} },
        "List" to { sb: StringBuilder, ints: Array<Int> -> listOf(*ints).appendToStringBuilder(sb, separator) {append(it, sb)} },
        "Iterable" to { sb: StringBuilder, ints: Array<Int> -> listOf(*ints).asIterable().appendToStringBuilder(sb, separator) {append(it, sb)} },
        "Sequence" to { sb: StringBuilder, ints: Array<Int> -> listOf(*ints).asSequence().appendToStringBuilder(sb, separator) {append(it, sb)} }
    ).forEach { (type, function) ->

        describe("$type.${appendToStringBuilder.name}") {
            given("empty $type") {
                it("does not append anything to the given StringBuilder") {
                    val result = StringBuilder()
                    function(result, arrayOf())
                    assert(result).isEmpty()
                }
            }

            given("$type with one item") {
                it("returns a string according to the given append function") {
                    val result = StringBuilder()
                    function(result, arrayOf(1))
                    assert(result.toString()).toBe("a number: 1")
                }
            }

            given("$type with two items") {
                it("returns a string according to the given append function and uses the separator") {
                    val result = StringBuilder()
                    function(result, arrayOf(1, 2))
                    assert(result.toString()).toBe("a number: 1, a number: 2")
                }
            }
            given("$type with three items") {
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
        given("empty list") {
            it("does not append anything to the given StringBuilder") {
                val result = StringBuilder()
                listOf<Int>().appendToStringBuilder(result, separator, lastSeparator) {append(it, result)}
                assert(result).isEmpty()
            }
        }

        given("a list with one item") {
            it("returns a string according to the given append function") {
                val result = StringBuilder()
                listOf(1).appendToStringBuilder(result, separator, lastSeparator) {append(it, result)}
                assert(result.toString()).toBe("a number: 1")
            }
        }

        given("a list with two items") {
            it("returns a string according to the given append function and uses the lastSeparator") {
                val result = StringBuilder()
                listOf(1, 2).appendToStringBuilder(result, separator, lastSeparator) {append(it, result)}
                assert(result.toString()).toBe("a number: 1 and a number: 2")
            }
        }
        given("a list with three items") {
            it("returns a string according to the given append function and uses the separator and lastSeparator") {
                val result = StringBuilder()
                listOf(1, 3, 2).appendToStringBuilder(result, separator, lastSeparator) {append(it, result)}
                assert(result.toString()).toBe("a number: 1, a number: 3 and a number: 2")
            }
        }
    }
})
