// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

import kotlin.jvm.JvmName/**
 * Splits this [Array] into the first element and the rest as `Array<out T>`.
 *
 * This way you can pass it to a function which expects `x: T, vararg otherX: T`.
 *
 * @since 3.1.0
 */
inline fun <reified T> Array<out T>.toVararg(): Pair<T, Array<out T>> =
   first() to drop(1).toList().toTypedArray()

/**
 * Splits this [Iterable] into the first element and the rest as [BooleanArray].
 *
 * This way you can pass it to a function which expects `x: Boolean, vararg otherX: Boolean`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargBoolean")
fun Iterable<Boolean>.toVararg(): Pair<Boolean, BooleanArray> =
   first() to drop(1).toBooleanArray()

/**
 * Splits this [Array] into the first element and the rest as [BooleanArray].
 *
 * This way you can pass it to a function which expects `x: Boolean, vararg otherX: Boolean`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargBoolean")
fun Array<Boolean>.toVararg(): Pair<Boolean, BooleanArray> =
   first() to drop(1).toBooleanArray()

/**
 * Splits this [Sequence] into the first element and the rest as [BooleanArray].
 *
 * This way you can pass it to a function which expects `x: Boolean, vararg otherX: Boolean`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargBoolean")
fun Sequence<Boolean>.toVararg(): Pair<Boolean, BooleanArray> =
   first() to drop(1).toList().toBooleanArray()

/**
 * Splits this [BooleanArray] into the first element and the rest as [BooleanArray].
 *
 * This way you can pass it to a function which expects `x: Boolean, vararg otherX: Boolean`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargBoolean")
fun BooleanArray.toVararg(): Pair<Boolean, BooleanArray> =
   first() to drop(1).toBooleanArray()

/**
 * Splits this [Iterable] into the first element and the rest as [ByteArray].
 *
 * This way you can pass it to a function which expects `x: Byte, vararg otherX: Byte`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargByte")
fun Iterable<Byte>.toVararg(): Pair<Byte, ByteArray> =
   first() to drop(1).toByteArray()

/**
 * Splits this [Array] into the first element and the rest as [ByteArray].
 *
 * This way you can pass it to a function which expects `x: Byte, vararg otherX: Byte`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargByte")
fun Array<Byte>.toVararg(): Pair<Byte, ByteArray> =
   first() to drop(1).toByteArray()

/**
 * Splits this [Sequence] into the first element and the rest as [ByteArray].
 *
 * This way you can pass it to a function which expects `x: Byte, vararg otherX: Byte`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargByte")
fun Sequence<Byte>.toVararg(): Pair<Byte, ByteArray> =
   first() to drop(1).toList().toByteArray()

/**
 * Splits this [ByteArray] into the first element and the rest as [ByteArray].
 *
 * This way you can pass it to a function which expects `x: Byte, vararg otherX: Byte`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargByte")
fun ByteArray.toVararg(): Pair<Byte, ByteArray> =
   first() to drop(1).toByteArray()

/**
 * Splits this [Iterable] into the first element and the rest as [CharArray].
 *
 * This way you can pass it to a function which expects `x: Char, vararg otherX: Char`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargChar")
fun Iterable<Char>.toVararg(): Pair<Char, CharArray> =
   first() to drop(1).toCharArray()

/**
 * Splits this [Array] into the first element and the rest as [CharArray].
 *
 * This way you can pass it to a function which expects `x: Char, vararg otherX: Char`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargChar")
fun Array<Char>.toVararg(): Pair<Char, CharArray> =
   first() to drop(1).toCharArray()

/**
 * Splits this [Sequence] into the first element and the rest as [CharArray].
 *
 * This way you can pass it to a function which expects `x: Char, vararg otherX: Char`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargChar")
fun Sequence<Char>.toVararg(): Pair<Char, CharArray> =
   first() to drop(1).toList().toCharArray()

/**
 * Splits this [CharArray] into the first element and the rest as [CharArray].
 *
 * This way you can pass it to a function which expects `x: Char, vararg otherX: Char`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargChar")
fun CharArray.toVararg(): Pair<Char, CharArray> =
   first() to drop(1).toCharArray()

/**
 * Splits this [Iterable] into the first element and the rest as [ShortArray].
 *
 * This way you can pass it to a function which expects `x: Short, vararg otherX: Short`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargShort")
fun Iterable<Short>.toVararg(): Pair<Short, ShortArray> =
   first() to drop(1).toShortArray()

/**
 * Splits this [Array] into the first element and the rest as [ShortArray].
 *
 * This way you can pass it to a function which expects `x: Short, vararg otherX: Short`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargShort")
fun Array<Short>.toVararg(): Pair<Short, ShortArray> =
   first() to drop(1).toShortArray()

/**
 * Splits this [Sequence] into the first element and the rest as [ShortArray].
 *
 * This way you can pass it to a function which expects `x: Short, vararg otherX: Short`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargShort")
fun Sequence<Short>.toVararg(): Pair<Short, ShortArray> =
   first() to drop(1).toList().toShortArray()

/**
 * Splits this [ShortArray] into the first element and the rest as [ShortArray].
 *
 * This way you can pass it to a function which expects `x: Short, vararg otherX: Short`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargShort")
fun ShortArray.toVararg(): Pair<Short, ShortArray> =
   first() to drop(1).toShortArray()

/**
 * Splits this [Iterable] into the first element and the rest as [IntArray].
 *
 * This way you can pass it to a function which expects `x: Int, vararg otherX: Int`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargInt")
fun Iterable<Int>.toVararg(): Pair<Int, IntArray> =
   first() to drop(1).toIntArray()

/**
 * Splits this [Array] into the first element and the rest as [IntArray].
 *
 * This way you can pass it to a function which expects `x: Int, vararg otherX: Int`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargInt")
fun Array<Int>.toVararg(): Pair<Int, IntArray> =
   first() to drop(1).toIntArray()

/**
 * Splits this [Sequence] into the first element and the rest as [IntArray].
 *
 * This way you can pass it to a function which expects `x: Int, vararg otherX: Int`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargInt")
fun Sequence<Int>.toVararg(): Pair<Int, IntArray> =
   first() to drop(1).toList().toIntArray()

/**
 * Splits this [IntArray] into the first element and the rest as [IntArray].
 *
 * This way you can pass it to a function which expects `x: Int, vararg otherX: Int`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargInt")
fun IntArray.toVararg(): Pair<Int, IntArray> =
   first() to drop(1).toIntArray()

/**
 * Splits this [Iterable] into the first element and the rest as [LongArray].
 *
 * This way you can pass it to a function which expects `x: Long, vararg otherX: Long`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargLong")
fun Iterable<Long>.toVararg(): Pair<Long, LongArray> =
   first() to drop(1).toLongArray()

/**
 * Splits this [Array] into the first element and the rest as [LongArray].
 *
 * This way you can pass it to a function which expects `x: Long, vararg otherX: Long`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargLong")
fun Array<Long>.toVararg(): Pair<Long, LongArray> =
   first() to drop(1).toLongArray()

/**
 * Splits this [Sequence] into the first element and the rest as [LongArray].
 *
 * This way you can pass it to a function which expects `x: Long, vararg otherX: Long`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargLong")
fun Sequence<Long>.toVararg(): Pair<Long, LongArray> =
   first() to drop(1).toList().toLongArray()

/**
 * Splits this [LongArray] into the first element and the rest as [LongArray].
 *
 * This way you can pass it to a function which expects `x: Long, vararg otherX: Long`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargLong")
fun LongArray.toVararg(): Pair<Long, LongArray> =
   first() to drop(1).toLongArray()

/**
 * Splits this [Iterable] into the first element and the rest as [FloatArray].
 *
 * This way you can pass it to a function which expects `x: Float, vararg otherX: Float`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargFloat")
fun Iterable<Float>.toVararg(): Pair<Float, FloatArray> =
   first() to drop(1).toFloatArray()

/**
 * Splits this [Array] into the first element and the rest as [FloatArray].
 *
 * This way you can pass it to a function which expects `x: Float, vararg otherX: Float`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargFloat")
fun Array<Float>.toVararg(): Pair<Float, FloatArray> =
   first() to drop(1).toFloatArray()

/**
 * Splits this [Sequence] into the first element and the rest as [FloatArray].
 *
 * This way you can pass it to a function which expects `x: Float, vararg otherX: Float`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargFloat")
fun Sequence<Float>.toVararg(): Pair<Float, FloatArray> =
   first() to drop(1).toList().toFloatArray()

/**
 * Splits this [FloatArray] into the first element and the rest as [FloatArray].
 *
 * This way you can pass it to a function which expects `x: Float, vararg otherX: Float`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargFloat")
fun FloatArray.toVararg(): Pair<Float, FloatArray> =
   first() to drop(1).toFloatArray()

/**
 * Splits this [Iterable] into the first element and the rest as [DoubleArray].
 *
 * This way you can pass it to a function which expects `x: Double, vararg otherX: Double`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargDouble")
fun Iterable<Double>.toVararg(): Pair<Double, DoubleArray> =
   first() to drop(1).toDoubleArray()

/**
 * Splits this [Array] into the first element and the rest as [DoubleArray].
 *
 * This way you can pass it to a function which expects `x: Double, vararg otherX: Double`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargDouble")
fun Array<Double>.toVararg(): Pair<Double, DoubleArray> =
   first() to drop(1).toDoubleArray()

/**
 * Splits this [Sequence] into the first element and the rest as [DoubleArray].
 *
 * This way you can pass it to a function which expects `x: Double, vararg otherX: Double`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargDouble")
fun Sequence<Double>.toVararg(): Pair<Double, DoubleArray> =
   first() to drop(1).toList().toDoubleArray()

/**
 * Splits this [DoubleArray] into the first element and the rest as [DoubleArray].
 *
 * This way you can pass it to a function which expects `x: Double, vararg otherX: Double`.
 *
 * @since 3.1.0
 */
@JvmName("toVarargDouble")
fun DoubleArray.toVararg(): Pair<Double, DoubleArray> =
   first() to drop(1).toDoubleArray()

