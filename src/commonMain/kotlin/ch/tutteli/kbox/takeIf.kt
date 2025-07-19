package ch.tutteli.kbox

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * Calls the [provider] only if the [predicate] holds, returns `null` otherwise.
 *
 * This function shall complement [kotlin.takeIf] for cases where the cost to call the provider
 * is high or the code involved to define the provider is long and a postfix `takeIf` is less readable
 * than stating it at the beginning.
 *
 * @since 1.1.0
 */
//TODO move to xIf with 4.0.0
@OptIn(ExperimentalContracts::class)
inline fun <R> takeIf(predicate: Boolean, provider: () -> R): R? {
    contract {
        callsInPlace(provider, InvocationKind.AT_MOST_ONCE)
    }
    return if (predicate) provider() else null
}
