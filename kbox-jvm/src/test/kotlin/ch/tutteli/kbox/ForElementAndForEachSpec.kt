package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.reflect.KFunction3

object ForElementAndForEachSpec : Spek({

    val t : (Int, Sequence<Int>, (Int) -> Unit) -> Unit = ::forElementAndForEachIn
    val forThisAndForEachIn: KFunction3<Int, Sequence<Int>, (Int) -> Unit, Unit> = t as KFunction3<Int, Sequence<Int>, (Int) -> Unit, Unit>

    fun t(result: String, vararg arr: Array<Int>)
        = ForEachInSpec.TestData(result, arr)


    mapOf(
        "Array" to { sb: StringBuilder, ints: Array<Int> -> forElementAndForEachIn(1, ints) { sb.append(it) } },
        "Iterable" to { sb: StringBuilder, ints: Array<Int> -> forElementAndForEachIn(1, ints.asIterable()) { sb.append(it) } },
        "Sequence" to { sb: StringBuilder,  ints: Array<Int> -> forElementAndForEachIn(1, ints.asSequence()) { sb.append(it) } }
    ).forEach { (type, function) ->
        describe("1.${forThisAndForEachIn.name} with one $type") {
            listOf(
                t("1", arrayOf()),
                t("12", arrayOf(2)),
                t("123", arrayOf(2, 3))
            ).forEach { (result, arrays) ->
                given(arrays.joinToString { "[" + it.joinToString() + "]" }) {
                    it("action is append item to StrinBuilder, result is $result") {
                        val sb = StringBuilder()
                        function(sb, arrays[0])
                        assert(sb.toString()).toBe(result)
                    }
                }
            }
        }
    }

    mapOf(
        "Array" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int> -> forElementAndForEachIn(1, ints1, ints2) { sb.append(it) } },
        "Iterable" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int> -> forElementAndForEachIn(1, ints1.asIterable(), ints2.asIterable()) { sb.append(it) } },
        "Sequence" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int> -> forElementAndForEachIn(1, ints1.asSequence(), ints2.asSequence()) { sb.append(it) } }
    ).forEach { (type, function) ->
        describe("1.${forThisAndForEachIn.name} with two $type") {
            listOf(
                t("1", arrayOf(), arrayOf()),
                t("12", arrayOf(2), arrayOf()),
                t("12", arrayOf(), arrayOf(2)),
                t("123", arrayOf(2), arrayOf(3)),
                t("132", arrayOf(3), arrayOf(2)),
                t("12345", arrayOf(2, 3), arrayOf(4, 5))
            ).forEach { (result, arrays) ->
                given(arrays.joinToString { "[" + it.joinToString() + "]" }) {
                    it("action is append item to StrinBuilder, result is $result") {
                        val sb = StringBuilder()
                        function(sb, arrays[0], arrays[1])
                        assert(sb.toString()).toBe(result)
                    }
                }
            }
        }
    }

    mapOf(
        "Array" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int> -> forElementAndForEachIn(1, ints1, ints2, ints3) { sb.append(it) } },
        "Iterable" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int> -> forElementAndForEachIn(1, ints1.asIterable(), ints2.asIterable(), ints3.asIterable()) { sb.append(it) } },
        "Sequence" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int> -> forElementAndForEachIn(1, ints1.asSequence(), ints2.asSequence(), ints3.asSequence()) { sb.append(it) } }
    ).forEach { (type, function) ->
        describe("1.${forThisAndForEachIn.name} with tree $type") {
            listOf(
                t("1", arrayOf(), arrayOf(), arrayOf()),
                t("12", arrayOf(2), arrayOf(), arrayOf()),
                t("12", arrayOf(), arrayOf(2), arrayOf()),
                t("12", arrayOf(), arrayOf(), arrayOf(2)),
                t("123", arrayOf(2), arrayOf(3), arrayOf()),
                t("123", arrayOf(), arrayOf(2), arrayOf(3)),
                t("123", arrayOf(2), arrayOf(), arrayOf(3)),
                t("1324", arrayOf(3), arrayOf(2), arrayOf(4)),
                t("1234567", arrayOf(2, 3), arrayOf(4, 5), arrayOf(6, 7))
            ).forEach { (result, arrays) ->
                given(arrays.joinToString { "[" + it.joinToString() + "]" }) {
                    it("action is append item to StrinBuilder, result is $result") {
                        val sb = StringBuilder()
                        function(sb, arrays[0], arrays[1], arrays[2])
                        assert(sb.toString()).toBe(result)
                    }
                }
            }
        }
    }
}){
    data class TestData(val result: String, @Suppress("ArrayInDataClass") val arrays: Array<out Array<Int>>)
}
