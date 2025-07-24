package ch.tutteli.kbox

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * Delegates to [let] in case the given [predicate] holds, returns `this` otherwise.
 *
 * This function shall complement [let] for cases such as invoking a builder method conditionally which without [letIf]
 * would be written as follows `if (predicate) t.let{...} else t`
 *
 * @since 3.2.0
 */
@OptIn(ExperimentalContracts::class)
inline fun <T : U, R : U, U> T.letIf(predicate: Boolean, block: (T) -> R): U {
    contract {
        callsInPlace(block, InvocationKind.AT_MOST_ONCE)
        //TODO add `predicate holds in block` once we use Kotlin 2.2.20
    }
    return if (predicate) let(block) else this
}
