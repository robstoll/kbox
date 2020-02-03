package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.kbox.atrium.assert
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object IfWithinBoundSpec : Spek({

    mapOf(
        "List" to { index: Int -> listOf(1).ifWithinBound(index, { 1 }, { 2 }) },
        "Array" to { index: Int -> arrayOf(1).ifWithinBound(index, { 1 }, { 2 }) }
    ).forEach { (type, ifWithinBound) ->

        //TODO use function reference as soon as https://youtrack.jetbrains.com/issue/KT-24279 is fixed
        describe("$type.ifWithinBound") {
            context("index less than size") {
                it("executes thenBlock") {
                    assert(ifWithinBound(0)).toBe(1)
                }
            }

            context("index same as size") {
                it("executes elseBlock") {
                    assert(ifWithinBound(1)).toBe(2)
                }
            }

            context("index greater than size") {
                it("executes elseBlock") {
                    assert(ifWithinBound(2)).toBe(2)
                }
            }
        }
    }
})
