package ch.tutteli.kbox

/**
 * An [Iterator] which provides the [peek] function in addition.
 */
class DefaultPeekingIterator<out T>(private val itr: Iterator<T>) : PeekingIterator<T> {
    @Suppress(
        "UnusedPrivateMember"
        //TODO remove once https://github.com/arturbosch/detekt/issues/1235 is fixed
    )

    private var peek: T? = null
    @JvmSynchronized
    override fun hasNext() = peek != null || itr.hasNext()

    @JvmSynchronized
    override fun next(): T {
        val peeked = peek
        return if (peeked != null) {
            peek = null
            peeked
        } else {
            itr.next()
        }
    }

    @JvmSynchronized
    override fun peek(): T {
        if (peek == null) {
            peek = itr.next()
        }
        return peek ?: throw IllegalStateException(
            "Either the given Iterator returned null or this class was accessed concurrently (it is not thread safe)."
        )
    }
}
