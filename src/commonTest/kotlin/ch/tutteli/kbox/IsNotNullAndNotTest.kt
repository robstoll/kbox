package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.group
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.test.Test

class IsNotNullAndNotTest {

    @Test
    fun isNotNullAndNotEmpty() {
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
                    expect(value.isNotNullAndNotEmpty()).toEqual(expected)
                }
            }
        }
    }

    @Test
    fun isNotNullAndNotBlank() {
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
                    expect(value.isNotNullAndNotBlank()).toEqual(expected)
                }
            }
        }
    }
}
