package ch.tutteli.kbox

class PeekingIterator<out T>(private val itr: Iterator<T>) : Iterator<T> {
    private var peek: T? = null

    @Synchronized
    override fun hasNext() = peek != null || itr.hasNext()

    @Synchronized
    override fun next(): T {
        val peeked = peek
        return if (peeked != null) {
            peek = null
            peeked
        } else {
            itr.next()
        }
    }

    @Synchronized
    fun peek(): T {
        if (peek == null) {
            peek = itr.next()
        }
        return peek!!
    }

}
