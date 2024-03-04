package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.kbox.atrium.expect
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object TakeIfSpec : Spek({

    describe("fun ${::takeIf.name}}") {
        it("it returns null if predicate doesn't hold") {
            expect(
                takeIf<Int>(false) { throw IllegalArgumentException("bla") }
            ).toEqual(null)
        }

        it("it returns null if predicate doesn't hold") {
            expect(takeIf(true) { 1 }).toEqual(1)
        }
    }
})
