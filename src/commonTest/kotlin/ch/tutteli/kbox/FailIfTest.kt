package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.messageToContain
import ch.tutteli.atrium.api.fluent.en_GB.notToThrow
import ch.tutteli.atrium.api.fluent.en_GB.toThrow
import ch.tutteli.kbox.atrium.expect
import kotlin.test.Test

class FailIfTest {
    @Test
    fun it_throws_an_IllegalStateException_if_predicate_is_true() {
        expect {
            failIf(true) { "my message" }
        }.toThrow<IllegalStateException> { messageToContain("my message") }
    }

    @Test
    fun it_does_not_throw_if_predicate_holds() {
        expect {
            failIf(false) { throw UnsupportedOperationException("bla") }
        }.notToThrow()
    }
}

