import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    id("ch.tutteli.gradle.plugins.junitjacoco")
}

// adjust because we use com.github.vlsi.gradle-extensions which prints tests differently, otherwise we print
// the failed tests twice.
tasks.withType<Test>().configureEach {
    testLogging {
        // Empty enum throws "Collection is empty", so we use Iterable method
        setEvents((events - TestLogEvent.FAILED) as Iterable<TestLogEvent>)
        showStackTraces = false
    }
}
