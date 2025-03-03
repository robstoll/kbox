import java.util.*

val generationFolder: ConfigurableFileCollection by rootProject.extra
val generationTestFolder: ConfigurableFileCollection by rootProject.extra

val packageName = "ch.tutteli.kbox"
val packageNameAsPath = packageName.replace('.', '/')

fun dontModifyNotice(place: String) =
    """
        |// --------------------------------------------------------------------------------------------------------------------
        |// automatically generated, don't modify here but in:
        |// $place
        |// --------------------------------------------------------------------------------------------------------------------
        |
    """.trimMargin()

val dontModifyNotice = dontModifyNotice("gradle/code-generation/src/main/kotlin/code-generation.generate.gradle.kts")

fun createStringBuilder(packageName: String): java.lang.StringBuilder = StringBuilder(dontModifyNotice)
    .append("package ").append(packageName).append("\n\n")

val numOfArgs = 9

fun getTupleName(numOfValues: Int) = when (numOfValues) {
    2 -> "Pair"
    3 -> "Triple"
    else -> "Tuple$numOfValues"
}

fun getArgName(numOfValues: Int, index: Int) = when (index) {
    1 -> if (numOfValues <= 3) "first" else "a$index"
    2 -> if (numOfValues <= 3) "second" else "a$index"
    3 -> if (numOfValues <= 3) "third" else "a$index"
    else -> "a$index"
}

fun withOrdinalIndicator(index: Int) = index.toString() + when (index) {
    1 -> "st"
    2 -> "nd"
    3 -> "rd"
    else -> "th"
}

val primitiveTypes = listOf(
    "Boolean" to "BooleanArray",
    "Byte" to "ByteArray",
    "Char" to "CharArray",
    "Short" to "ShortArray",
    "Int" to "IntArray",
    "Long" to "LongArray",
    "Float" to "FloatArray",
    "Double" to "DoubleArray"
)

