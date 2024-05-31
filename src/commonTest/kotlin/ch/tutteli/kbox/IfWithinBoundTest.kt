package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.group
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.test.Test

class IfWithinBoundTest {

    @Test
    fun data_driven_cases() {
        expectGrouped {
            mapOf(
                "List" to { index: Int -> listOf(1).ifWithinBound(index, { 1 }, { 2 }) },
                "Array" to { index: Int -> arrayOf(1).ifWithinBound(index, { 1 }, { 2 }) }
            ).forEach { (type, ifWithinBound) ->
                group(type) {
                    group("index less than size, executes thenBlock") {
                        expect(ifWithinBound(0)).toEqual(1)
                    }

                    group("index same as size, executes elseBlock") {
                        expect(ifWithinBound(1)).toEqual(2)
                    }

                    group("index greater than size, executes elseBlock") {
                        expect(ifWithinBound(2)).toEqual(2)
                    }
                }
            }
        }
    }
}
