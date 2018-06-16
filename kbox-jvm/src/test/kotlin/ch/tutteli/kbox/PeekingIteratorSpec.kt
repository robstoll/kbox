package ch.tutteli.kbox


import ch.tutteli.atrium.api.cc.en_GB.isSameAs
import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.api.cc.en_GB.toThrow
import ch.tutteli.atrium.assert
import ch.tutteli.atrium.expect
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it

object PeekingIteratorSpec : Spek({

    given("empty list") {
        val emptyItr = listOf<Int>().iterator().toPeekingIterator()
        describe("fun peek") {
            it("throws an NoSuchElementException") {
                expect {
                    emptyItr.peek()
                }.toThrow<NoSuchElementException>{}
            }
        }
        describe("fun next") {
            it("throws an NoSuchElementException") {
                expect {
                    emptyItr.next()
                }.toThrow<NoSuchElementException>{}
            }
        }
        describe("fun hasNext") {
            it("returns false") {
                assert(emptyItr.hasNext()).toBe(false)
            }
        }
    }

    given("list with one element") {
        describe("fun peek") {

            action("calling peek for the first time") {
                val obj = object : Any() {}
                val itr = listOf(obj).iterator().toPeekingIterator()
                val result = itr.peek()
                it("returns the element") {
                    assert(result).isSameAs(obj)
                }
                test("calling it a second time still returns the same element") {
                    val result2 = itr.peek()
                    assert(result2).isSameAs(obj)
                }

                test("calling hasNext returns true") {
                    assert(itr.hasNext()).toBe(true)
                }
                test("calling next returns the same element") {
                    assert(itr.next()).isSameAs(obj)
                }
                test("calling then hasNext returns false") {
                    assert(itr.hasNext()).toBe(false)
                }
            }
        }
    }

    given("list with three elements") {
        describe("fun peek") {

            action("calling next") {
                val first = object : Any() {}
                val second = object : Any() {}
                val third = object : Any() {}
                val itr = listOf(first, second, third).iterator().toPeekingIterator()
                val result = itr.next()
                it("returns the first element") {
                    assert(result).isSameAs(first)
                }
                test("calling peek returns the second element") {
                    val result2 = itr.peek()
                    assert(result2).isSameAs(second)
                }
                test("calling peek a second time still returns the second element") {
                    val result2 = itr.peek()
                    assert(result2).isSameAs(second)
                }
                test("calling next returns the second element") {
                    assert(itr.next()).isSameAs(second)
                }

                test("calling peek returns the third element") {
                    val result2 = itr.peek()
                    assert(result2).isSameAs(third)
                }
                test("calling hasNext returns true") {
                    assert(itr.hasNext()).toBe(true)
                }
                test("calling next returns the third element") {
                    assert(itr.next()).isSameAs(third)
                }
                test("calling then hasNext returns false") {
                    assert(itr.hasNext()).toBe(false)
                }
                test("calling peek throws an NoSuchElementException") {
                    expect {
                        itr.peek()
                    }.toThrow<NoSuchElementException>{}
                }
            }
        }
    }
})
