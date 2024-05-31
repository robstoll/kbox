package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.toBeEmpty
import ch.tutteli.atrium.api.fluent.en_GB.toContainExactly
import ch.tutteli.atrium.api.verbs.expect
import kotlin.test.Test
import ch.tutteli.kbox.forEachRemaining as foreachRemaining

class ForEachRemainingTest {
    @Test
    fun add_to_list__empty_iterator__returns_an_empty_list() {
        val result = mutableListOf<Int>()
        listOf<Int>().iterator().foreachRemaining { result.add(it) }
        expect(result).toBeEmpty()
    }

    @Test
    fun add_to_list__itr_with_one_element_but_already_consumed__returns_an_empty_list() {
        val itr = listOf(1).iterator()
        itr.next()
        val result = mutableListOf<Int>()
        itr.foreachRemaining { result.add(it) }
        expect(result).toBeEmpty()
    }

    @Test
    fun add_to_list__itr_with_two_elements_one_consumed__returns_list_with_one_element() {
        val itr = listOf(1, 2).iterator()
        itr.next()
        val result = mutableListOf<Int>()
        itr.foreachRemaining { result.add(it) }
        expect(result).toContainExactly(2)
    }

    @Test
    fun add_to_list__itr_with_three_elements_one_consumed__returns_list_with_two_elements(){
        val itr = listOf(1, 2, 4).iterator()
        itr.next()
        val result = mutableListOf<Int>()
        itr.foreachRemaining { result.add(it) }
        expect(result).toContainExactly(2, 4)
    }
}
