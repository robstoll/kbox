// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
@file:Suppress("MethodOverloading")
@file:OptIn(ExperimentalTypeInference::class)
package ch.tutteli.kbox

import kotlin.experimental.ExperimentalTypeInference

import kotlin.jvm.JvmName

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
 *
 * This function is intended for API functions which expect `x: T, vararg otherX: T` and want to pass
 * the arguments to another function expecting `x: R, vararg otherX: R`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
inline fun <T, reified R> mapVararg(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (T) -> R
): Pair<R, Array<out R>> = mapper(arg) to otherArgs.map(mapper).toTypedArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Boolean].
 *
 * This function is intended for API functions which expect `x: T, vararg otherX: T` and
 * want to pass the arguments to another function expecting `x: Boolean, vararg otherX: Boolean`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapVarargToBoolean")
inline fun <T> mapVararg(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (T) -> Boolean
): Pair<Boolean, BooleanArray> = mapper(arg) to otherArgs.map(mapper).toBooleanArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
 *
 * This function is intended for API functions which expect `x: Boolean, vararg otherX: Boolean` and
 * want to pass the arguments to another function expecting `x: R, vararg otherX: R`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapBooleanVararg")
inline fun <reified R> mapVararg(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Boolean) -> R
): Pair<R, Array<out R>> = mapper(arg) to otherArgs.map(mapper).toTypedArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Boolean].
 *
 * This function is intended for API functions which expect `x: Boolean, vararg otherX: Boolean` and
 * want to pass the arguments to another function expecting `x: Boolean, vararg otherX: Boolean`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapBooleanVarargToBoolean")
inline fun mapVararg(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Boolean) -> Boolean
): Pair<Boolean, BooleanArray> = mapper(arg) to otherArgs.map(mapper).toBooleanArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Byte].
 *
 * This function is intended for API functions which expect `x: Boolean, vararg otherX: Boolean` and
 * want to pass the arguments to another function expecting `x: Byte, vararg otherX: Byte`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapBooleanVarargToByte")
inline fun mapVararg(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Boolean) -> Byte
): Pair<Byte, ByteArray> = mapper(arg) to otherArgs.map(mapper).toByteArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Char].
 *
 * This function is intended for API functions which expect `x: Boolean, vararg otherX: Boolean` and
 * want to pass the arguments to another function expecting `x: Char, vararg otherX: Char`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapBooleanVarargToChar")
inline fun mapVararg(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Boolean) -> Char
): Pair<Char, CharArray> = mapper(arg) to otherArgs.map(mapper).toCharArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Short].
 *
 * This function is intended for API functions which expect `x: Boolean, vararg otherX: Boolean` and
 * want to pass the arguments to another function expecting `x: Short, vararg otherX: Short`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapBooleanVarargToShort")
inline fun mapVararg(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Boolean) -> Short
): Pair<Short, ShortArray> = mapper(arg) to otherArgs.map(mapper).toShortArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Int].
 *
 * This function is intended for API functions which expect `x: Boolean, vararg otherX: Boolean` and
 * want to pass the arguments to another function expecting `x: Int, vararg otherX: Int`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapBooleanVarargToInt")
inline fun mapVararg(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Boolean) -> Int
): Pair<Int, IntArray> = mapper(arg) to otherArgs.map(mapper).toIntArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Long].
 *
 * This function is intended for API functions which expect `x: Boolean, vararg otherX: Boolean` and
 * want to pass the arguments to another function expecting `x: Long, vararg otherX: Long`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapBooleanVarargToLong")
inline fun mapVararg(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Boolean) -> Long
): Pair<Long, LongArray> = mapper(arg) to otherArgs.map(mapper).toLongArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Float].
 *
 * This function is intended for API functions which expect `x: Boolean, vararg otherX: Boolean` and
 * want to pass the arguments to another function expecting `x: Float, vararg otherX: Float`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapBooleanVarargToFloat")
inline fun mapVararg(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Boolean) -> Float
): Pair<Float, FloatArray> = mapper(arg) to otherArgs.map(mapper).toFloatArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Double].
 *
 * This function is intended for API functions which expect `x: Boolean, vararg otherX: Boolean` and
 * want to pass the arguments to another function expecting `x: Double, vararg otherX: Double`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapBooleanVarargToDouble")