val generate: TaskProvider<Task> = tasks.register("generate") {
    doFirst {
        val packageDir = File(generationFolder.asPath + "/" + packageNameAsPath)
        val tupleAppend = StringBuilder(dontModifyNotice)
            .append("@file:Suppress(\"MethodOverloading\")\n")
            .append("package ").append(packageName).append("\n\n")

        val tupleGlue = StringBuilder(dontModifyNotice)
            .append("@file:Suppress(\"MethodOverloading\")\n")
            .append("package ").append(packageName).append("\n\n")

        val tupleMap = createStringBuilder(packageName)

        val tupleFactory = StringBuilder(dontModifyNotice)
            .append("@file:Suppress(\"MethodOverloading\", \"FunctionName\")\n")
            .append("package ").append(packageName).append("\n\n")

        val tupleToList = createStringBuilder(packageName)
        val tupleToSequence = createStringBuilder(packageName)
        val tupleFlatten = createStringBuilder(packageName)
            .append("import kotlin.jvm.JvmName\n\n")

        val varargToList = StringBuilder(dontModifyNotice)
            .append("@file:Suppress(\"MethodOverloading\", \"FunctionName\")\n")
            .append("package ").append(packageName).append("\n\n")

        val toVararg = createStringBuilder(packageName)
            .append("import kotlin.jvm.JvmName\n\n")

        (2..numOfArgs).forEach { upperNumber ->
            val numbers = (1..upperNumber).toList()
            val typeArgs = numbers.joinToString(", ") { "A$it" }
            val typeArgsOut = numbers.joinToString(", ") { "out A$it" }
            val constructorProperties = numbers.joinToString(",\n    ") { "val a$it: A$it" }
            val parameters = numbers.joinToString(", ") { "a$it: A$it" }
            val arguments = numbers.joinToString(", ") { "a$it" }
            val tupleName = getTupleName(upperNumber)
            val tupleLike = createStringBuilder(packageName)
            val tuple = createStringBuilder(packageName)
            val properties = numbers.joinToString(", ") { getArgName(upperNumber, it) }

            tupleLike.append(
                """
                |/**
                | * Represents a tuple like data structure which has $upperNumber components.
                | *
                | * @since 2.1.0
                | */${if (upperNumber >= 9) "\n@Suppress(\"ComplexInterface\")" else ""}
                |interface Tuple${upperNumber}Like<$typeArgs> {
                |${
                    numbers.joinToString("\n") {
                        """
                          |    /**
                          |     * Returns the ${withOrdinalIndicator(it)} component of this Tuple${upperNumber}Like data structure.
                          |     *
                          |     * @since 2.1.0
                          |     */
                          |    operator fun component$it(): A$it
                          |
                      """.trimMargin()
                    }
                }
                |    /**
                |     * Turns this class into a [$tupleName].
                |     *
                |     * @since 2.1.0
                |     */
                |    fun toTuple(): $tupleName<$typeArgs> = $tupleName(
                |        ${numbers.joinToString(",\n        ") { "component$it()" }}
                |    )
                |}
                """.trimMargin()
            )
            tupleLike.appendLine()

            val tupleLikeFile = packageDir.resolve("Tuple${upperNumber}Like.kt")
            tupleLikeFile.writeText(tupleLike.toString())

            // we don't create a Tuple2, and Tuple3
            if (upperNumber >= 4) {
                tuple.append(
                    """
                    |/**
                    | * Represents a simple data structure to hold $upperNumber values.
                    | *
                    | * ${numbers.joinToString("\n * ") { "@param A$it The type of the ${withOrdinalIndicator(it)} component of this $tupleName." }}
                    | *
                    | * ${numbers.joinToString("\n * ") { "@param a$it the ${withOrdinalIndicator(it)} component of this $tupleName." }}
                    | *
                    | * @since 2.0.0
                    | */
                    |data class $tupleName<$typeArgsOut>(
                    |    $constructorProperties,
                    |)
                    """.trimMargin()
                )
                tuple.appendLine()

                val tupleFile = packageDir.resolve("Tuple$upperNumber.kt")
                tupleFile.writeText(tuple.toString())
            }

            tupleFactory.append(
                """
                |/**
                | * Factory method to create a [$tupleName].
                | *
                | * Alternative to `$tupleName(...)` with the advantage that you can add remove
                | * arguments without the need to change function name.
                | *
                | * @return the newly created [$tupleName]
                | *
                | * @since 2.1.0
                | */${if (upperNumber >= 6) "\n@Suppress(\"LongParameterList\")" else ""}
                |fun <$typeArgs> Tuple(
                |   $parameters
                |): $tupleName<$typeArgs> =
                |    $tupleName($arguments)
                """.trimMargin()
            ).appendLine().appendLine()

            val tAsTypeArgs = numbers.joinToString(", ") { "T" }

            if (upperNumber > 3) {
                tupleToList.append(
                    """
                    |/**
                    |* Converts this [$tupleName] into a [List].
                    |*
                    |* @since 3.0.0
                    |*/
                    |fun <T> $tupleName<$tAsTypeArgs>.toList(): List<T> =
                    |    listOf($properties)
                    |
                    """.trimMargin()
                ).appendLine()
            }


            tupleToSequence.append(
                """
                |/**
                |* Converts this [$tupleName] into a [Sequence].
                |*
                |* @since 3.0.0
                |*/
                |fun <T> $tupleName<$tAsTypeArgs>.toSequence(): Sequence<T> =
                |    sequenceOf($properties)
                |
                """.trimMargin()
            ).appendLine()

            tupleFlatten.append(
                //TODO remove with 4.0.0 only here to retain binary backward compatibility
                """
                |/**
                | * Flattens a [List] of [$tupleName]<${if (upperNumber > 2) "T, T, ..." else tAsTypeArgs}> into a `List<T>`.
                | *
                | * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
                | * are not all the same.
                | *
                | * @since 3.0.0
                | */
                |@JvmName("flatten$upperNumber")
                |fun <T> List<$tupleName<${tAsTypeArgs}>>.flatten(): List<T> =
                |    asSequence().flatten().toList()
                |
                |/**
                | * Flattens an [Iterable] of [$tupleName]<${if (upperNumber > 2) "T, T, ..." else tAsTypeArgs}> into a `List<T>`.
                | *
                | * Kotlin will automatically infer the least upper bound type in case your component types A1, A2, ...
                | * are not all the same.
                | *
                | * @since 3.1.0
                | */
                |@JvmName("flatten$upperNumber")
                |fun <T> Iterable<$tupleName<${tAsTypeArgs}>>.flatten(): List<T> =
                |    asSequence().flatten().toList()
                |
                |/**
                | * Flattens a [Sequence] of [$tupleName]<${if (upperNumber > 2) "T, T, ..." else tAsTypeArgs}> into a `Sequence<T>`.
                | *
                | * Kotlin will automatically infer the least upper bound type in case your component type A1, A2, ...
                | * are not all the same.
                | *
                | * @since 3.0.0
                | */
                |@JvmName("flatten$upperNumber")
                |fun <T> Sequence<$tupleName<$tAsTypeArgs>>.flatten(): Sequence<T> =
                |    flatMap { it.toSequence() }
                |
                """.trimMargin()
            ).appendLine()


            (1..numOfArgs - upperNumber).forEach { upperNumber2 ->
                val upperNumber3 = upperNumber + upperNumber2
                val numbers2 = (1..upperNumber2)
                val numbers3 = (1..upperNumber3)
                val typeArgs2 = numbers2.joinToString(", ") { "A${it + upperNumber}" }
                val typeArgs3 = numbers3.joinToString(", ") { "A$it" }

                val toTupleName = getTupleName(upperNumber3)
                val tupleNameParam = getTupleName(upperNumber2)
                val tupleNameParamLowercase = tupleNameParam.lowercase()

                val params = numbers2.joinToString(", ") { "a${it + upperNumber}: A${it + upperNumber}" }
                val args = numbers2.joinToString(", ") { "a${it + upperNumber}" }


                tupleAppend.append(
                    """
                    |/**
                    |* Transforms this [$tupleName] into a [$toTupleName] by appending the given arguments.
                    |*
                    |* @since 2.0.0
                    |*/${if (upperNumber2 >= 6) "\n@Suppress(\"LongParameterList\")" else ""}
                    |fun <$typeArgs3> $tupleName<$typeArgs>.append(
                    |    $params
                    |): $toTupleName<$typeArgs3> =
                    |    $toTupleName($properties, $args)
                    |
                    """.trimMargin()
                ).appendLine()

                if (upperNumber2 > 1) {
                    val properties2 = numbers2.joinToString(", ") {
                        "$tupleNameParamLowercase.${getArgName(upperNumber2, it)}"
                    }

                    tupleGlue.append(
                        """
                        |/**
                        |* Glues the given [$tupleNameParamLowercase] to this [$tupleName] and thus results in a [$toTupleName].
                        |*
                        |* You can also think of it as all values of the given [$tupleNameParamLowercase] are [$tupleName.append]ed to this [$tupleName].
                        |*
                        |* @since 2.0.0
                        |*/
                        |fun <$typeArgs3> $tupleName<$typeArgs>.glue(
                        |    $tupleNameParamLowercase: $tupleNameParam<$typeArgs2>
                        |): $toTupleName<$typeArgs3> =
                        |    $toTupleName($properties, $properties2)
                        |
                        """.trimMargin()
                    ).appendLine()
                }
            }

            numbers.forEach { argNum ->
                val modifiedTypeArgs = numbers.joinToString(", ") { "A$it" + if (it == argNum) "New" else "" }
                val args = numbers.joinToString(", ") { arg ->
                    getArgName(upperNumber, arg).let {
                        if (arg == argNum) "transform($it)" else it
                    }
                }

                val argNameToMap = getArgName(upperNumber, argNum)
                val argNameCapitalized = argNameToMap.replaceFirstChar {
                    if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
                }
                tupleMap.append(
                    """
                    |/**
                    |* Maps [$tupleName.$argNameToMap] with the given [transform] function and returns a new [$tupleName].
                    |*
                    |* @since 2.0.0
                    |*/
                    |fun <$typeArgs, A${argNum}New> $tupleName<$typeArgs>.map$argNameCapitalized(
                    |    transform: (A$argNum) -> A${argNum}New
                    |): $tupleName<$modifiedTypeArgs> =
                    |    $tupleName($args)
                    |
                    """.trimMargin()
                ).appendLine()
            }
        }

        varargToList.append(
            """
            |/**
            | * Adds the given [arg] and the [otherArgs] into a new [List] and returns it.
            | *
            | * This function is intended for API functions which expect `x: T, vararg otherX: T` and want to pass the arguments
            | * to another function which expects only one argument of `List<T>`.
            | *
            | * @return a [List] containing [arg] and [otherArgs].
            | */
            |fun <T> varargToList(arg: T, otherArgs: Array<out T>): List<T> {
            |    val list = ArrayList<T>(otherArgs.size + 1)
            |    list.add(arg)
            |    list.addAll(otherArgs)
            |    return list
            |}
            |
            |/**
            | * Delegates to [varargToList] -- adds `this` and the [otherArgs] into a new [List] and returns it.
            | */
            |@Suppress("NOTHING_TO_INLINE")
            |inline infix fun <T> T.glue(otherArgs: Array<out T>): List<T> = varargToList(this, otherArgs)
            |
            """.trimMargin()
        ).appendLine()

        listOf("Array", "Iterable", "Sequence").forEach { receiver ->
            toVararg.append(
                """
                |/**
                | * Splits this [$receiver] into the first element and the rest as `Array<out T>`.
                | *
                | * This way you can pass it to a function which expects `x: T, vararg otherX: T`.
                | *
                | * @since 3.1.0
                | */
                |inline fun <reified T> $receiver<${if (receiver == "Array") "out " else ""}T>.toVararg(): Pair<T, Array<out T>> =
                |   first() to drop(1).toList().toTypedArray()
                |
                """.trimMargin()
            ).appendLine()
        }

        primitiveTypes.forEach { (type, arrayType) ->
            varargToList.append(
                """
                |/**
                | * Adds the given [arg] and the [otherArgs] into a new [List] and returns it.
                | *
                | * This function is intended for API functions which expect `x: $type, vararg otherX: $type` and want to pass
                | * the arguments to another function which expects only one argument of `List<$type>`.
                | *
                | * @return a [List] containing [arg] and [otherArgs].
                | *
                | * @since 3.1.0
                | */
                |fun varargToList(arg: $type, otherArgs: $arrayType): List<$type> {
                |    val list = ArrayList<$type>(otherArgs.size + 1)
                |    list.add(arg)
                |    list.addAll(otherArgs.asList())
                |    return list
                |}
                |
                |/**
                | * Delegates to [varargToList] -- adds `this` and the [otherArgs] into a new [List] and returns it.
                | *
                | * @since 3.1.0
                | */
                |@Suppress("NOTHING_TO_INLINE")
                |inline infix fun $type.glue(otherArgs: $arrayType): List<$type> = varargToList(this, otherArgs)

                """.trimMargin()
            ).appendLine()


            listOf("Iterable", "Array").forEach { receiver ->
                toVararg.append(
                    """
                    |/**
                    | * Splits this [$receiver] into the first element and the rest as [$arrayType].
                    | *
                    | * This way you can pass it to a function which expects `x: $type, vararg otherX: $type`.
                    | *
                    | * @since 3.1.0
                    | */${if (receiver != "Array") "\n@JvmName(\"toVararg$type\")" else ""}
                    |fun $receiver<$type>.toVararg(): Pair<$type, $arrayType> =
                    |   first() to drop(1).to$arrayType()
                    |
                    """.trimMargin()
                ).appendLine()
            }
            toVararg.append(
                """
                |/**
                | * Splits this [Sequence] into the first element and the rest as [$arrayType].
                | *
                | * This way you can pass it to a function which expects `x: $type, vararg otherX: $type`.
                | *
                | * @since 3.1.0
                | */
                |@JvmName("toVararg$type")
                |fun Sequence<$type>.toVararg(): Pair<$type, $arrayType> =
                |   first() to drop(1).toList().to$arrayType()
                |
                |/**
                | * Splits this [$arrayType] into the first element and the rest as [$arrayType].
                | *
                | * This way you can pass it to a function which expects `x: $type, vararg otherX: $type`.
                | *
                | * @since 3.1.0
                | */
                |fun $arrayType.toVararg(): Pair<$type, $arrayType> =
                |   first() to drop(1).to$arrayType()
                |
                """.trimMargin()
            ).appendLine()
        }


        val tupleAppendFile = packageDir.resolve("tupleAppend.kt")
        tupleAppendFile.writeText(tupleAppend.toString())

        val tupleGlueFile = packageDir.resolve("tupleGlue.kt")
        tupleGlueFile.writeText(tupleGlue.toString())

        val tupleMapFile = packageDir.resolve("tupleMap.kt")
        tupleMapFile.writeText(tupleMap.toString())

        val tupleFactoryFile = packageDir.resolve("tupleFactory.kt")
        tupleFactoryFile.writeText(tupleFactory.toString())

        val tupleToListFile = packageDir.resolve("tupleToList.kt")
        tupleToListFile.writeText(tupleToList.toString())

        val tupleToSequenceFile = packageDir.resolve("tupleToSequence.kt")
        tupleToSequenceFile.writeText(tupleToSequence.toString())

        val tupleFlattenFile = packageDir.resolve("tupleFlatten.kt")
        tupleFlattenFile.writeText(tupleFlatten.toString())

        val varargToListFile = packageDir.resolve("varargToList.kt")
        varargToListFile.writeText(varargToList.toString())

        val toVarargFile = packageDir.resolve("toVararg.kt")
        toVarargFile.writeText(toVararg.toString())
    }
}
generationFolder.builtBy(generate)

