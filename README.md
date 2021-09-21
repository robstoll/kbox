<!-- for master -->

[![Download](https://img.shields.io/badge/Download-0.15.1-%23007ec6)](https://search.maven.org/artifact/ch.tutteli.kbox/kbox/0.15.1/jar)
[![Apache license](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)](http://opensource.org/licenses/Apache2.0)
[![Build Status Ubuntu](https://github.com/robstoll/kbox/workflows/Ubuntu/badge.svg?event=push)](https://github.com/robstoll/kbox/actions?query=workflow%3AUbuntu+branch%3Amaster)
[![Build Status Windows](https://github.com/robstoll/kbox/workflows/Windows/badge.svg?event=push)](https://github.com/robstoll/kbox/actions?query=workflow%3AWindows+branch%3Amaster)
[![SonarCloud Status](https://sonarcloud.io/api/project_badges/measure?project=robstoll_kbox&metric=alert_status)](https://sonarcloud.io/dashboard?id=robstoll_kbox)


<!-- for a specific release -->
<!--
[![Download](https://img.shields.io/badge/Download-0.15.1-%23007ec6)](https://search.maven.org/artifact/ch.tutteli.kbox/kbox/0.15.1/jar)
[![Apache license](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)](http://opensource.org/licenses/Apache2.0)
-->

# KBox
KBox is a very small but useful utility library for Kotlin (JVM, Android and JS).

Current extension functions:
- [`Array/List/Iterable/Sequence.appendtoStringBuilder`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/appendToString.kt#L37)
    with the ability to define a different separator for the last separation
    => handy if you want to form sentences like `a, b and c`

- [`CharSequence.blankToNull`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/blanktoNull.kt#L7)
  returns the same `CharSequence` if not blank, `null` otherwise

- [`forEachIn(Array/Iterable/Sequence<E>, Array/Iterable/Sequence<E>, ..., action: (E) -> Unit)`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/forEachIn.kt#L6)
  applies the given action to each entry in the given `Iterable`s.
    
- [`<E> forElementAndEachIn(E, Array/Iterable/Sequence<E>, action: (E) -> Unit)`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/forThisAndForEach.kt#L6)
  applies the given action to `this` and each entry in Iterable

- [`Iterable<T>.forEachRemaining()`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/forEachRemaining.kt#L9)
  shortcut for `while(hasNext()) yourLambda(next())`

- [Array/List.ifWithinBound](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/ifWithinBound.kt#L13)
  shortcut for `if(index < size){ thenBlock() } else { elseBlock() }` 

- [CharSequence?.isNotNullAndNotEmpty/isNotNullAndNotBlank](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/isNotNullAndNot.kt#L6)  
  
- [`Array/List/Iterable/Sequence.joinToString`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/joinToString.kt#L31)
  with the ability to define a different separator for the last separation
  => handy if you want to form sentences like `a, b and c`

- [`Map<T, T>.mapParents`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/mapParents.kt#L13) 
  maps child-parent relations.

- [`Iterator<T>.mapRemaining/mapRemainingWithCounter`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/mapRemaining.kt#L9) 
  maps remaining entries with the help of a transform function (where `mapRemainingWithCounter` passes a counter variable to the transform function).  
  
- [`Array/Iterable/Sequence.mapWithIndex`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/mapWithIndex.kt#L11)
    
- [`Iterator.toPeekingIterator()`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/PeekingIteratorUnsynchronized.kt)
  which allows to have a look what the next element is without consuming it.
  
- [`varargsToList/glue`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/varargToList.kt#L11)
  creates a `List` out of a single `E` and an `Array<E>`.

Moreover, the following function might come in handy for you as well:
- [identity](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/identity.kt)

# Installation

KBox is published to maven central.

```
repositories { mavenCentral() }
dependencies {
    implementation("ch.tutteli.kbox:kbox-jvm:0.15.1")
}
```

Accordingly, you can use `kbox-js` as artifactId instead of `kbox-jvm`
(or simply `kbox` in case of a MPP project in commonMain).

# Documentation

Visit [https://robstoll.github.io/kbox/kdoc](https://robstoll.github.io/kbox/kdoc/).


# License
KBox is licensed under [Apache 2.0](http://opensource.org/licenses/Apache2.0).