inline fun mapVararg(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Boolean) -> Double
): Pair<Double, DoubleArray> = mapper(arg) to otherArgs.map(mapper).toDoubleArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Byte].
 *
 * This function is intended for API functions which expect `x: T, vararg otherX: T` and
 * want to pass the arguments to another function expecting `x: Byte, vararg otherX: Byte`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapVarargToByte")
inline fun <T> mapVararg(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (T) -> Byte
): Pair<Byte, ByteArray> = mapper(arg) to otherArgs.map(mapper).toByteArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
 *
 * This function is intended for API functions which expect `x: Byte, vararg otherX: Byte` and
 * want to pass the arguments to another function expecting `x: R, vararg otherX: R`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapByteVararg")
inline fun <reified R> mapVararg(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Byte) -> R
): Pair<R, Array<out R>> = mapper(arg) to otherArgs.map(mapper).toTypedArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Boolean].
 *
 * This function is intended for API functions which expect `x: Byte, vararg otherX: Byte` and
 * want to pass the arguments to another function expecting `x: Boolean, vararg otherX: Boolean`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapByteVarargToBoolean")
inline fun mapVararg(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Byte) -> Boolean
): Pair<Boolean, BooleanArray> = mapper(arg) to otherArgs.map(mapper).toBooleanArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Byte].
 *
 * This function is intended for API functions which expect `x: Byte, vararg otherX: Byte` and
 * want to pass the arguments to another function expecting `x: Byte, vararg otherX: Byte`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapByteVarargToByte")
inline fun mapVararg(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Byte) -> Byte
): Pair<Byte, ByteArray> = mapper(arg) to otherArgs.map(mapper).toByteArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Char].
 *
 * This function is intended for API functions which expect `x: Byte, vararg otherX: Byte` and
 * want to pass the arguments to another function expecting `x: Char, vararg otherX: Char`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapByteVarargToChar")
inline fun mapVararg(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Byte) -> Char
): Pair<Char, CharArray> = mapper(arg) to otherArgs.map(mapper).toCharArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Short].
 *
 * This function is intended for API functions which expect `x: Byte, vararg otherX: Byte` and
 * want to pass the arguments to another function expecting `x: Short, vararg otherX: Short`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapByteVarargToShort")
inline fun mapVararg(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Byte) -> Short
): Pair<Short, ShortArray> = mapper(arg) to otherArgs.map(mapper).toShortArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Int].
 *
 * This function is intended for API functions which expect `x: Byte, vararg otherX: Byte` and
 * want to pass the arguments to another function expecting `x: Int, vararg otherX: Int`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapByteVarargToInt")
inline fun mapVararg(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Byte) -> Int
): Pair<Int, IntArray> = mapper(arg) to otherArgs.map(mapper).toIntArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Long].
 *
 * This function is intended for API functions which expect `x: Byte, vararg otherX: Byte` and
 * want to pass the arguments to another function expecting `x: Long, vararg otherX: Long`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapByteVarargToLong")
inline fun mapVararg(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Byte) -> Long
): Pair<Long, LongArray> = mapper(arg) to otherArgs.map(mapper).toLongArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Float].
 *
 * This function is intended for API functions which expect `x: Byte, vararg otherX: Byte` and
 * want to pass the arguments to another function expecting `x: Float, vararg otherX: Float`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapByteVarargToFloat")
inline fun mapVararg(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Byte) -> Float
): Pair<Float, FloatArray> = mapper(arg) to otherArgs.map(mapper).toFloatArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Double].
 *
 * This function is intended for API functions which expect `x: Byte, vararg otherX: Byte` and
 * want to pass the arguments to another function expecting `x: Double, vararg otherX: Double`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapByteVarargToDouble")
inline fun mapVararg(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Byte) -> Double
): Pair<Double, DoubleArray> = mapper(arg) to otherArgs.map(mapper).toDoubleArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Char].
 *
 * This function is intended for API functions which expect `x: T, vararg otherX: T` and
 * want to pass the arguments to another function expecting `x: Char, vararg otherX: Char`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapVarargToChar")
inline fun <T> mapVararg(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (T) -> Char
): Pair<Char, CharArray> = mapper(arg) to otherArgs.map(mapper).toCharArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
 *
 * This function is intended for API functions which expect `x: Char, vararg otherX: Char` and
 * want to pass the arguments to another function expecting `x: R, vararg otherX: R`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapCharVararg")
