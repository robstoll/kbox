[![Download](https://api.bintray.com/packages/robstoll/tutteli-jars/kbox/images/download.svg) ](https://bintray.com/robstoll/tutteli-jars/kbox/_latestVersion)
[![Apache license](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)](http://opensource.org/licenses/Apache2.0)
[![Build Status Travis](https://travis-ci.org/robstoll/kbox.svg?branch=v0.13.0)](https://travis-ci.org/robstoll/kbox)
[![Build status GitHub Actions](https://github.com/robstoll/kbox/workflows/Windows/badge.svg)](https://github.com/robstoll/kbox/actions/)
[![SonarCloud Status](https://sonarcloud.io/api/project_badges/measure?project=robstoll_kbox&metric=alert_status)](https://sonarcloud.io/dashboard?id=robstoll_kbox)


# KBox
KBox is a very small but useful utility library for Kotlin (JVM, Android and JS).

Current extension functions:
- [`Array/List/Iterable/Sequence.appendtoStringBuilder`](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/appendToString.kt#L37)
    with the ability to define a different separator for the last separation
    => handy if you want to form sentences like `a, b and c`

- [`CharSequence.blankToNull`](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/blanktoNull.kt#L7)
  returns the same `CharSequence` if not blank, `null` otherwise

- [`forEachIn(Array/Iterable/Sequence<E>, Array/Iterable/Sequence<E>, ..., action: (E) -> Unit)`](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/forEachIn.kt#L6)
  applies the given action to each entry in the given `Iterable`s.
    
- [`<E> forElementAndEachIn(E, Array/Iterable/Sequence<E>, action: (E) -> Unit)`](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/forThisAndForEach.kt#L6)
  applies the given action to `this` and each entry in Iterable

- [`Iterable<T>.forEachRemaining()`](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/forEachRemaining.kt#L9)
  shortcut for `while(hasNext()) yourLambda(next())`

- [Array/List.ifWithinBound](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/ifWithinBound.kt#L13)
  shortcut for `if(index < size){ thenBlock() } else { elseBlock() }` 

- [Charsequence?.isNotNullAndNotEmpty/isNotNullAndNotBlank](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/isNotNullAndNot.kt#L6)  
  
- [`Array/List/Iterable/Sequence.joinToString`](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/joinToString.kt#L31)
  with the ability to define a different separator for the last separation
  => handy if you want to form sentences like `a, b and c`

- [`Map<T, T>.mapParents`](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/mapParents.kt#L13) 
  maps child-parent relations.

- [`Iterator<T>.mapRemaining/mapRemainingWithCounter`](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/mapRemaining.kt#L9) 
  maps remaining entries with the help of a transform function (where `mapRemainingWithCounter` passes a counter variable to the transform function).  
  
- [`Array/Iterable/Sequence.mapWithIndex`](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/mapWithIndex.kt#L11)
    
- [`Iterator.toPeekingIterator()`](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/PeekingIteratorUnsynchronized.kt)
  which allows to have a look what the next element is without consuming it.
  
- [`varargsToList/glue`](https://github.com/robstoll/kbox/tree/v0.13.0/kbox-common/src/main/kotlin/ch/tutteli/kbox/varargToList.kt#L11)
  creates a `List` out of a single `E` and an `Array<E>`.

# Installation

KBox is pusblished to [bintray](https://bintray.com/robstoll/tutteli-jars/kbox) and jcenter. 
Following an example if you use gradle:

```
repositories { jcenter() }
dependencies {
    implementation 'ch.tutteli.kbox:kbox:0.13.0'
}
```

accordingly you can use `kbox-js` or `kbox-android` as artifactId instead of `kbox`.


# License
KBox is licensed under [Apache 2.0](http://opensource.org/licenses/Apache2.0).