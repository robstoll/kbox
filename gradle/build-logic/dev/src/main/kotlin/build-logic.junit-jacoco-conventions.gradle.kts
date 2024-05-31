plugins {
    id("ch.tutteli.gradle.plugins.junitjacoco")
}

dependencies {
    // used to run the samples
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
}