inline fun <reified R> mapVararg(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Char) -> R
): Pair<R, Array<out R>> = mapper(arg) to otherArgs.map(mapper).toTypedArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Boolean].
 *
 * This function is intended for API functions which expect `x: Char, vararg otherX: Char` and
 * want to pass the arguments to another function expecting `x: Boolean, vararg otherX: Boolean`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapCharVarargToBoolean")
inline fun mapVararg(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Char) -> Boolean
): Pair<Boolean, BooleanArray> = mapper(arg) to otherArgs.map(mapper).toBooleanArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Byte].
 *
 * This function is intended for API functions which expect `x: Char, vararg otherX: Char` and
 * want to pass the arguments to another function expecting `x: Byte, vararg otherX: Byte`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapCharVarargToByte")
inline fun mapVararg(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Char) -> Byte
): Pair<Byte, ByteArray> = mapper(arg) to otherArgs.map(mapper).toByteArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Char].
 *
 * This function is intended for API functions which expect `x: Char, vararg otherX: Char` and
 * want to pass the arguments to another function expecting `x: Char, vararg otherX: Char`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapCharVarargToChar")
inline fun mapVararg(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Char) -> Char
): Pair<Char, CharArray> = mapper(arg) to otherArgs.map(mapper).toCharArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Short].
 *
 * This function is intended for API functions which expect `x: Char, vararg otherX: Char` and
 * want to pass the arguments to another function expecting `x: Short, vararg otherX: Short`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapCharVarargToShort")
inline fun mapVararg(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Char) -> Short
): Pair<Short, ShortArray> = mapper(arg) to otherArgs.map(mapper).toShortArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Int].
 *
 * This function is intended for API functions which expect `x: Char, vararg otherX: Char` and
 * want to pass the arguments to another function expecting `x: Int, vararg otherX: Int`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapCharVarargToInt")
inline fun mapVararg(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Char) -> Int
): Pair<Int, IntArray> = mapper(arg) to otherArgs.map(mapper).toIntArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Long].
 *
 * This function is intended for API functions which expect `x: Char, vararg otherX: Char` and
 * want to pass the arguments to another function expecting `x: Long, vararg otherX: Long`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapCharVarargToLong")
inline fun mapVararg(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Char) -> Long
): Pair<Long, LongArray> = mapper(arg) to otherArgs.map(mapper).toLongArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Float].
 *
 * This function is intended for API functions which expect `x: Char, vararg otherX: Char` and
 * want to pass the arguments to another function expecting `x: Float, vararg otherX: Float`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapCharVarargToFloat")
inline fun mapVararg(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Char) -> Float
): Pair<Float, FloatArray> = mapper(arg) to otherArgs.map(mapper).toFloatArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Double].
 *
 * This function is intended for API functions which expect `x: Char, vararg otherX: Char` and
 * want to pass the arguments to another function expecting `x: Double, vararg otherX: Double`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapCharVarargToDouble")
inline fun mapVararg(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Char) -> Double
): Pair<Double, DoubleArray> = mapper(arg) to otherArgs.map(mapper).toDoubleArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Short].
 *
 * This function is intended for API functions which expect `x: T, vararg otherX: T` and
 * want to pass the arguments to another function expecting `x: Short, vararg otherX: Short`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapVarargToShort")
inline fun <T> mapVararg(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (T) -> Short
): Pair<Short, ShortArray> = mapper(arg) to otherArgs.map(mapper).toShortArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
 *
 * This function is intended for API functions which expect `x: Short, vararg otherX: Short` and
 * want to pass the arguments to another function expecting `x: R, vararg otherX: R`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapShortVararg")
inline fun <reified R> mapVararg(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Short) -> R
): Pair<R, Array<out R>> = mapper(arg) to otherArgs.map(mapper).toTypedArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Boolean].
 *
 * This function is intended for API functions which expect `x: Short, vararg otherX: Short` and
 * want to pass the arguments to another function expecting `x: Boolean, vararg otherX: Boolean`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapShortVarargToBoolean")
inline fun mapVararg(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Short) -> Boolean
): Pair<Boolean, BooleanArray> = mapper(arg) to otherArgs.map(mapper).toBooleanArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Byte].
 *
 * This function is intended for API functions which expect `x: Short, vararg otherX: Short` and
 * want to pass the arguments to another function expecting `x: Byte, vararg otherX: Byte`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapShortVarargToByte")
