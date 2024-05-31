package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.group
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.test.Test

class BlankToNullTest {

    @Test
    fun data_driven() {
        expectGrouped {
            listOf(
                Triple("empty String", "", null),
                Triple("empty StringBuilder", StringBuilder(), null),
                Triple("String \"   \"", "   ", null),
                Triple("StringBuilder \"   \"", StringBuilder("   "), null),
                Triple("String \"  h\"", "  h", "  h"),
                Triple("StringBuilder \"  h\"", StringBuilder("  h"), StringBuilder("  h")),
                Triple("String \"h  \"", "h  ", "h  "),
                Triple("StringBuilder \"h  \"", StringBuilder("h  "), StringBuilder("h  "))
            ).forEach { (description, value, expected) ->
                group("given $description, expect $expected") {
                    expect(value.blankToNull().toString()).toEqual(expected.toString())
                }
            }
        }
    }
}
