package ch.tutteli.kbox

import ch.tutteli.atrium.api.cc.en_GB.toBe
import ch.tutteli.atrium.assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given

object IsNotNullAndNotSpec : Spek({
    describe("${CharSequence?::isNotNullAndNotEmpty}") {
        listOf<Triple<String, CharSequence?, Boolean>>(
            Triple("null", null, false),
            Triple("empty String", "", false),
            Triple("empty StringBuilder", StringBuilder(), false),
            Triple("String \"   \"", StringBuilder("hello"), true),
            Triple("StringBuilder \"   \"", StringBuilder("   "), true),
            Triple("String \"hello\"", "hello", true),
            Triple("StringBuilder \"hello\"", StringBuilder("hello"), true)
        ).forEach { (description, value, expected) ->
            given("$description, expect $expected") {
                assert(value.isNotNullAndNotEmpty()).toBe(expected)
            }
        }
    }

    describe("${CharSequence?::isNotNullAndNotBlank}") {
        listOf<Triple<String, CharSequence?, Boolean>>(
            Triple("null", null, false),
            Triple("empty String", "", false),
            Triple("empty StringBuilder", StringBuilder(), false),
            Triple("String \"   \"", StringBuilder("hello"), false),
            Triple("StringBuilder \"   \"", StringBuilder("   "), false),
            Triple("String \"hello\"", "hello", true),
            Triple("StringBuilder \"hello\"", StringBuilder("hello"), true)
        ).forEach { (description, value, expected) ->
            given("$description, expect $expected") {
                assert(value.isNotNullAndNotEmpty()).toBe(expected)
            }
        }
    }
})