inline fun mapVararg(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Short) -> Byte
): Pair<Byte, ByteArray> = mapper(arg) to otherArgs.map(mapper).toByteArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Char].
 *
 * This function is intended for API functions which expect `x: Short, vararg otherX: Short` and
 * want to pass the arguments to another function expecting `x: Char, vararg otherX: Char`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapShortVarargToChar")
inline fun mapVararg(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Short) -> Char
): Pair<Char, CharArray> = mapper(arg) to otherArgs.map(mapper).toCharArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Short].
 *
 * This function is intended for API functions which expect `x: Short, vararg otherX: Short` and
 * want to pass the arguments to another function expecting `x: Short, vararg otherX: Short`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapShortVarargToShort")
inline fun mapVararg(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Short) -> Short
): Pair<Short, ShortArray> = mapper(arg) to otherArgs.map(mapper).toShortArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Int].
 *
 * This function is intended for API functions which expect `x: Short, vararg otherX: Short` and
 * want to pass the arguments to another function expecting `x: Int, vararg otherX: Int`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapShortVarargToInt")
inline fun mapVararg(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Short) -> Int
): Pair<Int, IntArray> = mapper(arg) to otherArgs.map(mapper).toIntArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Long].
 *
 * This function is intended for API functions which expect `x: Short, vararg otherX: Short` and
 * want to pass the arguments to another function expecting `x: Long, vararg otherX: Long`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapShortVarargToLong")
inline fun mapVararg(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Short) -> Long
): Pair<Long, LongArray> = mapper(arg) to otherArgs.map(mapper).toLongArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Float].
 *
 * This function is intended for API functions which expect `x: Short, vararg otherX: Short` and
 * want to pass the arguments to another function expecting `x: Float, vararg otherX: Float`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapShortVarargToFloat")
inline fun mapVararg(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Short) -> Float
): Pair<Float, FloatArray> = mapper(arg) to otherArgs.map(mapper).toFloatArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Double].
 *
 * This function is intended for API functions which expect `x: Short, vararg otherX: Short` and
 * want to pass the arguments to another function expecting `x: Double, vararg otherX: Double`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapShortVarargToDouble")
inline fun mapVararg(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Short) -> Double
): Pair<Double, DoubleArray> = mapper(arg) to otherArgs.map(mapper).toDoubleArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Int].
 *
 * This function is intended for API functions which expect `x: T, vararg otherX: T` and
 * want to pass the arguments to another function expecting `x: Int, vararg otherX: Int`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@JvmName("mapVarargToInt")
inline fun <T> mapVararg(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (T) -> Int
): Pair<Int, IntArray> = mapper(arg) to otherArgs.map(mapper).toIntArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
 *
 * This function is intended for API functions which expect `x: Int, vararg otherX: Int` and
 * want to pass the arguments to another function expecting `x: R, vararg otherX: R`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapIntVararg")
inline fun <reified R> mapVararg(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int) -> R
): Pair<R, Array<out R>> = mapper(arg) to otherArgs.map(mapper).toTypedArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Boolean].
 *
 * This function is intended for API functions which expect `x: Int, vararg otherX: Int` and
 * want to pass the arguments to another function expecting `x: Boolean, vararg otherX: Boolean`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapIntVarargToBoolean")
inline fun mapVararg(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int) -> Boolean
): Pair<Boolean, BooleanArray> = mapper(arg) to otherArgs.map(mapper).toBooleanArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Byte].
 *
 * This function is intended for API functions which expect `x: Int, vararg otherX: Int` and
 * want to pass the arguments to another function expecting `x: Byte, vararg otherX: Byte`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapIntVarargToByte")
inline fun mapVararg(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int) -> Byte
): Pair<Byte, ByteArray> = mapper(arg) to otherArgs.map(mapper).toByteArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Char].
 *
 * This function is intended for API functions which expect `x: Int, vararg otherX: Int` and
 * want to pass the arguments to another function expecting `x: Char, vararg otherX: Char`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapIntVarargToChar")
