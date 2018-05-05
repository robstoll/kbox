package ch.tutteli.kbox

/**
 * Adds the given [arg] and the [otherArgs] into a new [List] and returns it.
 *
 * This function is intended for API functions which expect `x: T, vararg otherX: T` and want to pass the arguments
 * to another function which expects only one argument of `List<T>`.
 *
 * @return a [List] containing [arg] and [otherArgs].
 */
fun <T> varargToList(arg: T, otherArgs: Array<out T>): List<T> {
    val list = ArrayList<T>(otherArgs.size + 1)
    list.add(arg)
    list.addAll(otherArgs)
    return list
}

/**
 * Delegates to [varargToList] -- adds `this` and the [otherArgs] into a new [List] and returns it.
 */
@Suppress("NOTHING_TO_INLINE")
inline infix fun <T> T.glue(otherArgs: Array<out T>): List<T> = varargToList(this, otherArgs)
