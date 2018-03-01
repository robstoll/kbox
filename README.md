[![Download](https://api.bintray.com/packages/robstoll/tutteli-jars/kbox/images/download.svg) ](https://bintray.com/robstoll/tutteli-jars/kbox/_latestVersion)
[![Apache license](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)](http://opensource.org/licenses/Apache2.0)
[![Build Status](https://travis-ci.org/robstoll/kbox.svg?branch=v0.3.0)](https://travis-ci.org/robstoll/kbox)
[![Coverage](https://codecov.io/github/robstoll/kbox/coverage.svg?branch=v0.3.0)](https://codecov.io/github/robstoll/kbox?branch=v0.3.0)

# KBox
KBox is a very small utility library for Kotlin

Current extension functions:
- [`Array/List.joinToString`](https://github.com/robstoll/kbox/blob/master/src/main/kotlin/ch/tutteli/kbox/ListExtensions.kt#L13)
  with the ability to define a different separator for the last separation
  => handy if you want to form sentences like `a, b and c`
- [`Iterator.toPeekingIterator()`](https://github.com/robstoll/kbox/blob/master/src/main/kotlin/ch/tutteli/kbox/IteratorExtensions.kt#L3)
  which allows to have a look what the next element is without consuming it.
  

# License
KBox is published under [Apache 2.0](http://opensource.org/licenses/Apache2.0). 
    