inline fun mapVararg(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int) -> Char
): Pair<Char, CharArray> = mapper(arg) to otherArgs.map(mapper).toCharArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Short].
 *
 * This function is intended for API functions which expect `x: Int, vararg otherX: Int` and
 * want to pass the arguments to another function expecting `x: Short, vararg otherX: Short`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapIntVarargToShort")
inline fun mapVararg(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int) -> Short
): Pair<Short, ShortArray> = mapper(arg) to otherArgs.map(mapper).toShortArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Int].
 *
 * This function is intended for API functions which expect `x: Int, vararg otherX: Int` and
 * want to pass the arguments to another function expecting `x: Int, vararg otherX: Int`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapIntVarargToInt")
inline fun mapVararg(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int) -> Int
): Pair<Int, IntArray> = mapper(arg) to otherArgs.map(mapper).toIntArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Long].
 *
 * This function is intended for API functions which expect `x: Int, vararg otherX: Int` and
 * want to pass the arguments to another function expecting `x: Long, vararg otherX: Long`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapIntVarargToLong")
inline fun mapVararg(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int) -> Long
): Pair<Long, LongArray> = mapper(arg) to otherArgs.map(mapper).toLongArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Float].
 *
 * This function is intended for API functions which expect `x: Int, vararg otherX: Int` and
 * want to pass the arguments to another function expecting `x: Float, vararg otherX: Float`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapIntVarargToFloat")
inline fun mapVararg(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int) -> Float
): Pair<Float, FloatArray> = mapper(arg) to otherArgs.map(mapper).toFloatArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Double].
 *
 * This function is intended for API functions which expect `x: Int, vararg otherX: Int` and
 * want to pass the arguments to another function expecting `x: Double, vararg otherX: Double`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapIntVarargToDouble")
inline fun mapVararg(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int) -> Double
): Pair<Double, DoubleArray> = mapper(arg) to otherArgs.map(mapper).toDoubleArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Long].
 *
 * This function is intended for API functions which expect `x: T, vararg otherX: T` and
 * want to pass the arguments to another function expecting `x: Long, vararg otherX: Long`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapVarargToLong")
inline fun <T> mapVararg(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (T) -> Long
): Pair<Long, LongArray> = mapper(arg) to otherArgs.map(mapper).toLongArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
 *
 * This function is intended for API functions which expect `x: Long, vararg otherX: Long` and
 * want to pass the arguments to another function expecting `x: R, vararg otherX: R`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapLongVararg")
inline fun <reified R> mapVararg(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Long) -> R
): Pair<R, Array<out R>> = mapper(arg) to otherArgs.map(mapper).toTypedArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Boolean].
 *
 * This function is intended for API functions which expect `x: Long, vararg otherX: Long` and
 * want to pass the arguments to another function expecting `x: Boolean, vararg otherX: Boolean`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapLongVarargToBoolean")
inline fun mapVararg(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Long) -> Boolean
): Pair<Boolean, BooleanArray> = mapper(arg) to otherArgs.map(mapper).toBooleanArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Byte].
 *
 * This function is intended for API functions which expect `x: Long, vararg otherX: Long` and
 * want to pass the arguments to another function expecting `x: Byte, vararg otherX: Byte`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapLongVarargToByte")
inline fun mapVararg(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Long) -> Byte
): Pair<Byte, ByteArray> = mapper(arg) to otherArgs.map(mapper).toByteArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Char].
 *
 * This function is intended for API functions which expect `x: Long, vararg otherX: Long` and
 * want to pass the arguments to another function expecting `x: Char, vararg otherX: Char`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapLongVarargToChar")
inline fun mapVararg(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Long) -> Char
): Pair<Char, CharArray> = mapper(arg) to otherArgs.map(mapper).toCharArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Short].
 *
 * This function is intended for API functions which expect `x: Long, vararg otherX: Long` and
 * want to pass the arguments to another function expecting `x: Short, vararg otherX: Short`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapLongVarargToShort")
inline fun mapVararg(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Long) -> Short
): Pair<Short, ShortArray> = mapper(arg) to otherArgs.map(mapper).toShortArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Int].
 *
 * This function is intended for API functions which expect `x: Long, vararg otherX: Long` and
 * want to pass the arguments to another function expecting `x: Int, vararg otherX: Int`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapLongVarargToInt")
