package ch.tutteli.kbox

import ch.tutteli.atrium.*
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class ListExtensionSpec : Spek({

    val append: (it: Int, sb: StringBuilder) -> Unit = { it, sb -> sb.append("a number: $it") }
    val separator = ", "

    describe("fun ${List<*>::joinToString.name}") {
        on("empty list") {
            it("returns an empty string") {
                val result = listOf<Int>().joinToString(separator, append)
                assert(result).isEmpty()
            }
        }

        on("a list with one item") {
            it("returns a string according to the given append function") {
                val result = listOf(1).joinToString(separator, append)
                assert(result).toBe("a number: 1")
            }
        }

        on("a list with two items") {
            it("returns a string according to the given append function and uses the separator") {
                val result = listOf(1, 2).joinToString(separator, append)
                assert(result).toBe("a number: 1, a number: 2")
            }
        }
        on("a list with three items") {
            it("returns a string according to the given append function and uses the separator") {
                val result = listOf(1, 2, 3).joinToString(separator, append)
                assert(result).toBe("a number: 1, a number: 2, a number: 3")
            }
        }

    }

    describe("fun ${List<*>::appendToStringBuilder.name}") {
        on("empty list") {
            it("does not append anything to the given StringBuilder") {
                val result = StringBuilder()
                listOf<Int>().appendToStringBuilder(result, separator, append)
                assert(result).isEmpty()
            }
        }

        on("a list with one item") {
            it("returns a string according to the given append function") {
                val result = StringBuilder()
                listOf(1).appendToStringBuilder(result, separator, append)
                assert(result.toString()).toBe("a number: 1")
            }
        }

        on("a list with two items") {
            it("returns a string according to the given append function and uses the separator") {
                val result = StringBuilder()
                listOf(1, 2).appendToStringBuilder(result, separator, append)
                assert(result.toString()).toBe("a number: 1, a number: 2")
            }
        }
        on("a list with three items") {
            it("returns a string according to the given append function and uses the separator") {
                val result = StringBuilder()
                listOf(1, 3, 2).appendToStringBuilder(result, separator, append)
                assert(result.toString()).toBe("a number: 1, a number: 3, a number: 2")
            }
        }
    }

    describe("fun flatten") {
        on("empty list") {
            it("returns an empty list") {
                val list = listOf<DummyWithList>()
                val result = list.flatten(DummyWithList::list)
                assert(result).toBe(listOf<Int>())
            }
        }
        on("list with one element but element has empty list") {
            it("returns an empty list") {
                val list = listOf(DummyWithList(listOf()))
                val result = list.flatten(DummyWithList::list)
                assert(result).toBe(listOf<Int>())
            }
        }
        on("list with one element which has list of two int") {
            it("returns list with two int") {
                val list = listOf(DummyWithList(listOf(1, 2)))
                val result = list.flatten(DummyWithList::list)
                assert(result).toBe(listOf(1, 2))
            }
        }

        on("list with 3 elements, first has list of two int, seond an empty list and third a list with one int") {
            it("returns list with threee int") {
                val list = listOf(
                    DummyWithList(listOf(1, 2)),
                    DummyWithList(listOf()),
                    DummyWithList(listOf(4)))
                //act
                val result = list.flatten(DummyWithList::list)
                //arrange
                assert(result).toBe(listOf(1, 2, 4))
            }
        }
    }
}) {
    private class DummyWithList(val list: List<Int>)
}
