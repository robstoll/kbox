package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.isSameAs
import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.api.cc.en_GB.toThrow
import ch.tutteli.atrium.assert
import ch.tutteli.atrium.expect
import org.spekframework.spek2.Spek
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
                val obj by memoized { object : Any() {} }
                lateinit var itr: PeekingIterator<Any>
                lateinit var result: Any
                beforeEachTest {
                    itr = listOf(obj).iterator().toPeekingIterator()
                    result = itr.peek()
                }
                it("it returns the element") {
                    assert(result).isSameAs(obj)
                }
                context("calling it a second time") {
                    lateinit var result2: Any
                    beforeEachTest {
                        result2 = itr.peek()
                    }
                    it("still returns the same element") {
                        assert(result2).isSameAs(obj)
                    }
                    it("calling hasNext returns true") {
                        assert(itr.hasNext()).toBe(true)
                    }
                    context("calling next") {
                        lateinit var result3: Any
                        beforeEachTest {
                            result3 = itr.next()
                        }
                        it("returns the same element") {
                            assert(result3).isSameAs(obj)
                        }
                        it("calling then hasNext returns false") {
                            assert(itr.hasNext()).toBe(false)
                        }
                    }
                }
            }
        }
    }

    describe("list with three elements") {
        describe("fun peek") {

            context("calling next") {
                val first by memoized { object : Any() {} }
                val second by memoized { object : Any() {} }
                val third by memoized { object : Any() {} }
                lateinit var itr: PeekingIterator<Any>
                lateinit var result: Any
                beforeEachTest {
                    itr = listOf(first, second, third).iterator().toPeekingIterator()
                    result = itr.next()
                }
                it("it returns the first element") {
                    assert(result).isSameAs(first)
                }
                context("calling peek ") {
                    lateinit var result2: Any
                    beforeEachTest {
                        result2 = itr.peek()
                    }
                    it("returns the second element") {
                        assert(result2).isSameAs(second)
                    }
                    context("calling it a second time") {
                        lateinit var result3: Any
                        beforeEachTest {
                            result3 = itr.peek()
                        }
                        it("still returns the second element") {
                            assert(result3).isSameAs(second)
                        }
                        context("calling next") {
                            lateinit var result4: Any
                            beforeEachTest {
                                result4 = itr.next()
                            }
                            it("returns the second element") {
                                assert(result4).isSameAs(second)
                            }
                            it("calling hasNext returns true") {
                                assert(itr.hasNext()).toBe(true)
                            }
                            context("calling peek") {
                                lateinit var result5: Any
                                beforeEachTest {
                                    result5 = itr.peek()
                                }
                                it("returns the third element") {
                                    assert(result5).isSameAs(third)
                                }
                                context("calling next") {
                                    lateinit var result6: Any
                                    beforeEachTest {
                                        result6 = itr.next()
                                    }
                                    it("returns the third element") {
                                        assert(result6).isSameAs(third)
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
                    }
                }
            }
        }
    }
})
