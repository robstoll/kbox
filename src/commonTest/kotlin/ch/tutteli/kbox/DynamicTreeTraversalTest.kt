package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.test.Test

class DynamicTreeTraversalTest {

    @Test
    fun empty_sequence() {
        expectGrouped {
            TraversalAlgorithmOption.values().flatMap { algo ->
                listOf(false, true).flatMap { revisit ->
                    listOf(false, true).map { dropRoots ->
                        Triple(algo, revisit, dropRoots)
                    }
                }
            }.forEach { (algo, revisit, dropRoots) ->
                group("algo: $algo, revisit: $revisit, dropRoots: $dropRoots") {
                    expect(
                        emptySequence<Int>().dynamicTraversal(
                            revisit = revisit,
                            dropRoots = dropRoots,
                            traversalAlgorithm = algo,
                        ) {
                            sequenceOf(1)
                        }
                    ).asIterable().notToHaveElements()
                }
            }
        }
    }

    @Test
    fun sequenceOf_1_and_3__load_elements_returns_sequence_of_it_plus_1() {
        expectGrouped {
            listOf(
                Triple(
                    TraversalAlgorithmOption.BreadthFirst, false, true
                ) to
                    //visiting rounds:
                    // 1, 3 (drop roots, so they don't show up)
                    // 2, 4
                    // 3, 5 (3 not returned as already visited)
                    //  , 6
                    listOf(2, 4, 5, 6, 7),

                Triple(
                    TraversalAlgorithmOption.BreadthFirst, false, false
                ) to listOf(1, 3, 2, 4, 5),

                Triple(
                    TraversalAlgorithmOption.BreadthFirst, true, true
                ) to
                    //visiting rounds:
                    // 1, 3 (drop roots, so they don't show up)
                    // 2, 4
                    // 3, 5 (3 revisited)
                    // 4    (4 revisited)
                    listOf(2, 4, 3, 5, 4),

                Triple(
                    TraversalAlgorithmOption.BreadthFirst, true, false
                ) to listOf(1, 3, 2, 4, 3),

                Triple(
                    TraversalAlgorithmOption.DepthFirst, false, true
                ) to listOf(2, 3, 4, 5, 6),

                Triple(
                    TraversalAlgorithmOption.DepthFirst, false, false
                ) to listOf(1, 2, 3, 4, 5),

                Triple(
                    TraversalAlgorithmOption.DepthFirst, true, true
                ) to listOf(2, 3, 4, 5, 6),

                Triple(
                    TraversalAlgorithmOption.DepthFirst, true, false
                ) to listOf(1, 2, 3, 4, 5),
            ).forEach { (triple, expected) ->
                val (algo, revisit, dropRoots) = triple
                group("algo: $algo, revisit: $revisit, dropRoots: $dropRoots => take 5 returns ${expected.joinToString(", ")}") {
                    var saw3 = false
                    expect(
                        sequenceOf(1, 3).dynamicTraversal(
                            revisit = revisit,
                            dropRoots = dropRoots,
                            traversalAlgorithm = algo,
                        ) {
                            if (revisit.not() && it == 3) {
                                if (saw3) throw IllegalStateException("visiting 3 for the second time")
                                else saw3 = true
                            }
                            sequenceOf(it + 1)
                        }.take(5).toList()
                    ).toContainExactlyElementsOf(expected)
                }
            }
        }
    }

    @Test
    fun sequenceOf_1_and_3__initial_sequence_throws_when_loading_3() {
        expectGrouped {
            val throwingSequence = Sequence {
                object : Iterator<Int> {
                    var isFirst = true
                    override fun hasNext() = true

                    override fun next(): Int =
                        if (isFirst) {
                            isFirst = false
                            1
                        } else throw IllegalStateException("unexpected error")
                }
            }
            listOf(false, true).flatMap { revisit ->
                listOf(false, true).map { dropRoots ->
                    Triple(TraversalAlgorithmOption.BreadthFirst, revisit, dropRoots)
                }
            }.forEach { (algo, revisit, dropRoots) ->
                group("algo: $algo, revisit: $revisit, dropRoots: $dropRoots => throws as it reads it") {
                    expect {
                        throwingSequence.dynamicTraversal(
                            revisit = revisit,
                            dropRoots = dropRoots,
                            traversalAlgorithm = algo,
                        ) {
                            sequenceOf(it + 1)
                        }.take(5).toList()
                    }.toThrow<IllegalStateException> {
                        messageToContain("unexpected error")
                    }
                }
            }
            listOf(false, true).flatMap { revisit ->
                listOf(false, true).map { dropRoots ->
                    Triple(TraversalAlgorithmOption.DepthFirst, revisit, dropRoots)
                }
            }.forEach { (algo, revisit, dropRoots) ->
                group("algo: $algo, revisit: $revisit, dropRoots: $dropRoots => doesn't throw as it never reaches it") {
                    expect {
                        throwingSequence.dynamicTraversal(
                            revisit = revisit,
                            dropRoots = dropRoots,
                            traversalAlgorithm = algo,
                        ) {
                            sequenceOf(it + 1)
                        }.take(5).toList()
                    }.notToThrow().let {
                        if (dropRoots) {
                            it.toContainExactly(2, 3, 4, 5, 6)
                        } else {
                            it.toContainExactly(1, 2, 3, 4, 5)
                        }
                    }
                }
            }
        }
    }

    @Test
    fun sequenceOf_1_and_3__load_elements_returns_only_for_initial_sequence_it_plus_1_it_plus_2_then_empty_sequence() {
        expectGrouped {
            listOf(

                Triple(
                    TraversalAlgorithmOption.BreadthFirst, true, true
                ) to listOf(2 to false, 3 to false, 4 to false, 5 to false),

                Triple(
                    TraversalAlgorithmOption.BreadthFirst, true, false
                ) to listOf(1 to true, 3 to true, 2 to false, 3 to false, 4 to false),

                Triple(
                    TraversalAlgorithmOption.DepthFirst, true, true
                ) to listOf(2 to false, 3 to false, 4 to false, 5 to false),

                Triple(
                    TraversalAlgorithmOption.DepthFirst, true, false
                ) to listOf(1 to true, 2 to false, 3 to false, 3 to true, 4 to false),
            ).forEach { (triple, expected) ->
                val (algo, revisit, dropRoots) = triple
                group("algo: $algo, revisit: $revisit, dropRoots: $dropRoots => take 5 returns ${expected.joinToString(", ")}") {
                    expect(
                        sequenceOf(1 to true, 3 to true).dynamicTraversal(
                            revisit = revisit,
                            dropRoots = dropRoots,
                            traversalAlgorithm = algo
                        ) { (num, isFirst) ->
                            if (isFirst) {
                                sequenceOf(num + 1 to false, num + 2 to false)
                            } else emptySequence()
                        }.take(5).toList()
                    ).toContainExactlyElementsOf(expected)
                }
            }
        }
    }
}
