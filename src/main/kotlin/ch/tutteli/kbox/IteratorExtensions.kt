package ch.tutteli.kbox

fun <T> Iterator<T>.toPeekingIterator() = PeekingIterator(this)

