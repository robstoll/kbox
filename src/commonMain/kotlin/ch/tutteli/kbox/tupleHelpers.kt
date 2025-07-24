package ch.tutteli.kbox

/**
 * Typealias which points to type [Pair].
 *
 * @since 3.2.0
 */
typealias Tuple2<A1, A2> = Pair<A1, A2>

/**
 * Typealias which points to type [Triple].
 *
 * @since 3.2.0
 */
typealias Tuple3<A1, A2, A3> = Triple<A1, A2, A3>

/**
 *  @param A1 The type of the 1st component of this Pair.
 *  @property a1 the 1st component of this Pair.
 *
 *  @since 3.2.0
 */
inline val <A1> Tuple2<A1, *>.a1: A1 get() = first

/**
 *  @param A2 The type of the 2nd component of this Pair.
 *  @property a2 the 2nd component of this Pair.
 *
 *  @since 3.2.0
 */
inline val <A2> Tuple2<*, A2>.a2: A2 get() = second

/**
 *  @param A1 The type of the 1st component of this Triple.
 *  @property a1 the 1st component of this Triple.
 *
 *  @since 3.2.0
 */
inline val <A1> Tuple3<A1, *, *>.a1: A1 get() = first

/**
 *  @param A2 The type of the 2nd component of this Triple.
 *  @property a2 the 2nd component of this Triple.
 *
 *  @since 3.2.0
 */
inline val <A2> Tuple3<*, A2, *>.a2: A2 get() = second

/**
 *  @param A3 The type of the 3rd component of this Triple.
 *  @property a3 the 3rd component of this Triple.
 *
 *  @since 3.2.0
 */
inline val <A3> Tuple3<*, *, A3>.a3: A3 get() = third
