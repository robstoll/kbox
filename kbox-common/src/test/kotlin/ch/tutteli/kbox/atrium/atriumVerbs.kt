@file:Suppress("MatchingDeclarationName")
package ch.tutteli.kbox.atrium

import ch.tutteli.atrium.creating.Assert
import ch.tutteli.atrium.reporting.translating.StringBasedTranslatable
import ch.tutteli.kbox.atrium.AssertionVerb.ASSERT
import ch.tutteli.kbox.atrium.AssertionVerb.EXPECT_THROWN
import ch.tutteli.atrium.core.newReportingPlantNullable
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
