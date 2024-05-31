package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.toContainExactly
import ch.tutteli.atrium.api.fluent.en_GB.toBeEmpty
import ch.tutteli.atrium.api.verbs.expect
import kotlin.test.Test

class MapRemainingTest {
    @Test
    fun mapRemaining_map_is_it_plus_1__empty_iterator__returns_empty_list() {
        val result = listOf<Int>().iterator().mapRemaining { it + 1 }
        expect(result).toBeEmpty()
    }

    @Test
    fun mapRemaining_map_is_it_plus_1__iterator_with_one_element_already_consumed__returns_empty_list() {
        val itr = listOf(1).iterator()
        itr.next()
        val result = itr.mapRemaining { it + 1 }
        expect(result).toBeEmpty()
    }

    @Test
    fun mapRemaining_map_is_it_plus_1__iterator_with_two_elements_one_consumed__return_list_with_one_mapped_element() {
        val itr = listOf(1, 2).iterator()
        itr.next()
        val result = itr.mapRemaining { it + 1 }
        expect(result).toContainExactly(3)
    }

    @Test
    fun mapRemaining_map_is_it_plus_1__iterator_with_three_elements_one_consumed__returns_list_with_two_mapped() {
        val itr = listOf(1, 2, 4).iterator()
        itr.next()
        val result = itr.mapRemaining { it + 1 }
        expect(result).toContainExactly(3, 5)
    }

    @Test
    fun mapRemaining_with_counter_map_is_it_plus_counter__empty_iterator__returns_empty_list() {
        val result = listOf<Int>().iterator().mapRemainingWithCounter { counter, it -> it + counter }
        expect(result).toBeEmpty()
    }

    @Test
    fun mapRemaining_with_counter_map_is_it_plus_counter__itr_with_one_element_already_consumed__returns_empty_list() {
        val itr = listOf(1).iterator()
        itr.next()
        val result = itr.mapRemainingWithCounter { counter, it -> it + counter }
        expect(result).toBeEmpty()
    }

    @Test
    fun mapRemaining_with_counter_map_is_it_plus_counter__itr_with_two_elements_one_consumed__return_list_with_one_mapped_element() {
        val itr = listOf(1, 2).iterator()
        itr.next()
        val result = itr.mapRemainingWithCounter { counter, it -> it + counter }
        expect(result).toContainExactly(2)
    }

    @Test
    fun mapRemaining_with_counter_map_is_it_plus_counter__itr_with_three_elements_one_consumed__returns_list_with_two_mapped() {
        val itr = listOf(1, 2, 4).iterator()
        itr.next()
        val result = itr.mapRemainingWithCounter { counter, it -> it + counter }
        expect(result).toContainExactly(2, 5)
    }
}
