package ch.tutteli.kbox

/**
 * An unsynchronized version of [PeekingIterator], meaning it is not thread-safe.
 */
class UnsynchronizedPeekingIterator<out T>(private val itr: Iterator<T>) : PeekingIterator<T> {
    private var peek: T? = null

    override fun hasNext() = peek != null || itr.hasNext()

    override fun next(): T {
        val peeked = peek
        return if (peeked != null) {
            peek = null
            peeked
        } else {
            itr.next()
        }
    }

    override fun peek(): T {
        if (peek == null) {
            peek = itr.next()
        }
        return peek ?: throw IllegalStateException(
            "Either the given Iterator returned null or this class was accessed concurrently (it is not thread safe)."
        )
    }
}
