package org.spekframework.spek2

interface Root

@Suppress("UnnecessaryAbstractClass")
abstract class Spek(val root: Root.() -> Unit)
