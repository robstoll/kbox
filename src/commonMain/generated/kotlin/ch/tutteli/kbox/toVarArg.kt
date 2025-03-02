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
inline fun <reified T> Array<out T>.toVarArg(): Pair<T, Array<out T>> =
   first() to drop(1).toList().toTypedArray()

/**
 * Splits this [Iterable] into the first element and the rest as [BooleanArray].
 *
 * This way you can pass it to a function which expects `x: Boolean, vararg otherX: Boolean`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgBoolean")
fun Iterable<Boolean>.toVarArg(): Pair<Boolean, BooleanArray> =
   first() to drop(1).toBooleanArray()

/**
 * Splits this [Array] into the first element and the rest as [BooleanArray].
 *
 * This way you can pass it to a function which expects `x: Boolean, vararg otherX: Boolean`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgBoolean")
fun Array<Boolean>.toVarArg(): Pair<Boolean, BooleanArray> =
   first() to drop(1).toBooleanArray()

/**
 * Splits this [Sequence] into the first element and the rest as [BooleanArray].
 *
 * This way you can pass it to a function which expects `x: Boolean, vararg otherX: Boolean`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgBoolean")
fun Sequence<Boolean>.toVarArg(): Pair<Boolean, BooleanArray> =
   first() to drop(1).toList().toBooleanArray()

/**
 * Splits this [BooleanArray] into the first element and the rest as [BooleanArray].
 *
 * This way you can pass it to a function which expects `x: Boolean, vararg otherX: Boolean`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgBoolean")
fun BooleanArray.toVarArg(): Pair<Boolean, BooleanArray> =
   first() to drop(1).toBooleanArray()

/**
 * Splits this [Iterable] into the first element and the rest as [ByteArray].
 *
 * This way you can pass it to a function which expects `x: Byte, vararg otherX: Byte`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgByte")
fun Iterable<Byte>.toVarArg(): Pair<Byte, ByteArray> =
   first() to drop(1).toByteArray()

/**
 * Splits this [Array] into the first element and the rest as [ByteArray].
 *
 * This way you can pass it to a function which expects `x: Byte, vararg otherX: Byte`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgByte")
fun Array<Byte>.toVarArg(): Pair<Byte, ByteArray> =
   first() to drop(1).toByteArray()

/**
 * Splits this [Sequence] into the first element and the rest as [ByteArray].
 *
 * This way you can pass it to a function which expects `x: Byte, vararg otherX: Byte`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgByte")
fun Sequence<Byte>.toVarArg(): Pair<Byte, ByteArray> =
   first() to drop(1).toList().toByteArray()

/**
 * Splits this [ByteArray] into the first element and the rest as [ByteArray].
 *
 * This way you can pass it to a function which expects `x: Byte, vararg otherX: Byte`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgByte")
fun ByteArray.toVarArg(): Pair<Byte, ByteArray> =
   first() to drop(1).toByteArray()

/**
 * Splits this [Iterable] into the first element and the rest as [CharArray].
 *
 * This way you can pass it to a function which expects `x: Char, vararg otherX: Char`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgChar")
fun Iterable<Char>.toVarArg(): Pair<Char, CharArray> =
   first() to drop(1).toCharArray()

/**
 * Splits this [Array] into the first element and the rest as [CharArray].
 *
 * This way you can pass it to a function which expects `x: Char, vararg otherX: Char`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgChar")
fun Array<Char>.toVarArg(): Pair<Char, CharArray> =
   first() to drop(1).toCharArray()

/**
 * Splits this [Sequence] into the first element and the rest as [CharArray].
 *
 * This way you can pass it to a function which expects `x: Char, vararg otherX: Char`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgChar")
fun Sequence<Char>.toVarArg(): Pair<Char, CharArray> =
   first() to drop(1).toList().toCharArray()

/**
 * Splits this [CharArray] into the first element and the rest as [CharArray].
 *
 * This way you can pass it to a function which expects `x: Char, vararg otherX: Char`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgChar")
fun CharArray.toVarArg(): Pair<Char, CharArray> =
   first() to drop(1).toCharArray()

/**
 * Splits this [Iterable] into the first element and the rest as [ShortArray].
 *
 * This way you can pass it to a function which expects `x: Short, vararg otherX: Short`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgShort")
fun Iterable<Short>.toVarArg(): Pair<Short, ShortArray> =
   first() to drop(1).toShortArray()

/**
 * Splits this [Array] into the first element and the rest as [ShortArray].
 *
 * This way you can pass it to a function which expects `x: Short, vararg otherX: Short`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgShort")
fun Array<Short>.toVarArg(): Pair<Short, ShortArray> =
   first() to drop(1).toShortArray()

/**
 * Splits this [Sequence] into the first element and the rest as [ShortArray].
 *
 * This way you can pass it to a function which expects `x: Short, vararg otherX: Short`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgShort")
fun Sequence<Short>.toVarArg(): Pair<Short, ShortArray> =
   first() to drop(1).toList().toShortArray()

/**
 * Splits this [ShortArray] into the first element and the rest as [ShortArray].
 *
 * This way you can pass it to a function which expects `x: Short, vararg otherX: Short`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgShort")
fun ShortArray.toVarArg(): Pair<Short, ShortArray> =
   first() to drop(1).toShortArray()

/**
 * Splits this [Iterable] into the first element and the rest as [IntArray].
 *
 * This way you can pass it to a function which expects `x: Int, vararg otherX: Int`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgInt")
fun Iterable<Int>.toVarArg(): Pair<Int, IntArray> =
   first() to drop(1).toIntArray()

/**
 * Splits this [Array] into the first element and the rest as [IntArray].
 *
 * This way you can pass it to a function which expects `x: Int, vararg otherX: Int`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgInt")
fun Array<Int>.toVarArg(): Pair<Int, IntArray> =
   first() to drop(1).toIntArray()

/**
 * Splits this [Sequence] into the first element and the rest as [IntArray].
 *
 * This way you can pass it to a function which expects `x: Int, vararg otherX: Int`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgInt")
fun Sequence<Int>.toVarArg(): Pair<Int, IntArray> =
   first() to drop(1).toList().toIntArray()

/**
 * Splits this [IntArray] into the first element and the rest as [IntArray].
 *
 * This way you can pass it to a function which expects `x: Int, vararg otherX: Int`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgInt")
fun IntArray.toVarArg(): Pair<Int, IntArray> =
   first() to drop(1).toIntArray()

/**
 * Splits this [Iterable] into the first element and the rest as [LongArray].
 *
 * This way you can pass it to a function which expects `x: Long, vararg otherX: Long`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgLong")
fun Iterable<Long>.toVarArg(): Pair<Long, LongArray> =
   first() to drop(1).toLongArray()

/**
 * Splits this [Array] into the first element and the rest as [LongArray].
 *
 * This way you can pass it to a function which expects `x: Long, vararg otherX: Long`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgLong")
fun Array<Long>.toVarArg(): Pair<Long, LongArray> =
   first() to drop(1).toLongArray()

/**
 * Splits this [Sequence] into the first element and the rest as [LongArray].
 *
 * This way you can pass it to a function which expects `x: Long, vararg otherX: Long`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgLong")
fun Sequence<Long>.toVarArg(): Pair<Long, LongArray> =
   first() to drop(1).toList().toLongArray()

/**
 * Splits this [LongArray] into the first element and the rest as [LongArray].
 *
 * This way you can pass it to a function which expects `x: Long, vararg otherX: Long`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgLong")
fun LongArray.toVarArg(): Pair<Long, LongArray> =
   first() to drop(1).toLongArray()

/**
 * Splits this [Iterable] into the first element and the rest as [FloatArray].
 *
 * This way you can pass it to a function which expects `x: Float, vararg otherX: Float`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgFloat")
fun Iterable<Float>.toVarArg(): Pair<Float, FloatArray> =
   first() to drop(1).toFloatArray()

/**
 * Splits this [Array] into the first element and the rest as [FloatArray].
 *
 * This way you can pass it to a function which expects `x: Float, vararg otherX: Float`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgFloat")
fun Array<Float>.toVarArg(): Pair<Float, FloatArray> =
   first() to drop(1).toFloatArray()

/**
 * Splits this [Sequence] into the first element and the rest as [FloatArray].
 *
 * This way you can pass it to a function which expects `x: Float, vararg otherX: Float`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgFloat")
fun Sequence<Float>.toVarArg(): Pair<Float, FloatArray> =
   first() to drop(1).toList().toFloatArray()

/**
 * Splits this [FloatArray] into the first element and the rest as [FloatArray].
 *
 * This way you can pass it to a function which expects `x: Float, vararg otherX: Float`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgFloat")
fun FloatArray.toVarArg(): Pair<Float, FloatArray> =
   first() to drop(1).toFloatArray()

/**
 * Splits this [Iterable] into the first element and the rest as [DoubleArray].
 *
 * This way you can pass it to a function which expects `x: Double, vararg otherX: Double`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgDouble")
fun Iterable<Double>.toVarArg(): Pair<Double, DoubleArray> =
   first() to drop(1).toDoubleArray()

/**
 * Splits this [Array] into the first element and the rest as [DoubleArray].
 *
 * This way you can pass it to a function which expects `x: Double, vararg otherX: Double`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgDouble")
fun Array<Double>.toVarArg(): Pair<Double, DoubleArray> =
   first() to drop(1).toDoubleArray()

/**
 * Splits this [Sequence] into the first element and the rest as [DoubleArray].
 *
 * This way you can pass it to a function which expects `x: Double, vararg otherX: Double`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgDouble")
fun Sequence<Double>.toVarArg(): Pair<Double, DoubleArray> =
   first() to drop(1).toList().toDoubleArray()

/**
 * Splits this [DoubleArray] into the first element and the rest as [DoubleArray].
 *
 * This way you can pass it to a function which expects `x: Double, vararg otherX: Double`.
 *
 * @since 3.1.0
 */
@JvmName("toVarArgDouble")
fun DoubleArray.toVarArg(): Pair<Double, DoubleArray> =
   first() to drop(1).toDoubleArray()

