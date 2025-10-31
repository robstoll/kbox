package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.group
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.collections.emptyMap
import kotlin.test.Test

class IsNotNullNorTest {

    @Test
    fun isNotNullNorEmpty() {
        expectGrouped {
            listOf(
                Triple("null", null, false),
                Triple("empty String", "", false),
                Triple("empty StringBuilder", StringBuilder(), false),
                Triple("String \"   \"", "   ", true),
                Triple("StringBuilder \"   \"", StringBuilder("   "), true),
                Triple("String \"hello\"", "hello", true),
                Triple("StringBuilder \"hello\"", StringBuilder("hello"), true)
            ).forEach { (description, value, expected) ->
                group("given $description, expect $expected") {
                    expect(value.isNotNullNorEmpty()).toEqual(expected)
                }
            }
        }
    }

    @Test
    fun isNotNullNorBlank() {
        expectGrouped {
            listOf(
                Triple("null", null, false),
                Triple("empty String", "", false),
                Triple("empty StringBuilder", StringBuilder(), false),
                Triple("String \"   \"", "   ", false),
                Triple("StringBuilder \"   \"", StringBuilder("   "), false),
                Triple("String \"hello\"", "hello", true),
                Triple("StringBuilder \"hello\"", StringBuilder("hello"), true)
            ).forEach { (description, value, expected) ->
                group("given $description, expect $expected") {
                    expect(value.isNotNullNorBlank()).toEqual(expected)
                }
            }
        }
    }

    @Test
    fun isNotNullNorEmpty_Array() {
        expectGrouped {
            listOf(
                Triple("null", null, false),
                Triple("empty Array", emptyArray(), false),
                Triple("Array with one element", arrayOf(1), true),
                Triple("Array with two element", arrayOf(1, 2), true),
            ).forEach { (description, value, expected) ->
                group("given $description, expect $expected") {
                    expect(value.isNotNullNorEmpty()).toEqual(expected)
                }
            }
        }
    }

    @Test
    fun isNotNullNorEmpty_Collection() {
        expectGrouped {
            listOf(
                Triple("null", null, false),
                Triple("empty List", emptyList(), false),
                Triple("List with one element", listOf(1), true),
                Triple("Set with two element", setOf(1, 2), true),
            ).forEach { (description, value, expected) ->
                group("given $description, expect $expected") {
                    expect(value.isNotNullNorEmpty()).toEqual(expected)
                }
            }
        }
    }


    @Test
    fun isNotNullNorEmpty_Map() {
        expectGrouped {
            listOf(
                Triple("null", null, false),
                Triple("empty Map", emptyMap(), false),
                Triple("Map with one element", mapOf(1 to "a"), true),
                Triple("Map with two element", mapOf(1 to "a", 2 to "b"), true),
            ).forEach { (description, value, expected) ->
                group("given $description, expect $expected") {
                    expect(value.isNotNullNorEmpty()).toEqual(expected)
                }
            }
        }
    }
}
