// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
@file:Suppress("MethodOverloading", "FunctionName")
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

/**
 * Adds the given [arg] and the [otherArgs] into a new [List] and returns it.
 *
 * This function is intended for API functions which expect `x: Boolean, vararg otherX: Boolean` and want to pass
 * the arguments to another function which expects only one argument of `List<Boolean>`.
 *
 * @return a [List] containing [arg] and [otherArgs].
 *
 * @since 3.1.0
 */
fun varargToList(arg: Boolean, otherArgs: BooleanArray): List<Boolean> {
    val list = ArrayList<Boolean>(otherArgs.size + 1)
    list.add(arg)
    list.addAll(otherArgs.asList())
    return list
}

/**
 * Delegates to [varargToList] -- adds `this` and the [otherArgs] into a new [List] and returns it.
 *
 * @since 3.1.0
 */
@Suppress("NOTHING_TO_INLINE")
inline infix fun Boolean.glue(otherArgs: BooleanArray): List<Boolean> = varargToList(this, otherArgs)

/**
 * Adds the given [arg] and the [otherArgs] into a new [List] and returns it.
 *
 * This function is intended for API functions which expect `x: Byte, vararg otherX: Byte` and want to pass
 * the arguments to another function which expects only one argument of `List<Byte>`.
 *
 * @return a [List] containing [arg] and [otherArgs].
 *
 * @since 3.1.0
 */
fun varargToList(arg: Byte, otherArgs: ByteArray): List<Byte> {
    val list = ArrayList<Byte>(otherArgs.size + 1)
    list.add(arg)
    list.addAll(otherArgs.asList())
    return list
}

/**
 * Delegates to [varargToList] -- adds `this` and the [otherArgs] into a new [List] and returns it.
 *
 * @since 3.1.0
 */
@Suppress("NOTHING_TO_INLINE")
inline infix fun Byte.glue(otherArgs: ByteArray): List<Byte> = varargToList(this, otherArgs)

/**
 * Adds the given [arg] and the [otherArgs] into a new [List] and returns it.
 *
 * This function is intended for API functions which expect `x: Char, vararg otherX: Char` and want to pass
 * the arguments to another function which expects only one argument of `List<Char>`.
 *
 * @return a [List] containing [arg] and [otherArgs].
 *
 * @since 3.1.0
 */
fun varargToList(arg: Char, otherArgs: CharArray): List<Char> {
    val list = ArrayList<Char>(otherArgs.size + 1)
    list.add(arg)
    list.addAll(otherArgs.asList())
    return list
}

/**
 * Delegates to [varargToList] -- adds `this` and the [otherArgs] into a new [List] and returns it.
 *
 * @since 3.1.0
 */
@Suppress("NOTHING_TO_INLINE")
inline infix fun Char.glue(otherArgs: CharArray): List<Char> = varargToList(this, otherArgs)

/**
 * Adds the given [arg] and the [otherArgs] into a new [List] and returns it.
 *
 * This function is intended for API functions which expect `x: Short, vararg otherX: Short` and want to pass
 * the arguments to another function which expects only one argument of `List<Short>`.
 *
 * @return a [List] containing [arg] and [otherArgs].
 *
 * @since 3.1.0
 */
fun varargToList(arg: Short, otherArgs: ShortArray): List<Short> {
    val list = ArrayList<Short>(otherArgs.size + 1)
    list.add(arg)
    list.addAll(otherArgs.asList())
    return list
}

/**
 * Delegates to [varargToList] -- adds `this` and the [otherArgs] into a new [List] and returns it.
 *
 * @since 3.1.0
 */
@Suppress("NOTHING_TO_INLINE")
inline infix fun Short.glue(otherArgs: ShortArray): List<Short> = varargToList(this, otherArgs)

/**
 * Adds the given [arg] and the [otherArgs] into a new [List] and returns it.
 *
 * This function is intended for API functions which expect `x: Int, vararg otherX: Int` and want to pass
 * the arguments to another function which expects only one argument of `List<Int>`.
 *
 * @return a [List] containing [arg] and [otherArgs].
 *
 * @since 3.1.0
 */
fun varargToList(arg: Int, otherArgs: IntArray): List<Int> {
    val list = ArrayList<Int>(otherArgs.size + 1)
    list.add(arg)
    list.addAll(otherArgs.asList())
    return list
}

/**
 * Delegates to [varargToList] -- adds `this` and the [otherArgs] into a new [List] and returns it.
 *
 * @since 3.1.0
 */
@Suppress("NOTHING_TO_INLINE")
inline infix fun Int.glue(otherArgs: IntArray): List<Int> = varargToList(this, otherArgs)

/**
 * Adds the given [arg] and the [otherArgs] into a new [List] and returns it.
 *
 * This function is intended for API functions which expect `x: Long, vararg otherX: Long` and want to pass
 * the arguments to another function which expects only one argument of `List<Long>`.
 *
 * @return a [List] containing [arg] and [otherArgs].
 *
 * @since 3.1.0
 */
fun varargToList(arg: Long, otherArgs: LongArray): List<Long> {
    val list = ArrayList<Long>(otherArgs.size + 1)
    list.add(arg)
    list.addAll(otherArgs.asList())
    return list
}

/**
 * Delegates to [varargToList] -- adds `this` and the [otherArgs] into a new [List] and returns it.
 *
 * @since 3.1.0
 */
@Suppress("NOTHING_TO_INLINE")
inline infix fun Long.glue(otherArgs: LongArray): List<Long> = varargToList(this, otherArgs)

/**
 * Adds the given [arg] and the [otherArgs] into a new [List] and returns it.
 *
 * This function is intended for API functions which expect `x: Float, vararg otherX: Float` and want to pass
 * the arguments to another function which expects only one argument of `List<Float>`.
 *
 * @return a [List] containing [arg] and [otherArgs].
 *
 * @since 3.1.0
 */
fun varargToList(arg: Float, otherArgs: FloatArray): List<Float> {
    val list = ArrayList<Float>(otherArgs.size + 1)
    list.add(arg)
    list.addAll(otherArgs.asList())
    return list
}

/**
 * Delegates to [varargToList] -- adds `this` and the [otherArgs] into a new [List] and returns it.
 *
 * @since 3.1.0
 */
@Suppress("NOTHING_TO_INLINE")
inline infix fun Float.glue(otherArgs: FloatArray): List<Float> = varargToList(this, otherArgs)

/**
 * Adds the given [arg] and the [otherArgs] into a new [List] and returns it.
 *
 * This function is intended for API functions which expect `x: Double, vararg otherX: Double` and want to pass
 * the arguments to another function which expects only one argument of `List<Double>`.
 *
 * @return a [List] containing [arg] and [otherArgs].
 *
 * @since 3.1.0
 */
fun varargToList(arg: Double, otherArgs: DoubleArray): List<Double> {
    val list = ArrayList<Double>(otherArgs.size + 1)
    list.add(arg)
    list.addAll(otherArgs.asList())
    return list
}

/**
 * Delegates to [varargToList] -- adds `this` and the [otherArgs] into a new [List] and returns it.
 *
 * @since 3.1.0
 */
@Suppress("NOTHING_TO_INLINE")
inline infix fun Double.glue(otherArgs: DoubleArray): List<Double> = varargToList(this, otherArgs)