inline fun mapVararg(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Long) -> Int
): Pair<Int, IntArray> = mapper(arg) to otherArgs.map(mapper).toIntArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Long].
 *
 * This function is intended for API functions which expect `x: Long, vararg otherX: Long` and
 * want to pass the arguments to another function expecting `x: Long, vararg otherX: Long`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapLongVarargToLong")
inline fun mapVararg(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Long) -> Long
): Pair<Long, LongArray> = mapper(arg) to otherArgs.map(mapper).toLongArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Float].
 *
 * This function is intended for API functions which expect `x: Long, vararg otherX: Long` and
 * want to pass the arguments to another function expecting `x: Float, vararg otherX: Float`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapLongVarargToFloat")
inline fun mapVararg(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Long) -> Float
): Pair<Float, FloatArray> = mapper(arg) to otherArgs.map(mapper).toFloatArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Double].
 *
 * This function is intended for API functions which expect `x: Long, vararg otherX: Long` and
 * want to pass the arguments to another function expecting `x: Double, vararg otherX: Double`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapLongVarargToDouble")
inline fun mapVararg(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Long) -> Double
): Pair<Double, DoubleArray> = mapper(arg) to otherArgs.map(mapper).toDoubleArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Float].
 *
 * This function is intended for API functions which expect `x: T, vararg otherX: T` and
 * want to pass the arguments to another function expecting `x: Float, vararg otherX: Float`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapVarargToFloat")
inline fun <T> mapVararg(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (T) -> Float
): Pair<Float, FloatArray> = mapper(arg) to otherArgs.map(mapper).toFloatArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
 *
 * This function is intended for API functions which expect `x: Float, vararg otherX: Float` and
 * want to pass the arguments to another function expecting `x: R, vararg otherX: R`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapFloatVararg")
inline fun <reified R> mapVararg(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Float) -> R
): Pair<R, Array<out R>> = mapper(arg) to otherArgs.map(mapper).toTypedArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Boolean].
 *
 * This function is intended for API functions which expect `x: Float, vararg otherX: Float` and
 * want to pass the arguments to another function expecting `x: Boolean, vararg otherX: Boolean`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapFloatVarargToBoolean")
inline fun mapVararg(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Float) -> Boolean
): Pair<Boolean, BooleanArray> = mapper(arg) to otherArgs.map(mapper).toBooleanArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Byte].
 *
 * This function is intended for API functions which expect `x: Float, vararg otherX: Float` and
 * want to pass the arguments to another function expecting `x: Byte, vararg otherX: Byte`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapFloatVarargToByte")
inline fun mapVararg(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Float) -> Byte
): Pair<Byte, ByteArray> = mapper(arg) to otherArgs.map(mapper).toByteArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Char].
 *
 * This function is intended for API functions which expect `x: Float, vararg otherX: Float` and
 * want to pass the arguments to another function expecting `x: Char, vararg otherX: Char`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapFloatVarargToChar")
inline fun mapVararg(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Float) -> Char
): Pair<Char, CharArray> = mapper(arg) to otherArgs.map(mapper).toCharArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Short].
 *
 * This function is intended for API functions which expect `x: Float, vararg otherX: Float` and
 * want to pass the arguments to another function expecting `x: Short, vararg otherX: Short`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapFloatVarargToShort")
inline fun mapVararg(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Float) -> Short
): Pair<Short, ShortArray> = mapper(arg) to otherArgs.map(mapper).toShortArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Int].
 *
 * This function is intended for API functions which expect `x: Float, vararg otherX: Float` and
 * want to pass the arguments to another function expecting `x: Int, vararg otherX: Int`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapFloatVarargToInt")
inline fun mapVararg(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Float) -> Int
): Pair<Int, IntArray> = mapper(arg) to otherArgs.map(mapper).toIntArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Long].
 *
 * This function is intended for API functions which expect `x: Float, vararg otherX: Float` and
 * want to pass the arguments to another function expecting `x: Long, vararg otherX: Long`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapFloatVarargToLong")
inline fun mapVararg(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Float) -> Long
): Pair<Long, LongArray> = mapper(arg) to otherArgs.map(mapper).toLongArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Float].
 *
 * This function is intended for API functions which expect `x: Float, vararg otherX: Float` and
 * want to pass the arguments to another function expecting `x: Float, vararg otherX: Float`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapFloatVarargToFloat")
