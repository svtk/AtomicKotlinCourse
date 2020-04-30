package interfacesExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.loadClass
import kotlin.reflect.KClass
import kotlin.reflect.typeOf
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@OptIn(ExperimentalStdlibApi::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestInterfacesExercise1 {

    @Test
    fun `#01 cloud class structure`() {
        val actualClass = loadClass("interfacesExercise1", "Cloud")

        assertEquals(
                expected = 1,
                actual = actualClass.constructors.size,
                message = "Class Cloud should have only one constructor"
        )

        actualClass.constructors.first().also { constructor ->
            assertEquals(
                    expected = listOf(typeOf<Int>()),
                    actual = constructor.parameters.map { it.type },
                    message = "Constructor of class Cloud should take only one parameter of Int type"
            )
        }

        assertTrue(
                actual = actualClass.supertypes.contains(typeOf<Computer>()),
                message = "Class Cloud should implement interface Computer"
        )
    }

    @Test
    fun `#02 cloud answer`() {
        val cloudClass = loadClass("interfacesExercise1", "Cloud")
        cloudClass.assertAnswer(10, 45)
        cloudClass.assertAnswer(0, 0)
    }

    private fun KClass<*>.assertAnswer(nodes: Int, answer: Int) {
        val cloud = constructors.first().call(nodes)
        assertTrue(
                actual = cloud is Computer,
                message = "Class Cloud should implement interface Computer"
        )
        assertEquals(
                expected = answer,
                actual = cloud.calculateAnswer(),
                message = "Answer for $nodes nodes in the cloud should be $answer"
        )
    }
}
