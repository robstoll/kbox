package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_UK.toBe
import ch.tutteli.atrium.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it

object IfWithinBoundSpec : Spek({

    //TODO use function reference as soon as https://youtrack.jetbrains.com/issue/KT-24279 is fixed
    describe("fun ifWithinBound") {
        given("index less than size") {
            it("executes thenBlock") {
                assert(listOf(1).ifWithinBound(0, { 1 }, { 2 })).toBe(1)
            }
        }

        given("index same as size") {
            it("executes elseBlock") {
                assert(listOf(1).ifWithinBound(1, { 1 }, { 2 })).toBe(2)
            }
        }

        given("index greater than size") {
            it("executes elseBlock") {
                assert(listOf(1).ifWithinBound(2, { 1 }, { 2 })).toBe(2)
            }
        }
    }
})
