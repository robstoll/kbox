package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.toEqual
import ch.tutteli.atrium.api.verbs.expect
import kotlin.test.Test

class TakeIfTest {

    @Test
    fun `it_returns_null_if_predicate_doesnt_hold`() {
        expect(
            takeIf<Int>(false) { throw IllegalArgumentException("bla") }
        ).toEqual(null)
    }

    @Test
    fun it_returns_lambda_result_if_predicate_holds() {
        expect(takeIf(true) { 1 }).toEqual(1)
    }
}
