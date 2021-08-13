package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.containsExactly
import ch.tutteli.atrium.api.fluent.en_GB.isEmpty
import ch.tutteli.kbox.atrium.assert
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object MapWithIndexSpec : Spek({
    val mapWithIndex = List<Float>::mapWithIndex.name

    mapOf(
        "Array" to { ints: Array<Int> -> ints.mapWithIndex() },
        "Iterable" to { ints: Array<Int> -> listOf(*ints).asIterable().mapWithIndex() },
        "Sequence" to { ints: Array<Int> -> listOf(*ints).asSequence().mapWithIndex().toList() }
    ).forEach { (type, function) ->

        describe("$type.$mapWithIndex") {
            context("empty list") {
                it("returns an empty list") {
                    val result = function(arrayOf())
                    assert(result).isEmpty()
                }
            }

            context("a list with one element") {
                it("returns list WithIndex(0, element0)") {
                    val result = function(arrayOf(1))
                    assert(result).containsExactly(WithIndex(0, 1))
                }
            }

            context("a list with two elements") {
                it("returns list WithIndex(0, element0) and WithIndex(1, element1") {
                    val result = function(arrayOf(1, 2))
                    assert(result).containsExactly(WithIndex(0, 1), WithIndex(1, 2))
                }
            }
            context("a list with three elements") {
                it("returns list with three WithIndex(0..2, element0..2)") {
                    val result = function(arrayOf(1, 2, 3))
                    assert(result).containsExactly(
                        WithIndex(0, 1),
                        WithIndex(1, 2),
                        WithIndex(2, 3)
                    )
                }
            }
        }
    }
})
