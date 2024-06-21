<!-- for main -->

[![Download](https://img.shields.io/badge/Download-2.1.0-%23007ec6)](https://central.sonatype.com/artifact/ch.tutteli.kbox/kbox/2.1.0)
[![Apache license](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)](http://opensource.org/licenses/Apache2.0)
[![Build Status Ubuntu](https://github.com/robstoll/kbox/workflows/Ubuntu/badge.svg?event=push)](https://github.com/robstoll/kbox/actions?query=workflow%3AUbuntu+branch%3Amain)
[![Build Status Windows](https://github.com/robstoll/kbox/workflows/Windows/badge.svg?event=push)](https://github.com/robstoll/kbox/actions?query=workflow%3AWindows+branch%3Amain)


<!-- for a specific release -->
<!--
[![Download](https://img.shields.io/badge/Download-2.1.0-%23007ec6)](https://central.sonatype.com/artifact/ch.tutteli.kbox/kbox/2.1.0)
[![Apache license](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)](http://opensource.org/licenses/Apache2.0)
-->

# KBox
KBox is a very small but useful utility library for Kotlin (JVM, Android and JS) providing functions which are missing
in the stdlib such as:
- failIf
- takeIf
- blankToNull
- isNotNullAndNotEmpty
- identity
- Tuple4 - Tuple9 (including map, append, glue)
- Pair.mapFirst/Second

and more, see the [Documentation](https://robstoll.github.io/kbox/kdoc/) for a full list.

# Installation

KBox is published to maven central.

```
repositories { mavenCentral() }
dependencies {
    implementation("ch.tutteli.kbox:kbox:2.1.0")
}
```

# Documentation

Visit [https://robstoll.github.io/kbox/kdoc](https://robstoll.github.io/kbox/kdoc/).


# License
KBox is licensed under [Apache 2.0](http://opensource.org/licenses/Apache2.0).
