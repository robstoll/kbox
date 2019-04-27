package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe

object BlankToNullSpec : Spek({

    describe("fun ${String::blankToNull.name}") {
        listOf<Triple<String, CharSequence, CharSequence?>>(
            Triple("empty String", "", null),
            Triple("empty StringBuilder", StringBuilder(), null),
            Triple("String \"   \"", "   ", null),
            Triple("StringBuilder \"   \"", StringBuilder("   "), null),
            Triple("String \"  h\"", "  h", "  h"),
            Triple("StringBuilder \"  h\"", StringBuilder("  h"), StringBuilder("  h")),
            Triple("String \"h  \"", "h  ", "h  "),
            Triple("StringBuilder \"h  \"", StringBuilder("h  "), StringBuilder("h  "))
        ).forEach { (description, value, expected) ->
            test("given $description, expect $expected") {
                assert(value.blankToNull().toString()).toBe(expected.toString())
            }
        }
    }
})
