// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

import kotlin.jvm.JvmName
import kotlin.Function2

/**
 * Invokes the function passing the first element of the given [Array] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
inline fun <reified T, R> Function2<T, Array<out T>, R>.invokeAsVararg(arr: Array<out T>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Iterable] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
inline fun <reified T, R> Function2<T, Array<out T>, R>.invokeAsVararg(arr: Iterable<T>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Sequence] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
inline fun <reified T, R> Function2<T, Array<out T>, R>.invokeAsVararg(arr: Sequence<T>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Iterable] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithIterableBooleanAsVarArg")
fun <R> Function2<Boolean, BooleanArray, R>.invokeAsVararg(arr: Iterable<Boolean>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Array] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Boolean, BooleanArray, R>.invokeAsVararg(arr: Array<Boolean>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Sequence] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithSequenceBooleanAsVarArg")
fun <R> Function2<Boolean, BooleanArray, R>.invokeAsVararg(arr: Sequence<Boolean>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [BooleanArray] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Boolean, BooleanArray, R>.invokeAsVararg(arr: BooleanArray): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Iterable] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithIterableByteAsVarArg")
fun <R> Function2<Byte, ByteArray, R>.invokeAsVararg(arr: Iterable<Byte>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Array] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Byte, ByteArray, R>.invokeAsVararg(arr: Array<Byte>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Sequence] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithSequenceByteAsVarArg")
fun <R> Function2<Byte, ByteArray, R>.invokeAsVararg(arr: Sequence<Byte>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [ByteArray] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Byte, ByteArray, R>.invokeAsVararg(arr: ByteArray): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Iterable] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithIterableCharAsVarArg")
fun <R> Function2<Char, CharArray, R>.invokeAsVararg(arr: Iterable<Char>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Array] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Char, CharArray, R>.invokeAsVararg(arr: Array<Char>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Sequence] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithSequenceCharAsVarArg")
fun <R> Function2<Char, CharArray, R>.invokeAsVararg(arr: Sequence<Char>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [CharArray] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Char, CharArray, R>.invokeAsVararg(arr: CharArray): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Iterable] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithIterableShortAsVarArg")
fun <R> Function2<Short, ShortArray, R>.invokeAsVararg(arr: Iterable<Short>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Array] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Short, ShortArray, R>.invokeAsVararg(arr: Array<Short>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Sequence] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithSequenceShortAsVarArg")
fun <R> Function2<Short, ShortArray, R>.invokeAsVararg(arr: Sequence<Short>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [ShortArray] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Short, ShortArray, R>.invokeAsVararg(arr: ShortArray): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Iterable] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithIterableIntAsVarArg")
fun <R> Function2<Int, IntArray, R>.invokeAsVararg(arr: Iterable<Int>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Array] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Int, IntArray, R>.invokeAsVararg(arr: Array<Int>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Sequence] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithSequenceIntAsVarArg")
fun <R> Function2<Int, IntArray, R>.invokeAsVararg(arr: Sequence<Int>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [IntArray] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Int, IntArray, R>.invokeAsVararg(arr: IntArray): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Iterable] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithIterableLongAsVarArg")
fun <R> Function2<Long, LongArray, R>.invokeAsVararg(arr: Iterable<Long>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Array] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Long, LongArray, R>.invokeAsVararg(arr: Array<Long>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Sequence] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithSequenceLongAsVarArg")
fun <R> Function2<Long, LongArray, R>.invokeAsVararg(arr: Sequence<Long>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [LongArray] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Long, LongArray, R>.invokeAsVararg(arr: LongArray): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Iterable] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithIterableFloatAsVarArg")
fun <R> Function2<Float, FloatArray, R>.invokeAsVararg(arr: Iterable<Float>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Array] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Float, FloatArray, R>.invokeAsVararg(arr: Array<Float>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Sequence] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithSequenceFloatAsVarArg")
fun <R> Function2<Float, FloatArray, R>.invokeAsVararg(arr: Sequence<Float>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [FloatArray] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Float, FloatArray, R>.invokeAsVararg(arr: FloatArray): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Iterable] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithIterableDoubleAsVarArg")
fun <R> Function2<Double, DoubleArray, R>.invokeAsVararg(arr: Iterable<Double>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Array] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Double, DoubleArray, R>.invokeAsVararg(arr: Array<Double>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [Sequence] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
@JvmName("invokeWithSequenceDoubleAsVarArg")
fun <R> Function2<Double, DoubleArray, R>.invokeAsVararg(arr: Sequence<Double>): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

/**
 * Invokes the function passing the first element of the given [DoubleArray] as first argument and the rest as vararg.
 *
 * @since 3.1.0
 */
fun <R> Function2<Double, DoubleArray, R>.invokeAsVararg(arr: DoubleArray): R =
   arr.toVararg().let { (first, rest) -> this.invoke(first, rest) }

