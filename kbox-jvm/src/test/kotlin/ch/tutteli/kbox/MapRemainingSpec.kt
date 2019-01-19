package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.containsExactly
import ch.tutteli.atrium.api.cc.en_GB.isEmpty
import ch.tutteli.atrium.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it

object MapRemainingSpec : Spek({
    //TODO use function reference as soon as https://youtrack.jetbrains.com/issue/KT-24279 is fixed
//    val mapRemainingFun : KFunction2<Iterator<Int>, (Int) -> Int, List<Int>> = Iterator<Int>::mapRemaining
//    val mapRemainingWithCounterFun : KFunction2<Iterator<Int>, (Int) -> Int, List<Int>> = Iterator<Int>::mapRemainingWithCounter
    val mapRemaining = "mapRemaining" //mapRemainingFun.name
    val mapRemainingWithCounter = "mapRemainingWithCounter" //mapRemainingWithCounterFun.name

    describe("fun $mapRemaining and map = it + 1") {
        given("empty iterator") {
            it("returns an empty List") {
                val result = listOf<Int>().iterator().mapRemaining { it + 1 }
                assert(result).isEmpty()
            }
        }

        given("iterator with one element but already one consumed") {
            it("returns an empty List") {
                val itr = listOf(1).iterator()
                itr.next()
                val result = itr.mapRemaining { it + 1 }
                assert(result).isEmpty()
            }
        }

        given("iterator with two element and one already consumed") {
            it("returns a List with one mapped element") {
                val itr = listOf(1, 2).iterator()
                itr.next()
                val result = itr.mapRemaining { it + 1 }
                assert(result).containsExactly(3)
            }
        }

        given("iterator with three element and one already consumed") {
            it("returns a List with two mapped elements") {
                val itr = listOf(1, 2, 4).iterator()
                itr.next()
                val result = itr.mapRemaining { it + 1 }
                assert(result).containsExactly(3, 5)
            }
        }
    }

    describe("fun $mapRemainingWithCounter and map = it + counter") {
        given("empty iterator") {
            it("returns an empty List") {
                val result = listOf<Int>().iterator().mapRemainingWithCounter { counter, it -> it + counter }
                assert(result).isEmpty()
            }
        }

        given("iterator with one element but already one consumed") {
            it("returns an empty list") {
                val itr = listOf(1).iterator()
                itr.next()
                val result = itr.mapRemainingWithCounter { counter, it -> it + counter }
                assert(result).isEmpty()
            }
        }

        given("iterator with two element and one already consumed") {
            it("returns a list with element + 0") {
                val itr = listOf(1, 2).iterator()
                itr.next()
                val result = itr.mapRemainingWithCounter { counter, it -> it + counter }
                assert(result).containsExactly(2)
            }
        }

        given("iterator with three element and one already consumed") {
            it("returns a list with element + 0 and element + 1") {
                val itr = listOf(1, 2, 4).iterator()
                itr.next()
                val result = itr.mapRemainingWithCounter { counter, it -> it + counter }
                assert(result).containsExactly(2, 5)
            }
        }

    }
})
