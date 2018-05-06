package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_UK.toBe
import ch.tutteli.atrium.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import kotlin.reflect.KFunction2

object ForThisAndForEachSpec : Spek({

    val forThisAndForEachIn: KFunction2<Sequence<Int>, (Int) -> Unit, Unit> = 1::forThisAndForEachIn

    mapOf(
        "Iterable" to { sb: StringBuilder, ints: Array<Int> -> 1.forThisAndForEachIn(ints.asIterable()) { sb.append(it) } },
        "Sequence" to { sb: StringBuilder,  ints: Array<Int> -> 1.forThisAndForEachIn(ints.asSequence()) { sb.append(it) } }
    ).forEach { (type, function) ->
        describe("1.${forThisAndForEachIn.name} with one $type") {
            given("empty $type") {
                val sb = StringBuilder()
                function(sb, arrayOf())
                assert(sb.toString()).toBe("1")
            }

            given("$type with one element") {
                val sb = StringBuilder()
                function(sb, arrayOf(2))
                assert(sb.toString()).toBe("12")
            }

            given("$type with two element") {
                val sb = StringBuilder()
                function(sb, arrayOf(2, 3))
                assert(sb.toString()).toBe("123")
            }
        }
    }

    mapOf(
        "Iterable" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int> -> 1.forThisAndForEachIn(ints1.asIterable(), ints2.asIterable()) { sb.append(it) } },
        "Sequence" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int> -> 1.forThisAndForEachIn(ints1.asSequence(), ints2.asSequence()) { sb.append(it) } }
    ).forEach { (type, function) ->
        describe("1.${forThisAndForEachIn.name} with two $type") {
            given("both empty") {
                val sb = StringBuilder()
                function(sb, arrayOf(), arrayOf())
                assert(sb.toString()).toBe("1")
            }

            given("first with one element, second empty") {
                val sb = StringBuilder()
                function(sb, arrayOf(2), arrayOf())
                assert(sb.toString()).toBe("12")
            }
            given("first empty, second with one element") {
                val sb = StringBuilder()
                function(sb, arrayOf(), arrayOf(2))
                assert(sb.toString()).toBe("12")
            }

            given("first with one element, second with two elements") {
                val sb = StringBuilder()
                function(sb, arrayOf(2), arrayOf(3, 4))
                assert(sb.toString()).toBe("1234")
            }
        }
    }

    mapOf(
        "Iterable" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int> -> 1.forThisAndForEachIn(ints1.asIterable(), ints2.asIterable(), ints3.asIterable()) { sb.append(it) } },
        "Sequence" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int> -> 1.forThisAndForEachIn(ints1.asSequence(), ints2.asSequence(), ints3.asSequence()) { sb.append(it) } }
    ).forEach { (type, function) ->
        describe("1.${forThisAndForEachIn.name} with tree $type") {
            given("all empty") {
                val sb = StringBuilder()
                function(sb, arrayOf(), arrayOf(), arrayOf())
                assert(sb.toString()).toBe("1")
            }

            given("first with one element, second empty, third empty") {
                val sb = StringBuilder()
                function(sb, arrayOf(2), arrayOf(), arrayOf())
                assert(sb.toString()).toBe("12")
            }
            given("first empty, second with one element, third empty") {
                val sb = StringBuilder()
                function(sb, arrayOf(), arrayOf(2), arrayOf())
                assert(sb.toString()).toBe("12")
            }
            given("first empty, second empty, third with one element") {
                val sb = StringBuilder()
                function(sb, arrayOf(), arrayOf(), arrayOf(2))
                assert(sb.toString()).toBe("12")
            }

            given("first with one element, second with two elements, third with tree element") {
                val sb = StringBuilder()
                function(sb, arrayOf(2), arrayOf(3, 4), arrayOf(5, 6, 7))
                assert(sb.toString()).toBe("1234567")
            }
        }
    }
})
