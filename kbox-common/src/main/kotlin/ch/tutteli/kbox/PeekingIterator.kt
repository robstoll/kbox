package ch.tutteli.kbox

expect class PeekingIterator<out T>(itr: Iterator<T>) : Iterator<T> {
    fun peek(): T
}

fun <T> Iterator<T>.toPeekingIterator() = PeekingIterator(this)
