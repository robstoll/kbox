package ch.tutteli.kbox

/**
 *  @param A1 The type of the 1st component of this Pair.
 *  @property a1 the 1st component of this Pair.
 *
 *  @since 3.2.0
 */
inline val <A1> Pair<A1, *>.a1: A1 get() = first

/**
 *  @param A2 The type of the 2nd component of this Pair.
 *  @property a2 the 2nd component of this Pair.
 *
 *  @since 3.2.0
 */
inline val <A2> Pair<*, A2>.a2: A2 get() = second

/**
 *  @param A1 The type of the 1st component of this Triple.
 *  @property a1 the 1st component of this Triple.
 *
 *  @since 3.2.0
 */
inline val <A1> Triple<A1, *, *>.a1: A1 get() = first

/**
 *  @param A2 The type of the 2nd component of this Triple.
 *  @property a2 the 2nd component of this Triple.
 *
 *  @since 3.2.0
 */
inline val <A2> Triple<*, A2, *>.a2: A2 get() = second

/**
 *  @param A3 The type of the 3rd component of this Triple.
 *  @property a3 the 3rd component of this Triple.
 *
 *  @since 3.2.0
 */
inline val <A3> Triple<*, *, A3>.a3: A3 get() = third
