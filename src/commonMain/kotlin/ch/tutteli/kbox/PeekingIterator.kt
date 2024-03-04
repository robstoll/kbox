package ch.tutteli.kbox

import ch.tutteli.kbox.impl.DefaultPeekingIterator

/**
 * An [Iterator] which provides the [peek] function in addition.
 */
interface PeekingIterator<out T : Any> : Iterator<T> {
    /**
     * Returns the [next] element without consuming it.
     * @return the [next] element without consuming it
     * @throws NoSuchElementException in case there is no next element.
     */
    fun peek(): T

    /**
     * Necessary so that extension methods can extend it.
     */
    companion object {
        /**
         * Platform independent method which creates a [PeekingIterator] based on a given [itr].
         */
        operator fun <T : Any> invoke(itr: Iterator<T>): PeekingIterator<T> = DefaultPeekingIterator(itr)
    }
}

/**
 * Wraps this [Iterator] into a [PeekingIterator] and returns it.
 * @return The newly created [PeekingIterator].
 */
fun <T : Any> Iterator<T>.toPeekingIterator() = PeekingIterator(this)
