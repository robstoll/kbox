package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_UK.containsStrictly
import ch.tutteli.atrium.api.cc.en_UK.isEmpty
import ch.tutteli.atrium.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*

object MapExtensionsSpec : Spek({

    val mapToParents = Map<String, String>::mapParents.name

    fun SpecBody.testNonExistingChild(map: Map<String, String>) {
        on("passing non existing child") {
            it("returns an empty set") {
                val result = map.mapParents("a")
                assert(result).isEmpty()
            }
        }
    }

    describe("fun $mapToParents") {
        given("empty map") {
            it("returns an empty set") {
                val result = mapOf<String, String>().mapParents("a")
                assert(result).isEmpty()
            }
        }
        val child = "child"
        val parent = "parent"
        val grandparent = "grandparent"

        given("one child parent relation") {
            val map = mapOf(child to parent)

            testNonExistingChild(map)

            on("passing child") {
                it("returns set with the parent") {
                    val result = map.mapParents(child)
                    assert(result).containsStrictly(parent)
                }
            }

            on("passing parent") {
                it("returns an empty set") {
                    val result = map.mapParents(child)
                    assert(result).containsStrictly(parent)
                }
            }
        }

        given("two child parent grandparent relation") {
            val map = mapOf(child to parent, parent to grandparent)

            testNonExistingChild(map)
            on("passing child") {
                it("returns set with the parent and grandparent") {
                    val result = map.mapParents(child)
                    assert(result).containsStrictly(parent, grandparent)
                }
            }

            on("passing parent") {
                it("returns set with the grandparent") {
                    val result = map.mapParents(parent)
                    assert(result).containsStrictly(grandparent)
                }
            }

            on("passing grandparent") {
                it("returns empty set") {
                    val result = map.mapParents(grandparent)
                    assert(result).isEmpty()
                }
            }
        }

        given("two child parent relations unrelated") {
            val map = mapOf(child to parent, grandparent to parent)

            testNonExistingChild(map)

            on("passing child 1") {
                it("returns set only with related parent") {
                    val result = map.mapParents(child)
                    assert(result).containsStrictly(parent)
                }
            }

            on("passing child 2") {
                it("returns set only with related parent") {
                    val result = map.mapParents(grandparent)
                    assert(result).containsStrictly(parent)
                }
            }

        }
    }
})
