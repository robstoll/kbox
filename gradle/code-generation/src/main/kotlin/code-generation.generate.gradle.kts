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

fun createStringBuilder(packageName: String) = StringBuilder(dontModifyNotice)
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

val generate: TaskProvider<Task> = tasks.register("generate") {
    doFirst {
        val packageDir = File(generationFolder.asPath + "/" + packageNameAsPath)
        val append = StringBuilder(dontModifyNotice)
            .append("@file:Suppress(\"MethodOverloading\")\n")
            .append("package ").append(packageName).append("\n\n")

        val glue = StringBuilder(dontModifyNotice)
            .append("@file:Suppress(\"MethodOverloading\")\n")
            .append("package ").append(packageName).append("\n\n")

        val map = createStringBuilder(packageName)

        val tupleFactory = StringBuilder(dontModifyNotice)
            .append("@file:Suppress(\"MethodOverloading\", \"FunctionName\")\n")
            .append("package ").append(packageName).append("\n\n")


        (2..numOfArgs).forEach { upperNumber ->
            val numbers = (1..upperNumber).toList()
            val typeArgs = numbers.joinToString(", ") { "A$it" }
            val constructorProperties = numbers.joinToString(",\n    ") { "val a$it: A$it" }
            val parameters = numbers.joinToString(", ") { "a$it: A$it" }
            val arguments = numbers.joinToString(", ") { "a$it" }
            val tupleName = getTupleName(upperNumber)
            val tupleLike = createStringBuilder(packageName)
            val tuple = createStringBuilder(packageName)

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
                          |     * Returns the $it${
                            when (it) {
                                1 -> "st"
                                2 -> "nd"
                                3 -> "rd"
                                else -> "th"
                            }
                        } component of this Tuple${upperNumber}Like data structure.
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
                    | * @since 2.0.0
                    | */
                    |@Suppress("UndocumentedPublicProperty")
                    |data class $tupleName<$typeArgs>(
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
                val properties = numbers.joinToString(", ") { getArgName(upperNumber, it) }


                append.append(
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

                    glue.append(
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
                map.append(
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

        val appendFile = packageDir.resolve("tupleAppend.kt")
        appendFile.writeText(append.toString())

        val glueFile = packageDir.resolve("tupleGlue.kt")
        glueFile.writeText(glue.toString())

        val mapFile = packageDir.resolve("tupleMap.kt")
        mapFile.writeText(map.toString())

        val tupleFactoryFile = packageDir.resolve("tupleFactory.kt")
        tupleFactoryFile.writeText(tupleFactory.toString())
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
        val argValuesNotMapped =  sequenceOf(
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

        val factoryTest = createStringBuilder("$packageName")
            .appendTest("TupleFactoryTest")

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

            val mapTest = createStringBuilder("$packageName.map")
                .appendTest("${tupleName}MapTest")

            val toTupleTest = createStringBuilder("$packageName.toTuple")
                .appendTest("Tuple${upperNumber}LikeToTupleTest")

            val appendTest = createStringBuilder("$packageName.append")
                .appendTest("${tupleName}AppendTest")

            val glueTest = createStringBuilder("$packageName.glue")
                .appendTest("${tupleName}GlueTest")

            factoryTest.append(
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

                mapTest.append(
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

            (1..numOfArgs - upperNumber).forEach { upperNumber2 ->
                val upperNumber3 = upperNumber + upperNumber2
                val toTupleName = getTupleName(upperNumber3)
                val vals3AsArgs = (upperNumber + 1..upperNumber3).joinToString(", ") { "a$it" }

                appendTest.append(
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

                    glueTest.append(
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

            mapTest.append("}")
            val mapTestFile = packageDir.resolve("map/${tupleName}MapTest.kt")
            mapTestFile.writeText(mapTest.toString())

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


            //cannot append to tuple of max arity
            if (upperNumber < numOfArgs) {
                appendTest.append("}")
                val appendTestFile = packageDir.resolve("append/${tupleName}AppendTest.kt")
                appendTestFile.writeText(appendTest.toString())
            }

            //cannot glue to tuple of max arity with another, same same for tuple of max arity -1
            if (upperNumber < numOfArgs - 1) {
                glueTest.append("}")
                val glueTestFile = packageDir.resolve("glue/${tupleName}GlueTest.kt")
                glueTestFile.writeText(glueTest.toString())
            }
        }

        factoryTest.append("}")
        val factoryTestFile = packageDir.resolve("TupleFactoryTest.kt")
        factoryTestFile.writeText(factoryTest.toString())
    }
}
generationTestFolder.builtBy(generateTest)

