package ch.tutteli.kbox

actual class PeekingIterator<out T>
actual constructor(itr: Iterator<T>) : Iterator<T> {
    private val itr = PeekingIteratorUnsynchronized(itr)

    override fun hasNext() = itr.hasNext()
    override fun next() = itr.next()
    actual fun peek() = itr.peek()
}
