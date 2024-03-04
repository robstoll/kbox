package ch.tutteli.kbox.impl


internal class DynamicBreadthFirstTraversalSequence<T, IterableLikeT>(
    private val initialSequence: Sequence<T>,
    private val loadElements: (T) -> IterableLikeT,
    private val iteratorProvider: (IterableLikeT) -> Iterator<T>,
    private val revisit: Boolean,
    private val dropRoots: Boolean,
) : Sequence<T> {
    override fun iterator(): Iterator<T> = object : DynamicTreeTraversalLikeIterator<T, IterableLikeT>(
        initialSequence,
        loadElements,
        iteratorProvider,
        revisit = revisit,
        dropRoots = dropRoots
    ) {
        override fun insertIterator(loadedChildrenIterator: Iterator<T>) {
            iteratorsToVisit.add(loadedChildrenIterator)
        }
    }
}

internal class DynamicDepthFirstTraversalSequence<T, IterableLikeT>(
    private val initialSequence: Sequence<T>,
    private val loadChildren: (T) -> IterableLikeT,
    private val iteratorProvider: (IterableLikeT) -> Iterator<T>,
    private val revisit: Boolean,
    private val dropRoots: Boolean,
) : Sequence<T> {
    override fun iterator(): Iterator<T> = object : DynamicTreeTraversalLikeIterator<T, IterableLikeT>(
        initialSequence,
        loadChildren,
        iteratorProvider,
        revisit = revisit,
        dropRoots = dropRoots
    ) {
        override fun insertIterator(loadedChildrenIterator: Iterator<T>) =
            // put on the stack so that we visit the children next (and not the siblings)
            iteratorsToVisit.add(0, loadedChildrenIterator)
    }
}

internal abstract class DynamicTreeTraversalLikeIterator<T, IterableLikeT>(
    initialSequence: Sequence<T>,
    protected val loadElements: (T) -> IterableLikeT,
    private val iteratorProvider: (IterableLikeT) -> Iterator<T>,
    private val revisit: Boolean,
    private val dropRoots: Boolean
) : Iterator<T> {
    private val visitedElements = HashSet<T>()
    private val initialIterator = initialSequence.iterator()
    protected val iteratorsToVisit = mutableListOf(initialIterator)
    private var peek: Option<T> = None

    override fun hasNext(): Boolean = hasVisitableIterator()

    override fun next(): T {
        if (hasVisitableIterator().not()) throw NoSuchElementException()
        return when (val p = peek) {
            is None -> throw IllegalStateException(
                "we just checked hasNext and now we don't have next element, concurrent access? " +
                        "This Iterator is not thread-safe"
            )

            is Some -> {
                peek = None
                p.value
            }
        }
    }

    @Suppress(
        // remove once Kotlin supports to inline functions + tailrec, then we could move something to another method
        "NestedBlockDepth",
        "CognitiveComplexMethod"
    )
    private tailrec fun hasVisitableIterator(): Boolean = when {
        peek is Some -> true
        iteratorsToVisit.isEmpty() -> false
        else -> {
            val firstIterator = iteratorsToVisit[0]
            if (firstIterator.hasNext()) {
                val element = firstIterator.next()
                if (revisit || element !in visitedElements) {
                    peek = Some(element)
                    if (revisit.not()) {
                        visitedElements.add(element)
                    }
                    loadElements(element)
                        .let(iteratorProvider)
                        .also(this::insertIterator)

                    if (dropRoots && firstIterator == initialIterator) {
                        peek = None
                        hasVisitableIterator()
                    } else {
                        true
                    }
                } else {
                    peek = None
                    hasVisitableIterator()
                }
            } else {
                // pop the stack, visited all connected nodes
                iteratorsToVisit.removeAt(0)
                hasVisitableIterator()
            }
        }
    }

    protected abstract fun insertIterator(loadedChildrenIterator: Iterator<T>)
}

internal sealed class Option<out T>
internal object None : Option<Nothing>()
internal class Some<T>(val value: T) : Option<T>()
