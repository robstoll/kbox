package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.containsStrictly
import ch.tutteli.atrium.api.cc.en_GB.isEmpty
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import ch.tutteli.atrium.assert

object MapWithIndexSpec: Spek({
    val mapWithIndex = List<Float>::mapWithIndex.name

    mapOf(
        "Array" to { ints: Array<Int> -> ints.mapWithIndex() },
        "Iterable" to { ints: Array<Int> -> listOf(*ints).asIterable().mapWithIndex()  },
        "Sequence" to { ints: Array<Int> -> listOf(*ints).asSequence().mapWithIndex().toList() }
    ).forEach { (type, function) ->

        describe("$type.$mapWithIndex") {
            given("empty list") {
                it("returns an empty list") {
                    val result = function(arrayOf())
                    assert(result).isEmpty()
                }
            }

            given("a list with one element") {
                it("returns list WithIndex(0, element0)") {
                    val result = function(arrayOf(1))
                    assert(result).containsStrictly(WithIndex(0, 1))
                }
            }

            given("a list with two elements") {
                it("returns list WithIndex(0, element0) and WithIndex(1, element1") {
                    val result = function(arrayOf(1, 2))
                    assert(result).containsStrictly(WithIndex(0, 1), WithIndex(1, 2))
                }
            }
            given("a list with three elements") {
                it("returns list with three WithIndex(0..2, element0..2)") {
                    val result = function(arrayOf(1, 2, 3))
                    assert(result).containsStrictly(
                        WithIndex(0, 1),
                        WithIndex(1, 2),
                        WithIndex(2, 3)
                    )
                }
            }
        }
    }
})
