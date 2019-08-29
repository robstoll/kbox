package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.isSameAs
import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.api.cc.en_GB.toThrow
import ch.tutteli.kbox.atrium.assert
import ch.tutteli.kbox.atrium.expect
import org.spekframework.spek2.Spek
import org.spekframework.spek2.lifecycle.CachingMode
import org.spekframework.spek2.style.specification.describe

object PeekingIteratorSpec : Spek({

    describe("empty list") {
        val emptyItr = listOf<Int>().iterator().toPeekingIterator()
        describe("fun peek") {
            it("throws an NoSuchElementException") {
                expect {
                    emptyItr.peek()
                }.toThrow<NoSuchElementException> {}
            }
        }
        describe("fun next") {
            it("throws an NoSuchElementException") {
                expect {
                    emptyItr.next()
                }.toThrow<NoSuchElementException> {}
            }
        }
        describe("fun hasNext") {
            it("returns false") {
                assert(emptyItr.hasNext()).toBe(false)
            }
        }
    }

    describe("list with one element") {
        describe("fun peek") {

            context("calling peek for the first time") {
                val obj by memoized(CachingMode.SCOPE) { object : Any() {} }
                val itr by memoized(CachingMode.SCOPE) { listOf(obj).iterator().toPeekingIterator() }
                lateinit var result: Any
                it("returns the element") {
                    result = itr.peek()
                    assert(result).isSameAs(obj)
                }
                it("calling it a second time still returns the same element") {
                    val result2 = itr.peek()
                    assert(result2).isSameAs(obj)
                }
                it("calling hasNext returns true") {
                    assert(itr.hasNext()).toBe(true)
                }
                it("calling next returns the same element") {
                    assert(itr.next()).isSameAs(obj)
                }
                it("calling then hasNext returns false") {
                    assert(itr.hasNext()).toBe(false)
                }
            }
        }
    }

    describe("list with three elements") {
        describe("fun peek") {

            context("calling next") {
                val first by memoized(CachingMode.SCOPE) { object : Any() {} }
                val second by memoized(CachingMode.SCOPE) { object : Any() {} }
                val third by memoized(CachingMode.SCOPE) { object : Any() {} }
                val itr by memoized(CachingMode.SCOPE) { listOf(first, second, third).iterator().toPeekingIterator() }

                it("it returns the first element") {
                    assert(itr.next()).isSameAs(first)
                }
                it("calling peek returns the second element") {
                    assert(itr.peek()).isSameAs(second)
                }
                it("calling it peek again still returns the second element") {
                    assert(itr.peek()).isSameAs(second)
                }
                it("calling next returns the second element") {
                    assert(itr.next()).isSameAs(second)
                }
                it("calling hasNext returns true") {
                    assert(itr.hasNext()).toBe(true)
                }
                it("calling peek returns the third element") {
                    assert(itr.peek()).isSameAs(third)
                }

                it("calling next returns the third element") {
                    assert(itr.next()).isSameAs(third)
                }
                it("calling then hasNext returns false") {
                    assert(itr.hasNext()).toBe(false)
                }
                it("calling peek throws an NoSuchElementException") {
                    expect {
                        itr.peek()
                    }.toThrow<NoSuchElementException> {}
                }
            }
        }
    }
})
