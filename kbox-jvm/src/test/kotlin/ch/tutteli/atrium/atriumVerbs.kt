package ch.tutteli.atrium

import ch.tutteli.atrium.assertions.throwable.thrown.builders.ThrowableThrownBuilder
import ch.tutteli.atrium.creating.Assert
import ch.tutteli.atrium.reporting.ReporterBuilder
import ch.tutteli.atrium.reporting.translating.StringBasedTranslatable
import ch.tutteli.atrium.AssertionVerb.ASSERT
import ch.tutteli.atrium.AssertionVerb.EXPECT_THROWN

internal fun <T : Any> assert(subject: T)
    = AtriumFactory.newReportingPlant(ASSERT, subject, AtriumReporterSupplier.REPORTER)

internal fun <T : Any> assert(subject: T, createAssertions: Assert<T>.() -> Unit)
    = AtriumFactory.newReportingPlantAndAddAssertionsCreatedBy(ASSERT, subject, AtriumReporterSupplier.REPORTER, createAssertions)

internal fun <T : Any?> assert(subject: T)
    = AtriumFactory.newReportingPlantNullable(ASSERT, subject, AtriumReporterSupplier.REPORTER)

internal fun expect(act: () -> Unit)
    = ThrowableThrownBuilder(EXPECT_THROWN, act, AtriumReporterSupplier.REPORTER)


internal enum class AssertionVerb(override val value: String) : StringBasedTranslatable {
    ASSERT("assert"),
    EXPECT_THROWN("expect the thrown exception"),
}

internal object AtriumReporterSupplier {
    val REPORTER by lazy {
        ReporterBuilder
            .withoutTranslations()
            .withDetailedObjectFormatter()
            .withDefaultAssertionFormatterController()
            .withDefaultAssertionFormatterFacade()
            .withTextSameLineAssertionPairFormatter()
            .withDefaultTextCapabilities()
            .buildOnlyFailureReporter()
    }
}

object VerbSpec : ch.tutteli.atrium.spec.verbs.VerbSpec(
    "assert" to { subject -> assert(subject) },
    "assert" to { subject, createAssertions -> assert(subject, createAssertions) },
    "assert" to { subject -> assert(subject) },
    "expect" to { act -> expect { act() } })
