package ch.tutteli.atrium

import ch.tutteli.atrium.creating.Assert
import ch.tutteli.atrium.reporting.translating.StringBasedTranslatable
import ch.tutteli.atrium.AssertionVerb.ASSERT
import ch.tutteli.atrium.AssertionVerb.EXPECT_THROWN
import ch.tutteli.atrium.domain.builders.AssertImpl
import ch.tutteli.atrium.reporting.reporter

internal fun <T : Any> assert(subject: T)
    = AssertImpl.coreFactory.newReportingPlant(ASSERT, { subject }, reporter)

internal fun <T : Any> assert(subject: T, createAssertions: Assert<T>.() -> Unit)
    = AssertImpl.coreFactory.newReportingPlantAndAddAssertionsCreatedBy(ASSERT, { subject }, reporter, createAssertions)

internal fun <T : Any?> assert(subject: T)
    = AssertImpl.coreFactory.newReportingPlantNullable(ASSERT, { subject }, reporter)

internal fun expect(act: () -> Unit)
    = AssertImpl.throwable.thrownBuilder(EXPECT_THROWN, act, reporter)


internal enum class AssertionVerb(override val value: String) : StringBasedTranslatable {
    ASSERT("assert"),
    EXPECT_THROWN("expect the thrown exception"),
}

object VerbSpec : ch.tutteli.atrium.spec.verbs.VerbSpec(
    "assert" to { subject -> assert(subject) },
    "assert" to { subject, createAssertions -> assert(subject, createAssertions) },
    "assert" to { subject -> assert(subject) },
    "expect" to { act -> expect { act() } })
