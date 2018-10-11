package ch.tutteli.kbox

/**
 * An [Iterator] which provides the [peek] function in addition.
 */
class DefaultPeekingIterator<out T>(itr: Iterator<T>) : PeekingIterator<T> {
    @Suppress(
        "UnusedPrivateMember"
        //TODO remove once https://github.com/arturbosch/detekt/issues/1235 is fixed
    )
    private val itr = UnsynchronizedPeekingIterator(itr)

    @Synchronized
    override fun hasNext() = itr.hasNext()

    @Synchronized
    override fun next() = itr.next()

    @Synchronized
    override fun peek() = itr.peek()
}
