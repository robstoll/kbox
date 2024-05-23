package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.toBeTheInstance
import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.fluent.en_GB.toThrow
import ch.tutteli.atrium.api.verbs.expect
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
                }.toThrow<NoSuchElementException>()
            }
        }
        describe("fun next") {
            it("throws an NoSuchElementException") {
                expect {
                    emptyItr.next()
                }.toThrow<NoSuchElementException>()
            }
        }
        describe("fun hasNext") {
            it("returns false") {
                expect(emptyItr.hasNext()).toEqual(false)
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
                    expect(result).toBeTheInstance(obj)
                }
                it("calling it a second time still returns the same element") {
                    val result2 = itr.peek()
                    expect(result2).toBeTheInstance(obj)
                }
                it("calling hasNext returns true") {
                    expect(itr.hasNext()).toEqual(true)
                }
                it("calling next returns the same element") {
                    expect(itr.next()).toBeTheInstance(obj)
                }
                it("calling then hasNext returns false") {
                    expect(itr.hasNext()).toEqual(false)
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
                    expect(itr.next()).toBeTheInstance(first)
                }
                it("calling peek returns the second element") {
                    expect(itr.peek()).toBeTheInstance(second)
                }
                it("calling it peek again still returns the second element") {
                    expect(itr.peek()).toBeTheInstance(second)
                }
                it("calling next returns the second element") {
                    expect(itr.next()).toBeTheInstance(second)
                }
                it("calling hasNext returns true") {
                    expect(itr.hasNext()).toEqual(true)
                }
                it("calling peek returns the third element") {
                    expect(itr.peek()).toBeTheInstance(third)
                }

                it("calling next returns the third element") {
                    expect(itr.next()).toBeTheInstance(third)
                }
                it("calling then hasNext returns false") {
                    expect(itr.hasNext()).toEqual(false)
                }
                it("calling peek throws an NoSuchElementException") {
                    expect {
                        itr.peek()
                    }.toThrow<NoSuchElementException>()
                }
            }
        }
    }
})
