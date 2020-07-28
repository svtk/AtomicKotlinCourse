package sealedClassesExercise3

import org.junit.Test
import util.loadClass
import kotlin.random.Random
import kotlin.reflect.full.superclasses
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TestSealedClassesExercise3 {

    private val packageName = "sealedClassesExercise3"

    @Test
    fun `#01 classes structure`() {
        loadClass(packageName, "Top").also { top ->
            assertTrue(
                    message = "Class ${top.simpleName} is not sealed",
                    actual = top.isSealed
            )
            assertEquals(
                    message = "Should implement three sealed subclasses",
                    expected = listOf("Middle1", "Middle2", "Middle3"),
                    actual = top.sealedSubclasses.map { it.simpleName!! }.sorted()

            )
            top.sealedSubclasses
                    .first { it.simpleName == "Middle3" }
                    .also { middle3 ->
                        assertTrue(
                                message = "Class ${middle3.simpleName} is expected to be open",
                                actual = middle3.isOpen
                        )
                        val sealedSubclassesNames = top.sealedSubclasses.map { it.simpleName!! }
                        top.nestedClasses
                                .first { !sealedSubclassesNames.contains(it.simpleName!!) }
                                .also { bottom ->
                                    assertTrue(
                                            message = "Class ${middle3.simpleName} is expected to have at least one derived class",
                                            actual = bottom.superclasses.contains(middle3)
                                    )
                                }
                    }
        }
    }

    @Test
    fun `#02 random sealed subclass`() {
        val rand = Random(17)
        assertEquals(
                message = "Expected sealed subclass Middle3",
                expected = "Middle3",
                actual = Top::class.sealedSubclasses.random(rand).simpleName
        )
    }
}
