package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.test.Test

class PeekingIteratorTest {
    @Test
    fun empty_list() {
        expectGrouped {
            val emptyItr = listOf<Int>().iterator().toPeekingIterator()
            expect(emptyItr) {
                feature("peek") { { peek() } }.toThrow<NoSuchElementException>()
                feature("next") { { next() } }.toThrow<NoSuchElementException>()
                notToHaveNext()
            }
        }
    }

    @Test
    fun list_with_one_element() {
        val obj = listOf('h', 'e', 'l', 'l', 'o')
        val itr = listOf(obj).iterator().toPeekingIterator()

        expect(itr) {
            feature { f(it::peek) }.toBeTheInstance(obj)
            because("also calling it a second time should return the same object") {
                feature { f(it::peek) }.toBeTheInstance(obj)
            }
            toHaveNext()
        }
        //TODO merge with above once atrium bug https://github.com/robstoll/atrium/issues/1767 is fixed
        expect(itr) {
            feature { f(it::next) }.toBeTheInstance(obj)
            notToHaveNext()
            feature("peek") { { peek() } }.toThrow<NoSuchElementException>()
        }
    }

    @Test
    fun list_with_three_elements() {
        val first = object : Any() {}
        val second = object : Any() {}
        val third = object : Any() {}
        val itr = listOf(first, second, third).iterator().toPeekingIterator()
        expect(itr) {
            feature { f(it::next) }.toBeTheInstance(first)
            feature { f(it::peek) }.toBeTheInstance(second)
            feature { f(it::peek) }.toBeTheInstance(second)
            feature { f(it::next) }.toBeTheInstance(second)
            toHaveNext()
            feature { f(it::peek) }.toBeTheInstance(third)
            toHaveNext()
        }
        //TODO merge with above once atrium bug https://github.com/robstoll/atrium/issues/1767 is fixed
        expect(itr) {
            feature { f(it::next) }.toBeTheInstance(third)
            notToHaveNext()
            feature("peek") { { peek() } }.toThrow<NoSuchElementException>()
        }
    }
}
