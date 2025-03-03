// --------------------------------------------------------------------------------------------------------------------
// automatically generated, don't modify here but in:
// gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts
// --------------------------------------------------------------------------------------------------------------------
package ch.tutteli.kbox

import kotlin.jvm.JvmName

/**
 * Flattens a [List] of [Pair]<T, T> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten2")
fun <T> List<Pair<T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens an [Iterable] of [Pair]<T, T> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.1.0
 */
@JvmName("flatten2")
fun <T> Iterable<Pair<T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens a [Sequence] of [Pair]<T, T> into a `Sequence<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component type A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten2")
fun <T> Sequence<Pair<T, T>>.flatten(): Sequence<T> =
    flatMap { it.toSequence() }

/**
 * Flattens a [List] of [Triple]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten3")
fun <T> List<Triple<T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens an [Iterable] of [Triple]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.1.0
 */
@JvmName("flatten3")
fun <T> Iterable<Triple<T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens a [Sequence] of [Triple]<T, T, ...> into a `Sequence<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component type A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten3")
fun <T> Sequence<Triple<T, T, T>>.flatten(): Sequence<T> =
    flatMap { it.toSequence() }

/**
 * Flattens a [List] of [Tuple4]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten4")
fun <T> List<Tuple4<T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens an [Iterable] of [Tuple4]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.1.0
 */
@JvmName("flatten4")
fun <T> Iterable<Tuple4<T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens a [Sequence] of [Tuple4]<T, T, ...> into a `Sequence<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component type A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten4")
fun <T> Sequence<Tuple4<T, T, T, T>>.flatten(): Sequence<T> =
    flatMap { it.toSequence() }

/**
 * Flattens a [List] of [Tuple5]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten5")
fun <T> List<Tuple5<T, T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens an [Iterable] of [Tuple5]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.1.0
 */
@JvmName("flatten5")
fun <T> Iterable<Tuple5<T, T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens a [Sequence] of [Tuple5]<T, T, ...> into a `Sequence<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component type A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten5")
fun <T> Sequence<Tuple5<T, T, T, T, T>>.flatten(): Sequence<T> =
    flatMap { it.toSequence() }

/**
 * Flattens a [List] of [Tuple6]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten6")
fun <T> List<Tuple6<T, T, T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens an [Iterable] of [Tuple6]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.1.0
 */
@JvmName("flatten6")
fun <T> Iterable<Tuple6<T, T, T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens a [Sequence] of [Tuple6]<T, T, ...> into a `Sequence<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component type A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten6")
fun <T> Sequence<Tuple6<T, T, T, T, T, T>>.flatten(): Sequence<T> =
    flatMap { it.toSequence() }

/**
 * Flattens a [List] of [Tuple7]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten7")
fun <T> List<Tuple7<T, T, T, T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens an [Iterable] of [Tuple7]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.1.0
 */
@JvmName("flatten7")
fun <T> Iterable<Tuple7<T, T, T, T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens a [Sequence] of [Tuple7]<T, T, ...> into a `Sequence<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component type A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten7")
fun <T> Sequence<Tuple7<T, T, T, T, T, T, T>>.flatten(): Sequence<T> =
    flatMap { it.toSequence() }

/**
 * Flattens a [List] of [Tuple8]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten8")
fun <T> List<Tuple8<T, T, T, T, T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens an [Iterable] of [Tuple8]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.1.0
 */
@JvmName("flatten8")
fun <T> Iterable<Tuple8<T, T, T, T, T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens a [Sequence] of [Tuple8]<T, T, ...> into a `Sequence<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component type A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten8")
fun <T> Sequence<Tuple8<T, T, T, T, T, T, T, T>>.flatten(): Sequence<T> =
    flatMap { it.toSequence() }

/**
 * Flattens a [List] of [Tuple9]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten9")
fun <T> List<Tuple9<T, T, T, T, T, T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens an [Iterable] of [Tuple9]<T, T, ...> into a `List<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
 * are not all the same.
 *
 * @since 3.1.0
 */
@JvmName("flatten9")
fun <T> Iterable<Tuple9<T, T, T, T, T, T, T, T, T>>.flatten(): List<T> =
    asSequence().flatten().toList()

/**
 * Flattens a [Sequence] of [Tuple9]<T, T, ...> into a `Sequence<T>`.
 *
 * Kotlin will automatically infer the least upper bound type in case your component type A1, A2, ...
 * are not all the same.
 *
 * @since 3.0.0
 */
@JvmName("flatten9")
fun <T> Sequence<Tuple9<T, T, T, T, T, T, T, T, T>>.flatten(): Sequence<T> =
    flatMap { it.toSequence() }

