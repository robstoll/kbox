package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.group
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.test.Test

class ForElementAndForEachTest {

    private fun createTestData(result: String, vararg arr: Array<Int>) = TestData(result, arr)

    @Test
    fun with_one_element() {
        expectGrouped {
            mapOf(
                "Array" to { sb: StringBuilder, ints: Array<Int> -> forElementAndForEachIn(1, ints) { sb.append(it) } },
                "Iterable" to { sb: StringBuilder, ints: Array<Int> ->
                    forElementAndForEachIn(1, ints.asIterable()) {
                        sb.append(it)
                    }
                },
                "Sequence" to { sb: StringBuilder, ints: Array<Int> ->
                    forElementAndForEachIn(1, ints.asSequence()) {
                        sb.append(it)
                    }
                }
            ).forEach { (type, function) ->
                group("with one $type") {
                    listOf(
                        createTestData("1", arrayOf()),
                        createTestData("12", arrayOf(2)),
                        createTestData("123", arrayOf(2, 3))
                    ).forEach { (result, arrays) ->
                        group(arrays.joinToString { "[" + it.joinToString() + "]" }) {
                            group("action is append element to StringBuilder, result is $result") {
                                val sb = StringBuilder()
                                function(sb, arrays[0])
                                expect(sb.toString()).toEqual(result)
                            }
                        }
                    }
                }
            }
        }
    }

    @Test
    fun with_two() {
        expectGrouped {
            mapOf(
                "Array" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int> ->
                    forElementAndForEachIn(1, ints1, ints2) { sb.append(it) }
                },
                "Iterable" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int> ->
                    forElementAndForEachIn(1, ints1.asIterable(), ints2.asIterable()) { sb.append(it) }
                },
                "Sequence" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int> ->
                    forElementAndForEachIn(1, ints1.asSequence(), ints2.asSequence()) { sb.append(it) }
                }
            ).forEach { (type, function) ->
                group("with two $type") {
                    listOf(
                        createTestData("1", arrayOf(), arrayOf()),
                        createTestData("12", arrayOf(2), arrayOf()),
                        createTestData("12", arrayOf(), arrayOf(2)),
                        createTestData("123", arrayOf(2), arrayOf(3)),
                        createTestData("132", arrayOf(3), arrayOf(2)),
                        createTestData("12345", arrayOf(2, 3), arrayOf(4, 5))
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
                    forElementAndForEachIn(1, ints1, ints2, ints3) { sb.append(it) }
                },
                "Iterable" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int> ->
                    forElementAndForEachIn(
                        1,
                        ints1.asIterable(),
                        ints2.asIterable(),
                        ints3.asIterable()
                    ) { sb.append(it) }
                },
                "Sequence" to { sb: StringBuilder, ints1: Array<Int>, ints2: Array<Int>, ints3: Array<Int> ->
                    forElementAndForEachIn(
                        1,
                        ints1.asSequence(),
                        ints2.asSequence(),
                        ints3.asSequence()
                    ) { sb.append(it) }
                }
            ).forEach { (type, function) ->
                group("with tree $type") {
                    listOf(
                        createTestData("1", arrayOf(), arrayOf(), arrayOf()),
                        createTestData("12", arrayOf(2), arrayOf(), arrayOf()),
                        createTestData("12", arrayOf(), arrayOf(2), arrayOf()),
                        createTestData("12", arrayOf(), arrayOf(), arrayOf(2)),
                        createTestData("123", arrayOf(2), arrayOf(3), arrayOf()),
                        createTestData("123", arrayOf(), arrayOf(2), arrayOf(3)),
                        createTestData("123", arrayOf(2), arrayOf(), arrayOf(3)),
                        createTestData("1324", arrayOf(3), arrayOf(2), arrayOf(4)),
                        createTestData("1234567", arrayOf(2, 3), arrayOf(4, 5), arrayOf(6, 7))
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

    data class TestData(val result: String, @Suppress("ArrayInDataClass") val arrays: Array<out Array<Int>>)
}
