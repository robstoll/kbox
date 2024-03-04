package ch.tutteli.kbox

/**
 * Delegates to [check] but inverting the [predicate], i.e. throws an [IllegalStateException] if predicate is true.
 *
 * @param predicate the predicate which defines if the exception should be thrown or not.
 * @param errorMessage The message which as [IllegalStateException.message]
 *
 * @since 1.1.0
 */
inline fun failIf(predicate: Boolean, errorMessage: () -> String) = check(predicate.not(), errorMessage)
