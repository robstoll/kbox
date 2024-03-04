package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.kbox.atrium.expect
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

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
            it("given $description, expect $expected") {
                expect(value.blankToNull().toString()).toEqual(expected.toString())
            }
        }
    }
})