fun StringBuilder.appendTest(testName: String) = this.append(
    """
    |import ch.tutteli.atrium.api.fluent.en_GB.*
    |import ch.tutteli.atrium.api.verbs.expect
    |import ch.tutteli.kbox.*
    |import kotlin.test.Test
    |
    |class $testName {
    |
    """.trimMargin()
).appendLine()

val generateTest: TaskProvider<Task> = tasks.register("generateTest") {
    doFirst {
        val packageDir = File(generationTestFolder.asPath + "/" + packageNameAsPath)
        val argValuesNotMapped = sequenceOf(
            "\"string\"",
            "1",
            "2L",
            "3F",
            "4.0",
            "'c'",
            "1.toShort()",
            "2.toByte()",
            "listOf(1, 2)",
        )
        val argValues = argValuesNotMapped.map { "listOf($it)" }

        val argsTypeParameters = sequenceOf(
            "String", "Int", "Long", "Float", "Double", "Char", "Short", "Byte", "List<Int>"
        ).map { "List<$it>" }

        val tupleFactoryTest = createStringBuilder(packageName)
            .appendTest("TupleFactoryTest")

        val varargToListTest = createStringBuilder(packageName)
            .appendTest("VarargToListTest")

        val toVarargTest = createStringBuilder(packageName)
            .appendTest("ToVarargTest")

        varargToListTest.append(
            """
                |    @Test
                |    fun varArgToList_array_of_strings() {
                |        val arr = arrayOf("a", "b")
                |        val list = varargToList("c", arr)
                |
                |        expect(list).toContainExactly("c", "a", "b")
                |    }
                |
                |    @Test
                |    fun glue_array_of_strings() {
                |        val arr = arrayOf("a", "b")
                |        val list = "c" glue arr
                |
                |        expect(list).toContainExactly("c", "a", "b")
                |    }
                """.trimMargin()
        ).appendLine().appendLine()

        listOf(
            "Array" to "arrayOf",
            "Iterable" to "listOf",
            "Sequence" to "sequenceOf"
        ).forEach { (receiver, factory) ->
            toVarargTest.append(
                """
                |    @Test
                |    fun toVararg_$receiver() {
                |        val arr = $factory("a", "b")
                |        val pair = arr.toVararg()
                |
                |        val (first, rest) = pair
                |        expectString(first, *rest)
                |
                |        expect(pair) {
                |            this.first.toEqual("a")
                |            second.asList().toContainExactly("b")
                |        }
                |    }
                """.trimMargin()
            ).appendLine().appendLine()
        }

        primitiveTypes.forEach { (type, arrayTypeUpper) ->
            val arrayType = arrayTypeUpper.first().lowercase() + arrayTypeUpper.drop(1)
            val (value1, value2) = when (type) {
                "Boolean" -> "false" to "true"
                "Byte" -> "1.toByte()" to "2.toByte()"
                "Char" -> "'a'" to "'b', 'c', 'd'"
                "Short" -> "1.toShort()" to "2.toShort()"
                "Int" -> "1" to "2, 3, 4, 5, 6, 7"
                "Long" -> "1L" to "2L"
                "Float" -> "1.0f" to "2.0f"
                "Double" -> "1.0" to "2.0, 3.0"
                else -> throw IllegalStateException("not all primitiveTypes cases covered: $type")
            }
            varargToListTest.append(
                """
                |    @Test
                |    fun varArgToList_$arrayType() {
                |        val arr = ${arrayType}Of($value2)
                |        val list = varargToList($value1, arr)
                |
                |        expect(list).toContainExactly($value1, $value2)
                |    }
                |
                |    @Test
                |    fun glue_$arrayType() {
                |        val arr = ${arrayType}Of($value2)
                |        val list = $value1 glue arr
                |
                |        expect(list).toContainExactly($value1, $value2)
                |    }
                """.trimMargin()
            ).appendLine().appendLine()

            toVarargTest.append(
                """
                |    @Test
                |    fun toVararg_$arrayType() {
                |        val arr = ${arrayType}Of($value1, $value2)
                |        val pair = arr.toVararg()
                |
                |        val (first, rest) = pair
                |        expect$type(first, *rest)
                |
                |        expect(pair) {
                |            this.first.toEqual($value1)
                |            second.asList().toContainExactly($value2)
                |        }
                |    }
                """.trimMargin()
            ).appendLine().appendLine()

            listOf(
                "Array" to "arrayOf",
                "Iterable" to "listOf",
                "Sequence" to "sequenceOf"
            ).forEach { (receiver, factory) ->
                toVarargTest.append(
                    """
                    |    @Test
                    |    fun toVararg_${receiver}_of_${type}_returns_$arrayType() {
                    |        val arr: $receiver<$type> = ${factory}($value1, $value2)
                    |        val pair = arr.toVararg()
                    |
                    |        val (first, rest) = pair
                    |        expect$type(first, *rest)
                    |
                    |        expect(pair) {
                    |            this.first.toEqual($value1)
                    |            second.asList().toContainExactly($value2)
                    |        }
                    |    }
                    """.trimMargin()
                ).appendLine().appendLine()
            }
        }

        (2..numOfArgs).forEach { upperNumber ->
            val numbers = (1..upperNumber)
            fun typeArgs(num: Int) = argsTypeParameters.take(num).joinToString(", ")
            val typeArgs = typeArgs(upperNumber)
            val tupleName = getTupleName(upperNumber)

            fun vals(num: Int) = argValues.take(num).withIndex().joinToString("\n        ") { (index, value) ->
                "val a${index + 1} = $value"
            }

            val vals = vals(upperNumber)

            val valsAsArgs = numbers.joinToString(", ") { "a$it" }
            val tupleCreation = """$tupleName($valsAsArgs)"""
            fun sameFeatureCheck(num: Int, indent: String) = (1..num).joinToString("\n$indent") {
                "feature { f(it::${getArgName(num, it)}) }.toBeTheInstance(a${it})"
            }

            val tupleMapTest = createStringBuilder("$packageName.map")
                .appendTest("${tupleName}MapTest")

            val toTupleTest = createStringBuilder("$packageName.toTuple")
                .appendTest("Tuple${upperNumber}LikeToTupleTest")

            val tupleAppendTest = createStringBuilder("$packageName.append")
                .appendTest("${tupleName}AppendTest")

            val tupleGlueTest = createStringBuilder("$packageName.glue")
                .appendTest("${tupleName}GlueTest")

            val tupleToListTest = createStringBuilder("$packageName.toList")
                .appendTest("${tupleName}ToListTest")

            val tupleToSequenceTest = createStringBuilder("$packageName.toSequence")
                .appendTest("${tupleName}ToSequenceTest")

            val tupleFlattenTest = createStringBuilder("$packageName.flatten")
                .appendTest("${tupleName}FlattenTest")

            tupleFactoryTest.append(
                """
                |    @Test
                |    fun factory_for_$tupleName() {
                |        ${vals(upperNumber)}
                |        expect(Tuple($valsAsArgs))
                |            .toBeAnInstanceOf<$tupleName<${typeArgs}>> {
                |                ${sameFeatureCheck(upperNumber, "                ")}
                |          }
                |    }
                """.trimMargin()
            ).appendLine().appendLine()

            numbers.forEach { argNum ->
                val argNameToMap = getArgName(upperNumber, argNum)
                val argNameCapitalized = argNameToMap.replaceFirstChar {
                    if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
                }
                listOf(1, 2, 3).withIndex()

                val tupleListResult = "$tupleName(${
                    argValuesNotMapped.take(upperNumber).withIndex().joinToString(", ") { (index, value) ->
                        if (index + 1 == argNum) value else "a${index + 1}"
                    }
                })"

                tupleMapTest.append(
                    """
                    |    @Test
                    |    fun map${argNameCapitalized}__identity__returns_equal_$tupleName() {
                    |        $vals
                    |
                    |        expect(
                    |            $tupleCreation
                    |                .map${argNameCapitalized}(::identity)
                    |        ) {
                    |            ${sameFeatureCheck(upperNumber, "            ")}
                    |        }
                    |    }
                    |
                    |    @Test
                    |    fun map${argNameCapitalized}__transformation_does_not_touch_other_properties() {
                    |        $vals
                    |
                    |        expect(
                    |            $tupleCreation
                    |                .map${argNameCapitalized} { it.first() }
                    |        ) {
                    |            toEqual($tupleListResult)
                    |            ${
                        numbers.filter { it != argNum }.joinToString("\n            ") {
                            "feature { f(it::${getArgName(upperNumber, it)}) }.toBeTheInstance(a${it})"
                        }
                    }
                    |        }
                    |    }
                     """.trimMargin()
                ).appendLine().appendLine()
            }

            toTupleTest.append(
                """
                    |    @Test
                    |    fun toTuple__returns_${tupleName}_in_correct_order() {
                    |        $vals
                    |        val dataClass = Dummy$upperNumber($valsAsArgs)
                    |
                    |        expect(dataClass.toTuple()).toBeAnInstanceOf<$tupleName<$typeArgs>> {
                    |            ${sameFeatureCheck(upperNumber, "            ")}
                    |        }
                    |    }
                    |
                    """.trimMargin()
            ).appendLine()

            val ints = (0 until upperNumber).joinToString(", ")
            val intsAndString = (0 until upperNumber - 1).joinToString(", ") + ", \"a\""

            tupleToListTest.append(
                """
                |    @Test
                |    fun toList__Ints_returns_int_List_in_correct_order() {
                |        val tuple = $tupleName($ints)
                |        val l : List<Int> = tuple.toList()
                |
                |        expect(l).toContainExactly($ints)
                |    }
                |
                |    @Test
                |    fun toList__IntsAndString_returns_Comparable_List_in_correct_order() {
                |        val tuple = $tupleName($intsAndString)
                |        val l : List<Comparable<*>> = tuple.toList()
                |
                |        expect(l).toContainExactly($intsAndString)
                |    }
                |
                """.trimMargin()
            ).appendLine()

            tupleToSequenceTest.append(
                """
                |    @Test
                |    fun toSequence__Ints_returns_int_List_in_correct_order() {
                |        val tuple = $tupleName($ints)
                |        val l : Sequence<Int> = tuple.toSequence()
                |
                |        expect(l).asList().toContainExactly($ints)
                |    }
                |
                |    @Test
                |    fun toSequence__IntsAndString_returns_Comparable_List_in_correct_order() {
                |        val tuple = $tupleName($intsAndString)
                |        val l : Sequence<Comparable<*>> = tuple.toSequence()
                |
                |        expect(l).asList().toContainExactly($intsAndString)
                |    }
                |
                """.trimMargin()
            ).appendLine()

            tupleFlattenTest.append(
                """
                |    @Test
                |    fun flatten__onList_Ints_returns_int_List_in_correct_order() {
                |        val tuple = listOf($tupleName($ints), $tupleName($ints))
                |        val l : List<Int> = tuple.flatten()
                |
                |        expect(l).toContainExactly($ints, $ints)
                |    }
                |
                |    @Test
                |    fun flatten__onList_IntsAndString_returns_Comparable_List_in_correct_order() {
                |        val tuple = listOf($tupleName($intsAndString), $tupleName($intsAndString))
                |        val l : List<Comparable<*>> = tuple.flatten()
                |
                |        expect(l).toContainExactly($intsAndString, $intsAndString)
                |    }
                |
                |    @Test
                |    fun flatten__onSequence_Ints_returns_int_List_in_correct_order() {
                |        val tuple = sequenceOf($tupleName($ints), $tupleName($ints))
                |        val l : Sequence<Int> = tuple.flatten()
                |
                |        expect(l).asList().toContainExactly($ints, $ints)
                |    }
                |
                |    @Test
                |    fun flatten__onSequence_IntsAndString_returns_Comparable_List_in_correct_order() {
                |        val tuple = sequenceOf($tupleName($intsAndString), $tupleName($intsAndString))
                |        val l : Sequence<Comparable<*>> = tuple.flatten()
                |
                |        expect(l).asList().toContainExactly($intsAndString, $intsAndString)
                |    }
                |
                """.trimMargin()
            ).appendLine()

            (1..numOfArgs - upperNumber).forEach { upperNumber2 ->
                val upperNumber3 = upperNumber + upperNumber2
                val toTupleName = getTupleName(upperNumber3)
                val vals3AsArgs = (upperNumber + 1..upperNumber3).joinToString(", ") { "a$it" }

                tupleAppendTest.append(
                    """
                        |    @Test
                        |    fun append_${upperNumber2}_values__results_in_a_$toTupleName() {
                        |        ${vals(upperNumber3)}
                        |
                        |        expect(
                        |            $tupleCreation
                        |                .append($vals3AsArgs)
                        |        ).toBeAnInstanceOf<$toTupleName<${typeArgs(upperNumber3)}>> {
                        |            ${sameFeatureCheck(upperNumber3, "            ")}
                        |        }
                        |    }
                         """.trimMargin()
                ).appendLine().appendLine()

                if (upperNumber2 > 1) {
                    val tupleNameParam = getTupleName(upperNumber2)
                    val tupleNameParamCreation =
                        """$tupleNameParam($vals3AsArgs)"""

                    tupleGlueTest.append(
                        """
                        |    @Test
                        |    fun glue_${tupleNameParam}__results_in_a_$toTupleName() {
                        |        ${vals(upperNumber3)}
                        |
                        |        expect(
                        |            $tupleCreation
                        |                .glue($tupleNameParamCreation)
                        |        ).toBeAnInstanceOf<$toTupleName<${typeArgs(upperNumber3)}>> {
                        |            ${sameFeatureCheck(upperNumber3, "            ")}
                        |        }
                        |    }
                         """.trimMargin()
                    ).appendLine().appendLine()
                }
            }

            tupleMapTest.append("}")
            val mapTestFile = packageDir.resolve("map/${tupleName}MapTest.kt")
            mapTestFile.writeText(tupleMapTest.toString())

            toTupleTest
                .append(
                    """
                    |    data class Dummy$upperNumber(
                    |        ${
                        argsTypeParameters.take(upperNumber).withIndex()
                            .joinToString(",\n        ") { "val a${it.index + 1}: ${it.value}" }
                    }
                    |    ): Tuple${upperNumber}Like<$typeArgs>
                    """.trimMargin()
                )
                .appendLine()
                .append("}")

            val toTupleTestFile = packageDir.resolve("toTuple/Tuple${upperNumber}LikeToTupleTest.kt")
            toTupleTestFile.writeText(toTupleTest.toString())

            tupleToListTest.append("}")
            val toListTestFile = packageDir.resolve("toList/${tupleName}ToListTest.kt")
            toListTestFile.writeText(tupleToListTest.toString())

            tupleToSequenceTest.append("}")
            val toSequenceTestFile = packageDir.resolve("toSequence/${tupleName}ToSequenceTest.kt")
            toSequenceTestFile.writeText(tupleToSequenceTest.toString())

            tupleFlattenTest.append("}")
            val flattenTestFile = packageDir.resolve("flatten/${tupleName}FlattenTest.kt")
            flattenTestFile.writeText(tupleFlattenTest.toString())

            //cannot append to tuple of max arity
            if (upperNumber < numOfArgs) {
                tupleAppendTest.append("}")
                val appendTestFile = packageDir.resolve("append/${tupleName}AppendTest.kt")
                appendTestFile.writeText(tupleAppendTest.toString())
            }

            //cannot glue to tuple of max arity with another, same same for tuple of max arity -1
            if (upperNumber < numOfArgs - 1) {
                tupleGlueTest.append("}")
                val glueTestFile = packageDir.resolve("glue/${tupleName}GlueTest.kt")
                glueTestFile.writeText(tupleGlueTest.toString())
            }
        }

        tupleFactoryTest.append("}")
        val factoryTestFile = packageDir.resolve("TupleFactoryTest.kt")
        factoryTestFile.writeText(tupleFactoryTest.toString())


        varargToListTest.append("}")
        val varargToListTestFile = packageDir.resolve("VarargToListTest.kt")
        varargToListTestFile.writeText(varargToListTest.toString())

        toVarargTest.append("}")
        val toVarargTestFile = packageDir.resolve("ToVarargTest.kt")
        toVarargTestFile.writeText(toVarargTest.toString())
    }
}
generationTestFolder.builtBy(generateTest)

