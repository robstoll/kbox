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

fun getKotlinTupleName(numOfValues: Int) = when (numOfValues) {
    2 -> "Pair"
    3 -> "Triple"
    else -> error("should only be used for Pair and Triple")
}

fun getKotlinArgName(argNum: Int) = when (argNum) {
    1 -> "first"
    2 -> "second"
    3 -> "third"
    else -> error("should only be used for Pair and Triple")
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

        val tupleDrop = createStringBuilder(packageName)

        val tupleFactory = StringBuilder(dontModifyNotice)
            .append("@file:Suppress(\"MethodOverloading\", \"FunctionName\")\n")
            .append("package ").append(packageName).append("\n\n")

        val tupleToList = createStringBuilder(packageName)
        val tupleToSequence = createStringBuilder(packageName)
        val tupleFlatten = createStringBuilder(packageName)
            .append("import kotlin.jvm.JvmName\n\n")

        val varargToList = StringBuilder(dontModifyNotice)
            .append("@file:Suppress(\"MethodOverloading\")\n")
            .append("package ").append(packageName).append("\n\n")

        val toVararg = createStringBuilder(packageName)
            .append("import kotlin.jvm.JvmName\n\n")

        val mapVararg = StringBuilder(dontModifyNotice)
            .append("@file:Suppress(\"MethodOverloading\")\n")
            .append("@file:OptIn(ExperimentalTypeInference::class)\n")
            .append("package ").append(packageName).append("\n\n")
            .append("import kotlin.experimental.ExperimentalTypeInference\n\n")
            .append("import kotlin.jvm.JvmName\n\n")

        val mapVarargIndexed = StringBuilder(dontModifyNotice)
            .append("@file:Suppress(\"MethodOverloading\")\n")
            .append("@file:OptIn(ExperimentalTypeInference::class)\n")
            .append("package ").append(packageName).append("\n\n")
            .append("import kotlin.experimental.ExperimentalTypeInference\n\n")
            .append("import kotlin.jvm.JvmName\n\n")

        (2..numOfArgs).forEach { upperNumber ->
            val numbers = (1..upperNumber).toList()
            val typeArgs = numbers.joinToString(", ") { "A$it" }
            val typeArgsOut = numbers.joinToString(", ") { "out A$it" }
            val constructorProperties = numbers.joinToString(",\n    ") { "val a$it: A$it" }
            val parameters = numbers.joinToString(", ") { "a$it: A$it" }
            val arguments = numbers.joinToString(", ") { "a$it" }
            val tupleName = "Tuple$upperNumber"
            val tupleLike = createStringBuilder(packageName)
            val tuple = createStringBuilder(packageName)
            val properties = numbers.joinToString(", ") { "a$it" }

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
                    | * ${numbers.joinToString("\n * ") { "@property a$it the ${withOrdinalIndicator(it)} component of this $tupleName." }}
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

                val toTupleName = "Tuple$upperNumber3"
                val tupleNameParam = "Tuple$upperNumber2"
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
                        "$tupleNameParamLowercase.a$it"
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
                    "a$arg".let {
                        if (arg == argNum) "transform($it)" else it
                    }
                }

                fun appendMap(argNameToMap: String, argNameCapitalized: String, tupleName: String, since: String) =
                    tupleMap.append(
                        """
                        |/**
                        |* Maps [$tupleName.$argNameToMap] with the given [transform] function and returns a new [$tupleName].
                        |*
                        |* @since $since
                        |*/
                        |fun <$typeArgs, A${argNum}New> $tupleName<$typeArgs>.map$argNameCapitalized(
                        |    transform: (A$argNum) -> A${argNum}New
                        |): $tupleName<$modifiedTypeArgs> =
                        |    $tupleName($args)
                        |
                        """.trimMargin()
                    ).appendLine()

                appendMap("a$argNum", "A$argNum", tupleName, if (upperNumber <= 3) "3.2.0" else "2.0.0")
                if (upperNumber <= 3) {
                    val argName = getKotlinArgName(argNum)
                    val argNameCapitalized = argName.replaceFirstChar {
                        if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
                    }
                    appendMap(argName, argNameCapitalized, getKotlinTupleName(upperNumber), "2.0.0")
                }

                if (upperNumber >= 3) {
                    val numberWithoutDrop = numbers.toMutableList()
                    numberWithoutDrop.remove(argNum)
                    val typeArgsWithoutDrop = numberWithoutDrop.joinToString(", ") { "A${it}" }
                    val upperNumberOneLower = upperNumber - 1
                    val tupleNameOneLower = "Tuple$upperNumberOneLower"

                    fun appendDrop(argNameToDrop: String, argNameCapitalized: String, tupleName: String) =
                        tupleDrop.append(
                            """
                            |/**
                            | * Creates a new [$tupleNameOneLower] by copying `this` [$tupleName] but dropping its ${
                                withOrdinalIndicator(argNum)
                            } component ([$tupleName.$argNameToDrop]).
                            | *
                            | * @return The newly created [$tupleNameOneLower].
                            | *
                            | * @since 3.2.0
                            | */
                            |fun <$typeArgs> $tupleName<$typeArgs>.drop$argNameCapitalized(): $tupleNameOneLower<$typeArgsWithoutDrop> =
                            |	Tuple(${numberWithoutDrop.joinToString(", ") { "a$it" }})
                            |
                            """.trimMargin()
                        ).appendLine()

                    appendDrop("a$argNum", "A$argNum", tupleName)
                    if (upperNumber <= 3) {
                        val argName = getKotlinArgName(argNum)
                        val argNameCapitalized = argName.replaceFirstChar {
                            if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
                        }
                        appendDrop(argName, argNameCapitalized, getKotlinTupleName(upperNumber))
                    }
                }
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

        mapVararg.append(
            """
            |/**
            | * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
            | *
            | * This function is intended for API functions which expect `x: T, vararg otherX: T` and want to pass
            | * the arguments to another function expecting `x: R, vararg otherX: R`.
            | *
            | * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
            | *
            | * @since 3.1.0
            | */
            |@OverloadResolutionByLambdaReturnType
            |inline fun <T, reified R> mapVararg(
            |    arg: T,
            |    otherArgs: Array<out T>,
            |    mapper: (T) -> R
            |): Pair<R, Array<out R>> = mapper(arg) to otherArgs.map(mapper).toTypedArray()
            |
            """.trimMargin()
        ).appendLine()

        mapVarargIndexed.append(
            """
            |/**
            | * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
            | *
            | * This function is intended for API functions which expect `x: T, vararg otherX: T` and want to pass
            | * the arguments to another function expecting `x: R, vararg otherX: R`.
            | *
            | * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
            | *
            | * @since 3.1.0
            | */
            |@OverloadResolutionByLambdaReturnType
            |inline fun <T, reified R> mapVarargIndexed(
            |    arg: T,
            |    otherArgs: Array<out T>,
            |    mapper: (Int, T) -> R
            |): Pair<R, Array<out R>> =
            |   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toTypedArray()
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

            mapVararg.append(
                """
                |/**
                | * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [$type].
                | *
                | * This function is intended for API functions which expect `x: T, vararg otherX: T` and
                | * want to pass the arguments to another function expecting `x: $type, vararg otherX: $type`.
                | *
                | * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
                | *
                | * @since 3.1.0
                | */${if (type != "Int") "\n@OverloadResolutionByLambdaReturnType" else ""}
                |@JvmName("mapVarargTo$type")
                |inline fun <T> mapVararg(
                |    arg: T,
                |    otherArgs: Array<out T>,
                |    mapper: (T) -> $type
                |): Pair<$type, $arrayType> = mapper(arg) to otherArgs.map(mapper).to$arrayType()
                |
                """.trimMargin()
            ).appendLine()

            mapVarargIndexed.append(
                """
                |/**
                | * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [$type].
                | *
                | * This function is intended for API functions which expect `x: T, vararg otherX: T` and
                | * want to pass the arguments to another function expecting `x: $type, vararg otherX: $type`.
                | *
                | * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
                | *
                | * @since 3.1.0
                | */${if (type != "Int") "\n@OverloadResolutionByLambdaReturnType" else ""}
                |@JvmName("mapVarargIndexedTo$type")
                |inline fun <T> mapVarargIndexed(
                |    arg: T,
                |    otherArgs: Array<out T>,
                |    mapper: (Int, T) -> $type
                |): Pair<$type, $arrayType> =
                |   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.to$arrayType()
                |
                """.trimMargin()
            ).appendLine()

            mapVararg.append(
                """
                |/**
                | * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
                | *
                | * This function is intended for API functions which expect `x: $type, vararg otherX: $type` and
                | * want to pass the arguments to another function expecting `x: R, vararg otherX: R`.
                | *
                | * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
                | *
                | * @since 3.1.0
                | */
                |@OverloadResolutionByLambdaReturnType
                |@JvmName("map${type}Vararg")
                |inline fun <reified R> mapVararg(
                |    arg: $type,
                |    otherArgs: $arrayType,
                |    mapper: ($type) -> R
                |): Pair<R, Array<out R>> = mapper(arg) to otherArgs.map(mapper).toTypedArray()
                |
                """.trimMargin()
            ).appendLine()

            mapVarargIndexed.append(
                """
                |/**
                | * Maps the given [arg] and all elements in [otherArgs] by the given [mapper].
                | *
                | * This function is intended for API functions which expect `x: $type, vararg otherX: $type` and
                | * want to pass the arguments to another function expecting `x: R, vararg otherX: R`.
                | *
                | * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
                | *
                | * @since 3.1.0
                | */
                |@OverloadResolutionByLambdaReturnType
                |@JvmName("map${type}VarargIndexed")
                |inline fun <reified R> mapVarargIndexed(
                |    arg: $type,
                |    otherArgs: $arrayType,
                |    mapper: (Int, $type) -> R
                |): Pair<R, Array<out R>> =
                |   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.toTypedArray()
                |
                """.trimMargin()
            ).appendLine()

            primitiveTypes.forEach { (returnType, returnArrayType) ->
                mapVararg.append(
                    """
                    |/**
                    | * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [$returnType].
                    | *
                    | * This function is intended for API functions which expect `x: $type, vararg otherX: $type` and
                    | * want to pass the arguments to another function expecting `x: $returnType, vararg otherX: $returnType`.
                    | *
                    | * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
                    | *
                    | * @since 3.1.0
                    | */
                    |@OverloadResolutionByLambdaReturnType
                    |@JvmName("map${type}VarargTo$returnType")
                    |inline fun mapVararg(
                    |    arg: $type,
                    |    otherArgs: $arrayType,
                    |    mapper: ($type) -> $returnType
                    |): Pair<$returnType, $returnArrayType> = mapper(arg) to otherArgs.map(mapper).to$returnArrayType()
                    |
                    """.trimMargin()
                ).appendLine()

                mapVarargIndexed.append(
                    """
                    |/**
                    | * Maps the given [arg] and all elements in [otherArgs] by the given [mapper] to [$returnType].
                    | *
                    | * This function is intended for API functions which expect `x: $type, vararg otherX: $type` and
                    | * want to pass the arguments to another function expecting `x: $returnType, vararg otherX: $returnType`.
                    | *
                    | * @return a [Pair] containing the mapped [arg] as first and the mapped [otherArgs] as second element.
                    | *
                    | * @since 3.1.0
                    | */
                    |@OverloadResolutionByLambdaReturnType
                    |@JvmName("map${type}VarargIndexedTo$returnType")
                    |inline fun mapVarargIndexed(
                    |    arg: $type,
                    |    otherArgs: $arrayType,
                    |    mapper: (Int, $type) -> $returnType
                    |): Pair<$returnType, $returnArrayType> =
                    |   mapper(0, arg) to otherArgs.mapIndexed { index, e -> mapper(index + 1, e) }.to$returnArrayType()
                    |
                    """.trimMargin()
                ).appendLine()
            }
        }


        val tupleAppendFile = packageDir.resolve("tupleAppend.kt")
        tupleAppendFile.writeText(tupleAppend.toString())

        val tupleGlueFile = packageDir.resolve("tupleGlue.kt")
        tupleGlueFile.writeText(tupleGlue.toString())

        val tupleMapFile = packageDir.resolve("tupleMap.kt")
        tupleMapFile.writeText(tupleMap.toString())

        val tupleDropFile = packageDir.resolve("tupleDrop.kt")
        tupleDropFile.writeText(tupleDrop.toString())

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

        val mapVarargFile = packageDir.resolve("mapVararg.kt")
        mapVarargFile.writeText(mapVararg.toString())

        val mapVarargIndexedFile = packageDir.resolve("mapVarargIndexed.kt")
        mapVarargIndexedFile.writeText(mapVarargIndexed.toString())
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

        val mapVarargTest = createStringBuilder(packageName)
            .appendTest("MapVarargTest")

        val mapVarargIndexedTest = createStringBuilder(packageName)
            .appendTest("MapVarargIndexedTest")

        varargToListTest.append(
            """
            |    @Test
            |    fun varargToList_array_of_strings() {
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

        mapVarargTest.append(
            """
            |    @Test
            |    fun mapVararg_strings_to_strings() {
            |        val arr = arrayOf("a", "b")
            |        val pair = mapVararg("c", arr) { "_${'$'}it" }
            |
            |        expect(pair) {
            |           first.toEqual("_c")
            |           second.asList().toContainExactly("_a", "_b")
            |        }
            |    }
            """.trimMargin()
        ).appendLine().appendLine()

        mapVarargIndexedTest.append(
            """
            |    @Test
            |    fun mapVarargIndexed_strings_to_strings() {
            |        val arr = arrayOf("a", "b")
            |        val pair = mapVarargIndexed("c", arr) { index, s -> "${'$'}{index}_${'$'}s" }
            |
            |        expect(pair) {
            |           first.toEqual("0_c")
            |           second.asList().toContainExactly("1_a", "2_b")
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

        fun toValues(type: String) = when (type) {
            "Boolean" -> "false" to arrayOf("true")
            "Byte" -> "1.toByte()" to arrayOf("2.toByte()")
            "Char" -> "'a'" to arrayOf("'b'", "'c'", "'d'")
            "Short" -> "1.toShort()" to arrayOf("2.toShort()")
            "Int" -> "1" to arrayOf("2", "3", "4", "5", "6", "7")
            "Long" -> "1L" to arrayOf("2L")
            "Float" -> "1.0f" to arrayOf("2.0f")
            "Double" -> "1.0" to arrayOf("2.0", "3.0")
            else -> throw IllegalStateException("not all primitiveTypes cases covered: $type")
        }

        fun toValuesOfSize(type: String, size: Int): String {
            val (value1, rest) = toValues(type)
            val values = rest + arrayOf(value1)
            val valuesSize = values.size
            return arrayOfNulls<String>(size).mapIndexed { index, _ -> values[index % valuesSize] }
                .joinToString(", ")
        }

        primitiveTypes.forEach { (type, arrayTypeUpper) ->
            val arrayType = arrayTypeUpper.first().lowercase() + arrayTypeUpper.drop(1)


            val (value1, values) = toValues(type)
            val valuesAsString = values.joinToString(", ")
            val valuesAsIndex = values.mapIndexed { index, _ -> "\"${index + 1}_\"" }.joinToString(", ")
            varargToListTest.append(
                """
                |    @Test
                |    fun varargToList_$arrayType() {
                |        val arr = ${arrayType}Of($valuesAsString)
                |        val list = varargToList($value1, arr)
                |
                |        expect(list).toContainExactly($value1, $valuesAsString)
                |    }
                |
                |    @Test
                |    fun glue_$arrayType() {
                |        val arr = ${arrayType}Of($valuesAsString)
                |        val list = $value1 glue arr
                |
                |        expect(list).toContainExactly($value1, $valuesAsString)
                |    }
                """.trimMargin()
            ).appendLine().appendLine()

            toVarargTest.append(
                """
                |    @Test
                |    fun toVararg_$arrayType() {
                |        val arr = ${arrayType}Of($value1, $valuesAsString)
                |        val pair = arr.toVararg()
                |
                |        val (first, rest) = pair
                |        expect$type(first, *rest)
                |
                |        expect(pair) {
                |            this.first.toEqual($value1)
                |            second.asList().toContainExactly($valuesAsString)
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
                    |        val arr: $receiver<$type> = ${factory}($value1, $valuesAsString)
                    |        val pair = arr.toVararg()
                    |
                    |        val (first, rest) = pair
                    |        expect$type(first, *rest)
                    |
                    |        expect(pair) {
                    |            this.first.toEqual($value1)
                    |            second.asList().toContainExactly($valuesAsString)
                    |        }
                    |    }
                    """.trimMargin()
                ).appendLine().appendLine()
            }

            mapVarargTest.append(
                """
                |    @Test
                |    fun mapVararg_strings_to_$type() {
                |        val targetTypeArr = arrayOf(${toValuesOfSize(type, 3)})
                |        var i = 0
                |        val pair = mapVararg("c", arrayOf("a", "b")) { targetTypeArr[i++] }
                |
                |        expect(pair) {
                |           first.toEqual(targetTypeArr[0])
                |           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
                |        }
                |    }
                |
                |    @Test
                |    fun mapVararg_strings_to_single_$type() {
                |        // we use this test mainly to be sure we don't hit https://youtrack.jetbrains.com/issue/KT-75935
                |        val pair = mapVararg("c", arrayOf("a", "b")) { $value1 }
                |
                |        expect(pair) {
                |           first.toEqual($value1)
                |           second.asList().toContainExactly($value1, $value1)
                |        }
                |    }
                |
                |    @Test
                |    fun mapVararg_${type}_to_string() {
                |        var i = 0
                |        val pair = mapVararg($value1, arrayOf($valuesAsString)) { "${'$'}{i++}_" }
                |
                |        expect(pair) {
                |           first.toEqual("0_")
                |           second.asList().toContainExactly($valuesAsIndex)
                |        }
                |    }
                |
                |    @Test
                |    fun map${type}Vararg_${type}_to_string() {
                |        var i = 0
                |        val pair = mapVararg($value1, ${arrayType}Of($valuesAsString)) { "${'$'}{i++}_" }
                |
                |        expect(pair) {
                |           first.toEqual("0_")
                |           second.asList().toContainExactly($valuesAsIndex)
                |        }
                |    }
                """.trimMargin()
            ).appendLine().appendLine()

            mapVarargIndexedTest.append(
                """
                |    @Test
                |    fun mapVarargIndexed_strings_to_$type() {
                |        val targetTypeArr = arrayOf(${toValuesOfSize(type, 3)})
                |        val pair = mapVarargIndexed("c", arrayOf("a", "b")) { index, _ -> targetTypeArr[index] }
                |
                |        expect(pair) {
                |           first.toEqual(targetTypeArr[0])
                |           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
                |        }
                |    }
                |
                |    @Test
                |    fun mapVarargIndexed_${type}_to_string() {
                |        val pair = mapVarargIndexed($value1, arrayOf($valuesAsString)) { index, _ -> "${'$'}{index}_" }
                |
                |        expect(pair) {
                |           first.toEqual("0_")
                |           second.asList().toContainExactly($valuesAsIndex)
                |        }
                |    }
                |
                |    @Test
                |    fun map${type}VarargIndexed_${type}_to_string() {
                |        val pair = mapVarargIndexed($value1, ${arrayType}Of($valuesAsString)) { index, _ -> "${'$'}{index}_" }
                |
                |        expect(pair) {
                |           first.toEqual("0_")
                |           second.asList().toContainExactly($valuesAsIndex)
                |        }
                |    }
                """.trimMargin()
            ).appendLine().appendLine()

            primitiveTypes.forEach { (toType, _) ->

                mapVarargTest.append(
                    """
                    |    @Test
                    |    fun mapVararg_${type}_to_$toType() {
                    |        val targetTypeArr = arrayOf(${toValuesOfSize(toType, values.size + 1)})
                    |        var i = 0
                    |        val pair = mapVararg($value1, arrayOf($valuesAsString)) { targetTypeArr[i++] }
                    |
                    |        expect(pair) {
                    |           first.toEqual(targetTypeArr[0])
                    |           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
                    |        }
                    |    }
                    |
                    |    @Test
                    |    fun map${type}Vararg_${type}_to_$toType() {
                    |        val targetTypeArr = arrayOf(${toValuesOfSize(toType, values.size + 1)})
                    |        var i = 0
                    |        val pair = mapVararg($value1, ${arrayType}Of($valuesAsString)) { targetTypeArr[i++] }
                    |
                    |        expect(pair) {
                    |           first.toEqual(targetTypeArr[0])
                    |           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
                    |        }
                    |    }
                    """.trimMargin()
                ).appendLine().appendLine()

                mapVarargIndexedTest.append(
                    """
                    |    @Test
                    |    fun mapVarargIndexed_${type}_to_$toType() {
                    |        val targetTypeArr = arrayOf(${toValuesOfSize(toType, values.size + 1)})
                    |        val pair = mapVarargIndexed($value1, arrayOf($valuesAsString)) { index, _ -> targetTypeArr[index] }
                    |
                    |        expect(pair) {
                    |           first.toEqual(targetTypeArr[0])
                    |           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
                    |        }
                    |    }
                    |
                    |    @Test
                    |    fun map${type}VarargIndexed_${type}_to_$toType() {
                    |        val targetTypeArr = arrayOf(${toValuesOfSize(toType, values.size + 1)})
                    |        val pair = mapVarargIndexed($value1, ${arrayType}Of($valuesAsString)) { index, _ -> targetTypeArr[index] }
                    |
                    |        expect(pair) {
                    |           first.toEqual(targetTypeArr[0])
                    |           second.asList().toContainExactlyElementsOf(targetTypeArr.drop(1))
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
            val tupleName = "Tuple$upperNumber"

            fun vals(num: Int) = argValues.take(num).withIndex().joinToString("\n        ") { (index, value) ->
                "val a${index + 1} = $value"
            }

            val vals = vals(upperNumber)

            val valsAsArgs = numbers.joinToString(", ") { "a$it" }
            val tupleCreation = """$tupleName($valsAsArgs)"""
            fun sameFeatureCheck(num: Int, indent: String) = (1..num).joinToString("\n$indent") {
                "feature { f(it::a$it) }.toBeTheInstance(a${it})"
            }

            val tupleMapTest = createStringBuilder("$packageName.map")
                .appendTest("${tupleName}MapTest")

            val tupleDropTest = createStringBuilder("$packageName.drop")
                .appendTest("${tupleName}DropTest")

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

                val tupleListResult = "$tupleName(${
                    argValuesNotMapped.take(upperNumber).withIndex().joinToString(", ") { (index, value) ->
                        if (index + 1 == argNum) value else "a${index + 1}"
                    }
                })"

                fun appendMapTest(argNameCapitalized: String) =
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
                                "feature { f(it::a$it) }.toBeTheInstance(a${it})"
                            }
                        }
                    |        }
                    |    }
                     """.trimMargin()
                    ).appendLine().appendLine()

                appendMapTest("A$argNum")

                if (upperNumber <= 3) {
                    val argNameToMap = getKotlinArgName(argNum)
                    val argNameCapitalized = argNameToMap.replaceFirstChar {
                        if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
                    }
                    appendMapTest(argNameCapitalized)
                }

                if (upperNumber >= 3) {

                    fun appendDropTest(argNameCapitalized: String) {
                        tupleDropTest.append(
                            """
                            |    @Test
                            |    fun drop${argNameCapitalized}() {
                            |        $vals
                            |        val tuple = $tupleCreation
                            |
                            |        expect(tuple.drop${argNameCapitalized}()) {
                            |            ${
                                (1..upperNumber - 1).joinToString("\n            ") {
                                    "feature { f(it::a${it}) }.toBeTheInstance(a${if (it < argNum) it else it + 1})"
                                }
                            }
                            |        }
                            |    }

		    				""".trimMargin()
                        ).appendLine()
                    }

                    appendDropTest("A$argNum")
                    if (upperNumber <= 3) {
                        val argNameToDrop = getKotlinArgName(argNum)
                        val argNameCapitalized = argNameToDrop.replaceFirstChar {
                            if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
                        }
                        appendDropTest(argNameCapitalized)
                    }
                }
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
                val toTupleName = "Tuple$upperNumber3"
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
                    val tupleNameParam = "Tuple$upperNumber2"
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

            tupleDropTest.append("}")
            if (upperNumber >= 3) {
                val dropTestFile = packageDir.resolve("drop/${tupleName}DropTest.kt")
                dropTestFile.writeText(tupleDropTest.toString())
            }

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


        mapVarargTest.append("}")
        val mapVarargTestFile = packageDir.resolve("MapVarargTest.kt")
        mapVarargTestFile.writeText(mapVarargTest.toString())


        mapVarargIndexedTest.append("}")
        val mapVarargIndexedTestFile = packageDir.resolve("MapVarargIndexedTest.kt")
        mapVarargIndexedTestFile.writeText(mapVarargIndexedTest.toString())
    }
}
generationTestFolder.builtBy(generateTest)

