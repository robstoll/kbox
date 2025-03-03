package ch.tutteli.kbox

fun expectString(arg1: String, vararg rest: String) = arg1 glue rest
fun expectBoolean(arg1: Boolean, vararg rest: Boolean) = arg1 glue rest
fun expectByte(arg1: Byte, vararg rest: Byte) = arg1 glue rest
fun expectChar(arg1: Char, vararg rest: Char) = arg1 glue rest
fun expectShort(arg1: Short, vararg rest: Short) = arg1 glue rest
fun expectInt(arg1: Int, vararg rest: Int) = arg1 glue rest
fun expectLong(arg1: Long, vararg rest: Long) = arg1 glue rest
fun expectFloat(arg1: Float, vararg rest: Float) = arg1 glue rest
fun expectDouble(arg1: Double, vararg rest: Double) = arg1 glue rest
