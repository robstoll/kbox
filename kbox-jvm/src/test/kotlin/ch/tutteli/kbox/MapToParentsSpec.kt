package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_UK.*
import ch.tutteli.atrium.assert
import ch.tutteli.atrium.expect
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*

object MapToParentsSpec : Spek({

    fun SpecBody.testNonExistingChild(map: Map<String, String>) {
        on("passing non existing child") {
            it("returns an empty set") {
                val result = map.mapParents("a")
                assert(result).isEmpty()
            }
        }
    }

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

    given("one child parent and one parent grandparent relation") {
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

    given("one child to child relation (cycle)") {
        val map = mapOf(child to child)

        context("nothing passed for failIfCyclic (= false)") {

            testNonExistingChild(map)

            on("passing child") {
                it("returns an empty set") {
                    val result = map.mapParents(child)
                    assert(result).isEmpty()
                }
            }
        }

        context("true passed for failIfCyclic") {

            testNonExistingChild(map)

            on("passing child") {
                it("throws an IllegalStateException showing the cycle child -> child") {
                    expect {
                        map.mapParents(child, failIfCyclic = true)
                    }.toThrow<IllegalStateException>{
                        message { contains("$child -> $child") }
                    }
                }
            }
        }
    }

    given("one child to parent and one parent to child relation (cycle)") {
        val map = mapOf(child to parent, parent to child)

        context("nothing passed for failIfCyclic (= false)") {

            testNonExistingChild(map)

            on("passing child") {
                it("returns parent") {
                    val result = map.mapParents(child)
                    assert(result).containsStrictly(parent)
                }
            }

            on("passing parent") {
                it("returns child") {
                    val result = map.mapParents(parent)
                    assert(result).containsStrictly(child)
                }
            }
        }

        context("true passed for failIfCyclic") {

            testNonExistingChild(map)

            on("passing child") {
                it("throws an IllegalStateException showing the cycle child -> parent -> child") {
                    expect {
                        map.mapParents(child, failIfCyclic = true)
                    }.toThrow<IllegalStateException>{
                        message { contains("$child -> $parent -> $child") }
                    }
                }
            }

            on("passing parent") {
                it("throws an IllegalStateException showing the cycle parent -> child -> parent") {
                    expect {
                        map.mapParents(parent, failIfCyclic = true)
                    }.toThrow<IllegalStateException>{
                        message { contains("$parent -> $child -> $parent") }
                    }
                }
            }
        }
    }

    given("one child to parent, parent to grandparent and one grandparent to child relation (cycle)") {
        val map = mapOf(child to parent, parent to grandparent, grandparent to child)

        context("nothing passed for failIfCyclic (= false)") {

            testNonExistingChild(map)

            on("passing child") {
                it("returns parent and grandparent") {
                    val result = map.mapParents(child)
                    assert(result).containsStrictly(parent, grandparent)
                }
            }

            on("passing parent") {
                it("returns grandparent and child") {
                    val result = map.mapParents(parent)
                    assert(result).containsStrictly(grandparent, child)
                }
            }

            on("passing grandparent") {
                it("returns child and parent") {
                    val result = map.mapParents(grandparent)
                    assert(result).containsStrictly(child, parent)
                }
            }
        }

        context("true passed for failIfCyclic") {

            testNonExistingChild(map)

            on("passing child") {
                it("throws an IllegalStateException showing the cycle child -> parent -> grandparent -> child") {
                    expect {
                        map.mapParents(child, failIfCyclic = true)
                    }.toThrow<IllegalStateException>{
                        message { contains("$child -> $parent -> $grandparent -> $child") }
                    }
                }
            }

            on("passing parent") {
                it("throws an IllegalStateException showing the cycle parent -> grandparent -> child -> parent") {
                    expect {
                        map.mapParents(parent, failIfCyclic = true)
                    }.toThrow<IllegalStateException>{
                        message { contains("$parent -> $grandparent -> $child -> $parent") }
                    }
                }
            }

            on("passing grandparent") {
                it("throws an IllegalStateException showing the cycle grandparent -> child -> parent -> grandparent") {
                    expect {
                        map.mapParents(grandparent, failIfCyclic = true)
                    }.toThrow<IllegalStateException>{
                        message { contains("$grandparent -> $child -> $parent -> $grandparent") }
                    }
                }
            }
        }
    }
})
