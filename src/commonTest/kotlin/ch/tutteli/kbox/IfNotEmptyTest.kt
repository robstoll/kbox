package ch.tutteli.kbox

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.api.verbs.expectGrouped
import kotlin.test.Test

class IfNotEmptyTest {

    @Test
    fun it_returns_the_collection_itself_if_empty() {
        expectGrouped {
            listOf<Collection<Int>>(
                emptyList(),
                emptySet(),
            ).forEach { collection ->
                group("check it works with ${collection::class.simpleName}") {
                    expect(collection.ifNotEmpty { nonEmptyCollection ->
                        nonEmptyCollection.map { it + 1 }
                    }).toBeTheInstance(collection)
                }
            }
        }
    }

    @Test
    fun it_returns_the_result_of_the_transformation_if_not_empty() {
        expectGrouped {
            listOf(
                listOf(1),
                setOf(1),
            ).forEach { collection ->
                group("check it works with ${collection::class.simpleName}") {
                    expect(collection.ifNotEmpty { nonEmptyCollection ->
                        nonEmptyCollection.map { it + 1 }
                    }).toContainExactly(2)
                }
            }
        }
    }
}

