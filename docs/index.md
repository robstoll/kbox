[![Download](https://img.shields.io/badge/Download-0.15.1-%23007ec6)](https://search.maven.org/artifact/ch.tutteli.kbox/kbox/0.15.1/jar)
[![Apache license](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)](http://opensource.org/licenses/Apache2.0)

# KBox
KBox is a very small but useful utility library for Kotlin (JVM, Android and JS).

# Installation

KBox is published to maven central.

```
repositories { mavenCentral() }
dependencies {
    implementation("ch.tutteli.kbox:kbox:0.15.1")
}
```

Accordingly, you can use `kbox-js` as artifactId instead of `kbox-jvm`
(or simply `kbox` in case of a MPP project in commonMain).

# Documentation

Visit [kdoc/](https://robstoll.github.io/kbox/kdoc/)

# License
KBox is licensed under [Apache 2.0](http://opensource.org/licenses/Apache2.0).
