package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.group
import ch.tutteli.atrium.api.fluent.en_GB.toContainExactly
import ch.tutteli.atrium.api.fluent.en_GB.toBeEmpty
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.test.Test

class MapWithIndexTest {

    @Test
    fun data_driven(){
        expectGrouped {
            mapOf(
                "Array" to { ints: Array<Int> -> ints.mapWithIndex() },
                "Iterable" to { ints: Array<Int> -> listOf(*ints).asIterable().mapWithIndex() },
                "Sequence" to { ints: Array<Int> -> listOf(*ints).asSequence().mapWithIndex().toList() }
            ).forEach { (type, function) ->
                group("empty $type") {
                    group("returns an empty list") {
                        val result = function(arrayOf())
                        expect(result).toBeEmpty()
                    }
                }

                group("$type with one element") {
                    group("returns list WithIndex(0, element0)") {
                        val result = function(arrayOf(1))
                        expect(result).toContainExactly(WithIndex(0, 1))
                    }
                }

                group("$type with two elements") {
                    group("returns list WithIndex(0, element0) and WithIndex(1, element1") {
                        val result = function(arrayOf(1, 2))
                        expect(result).toContainExactly(WithIndex(0, 1), WithIndex(1, 2))
                    }
                }
                group("$type with three elements") {
                    group("returns list with three WithIndex(0..2, element0..2)") {
                        val result = function(arrayOf(1, 2, 3))
                        expect(result).toContainExactly(
                            WithIndex(0, 1),
                            WithIndex(1, 2),
                            WithIndex(2, 3)
                        )
                    }
                }
            }
        }
    }
}
