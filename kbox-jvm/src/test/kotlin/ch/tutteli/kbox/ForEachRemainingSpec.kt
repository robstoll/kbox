package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.containsExactly
import ch.tutteli.atrium.api.cc.en_GB.isEmpty
import ch.tutteli.atrium.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.reflect.KFunction2
import ch.tutteli.kbox.forEachRemaining as foreachRemaining //otherwise we use jdk8

object ForEachRemainingSpec : Spek({
    val forEachRemainingFun: KFunction2<Iterator<Int>, (Int) -> Unit, Unit> = Iterator<Int>::foreachRemaining
    val forEachRemaining = forEachRemainingFun.name

    describe("fun $forEachRemaining and add to list") {
        given("empty iterator") {
            it("returns an empty list") {
                val result = mutableListOf<Int>()
                listOf<Int>().iterator().foreachRemaining { result.add(it) }
                assert(result).isEmpty()
            }
        }

        given("iterator with one element but already one consumed") {
            it("returns an empty list") {
                val itr = listOf(1).iterator()
                itr.next()
                val result = mutableListOf<Int>()
                itr.foreachRemaining { result.add(it) }
                assert(result).isEmpty()
            }
        }

        given("iterator with two element and one already consumed") {
            it("returns a list with one mapped element") {
                val itr = listOf(1, 2).iterator()
                itr.next()
                val result = mutableListOf<Int>()
                itr.foreachRemaining { result.add(it) }
                assert(result).containsExactly(2)
            }
        }

        given("iterator with three element and one already consumed") {
            it("returns a list with two mapped elements") {
                val itr = listOf(1, 2, 4).iterator()
                itr.next()
                val result = mutableListOf<Int>()
                itr.foreachRemaining { result.add(it) }
                assert(result).containsExactly(2, 4)
            }
        }
    }
})
