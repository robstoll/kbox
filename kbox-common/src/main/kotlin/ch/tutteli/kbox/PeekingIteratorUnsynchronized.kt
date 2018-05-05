package ch.tutteli.kbox

class PeekingIteratorUnsynchronized<out T>(private val itr: Iterator<T>) : Iterator<T> {
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

    fun peek(): T {
        if (peek == null) {
            peek = itr.next()
        }
        return peek!!
    }
}
