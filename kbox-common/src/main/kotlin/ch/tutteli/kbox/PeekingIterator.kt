package ch.tutteli.kbox

/**
 * An [Iterator] which provides the [peek] function in addition.
 */
interface PeekingIterator<out T> : Iterator<T> {
    /**
     * Returns the [next] element without consuming it.
     * @return the [next] element without consuming it
     * @throws NoSuchElementException in case there is no next element.
     */
    fun peek(): T

    /**
     * Necessary so that extension methods can extend it.
     */
    companion object
}

@Suppress(
    "UnusedPrivateMember"
    //TODO remove once https://github.com/arturbosch/detekt/issues/1235 is fixed
)
/**
 * Platform independent method which creates a [PeekingIterator] based on a given [itr].
 */
expect fun <T> PeekingIterator.Companion.create(itr: Iterator<T>): PeekingIterator<T>

/**
 * Wraps this [Iterator] into a [PeekingIterator] and returns it.
 * @return The newly created [PeekingIterator].
 */
fun <T> Iterator<T>.toPeekingIterator() = PeekingIterator.create(this)
