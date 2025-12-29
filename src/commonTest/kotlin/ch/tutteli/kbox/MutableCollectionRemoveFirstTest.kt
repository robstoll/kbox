package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.toContainExactly
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.expect
import kotlin.test.Test

class MutableCollectionRemoveFirstTest {
    @Test
    fun empty_collection__returns_false() {
        val list = mutableListOf<Int>()
        val result = list.removeFirst { it > 2 }
        expect(result).toEqual(false)
    }

    @Test
    fun no_match__returns_false() {
        val list = mutableListOf(1)
        val result = list.removeFirst { it > 2 }
        expect(result).toEqual(false)
        expect(list).toContainExactly(1)
    }

    @Test
    fun one_match__removed_returns_true() {
        val list = mutableListOf(1, 2)
        val result = list.removeFirst { it < 2 }
        expect(result).toEqual(true)
        expect(list).toContainExactly(2)
    }

    @Test
    fun two_matches__first_removed_returns_true() {
        val list = mutableSetOf(1, 2, 3, 4)
        val result = list.removeFirst { it >= 3 }
        expect(result).toEqual(true)
        expect(list).toContainExactly(1, 2, 4)
    }
}
