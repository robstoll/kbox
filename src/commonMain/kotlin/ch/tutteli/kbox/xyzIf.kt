package ch.tutteli.kbox

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * Delegates to [let] in case the given [predicate] holds, returns `this` otherwise.
 *
 * This function shall complement [let] for cases such as invoking a builder method conditionally which without [letIf]
 * would be written as follows `if (predicate) t.let { ... } else t`
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

/**
 * Delegates to [run] in case the given [predicate] holds, returns `this` otherwise.
 *
 * This function shall complement [run] for cases such as invoking a builder method conditionally which without [runIf]
 * would be written as follows `if (predicate) t.run { ... } else t`
 *
 * @since 3.2.0
 */
@OptIn(ExperimentalContracts::class)
inline fun <T : U, R : U, U> T.runIf(predicate: Boolean, block: T.() -> R): U {
    contract {
        callsInPlace(block, InvocationKind.AT_MOST_ONCE)
        //TODO add `predicate holds in block` once we use Kotlin 2.2.20
    }
    return if (predicate) run(block) else this
}

/**
 * Delegates to [also] in case the given [predicate] holds, returns `this` otherwise.
 *
 * This function shall complement [also] and make simple conditional based side effects more readable.
 *
 * @since 3.2.0
 */
@OptIn(ExperimentalContracts::class)
inline fun <T> T.alsoIf(predicate: Boolean, block: (T) -> Unit): T {
    contract {
        callsInPlace(block, InvocationKind.AT_MOST_ONCE)
        //TODO add `predicate holds in block` once we use Kotlin 2.2.20
    }
    return if (predicate) also(block) else this
}

/**
 * Delegates to [apply] in case the given [predicate] holds, returns `this` otherwise.
 *
 * This function shall complement [apply] and make simple conditional based side effects more readable.
 *
 * @since 3.2.0
 */
@OptIn(ExperimentalContracts::class)
inline fun <T> T.applyIf(predicate: Boolean, block: T.() -> Unit): T {
    contract {
        callsInPlace(block, InvocationKind.AT_MOST_ONCE)
        //TODO add `predicate holds in block` once we use Kotlin 2.2.20
    }
    return if (predicate) apply(block) else this
}

/**
 * Returns `null` if the [predicate] holds, calls the [provider] otherwise.
 *
 * This function shall complement [kotlin.takeUnless] for cases where the cost to call the provider
 * is high or the code involved to define the provider is long and a postfix `takeUnless` is less readable
 * than stating it at the beginning.
 *
 * @since 3.2.0
 */
//TODO move to xIf with 4.0.0
@OptIn(ExperimentalContracts::class)
inline fun <R> takeUnless(predicate: Boolean, provider: () -> R): R? {
    contract {
        callsInPlace(provider, InvocationKind.AT_MOST_ONCE)
        //TODO add `predicate holds in block` once we use Kotlin 2.2.20
    }
    return if (predicate.not()) provider() else null
}

