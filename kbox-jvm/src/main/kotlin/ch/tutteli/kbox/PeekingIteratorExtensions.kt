package ch.tutteli.kbox

/**
 * Creates a [PeekingIterator] based on a given [itr].
 */
actual fun <T> PeekingIterator.Companion.create(itr: Iterator<T>): PeekingIterator<T> =
    DefaultPeekingIterator(itr)
