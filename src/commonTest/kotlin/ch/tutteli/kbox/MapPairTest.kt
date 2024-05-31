package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.first
import ch.tutteli.atrium.api.fluent.en_GB.second
import ch.tutteli.atrium.api.fluent.en_GB.toBeTheInstance
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.expect
import kotlin.test.Test

class MapTupleTest {
    @Test
    fun mapFirst_identity_returns_equal_pair() {
        expect(Pair(1, "hello").mapFirst(::identity)).toEqual(Pair(1, "hello"))
    }

    @Test
    fun mapFirst_returns_transformation_does_not_touch_second_element() {
        val obj = listOf('h', 'e', 'l', 'l', 'o')
        expect(Pair(1, obj).mapFirst { it + 1 }) {
            toEqual(Pair(2, obj))
            second.toBeTheInstance(obj)
        }
    }

    @Test
    fun mapSecond_identity_returns_equal_pair() {
        expect(Pair(1, "hello").mapSecond(::identity)).toEqual(Pair(1, "hello"))
    }

    @Test
    fun mapSecond_returns_transformation_does_not_touch_first_element() {
        val obj = listOf('h', 'e', 'l', 'l', 'o')
        expect(Pair(obj, 1).mapSecond { it + 1 }) {
            toEqual(Pair(obj, 2))
            first.toBeTheInstance(obj)
        }
    }
}
