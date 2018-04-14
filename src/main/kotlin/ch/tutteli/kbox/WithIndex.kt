package ch.tutteli.kbox

/**
 * A named pair with [index] and [value].
 */
@Suppress("MemberVisibilityCanBePrivate")
data class WithIndex<out T>(val index: Int, val value: T)
