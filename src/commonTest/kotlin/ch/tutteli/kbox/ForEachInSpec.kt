package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.toBe
import ch.tutteli.kbox.atrium.assert
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object ForEachInSpec : Spek({

    //TODO use function reference as soon as https://youtrack.jetbrains.com/issue/KT-24279 is fixed
//    val forEachInFun: KFunction3<Sequence<Int>, Sequence<Int>, (Int) -> Unit, Unit> = ::forEachIn
    val forEachIn = "forEachIn" //forEachInFun.name

    fun t(result: String, vararg arr: Array<Int>) = TestData(result, arr)

    mapOf(
        "Array" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int> ->
            forEachIn(ints1, ints2) { sb.append(it) }
        },
        "Iterable" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int> ->
            forEachIn(ints1.asIterable(), ints2.asIterable()) { sb.append(it) }
        },
        "Sequence" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int> ->
            forEachIn(ints1.asSequence(), ints2.asSequence()) { sb.append(it) }
        }
    ).forEach { (type, function) ->
        describe("1.$forEachIn with two $type") {
            listOf(
                t("", arrayOf(), arrayOf()),
                t("2", arrayOf(2), arrayOf()),
                t("2", arrayOf(), arrayOf(2)),
                t("23", arrayOf(2), arrayOf(3)),
                t("32", arrayOf(3), arrayOf(2)),
                t("2345", arrayOf(2, 3), arrayOf(4, 5))
            ).forEach { (result, arrays) ->
                context(arrays.joinToString { "[" + it.joinToString() + "]" }) {
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
        "Array" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int> ->
            forEachIn(ints1, ints2, ints3) { sb.append(it) }
        },
        "Iterable" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int> ->
            forEachIn(ints1.asIterable(), ints2.asIterable(), ints3.asIterable()) { sb.append(it) }
        },
        "Sequence" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int> ->
            forEachIn(ints1.asSequence(), ints2.asSequence(), ints3.asSequence()) { sb.append(it) }
        }
    ).forEach { (type, function) ->
        describe("1.$forEachIn with three $type") {
            listOf(
                t("", arrayOf(), arrayOf(), arrayOf()),
                t("2", arrayOf(2), arrayOf(), arrayOf()),
                t("2", arrayOf(), arrayOf(2), arrayOf()),
                t("2", arrayOf(), arrayOf(), arrayOf(2)),
                t("23", arrayOf(2), arrayOf(3), arrayOf()),
                t("23", arrayOf(), arrayOf(2), arrayOf(3)),
                t("23", arrayOf(2), arrayOf(), arrayOf(3)),
                t("324", arrayOf(3), arrayOf(2), arrayOf(4)),
                t("234567", arrayOf(2, 3), arrayOf(4, 5), arrayOf(6, 7))
            ).forEach { (result, arrays) ->
                context(arrays.joinToString { "[" + it.joinToString() + "]" }) {
                    it("action is append item to StrinBuilder, result is $result") {
                        val sb = StringBuilder()
                        function(sb, arrays[0], arrays[1], arrays[2])
                        assert(sb.toString()).toBe(result)
                    }
                }
            }
        }
    }

    mapOf(
        "Array" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int>, ints4: Array<Int> ->
            forEachIn(ints1, ints2, ints3, ints4) { sb.append(it) }
        },
        "Iterable" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int>, ints4: Array<Int> ->
            forEachIn(ints1.asIterable(), ints2.asIterable(), ints3.asIterable(), ints4.asIterable()) { sb.append(it) }
        },
        "Sequence" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int>, ints4: Array<Int> ->
            forEachIn(ints1.asSequence(), ints2.asSequence(), ints3.asSequence(), ints4.asSequence()) { sb.append(it) }
        }
    ).forEach { (type, function) ->
        describe("1.$forEachIn with four $type") {
            listOf(
                t("", arrayOf(), arrayOf(), arrayOf(), arrayOf()),
                t("2", arrayOf(2), arrayOf(), arrayOf(), arrayOf()),
                t("2", arrayOf(), arrayOf(2), arrayOf(), arrayOf()),
                t("2", arrayOf(), arrayOf(), arrayOf(2), arrayOf()),
                t("2", arrayOf(), arrayOf(), arrayOf(), arrayOf(2)),
                t("234", arrayOf(2), arrayOf(3), arrayOf(), arrayOf(4)),
                t("234", arrayOf(), arrayOf(2), arrayOf(3), arrayOf(4)),
                t("324", arrayOf(3), arrayOf(), arrayOf(2), arrayOf(4)),
                t("324", arrayOf(3), arrayOf(2), arrayOf(4), arrayOf()),
                t("3254", arrayOf(3), arrayOf(2), arrayOf(5), arrayOf(4)),
                t("2345678", arrayOf(2, 3), arrayOf(4, 5), arrayOf(6, 7), arrayOf(8))
            ).forEach { (result, arrays) ->
                context(arrays.joinToString { "[" + it.joinToString() + "]" }) {
                    it("action is append item to StrinBuilder, result is $result") {
                        val sb = StringBuilder()
                        function(sb, arrays[0], arrays[1], arrays[2], arrays[3])
                        assert(sb.toString()).toBe(result)
                    }
                }
            }
        }
    }
}) {
    data class TestData(val result: String, @Suppress("ArrayInDataClass") val arrays: Array<out Array<Int>>)
}
