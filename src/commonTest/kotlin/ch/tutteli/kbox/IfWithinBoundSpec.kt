package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.kbox.atrium.expect
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
                    expect(ifWithinBound(0)).toEqual(1)
                }
            }

            context("index same as size") {
                it("executes elseBlock") {
                    expect(ifWithinBound(1)).toEqual(2)
                }
            }

            context("index greater than size") {
                it("executes elseBlock") {
                    expect(ifWithinBound(2)).toEqual(2)
                }
            }
        }
    }
})
