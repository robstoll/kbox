package ch.tutteli.kbox.atrium

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.logic._logic
import ch.tutteli.atrium.logic.creating.RootExpectBuilder
import ch.tutteli.atrium.reporting.translating.StringBasedTranslatable
import ch.tutteli.kbox.atrium.AssertionVerb.ASSERT

internal fun <T> expect(subject: T): Expect<T> =
    RootExpectBuilder.forSubject(subject)
        .withVerb(ASSERT)
        .withoutOptions()
        .build()

internal fun <T : Any> expect(subject: T, createAssertions: Expect<T>.() -> Unit) =
    expect(subject)._logic.appendAsGroup(createAssertions)

internal enum class AssertionVerb(override val value: String) : StringBasedTranslatable {
    ASSERT("assert"),
}
