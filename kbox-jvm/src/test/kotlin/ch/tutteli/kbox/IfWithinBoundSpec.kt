package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_UK.toBe
import ch.tutteli.atrium.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it

object IfWithinBoundSpec : Spek({

    mapOf(
        "List" to { index: Int -> listOf(1).ifWithinBound(index, { 1 }, { 2 }) },
        "Array" to { index: Int -> arrayOf(1).ifWithinBound(index, { 1 }, { 2 }) }
    ).forEach { (type, ifWithinBound) ->

        //TODO use function reference as soon as https://youtrack.jetbrains.com/issue/KT-24279 is fixed
        describe("$type.ifWithinBound") {
            given("index less than size") {
                it("executes thenBlock") {
                    assert(ifWithinBound(0)).toBe(1)
                }
            }

            given("index same as size") {
                it("executes elseBlock") {
                    assert(ifWithinBound(1)).toBe(2)
                }
            }

            given("index greater than size") {
                it("executes elseBlock") {
                    assert(ifWithinBound(2)).toBe(2)
                }
            }
        }
    }
})