inline fun mapVararg(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Float) -> Float
): Pair<Float, FloatArray> = mapper(arg) to otherArgs.map(mapper).toFloatArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Double].
 *
 * This function is intended for API functions which expect `x: Float, vararg otherX: Float` and
 * want to pass the arguments to another function expecting `x: Double, vararg otherX: Double`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapFloatVarargToDouble")
inline fun mapVararg(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Float) -> Double
): Pair<Double, DoubleArray> = mapper(arg) to otherArgs.map(mapper).toDoubleArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Double].
 *
 * This function is intended for API functions which expect `x: T, vararg otherX: T` and
 * want to pass the arguments to another function expecting `x: Double, vararg otherX: Double`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapVarargToDouble")
inline fun <T> mapVararg(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (T) -> Double
): Pair<Double, DoubleArray> = mapper(arg) to otherArgs.map(mapper).toDoubleArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
 *
 * This function is intended for API functions which expect `x: Double, vararg otherX: Double` and
 * want to pass the arguments to another function expecting `x: R, vararg otherX: R`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapDoubleVararg")
inline fun <reified R> mapVararg(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Double) -> R
): Pair<R, Array<out R>> = mapper(arg) to otherArgs.map(mapper).toTypedArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Boolean].
 *
 * This function is intended for API functions which expect `x: Double, vararg otherX: Double` and
 * want to pass the arguments to another function expecting `x: Boolean, vararg otherX: Boolean`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapDoubleVarargToBoolean")
inline fun mapVararg(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Double) -> Boolean
): Pair<Boolean, BooleanArray> = mapper(arg) to otherArgs.map(mapper).toBooleanArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Byte].
 *
 * This function is intended for API functions which expect `x: Double, vararg otherX: Double` and
 * want to pass the arguments to another function expecting `x: Byte, vararg otherX: Byte`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapDoubleVarargToByte")
inline fun mapVararg(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Double) -> Byte
): Pair<Byte, ByteArray> = mapper(arg) to otherArgs.map(mapper).toByteArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Char].
 *
 * This function is intended for API functions which expect `x: Double, vararg otherX: Double` and
 * want to pass the arguments to another function expecting `x: Char, vararg otherX: Char`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapDoubleVarargToChar")
inline fun mapVararg(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Double) -> Char
): Pair<Char, CharArray> = mapper(arg) to otherArgs.map(mapper).toCharArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Short].
 *
 * This function is intended for API functions which expect `x: Double, vararg otherX: Double` and
 * want to pass the arguments to another function expecting `x: Short, vararg otherX: Short`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapDoubleVarargToShort")
inline fun mapVararg(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Double) -> Short
): Pair<Short, ShortArray> = mapper(arg) to otherArgs.map(mapper).toShortArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Int].
 *
 * This function is intended for API functions which expect `x: Double, vararg otherX: Double` and
 * want to pass the arguments to another function expecting `x: Int, vararg otherX: Int`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapDoubleVarargToInt")
inline fun mapVararg(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Double) -> Int
): Pair<Int, IntArray> = mapper(arg) to otherArgs.map(mapper).toIntArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Long].
 *
 * This function is intended for API functions which expect `x: Double, vararg otherX: Double` and
 * want to pass the arguments to another function expecting `x: Long, vararg otherX: Long`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapDoubleVarargToLong")
inline fun mapVararg(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Double) -> Long
): Pair<Long, LongArray> = mapper(arg) to otherArgs.map(mapper).toLongArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Float].
 *
 * This function is intended for API functions which expect `x: Double, vararg otherX: Double` and
 * want to pass the arguments to another function expecting `x: Float, vararg otherX: Float`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapDoubleVarargToFloat")
inline fun mapVararg(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Double) -> Float
): Pair<Float, FloatArray> = mapper(arg) to otherArgs.map(mapper).toFloatArray()

/**
 * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [Double].
 *
 * This function is intended for API functions which expect `x: Double, vararg otherX: Double` and
 * want to pass the arguments to another function expecting `x: Double, vararg otherX: Double`.
 *
 * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
 *
 * @since 3.1.0
 */
@OverloadResolutionByLambdaReturnType
@JvmName("mapDoubleVarargToDouble")
inline fun mapVararg(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Double) -> Double
): Pair<Double, DoubleArray> = mapper(arg) to otherArgs.map(mapper).toDoubleArray()

