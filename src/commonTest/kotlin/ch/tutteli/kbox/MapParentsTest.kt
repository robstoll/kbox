package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import ch.tutteli.atrium.creating.ExpectGrouping
import kotlin.test.Test

class MapParentTest {

    private val child = "child"
    private val parent = "parent"
    private val grandparent = "grandparent"


    private fun ExpectGrouping.testNonExistingChild(map: Map<String, String>) {
        group("passing non existing child") {
            group("returns an empty set") {
                val result = map.mapParents("a")
                expect(result).toBeEmpty()
            }
        }
    }

    @Test
    fun empty_map__returns_an_empty_set() {
        val result = mapOf<String, String>().mapParents("a")
        expect(result).toBeEmpty()
    }

    @Test
    fun one_child_parent_relation() {
        val map = mapOf(child to parent)
        expectGrouped {
            testNonExistingChild(map)

            group("passing child") {
                group("returns set with the parent") {
                    val result = map.mapParents(child)
                    expect(result).toContainExactly(parent)
                }
            }

            group("passing parent") {
                group("returns an empty set") {
                    val result = map.mapParents(child)
                    expect(result).toContainExactly(parent)
                }
            }
        }
    }

    @Test
    fun one_child_parent_and_one_parent_grandparent_relation() {
        val map = mapOf(child to parent, parent to grandparent)
        expectGrouped {
            testNonExistingChild(map)
            group("passing child") {
                group("returns set with the parent and grandparent") {
                    val result = map.mapParents(child)
                    expect(result).toContainExactly(parent, grandparent)
                }
            }

            group("passing parent") {
                group("returns set with the grandparent") {
                    val result = map.mapParents(parent)
                    expect(result).toContainExactly(grandparent)
                }
            }

            group("passing grandparent") {
                group("returns empty set") {
                    val result = map.mapParents(grandparent)
                    expect(result).toBeEmpty()
                }
            }
        }
    }

    @Test
    fun two_child_parent_relations_unrelated() {
        val map = mapOf(child to parent, grandparent to parent)
        expectGrouped {

            testNonExistingChild(map)

            group("passing child 1") {
                group("returns set only with related parent") {
                    val result = map.mapParents(child)
                    expect(result).toContainExactly(parent)
                }
            }

            group("passing child 2") {
                group("returns set only with related parent") {
                    val result = map.mapParents(grandparent)
                    expect(result).toContainExactly(parent)
                }
            }
        }
    }

    @Test
    fun one_child_to_child_relation__ie_cycle() {
        val map = mapOf(child to child)
        expectGrouped {

            group("nothing passed for failIfCyclic (= false)") {

                testNonExistingChild(map)

                group("passing child") {
                    group("returns an empty set") {
                        val result = map.mapParents(child)
                        expect(result).toBeEmpty()
                    }
                }
            }

            group("true passed for failIfCyclic") {

                testNonExistingChild(map)

                group("passing child") {
                    group("throws an IllegalStateException showing the cycle child -> child") {
                        expect {
                            map.mapParents(child, failIfCyclic = true)
                        }.toThrow<IllegalStateException> {
                            message { toContain("$child -> $child") }
                        }
                    }
                }
            }
        }
    }

    @Test
    fun one_child_to_parent_and_one_parent_to_child_relation__ie_cycle() {
        expectGrouped {
            val map = mapOf(child to parent, parent to child)

            group("nothing passed for failIfCyclic (= false)") {

                testNonExistingChild(map)

                group("passing child") {
                    group("returns parent") {
                        val result = map.mapParents(child)
                        expect(result).toContainExactly(parent)
                    }
                }

                group("passing parent") {
                    group("returns child") {
                        val result = map.mapParents(parent)
                        expect(result).toContainExactly(child)
                    }
                }
            }

            group("true passed for failIfCyclic") {

                testNonExistingChild(map)

                group("passing child") {
                    group("throws an IllegalStateException showing the cycle child -> parent -> child") {
                        expect {
                            map.mapParents(child, failIfCyclic = true)
                        }.toThrow<IllegalStateException> {
                            message { toContain("$child -> $parent -> $child") }
                        }
                    }
                }

                group("passing parent") {
                    group("throws an IllegalStateException showing the cycle parent -> child -> parent") {
                        expect {
                            map.mapParents(parent, failIfCyclic = true)
                        }.toThrow<IllegalStateException> {
                            message { toContain("$parent -> $child -> $parent") }
                        }
                    }
                }
            }
        }
    }

    @Test
    fun one_child_to_parent_parent_to_grandparent_and_one_grandparent_to_child_relation__ie_cycle() {
        expectGrouped {
            val map = mapOf(child to parent, parent to grandparent, grandparent to child)

            group("nothing passed for failIfCyclic (= false)") {

                testNonExistingChild(map)

                group("passing child") {
                    group("returns parent and grandparent") {
                        val result = map.mapParents(child)
                        expect(result).toContainExactly(parent, grandparent)
                    }
                }

                group("passing parent") {
                    group("returns grandparent and child") {
                        val result = map.mapParents(parent)
                        expect(result).toContainExactly(grandparent, child)
                    }
                }

                group("passing grandparent") {
                    group("returns child and parent") {
                        val result = map.mapParents(grandparent)
                        expect(result).toContainExactly(child, parent)
                    }
                }
            }

            group("true passed for failIfCyclic") {

                testNonExistingChild(map)

                group("passing child") {
                    group("throws an IllegalStateException showing the cycle child -> parent -> grandparent -> child") {
                        expect {
                            map.mapParents(child, failIfCyclic = true)
                        }.toThrow<IllegalStateException> {
                            message { toContain("$child -> $parent -> $grandparent -> $child") }
                        }
                    }
                }

                group("passing parent") {
                    group("throws an IllegalStateException showing the cycle parent -> grandparent -> child -> parent") {
                        expect {
                            map.mapParents(parent, failIfCyclic = true)
                        }.toThrow<IllegalStateException> {
                            message { toContain("$parent -> $grandparent -> $child -> $parent") }
                        }
                    }
                }

                group("passing grandparent") {
                    group("throws an IllegalStateException showing the cycle grandparent -> child -> parent -> grandparent") {
                        expect {
                            map.mapParents(grandparent, failIfCyclic = true)
                        }.toThrow<IllegalStateException> {
                            message { toContain("$grandparent -> $child -> $parent -> $grandparent") }
                        }
                    }
                }
            }
        }
    }
}
