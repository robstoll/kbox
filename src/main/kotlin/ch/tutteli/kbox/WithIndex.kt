package ch.tutteli.kbox

/**
 * A named pair with [index] and [value].
 */
data class WithIndex<out T>(val index: Int, val value: T)
