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

        (2..numOfArgs).forEach { upperNumber ->
            val numbers = (1..upperNumber).toList()
            val typeArgs = numbers.joinToString(", ") { "A$it" }
            val constructorProperties = numbers.joinToString(",\n    ") { "val a$it: A$it" }
            val tupleName = getTupleName(upperNumber)
            val tuple = createStringBuilder(packageName)

            // we don't create a Tuple2, and Tuple3
            if (upperNumber >= 4) {
                tuple.append(
                    """
                |/**
                | * Represents a simple data structure to hold $upperNumber values.
                | *
                | * @since 1.3.0
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
                    |* @since 1.3.0
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
                        |* @since 1.3.0
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
                    |* @since 1.3.0
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
        val argValues = sequenceOf(
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

        (2..numOfArgs).forEach { upperNumber ->
            val numbers = (1..upperNumber)
            val tupleName = getTupleName(upperNumber)
            val tupleCreation = """$tupleName(${argValues.take(upperNumber).joinToString(", ")})"""

            val mapTest = createStringBuilder("$packageName.map")
                .appendTest("${tupleName}MapTest")

            val appendTest = createStringBuilder("$packageName.append")
                .appendTest("${tupleName}AppendTest")

            val glueTest = createStringBuilder("$packageName.glue")
                .appendTest("${tupleName}GlueTest")

            numbers.forEach { argNum ->
                val argNameToMap = getArgName(upperNumber, argNum)
                val argNameCapitalized = argNameToMap.replaceFirstChar {
                    if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
                }
                listOf(1, 2, 3).withIndex()

                val vals = argValues.take(upperNumber).withIndex().joinToString("\n        ") { (index, value) ->
                    "val a${index + 1} = listOf($value)"
                }
                val tupleListCreation =
                    """$tupleName(${numbers.joinToString(", ") { "a$it" }})"""
                val tupleListResult = """$tupleName(${
                    argValues.take(upperNumber).withIndex().joinToString(", ") { (index, value) ->
                        if (index + 1 == argNum) value else "a${index + 1}"
                    }
                })"""
                val checkInstances = numbers.filter { it != argNum }.joinToString("\n            ") {
                    """
                    |feature { f(it::${getArgName(upperNumber, it)}) }.toBeTheInstance(a${it})
                    """.trimMargin()
                }
                mapTest.append(
                    """
                    |    @Test
                    |    fun map${argNameCapitalized}__identity__returns_equal_$tupleName() {
                    |        expect(
                    |            $tupleCreation
                    |                .map${argNameCapitalized}(::identity)
                    |        ).toEqual(
                    |            $tupleCreation
                    |        )
                    |    }
                    |
                    |    @Test
                    |    fun map${argNameCapitalized}__transformation_does_not_touch_other_properties() {
                    |        $vals
                    |        expect(
                    |            $tupleListCreation
                    |                .map${argNameCapitalized} { it.first() }
                    |        ) {
                    |            toEqual($tupleListResult)
                    |            $checkInstances
                    |        }
                    |    }
                     """.trimMargin()
                ).appendLine().appendLine()
            }

            (1..numOfArgs - upperNumber).forEach { upperNumber2 ->
                val upperNumber3 = upperNumber + upperNumber2
                val toTupleName = getTupleName(upperNumber3)

                val toTupleNameCreation = """$toTupleName(${argValues.take(upperNumber3).joinToString(", ")})"""

                appendTest.append(
                    """
                        |    @Test
                        |    fun append_${upperNumber2}_values__results_in_a_$toTupleName() {
                        |        expect(
                        |            $tupleCreation
                        |                .append(${argValues.drop(upperNumber).take(upperNumber2).joinToString(", ")})
                        |        ).toEqual(
                        |            $toTupleNameCreation
                        |        )
                        |    }
                         """.trimMargin()
                ).appendLine().appendLine()

                if (upperNumber2 > 1) {
                    val tupleNameParam = getTupleName(upperNumber2)
                    val tupleNameParamCreation =
                        """$tupleNameParam(${argValues.drop(upperNumber).take(upperNumber2).joinToString(", ")})"""

                    glueTest.append(
                        """
                        |    @Test
                        |    fun glue_${tupleNameParam}__results_in_a_$toTupleName() {
                        |        expect(
                        |            $tupleCreation
                        |                .glue($tupleNameParamCreation)
                        |        ).toEqual(
                        |            $toTupleNameCreation
                        |        )
                        |    }
                         """.trimMargin()
                    ).appendLine().appendLine()
                }

            }

            mapTest.append("}")
            val mapTestFile = packageDir.resolve("map/${tupleName}MapTest.kt")
            mapTestFile.writeText(mapTest.toString())


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
    }
}
generationTestFolder.builtBy(generateTest)

