package ch.tutteli.kbox

/**
 * Calls the [provider] only if the [predicate] holds, returns `null` otherwise.
 *
 * This function shall complement `takeIf` from the stdlib of Kotlin for cases where the cost to call the provider
 * is high or the code involved to define the provider is long and a postfix `takeIf` is less readable
 * than stating it at the beginning.
 *
 * @since 1.0.0
 */
inline fun <R> takeIf(predicate: Boolean, provider: () -> R): R? = if (predicate) provider() else null
