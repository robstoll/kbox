[![Download](https://api.bintray.com/packages/robstoll/tutteli-jars/kbox/images/download.svg) ](https://bintray.com/robstoll/tutteli-jars/kbox/_latestVersion)
[![Apache license](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)](http://opensource.org/licenses/Apache2.0)
[![Build Status](https://travis-ci.org/robstoll/kbox.svg?tree=v0.5.0)](https://travis-ci.org/robstoll/kbox)
[![Coverage](https://codecov.io/github/robstoll/kbox/coverage.svg?tree=v0.5.0)](https://codecov.io/github/robstoll/kbox?tree=v0.5.0)

# KBox
KBox is a very small utility library for Kotlin

Current extension functions:
- [`Array/List/Iterable.appendtoStringBuilder`](https://github.com/robstoll/kbox/tree/v0.5.0/src/main/kotlin/ch/tutteli/kbox/appendToString.kt#L37)
    with the ability to define a different separator for the last separation
    => handy if you want to form sentences like `a, b and c`
    
- [`E.forThisAndEachIn(Iterable/Sequence<E>, action: (E) -> Unit)`](https://github.com/robstoll/kbox/tree/v0.5.0/src/main/kotlin/ch/tutteli/kbox/forThisAndForEach.kt#L6)
  applies the given action to `this` and all elements in Iterable
  
- [`Array/List/Iterable.joinToString`](https://github.com/robstoll/kbox/tree/v0.5.0/src/main/kotlin/ch/tutteli/kbox/joinToString.kt#L31)
  with the ability to define a different separator for the last separation
  => handy if you want to form sentences like `a, b and c`

- [`Map<T, T>.mapParents`](https://github.com/robstoll/kbox/tree/v0.5.0/src/main/kotlin/ch/tutteli/kbox/mapParents.kt#L13) 
  maps child-parent relations.
  
- [`Array/Iterable/Sequence.mapWithIndex`](https://github.com/robstoll/kbox/tree/v0.5.0/src/main/kotlin/ch/tutteli/kbox/mapWithIndex.kt#L11)
    
- [`Iterator.toPeekingIterator()`](https://github.com/robstoll/kbox/tree/v0.5.0/src/main/kotlin/ch/tutteli/kbox/PeekingIterator.kt)
  which allows to have a look what the next element is without consuming it.
  
- [`varargsToList/glue`](https://github.com/robstoll/kbox/tree/v0.5.0/src/main/kotlin/ch/tutteli/kbox/varargToList.kt#L11)
  creates a `List` out of a single `E` and an `Array<E>`.
  

# License
KBox is published under [Apache 2.0](http://opensource.org/licenses/Apache2.0). 
    