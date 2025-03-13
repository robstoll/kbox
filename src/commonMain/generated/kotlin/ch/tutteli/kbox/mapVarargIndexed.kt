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
inline fun <T, reified R> mapVarargIndexed(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (Int, T) -> R
): Pair<R, Array<out R>> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toTypedArray()

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
@JvmName("mapVarargIndexedToBoolean")
inline fun <T> mapVarargIndexed(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (Int, T) -> Boolean
): Pair<Boolean, BooleanArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toBooleanArray()

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
@JvmName("mapBooleanVarargIndexed")
inline fun <reified R> mapVarargIndexed(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Int, Boolean) -> R
): Pair<R, Array<out R>> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toTypedArray()

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
@JvmName("mapBooleanVarargIndexedToBoolean")
inline fun mapVarargIndexed(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Int, Boolean) -> Boolean
): Pair<Boolean, BooleanArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toBooleanArray()

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
@JvmName("mapBooleanVarargIndexedToByte")
inline fun mapVarargIndexed(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Int, Boolean) -> Byte
): Pair<Byte, ByteArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toByteArray()

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
@JvmName("mapBooleanVarargIndexedToChar")
inline fun mapVarargIndexed(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Int, Boolean) -> Char
): Pair<Char, CharArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toCharArray()

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
@JvmName("mapBooleanVarargIndexedToShort")
inline fun mapVarargIndexed(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Int, Boolean) -> Short
): Pair<Short, ShortArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toShortArray()

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
@JvmName("mapBooleanVarargIndexedToInt")
inline fun mapVarargIndexed(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Int, Boolean) -> Int
): Pair<Int, IntArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toIntArray()

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
@JvmName("mapBooleanVarargIndexedToLong")
inline fun mapVarargIndexed(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Int, Boolean) -> Long
): Pair<Long, LongArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toLongArray()

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
@JvmName("mapBooleanVarargIndexedToFloat")
inline fun mapVarargIndexed(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Int, Boolean) -> Float
): Pair<Float, FloatArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toFloatArray()

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
@JvmName("mapBooleanVarargIndexedToDouble")
inline fun mapVarargIndexed(
    arg: Boolean,
    otherArgs: BooleanArray,
    mapper: (Int, Boolean) -> Double
): Pair<Double, DoubleArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toDoubleArray()

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
@JvmName("mapVarargIndexedToByte")
inline fun <T> mapVarargIndexed(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (Int, T) -> Byte
): Pair<Byte, ByteArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toByteArray()

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
@JvmName("mapByteVarargIndexed")
inline fun <reified R> mapVarargIndexed(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Int, Byte) -> R
): Pair<R, Array<out R>> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toTypedArray()

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
@JvmName("mapByteVarargIndexedToBoolean")
inline fun mapVarargIndexed(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Int, Byte) -> Boolean
): Pair<Boolean, BooleanArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toBooleanArray()

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
@JvmName("mapByteVarargIndexedToByte")
inline fun mapVarargIndexed(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Int, Byte) -> Byte
): Pair<Byte, ByteArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toByteArray()

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
@JvmName("mapByteVarargIndexedToChar")
inline fun mapVarargIndexed(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Int, Byte) -> Char
): Pair<Char, CharArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toCharArray()

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
@JvmName("mapByteVarargIndexedToShort")
inline fun mapVarargIndexed(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Int, Byte) -> Short
): Pair<Short, ShortArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toShortArray()

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
@JvmName("mapByteVarargIndexedToInt")
inline fun mapVarargIndexed(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Int, Byte) -> Int
): Pair<Int, IntArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toIntArray()

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
@JvmName("mapByteVarargIndexedToLong")
inline fun mapVarargIndexed(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Int, Byte) -> Long
): Pair<Long, LongArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toLongArray()

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
@JvmName("mapByteVarargIndexedToFloat")
inline fun mapVarargIndexed(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Int, Byte) -> Float
): Pair<Float, FloatArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toFloatArray()

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
@JvmName("mapByteVarargIndexedToDouble")
inline fun mapVarargIndexed(
    arg: Byte,
    otherArgs: ByteArray,
    mapper: (Int, Byte) -> Double
): Pair<Double, DoubleArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toDoubleArray()

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
@JvmName("mapVarargIndexedToChar")
inline fun <T> mapVarargIndexed(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (Int, T) -> Char
): Pair<Char, CharArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toCharArray()

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
@JvmName("mapCharVarargIndexed")
inline fun <reified R> mapVarargIndexed(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Int, Char) -> R
): Pair<R, Array<out R>> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toTypedArray()

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
@JvmName("mapCharVarargIndexedToBoolean")
inline fun mapVarargIndexed(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Int, Char) -> Boolean
): Pair<Boolean, BooleanArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toBooleanArray()

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
@JvmName("mapCharVarargIndexedToByte")
inline fun mapVarargIndexed(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Int, Char) -> Byte
): Pair<Byte, ByteArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toByteArray()

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
@JvmName("mapCharVarargIndexedToChar")
inline fun mapVarargIndexed(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Int, Char) -> Char
): Pair<Char, CharArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toCharArray()

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
@JvmName("mapCharVarargIndexedToShort")
inline fun mapVarargIndexed(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Int, Char) -> Short
): Pair<Short, ShortArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toShortArray()

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
@JvmName("mapCharVarargIndexedToInt")
inline fun mapVarargIndexed(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Int, Char) -> Int
): Pair<Int, IntArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toIntArray()

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
@JvmName("mapCharVarargIndexedToLong")
inline fun mapVarargIndexed(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Int, Char) -> Long
): Pair<Long, LongArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toLongArray()

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
@JvmName("mapCharVarargIndexedToFloat")
inline fun mapVarargIndexed(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Int, Char) -> Float
): Pair<Float, FloatArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toFloatArray()

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
@JvmName("mapCharVarargIndexedToDouble")
inline fun mapVarargIndexed(
    arg: Char,
    otherArgs: CharArray,
    mapper: (Int, Char) -> Double
): Pair<Double, DoubleArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toDoubleArray()

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
@JvmName("mapVarargIndexedToShort")
inline fun <T> mapVarargIndexed(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (Int, T) -> Short
): Pair<Short, ShortArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toShortArray()

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
@JvmName("mapShortVarargIndexed")
inline fun <reified R> mapVarargIndexed(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Int, Short) -> R
): Pair<R, Array<out R>> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toTypedArray()

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
@JvmName("mapShortVarargIndexedToBoolean")
inline fun mapVarargIndexed(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Int, Short) -> Boolean
): Pair<Boolean, BooleanArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toBooleanArray()

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
@JvmName("mapShortVarargIndexedToByte")
inline fun mapVarargIndexed(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Int, Short) -> Byte
): Pair<Byte, ByteArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toByteArray()

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
@JvmName("mapShortVarargIndexedToChar")
inline fun mapVarargIndexed(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Int, Short) -> Char
): Pair<Char, CharArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toCharArray()

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
@JvmName("mapShortVarargIndexedToShort")
inline fun mapVarargIndexed(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Int, Short) -> Short
): Pair<Short, ShortArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toShortArray()

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
@JvmName("mapShortVarargIndexedToInt")
inline fun mapVarargIndexed(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Int, Short) -> Int
): Pair<Int, IntArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toIntArray()

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
@JvmName("mapShortVarargIndexedToLong")
inline fun mapVarargIndexed(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Int, Short) -> Long
): Pair<Long, LongArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toLongArray()

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
@JvmName("mapShortVarargIndexedToFloat")
inline fun mapVarargIndexed(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Int, Short) -> Float
): Pair<Float, FloatArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toFloatArray()

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
@JvmName("mapShortVarargIndexedToDouble")
inline fun mapVarargIndexed(
    arg: Short,
    otherArgs: ShortArray,
    mapper: (Int, Short) -> Double
): Pair<Double, DoubleArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toDoubleArray()

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
@JvmName("mapVarargIndexedToInt")
inline fun <T> mapVarargIndexed(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (Int, T) -> Int
): Pair<Int, IntArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toIntArray()

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
@JvmName("mapIntVarargIndexed")
inline fun <reified R> mapVarargIndexed(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int, Int) -> R
): Pair<R, Array<out R>> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toTypedArray()

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
@JvmName("mapIntVarargIndexedToBoolean")
inline fun mapVarargIndexed(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int, Int) -> Boolean
): Pair<Boolean, BooleanArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toBooleanArray()

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
@JvmName("mapIntVarargIndexedToByte")
inline fun mapVarargIndexed(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int, Int) -> Byte
): Pair<Byte, ByteArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toByteArray()

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
@JvmName("mapIntVarargIndexedToChar")
inline fun mapVarargIndexed(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int, Int) -> Char
): Pair<Char, CharArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toCharArray()

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
@JvmName("mapIntVarargIndexedToShort")
inline fun mapVarargIndexed(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int, Int) -> Short
): Pair<Short, ShortArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toShortArray()

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
@JvmName("mapIntVarargIndexedToInt")
inline fun mapVarargIndexed(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int, Int) -> Int
): Pair<Int, IntArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toIntArray()

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
@JvmName("mapIntVarargIndexedToLong")
inline fun mapVarargIndexed(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int, Int) -> Long
): Pair<Long, LongArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toLongArray()

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
@JvmName("mapIntVarargIndexedToFloat")
inline fun mapVarargIndexed(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int, Int) -> Float
): Pair<Float, FloatArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toFloatArray()

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
@JvmName("mapIntVarargIndexedToDouble")
inline fun mapVarargIndexed(
    arg: Int,
    otherArgs: IntArray,
    mapper: (Int, Int) -> Double
): Pair<Double, DoubleArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toDoubleArray()

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
@JvmName("mapVarargIndexedToLong")
inline fun <T> mapVarargIndexed(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (Int, T) -> Long
): Pair<Long, LongArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toLongArray()

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
@JvmName("mapLongVarargIndexed")
inline fun <reified R> mapVarargIndexed(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Int, Long) -> R
): Pair<R, Array<out R>> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toTypedArray()

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
@JvmName("mapLongVarargIndexedToBoolean")
inline fun mapVarargIndexed(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Int, Long) -> Boolean
): Pair<Boolean, BooleanArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toBooleanArray()

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
@JvmName("mapLongVarargIndexedToByte")
inline fun mapVarargIndexed(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Int, Long) -> Byte
): Pair<Byte, ByteArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toByteArray()

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
@JvmName("mapLongVarargIndexedToChar")
inline fun mapVarargIndexed(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Int, Long) -> Char
): Pair<Char, CharArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toCharArray()

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
@JvmName("mapLongVarargIndexedToShort")
inline fun mapVarargIndexed(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Int, Long) -> Short
): Pair<Short, ShortArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toShortArray()

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
@JvmName("mapLongVarargIndexedToInt")
inline fun mapVarargIndexed(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Int, Long) -> Int
): Pair<Int, IntArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toIntArray()

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
@JvmName("mapLongVarargIndexedToLong")
inline fun mapVarargIndexed(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Int, Long) -> Long
): Pair<Long, LongArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toLongArray()

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
@JvmName("mapLongVarargIndexedToFloat")
inline fun mapVarargIndexed(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Int, Long) -> Float
): Pair<Float, FloatArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toFloatArray()

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
@JvmName("mapLongVarargIndexedToDouble")
inline fun mapVarargIndexed(
    arg: Long,
    otherArgs: LongArray,
    mapper: (Int, Long) -> Double
): Pair<Double, DoubleArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toDoubleArray()

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
@JvmName("mapVarargIndexedToFloat")
inline fun <T> mapVarargIndexed(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (Int, T) -> Float
): Pair<Float, FloatArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toFloatArray()

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
@JvmName("mapFloatVarargIndexed")
inline fun <reified R> mapVarargIndexed(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Int, Float) -> R
): Pair<R, Array<out R>> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toTypedArray()

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
@JvmName("mapFloatVarargIndexedToBoolean")
inline fun mapVarargIndexed(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Int, Float) -> Boolean
): Pair<Boolean, BooleanArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toBooleanArray()

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
@JvmName("mapFloatVarargIndexedToByte")
inline fun mapVarargIndexed(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Int, Float) -> Byte
): Pair<Byte, ByteArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toByteArray()

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
@JvmName("mapFloatVarargIndexedToChar")
inline fun mapVarargIndexed(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Int, Float) -> Char
): Pair<Char, CharArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toCharArray()

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
@JvmName("mapFloatVarargIndexedToShort")
inline fun mapVarargIndexed(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Int, Float) -> Short
): Pair<Short, ShortArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toShortArray()

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
@JvmName("mapFloatVarargIndexedToInt")
inline fun mapVarargIndexed(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Int, Float) -> Int
): Pair<Int, IntArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toIntArray()

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
@JvmName("mapFloatVarargIndexedToLong")
inline fun mapVarargIndexed(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Int, Float) -> Long
): Pair<Long, LongArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toLongArray()

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
@JvmName("mapFloatVarargIndexedToFloat")
inline fun mapVarargIndexed(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Int, Float) -> Float
): Pair<Float, FloatArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toFloatArray()

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
@JvmName("mapFloatVarargIndexedToDouble")
inline fun mapVarargIndexed(
    arg: Float,
    otherArgs: FloatArray,
    mapper: (Int, Float) -> Double
): Pair<Double, DoubleArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toDoubleArray()

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
@JvmName("mapVarargIndexedToDouble")
inline fun <T> mapVarargIndexed(
    arg: T,
    otherArgs: Array<out T>,
    mapper: (Int, T) -> Double
): Pair<Double, DoubleArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toDoubleArray()

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
@JvmName("mapDoubleVarargIndexed")
inline fun <reified R> mapVarargIndexed(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Int, Double) -> R
): Pair<R, Array<out R>> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toTypedArray()

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
@JvmName("mapDoubleVarargIndexedToBoolean")
inline fun mapVarargIndexed(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Int, Double) -> Boolean
): Pair<Boolean, BooleanArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toBooleanArray()

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
@JvmName("mapDoubleVarargIndexedToByte")
inline fun mapVarargIndexed(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Int, Double) -> Byte
): Pair<Byte, ByteArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toByteArray()

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
@JvmName("mapDoubleVarargIndexedToChar")
inline fun mapVarargIndexed(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Int, Double) -> Char
): Pair<Char, CharArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toCharArray()

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
@JvmName("mapDoubleVarargIndexedToShort")
inline fun mapVarargIndexed(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Int, Double) -> Short
): Pair<Short, ShortArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toShortArray()

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
@JvmName("mapDoubleVarargIndexedToInt")
inline fun mapVarargIndexed(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Int, Double) -> Int
): Pair<Int, IntArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toIntArray()

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
@JvmName("mapDoubleVarargIndexedToLong")
inline fun mapVarargIndexed(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Int, Double) -> Long
): Pair<Long, LongArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toLongArray()

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
@JvmName("mapDoubleVarargIndexedToFloat")
inline fun mapVarargIndexed(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Int, Double) -> Float
): Pair<Float, FloatArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toFloatArray()

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
@JvmName("mapDoubleVarargIndexedToDouble")
inline fun mapVarargIndexed(
    arg: Double,
    otherArgs: DoubleArray,
    mapper: (Int, Double) -> Double
): Pair<Double, DoubleArray> =
   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toDoubleArray()

