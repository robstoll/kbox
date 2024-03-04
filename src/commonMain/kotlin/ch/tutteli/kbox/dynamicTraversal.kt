package ch.tutteli.kbox

import ch.tutteli.kbox.impl.DynamicDepthFirstTraversalSequence
import ch.tutteli.kbox.impl.DynamicBreadthFirstTraversalSequence
import kotlin.experimental.ExperimentalTypeInference
import kotlin.jvm.JvmName

/**
 * Returns a single sequence containing all elements [loadElements] recursively provides for the elements of the
 * original sequence as well as the elements itself if [dropRoots] = false is specified.
 * The operation is intermediate and stateless.
 *
 * For instance, in case of a tree structure, [loadElements] loads the children, in case of a graph the connected nodes.
 * The order in which the elements are returned depends on the chosen [traversalAlgorithm] as well as [dropRoots].
 * (consult the documentation of the options to get more information).
 *
 * @param T the type of the elements in the sequence.
 *
 * @param revisit If set to true (default false), we no longer track visited elements and will re-[loadElements] in
 *   case of a revisit, potentially turning this into an infinite loop.
 *   Use this option only if you know that there aren't any cycles or in case the [loadElements] function is not
 *   referentially transparent, i.e. outcome might depend on other factors not only on input.
 * @param dropRoots if set to false (default true) the resulting sequence also includes the elements of the original
 *   sequence.
 * @param traversalAlgorithm the algorithm which should be used for traversal
 *   (default [TraversalAlgorithmOption.BreadthFirst]).
 * @param loadElements the function returning the children of a given element in case of a tree / the connected nodes
 *   in case of a graph.
 *
 * @since 1.0.0
 */
@OptIn(ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
fun <T> Sequence<T>.dynamicTraversal(
    revisit: Boolean = false,
    dropRoots: Boolean = true,
    traversalAlgorithm: TraversalAlgorithmOption = TraversalAlgorithmOption.BreadthFirst,
    loadElements: (element: T) -> Sequence<T>,
): Sequence<T> = when (traversalAlgorithm) {
    TraversalAlgorithmOption.BreadthFirst -> DynamicBreadthFirstTraversalSequence(
        this,
        loadElements,
        Sequence<T>::iterator,
        revisit = revisit,
        dropRoots = dropRoots
    )

    TraversalAlgorithmOption.DepthFirst -> DynamicDepthFirstTraversalSequence(
        this,
        loadElements,
        Sequence<T>::iterator,
        revisit = revisit,
        dropRoots = dropRoots
    )
}

/**
 * Returns a single sequence containing all elements [loadElements] recursively provides for the elements of the
 * original sequence as well as the elements as such if [dropRoots] = false is specified.
 * The operation is intermediate and stateless.
 *
 * For instance, in case of a tree structure, [loadElements] loads the children, in case of a graph the connected nodes.
 * The order in which the elements are returned depends on the chosen [traversalAlgorithm] as well as [dropRoots].
 * (consult the documentation of the options to get more information).
 *
 * @param T the type of the elements in the sequence.
 *
 * @param revisit If set to true (default false), we no longer track visited elements and will re-[loadElements] in
 *   case of a revisit, potentially turning this into an infinite loop.
 *   Use this option only if you know that there aren't any cycles or in case the [loadElements] function is not
 *   referentially transparent, i.e. outcome might depend on other factors not only on input.
 * @param dropRoots if set to false (default true) the resulting sequence also includes the elements of the original
 *   sequence.
 * @param traversalAlgorithm the algorithm which should be used for traversal
 *   (default [TraversalAlgorithmOption.BreadthFirst]).
 * @param loadElements the function returning the children of a given element in case of a tree / the connected nodes
 *   in case of a graph.
 *
 * @since 1.0.0
 */
@OptIn(ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
@JvmName("dynamicTraversalIterable")
fun <T> Sequence<T>.dynamicTraversal(
    revisit: Boolean = false,
    dropRoots: Boolean = true,
    traversalAlgorithm: TraversalAlgorithmOption = TraversalAlgorithmOption.BreadthFirst,
    loadElements: (element: T) -> Iterable<T>,
): Sequence<T> = when (traversalAlgorithm) {
    TraversalAlgorithmOption.BreadthFirst -> DynamicBreadthFirstTraversalSequence(
        this,
        loadElements,
        Iterable<T>::iterator,
        revisit = revisit,
        dropRoots = dropRoots
    )

    TraversalAlgorithmOption.DepthFirst -> DynamicBreadthFirstTraversalSequence(
        this,
        loadElements,
        Iterable<T>::iterator,
        revisit = revisit,
        dropRoots = dropRoots
    )
}

/**
 * Represents the option to which traversal algorithm shall be applied.
 *
 * @since 1.0.0
 */
enum class TraversalAlgorithmOption {
    /** Taking the tree as example, the resulting sequence contains the result in a breath first manner,
     * i.e. if `dropRoots = false` then the elements of the original sequence are returned first (if `dropRoots] = true`
     * then they are skipped/dropped), then the children of those elements, then the children of the children and so on.
     *
     * @since 1.0.0
     */
    BreadthFirst,

    /**
     * Taking the tree as example, the resulting sequence contains the result in a depth first manner,
     * i.e. if `dropRoots = false` then the first element of the original sequence is returned first
     * (if `dropRoots] = true` then this element is skipped/dropped). Next the first child of this first element is
     * returned, then the first child of the first child etc.
     * Once there is no first child (i.e. we reached a leaf of the tree) the sibling of this child is visited, and again
     * the first child of this sibling etc.
     *
     * @since 1.0.0
     */
    DepthFirst
}
