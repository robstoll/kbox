[![Download](https://api.bintray.com/packages/robstoll/tutteli-jars/kbox/images/download.svg) ](https://bintray.com/robstoll/tutteli-jars/kbox/_latestVersion)
[![Apache license](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)](http://opensource.org/licenses/Apache2.0)
[![Build Status](https://travis-ci.org/robstoll/kbox.svg?tag=master.0)](https://travis-ci.org/robstoll/kbox)
[![Coverage](https://codecov.io/github/robstoll/kbox/coverage.svg?tag=master)](https://codecov.io/github/robstoll/kbox?tag=master)

# KBox
KBox is a very small but useful utility library for Kotlin (JVM and JS).

Current extension functions:
- [`Array/List/Iterable.appendtoStringBuilder`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/appendToString.kt#L37)
    with the ability to define a different separator for the last separation
    => handy if you want to form sentences like `a, b and c`

- [`forEachIn(Array/Iterable/Sequence<E>, Array/Iterable/Sequence<E>, ..., action: (E) -> Unit)`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/forEachIn.kt#L6)
  applies the given action to each entry in the given Iterables.
    
- [`E.forThisAndEachIn(Iterable/Sequence<E>, action: (E) -> Unit)`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/forThisAndForEach.kt#L6)
  applies the given action to `this` and each entry in Iterable

- [Array/List.ifWithingBound](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/ifWithinBound.kt#L13)
  shortcut for `if(index < size){ thenBlock() } else { elseBlock() }` 
  
- [`Array/List/Iterable.joinToString`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/joinToString.kt#L31)
  with the ability to define a different separator for the last separation
  => handy if you want to form sentences like `a, b and c`

- [`Map<T, T>.mapParents`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/mapParents.kt#L13) 
  maps child-parent relations.

- [`Iterator<T>.mapRemaining(WithCounter)`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/mapRemaining.kt#L9) 
  maps remaining entries with the help of a transform function (where `mapRemainingWithCounter` passes a counter variable to the transform function).  
  
- [`Array/Iterable/Sequence.mapWithIndex`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/mapWithIndex.kt#L11)
    
- [`Iterator.toPeekingIterator()`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/PeekingIteratorUnsynchronized.kt)
  which allows to have a look what the next element is without consuming it.
  
- [`varargsToList/glue`](https://github.com/robstoll/kbox/tree/master/kbox-common/src/main/kotlin/ch/tutteli/kbox/varargToList.kt#L11)
  creates a `List` out of a single `E` and an `Array<E>`.
  

# License
KBox is published under [Apache 2.0](http://opensource.org/licenses/Apache2.0).