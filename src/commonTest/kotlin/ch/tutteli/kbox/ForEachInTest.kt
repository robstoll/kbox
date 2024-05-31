package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.group
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.test.Test
import kotlin.reflect.KFunction3

class ForEachInTest {

    private val forEachInFun: KFunction3<Sequence<Int>, Sequence<Int>, (Int) -> Unit, Unit> = ::forEachIn
    private val forEachIn = forEachInFun.name

    private fun createTestData(result: String, vararg arr: Array<Int>) = TestData(result, arr)

    @Test
    fun with_two() {
        expectGrouped {
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
                group("$forEachIn with two $type") {
                    listOf(
                        createTestData("", arrayOf(), arrayOf()),
                        createTestData("2", arrayOf(2), arrayOf()),
                        createTestData("2", arrayOf(), arrayOf(2)),
                        createTestData("23", arrayOf(2), arrayOf(3)),
                        createTestData("32", arrayOf(3), arrayOf(2)),
                        createTestData("2345", arrayOf(2, 3), arrayOf(4, 5))
                    ).forEach { (result, arrays) ->
                        group(arrays.joinToString { "[" + it.joinToString() + "]" }) {
                            group("action is append element to StringBuilder, result is $result") {
                                val sb = StringBuilder()
                                function(sb, arrays[0], arrays[1])
                                expect(sb.toString()).toEqual(result)
                            }
                        }
                    }
                }
            }
        }
    }

    @Test
    fun with_three() {
        expectGrouped {
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
                group("$forEachIn with three $type") {
                    listOf(
                        createTestData("", arrayOf(), arrayOf(), arrayOf()),
                        createTestData("2", arrayOf(2), arrayOf(), arrayOf()),
                        createTestData("2", arrayOf(), arrayOf(2), arrayOf()),
                        createTestData("2", arrayOf(), arrayOf(), arrayOf(2)),
                        createTestData("23", arrayOf(2), arrayOf(3), arrayOf()),
                        createTestData("23", arrayOf(), arrayOf(2), arrayOf(3)),
                        createTestData("23", arrayOf(2), arrayOf(), arrayOf(3)),
                        createTestData("324", arrayOf(3), arrayOf(2), arrayOf(4)),
                        createTestData("234567", arrayOf(2, 3), arrayOf(4, 5), arrayOf(6, 7))
                    ).forEach { (result, arrays) ->
                        group(arrays.joinToString { "[" + it.joinToString() + "]" }) {
                            group("action is append element to StringBuilder, result is $result") {
                                val sb = StringBuilder()
                                function(sb, arrays[0], arrays[1], arrays[2])
                                expect(sb.toString()).toEqual(result)
                            }
                        }
                    }
                }
            }
        }
    }

    @Test
    fun with_four() {
        expectGrouped {
            mapOf(
                "Array" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int>, ints4: Array<Int> ->
                    forEachIn(ints1, ints2, ints3, ints4) { sb.append(it) }
                },
                "Iterable" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int>, ints4: Array<Int> ->
                    forEachIn(
                        ints1.asIterable(),
                        ints2.asIterable(),
                        ints3.asIterable(),
                        ints4.asIterable()
                    ) { sb.append(it) }
                },
                "Sequence" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int>, ints4: Array<Int> ->
                    forEachIn(
                        ints1.asSequence(),
                        ints2.asSequence(),
                        ints3.asSequence(),
                        ints4.asSequence()
                    ) { sb.append(it) }
                }
            ).forEach { (type, function) ->
                group("1.$forEachIn with four $type") {
                    listOf(
                        createTestData("", arrayOf(), arrayOf(), arrayOf(), arrayOf()),
                        createTestData("2", arrayOf(2), arrayOf(), arrayOf(), arrayOf()),
                        createTestData("2", arrayOf(), arrayOf(2), arrayOf(), arrayOf()),
                        createTestData("2", arrayOf(), arrayOf(), arrayOf(2), arrayOf()),
                        createTestData("2", arrayOf(), arrayOf(), arrayOf(), arrayOf(2)),
                        createTestData("234", arrayOf(2), arrayOf(3), arrayOf(), arrayOf(4)),
                        createTestData("234", arrayOf(), arrayOf(2), arrayOf(3), arrayOf(4)),
                        createTestData("324", arrayOf(3), arrayOf(), arrayOf(2), arrayOf(4)),
                        createTestData("324", arrayOf(3), arrayOf(2), arrayOf(4), arrayOf()),
                        createTestData("3254", arrayOf(3), arrayOf(2), arrayOf(5), arrayOf(4)),
                        createTestData("2345678", arrayOf(2, 3), arrayOf(4, 5), arrayOf(6, 7), arrayOf(8))
                    ).forEach { (result, arrays) ->
                        group(arrays.joinToString { "[" + it.joinToString() + "]" }) {
                            group("action is append element to StringBuilder, result is $result") {
                                val sb = StringBuilder()
                                function(sb, arrays[0], arrays[1], arrays[2], arrays[3])
                                expect(sb.toString()).toEqual(result)
                            }
                        }
                    }
                }
            }
        }
    }

    data class TestData(val result: String, @Suppress("ArrayInDataClass") val arrays: Array<out Array<Int>>)
}
