<!-- for main -->
<!--
[![Download](https://img.shields.io/badge/Download-1.1.0-%23007ec6)](https://search.maven.org/artifact/ch.tutteli.kbox/kbox/1.1.0/jar)
[![Apache license](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)](http://opensource.org/licenses/Apache2.0)
[![Build Status Ubuntu](https://github.com/robstoll/kbox/workflows/Ubuntu/badge.svg?event=push)](https://github.com/robstoll/kbox/actions?query=workflow%3AUbuntu+branch%3Amain)
[![Build Status Windows](https://github.com/robstoll/kbox/workflows/Windows/badge.svg?event=push)](https://github.com/robstoll/kbox/actions?query=workflow%3AWindows+branch%3Amain)
[![SonarCloud Status](https://sonarcloud.io/api/project_badges/measure?project=robstoll_kbox&metric=alert_status)](https://sonarcloud.io/dashboard?id=robstoll_kbox)
-->

<!-- for a specific release -->

[![Download](https://img.shields.io/badge/Download-1.1.0-%23007ec6)](https://search.maven.org/artifact/ch.tutteli.kbox/kbox/1.1.0/jar)
[![Apache license](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)](http://opensource.org/licenses/Apache2.0)


# KBox
KBox is a very small but useful utility library for Kotlin (JVM, Android and JS) providing functions which are missing
in the stdlib such as:
- failIf
- takeIf
- blankToNull
- isNotNullAndNotEmpty
- identity

and more, see the [Documentation](#documentation) for a full list.

# Installation

KBox is published to maven central.

```
repositories { mavenCentral() }
dependencies {
    implementation("ch.tutteli.kbox:kbox:1.1.0")
}
```

# Documentation

Visit [https://robstoll.github.io/kbox/kdoc](https://robstoll.github.io/kbox/kdoc/).


# License
KBox is licensed under [Apache 2.0](http://opensource.org/licenses/Apache2.0).
