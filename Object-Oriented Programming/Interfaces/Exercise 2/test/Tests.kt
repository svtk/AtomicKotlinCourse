package interfacesExercise2

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.loadClass
import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestInterfacesExercise2 {

    companion object {
        private const val FUNC_NAME = "speak"
    }

    @Test
    fun `#01 pets structure`() {
        val loadClasses = loadClasses()
        assertTrue(
                actual = loadClasses.first().isAbstract,
                message = "Class ${loadClasses.first().simpleName} should be an abstract class or an interface"
        )
        loadClasses.forEach { clazz ->
            assertTrue(
                    actual = clazz.memberFunctions.map { it.name }.contains(FUNC_NAME),
                    message = "Class ${clazz.simpleName} should implement method \"$FUNC_NAME\""
            )
        }
    }

    private fun loadClasses(): List<KClass<out Any>> {
        return listOf("Pet", "Dog", "Cat", "Hamster")
                .map { name -> loadClass("interfacesExercise2", name) }
    }

    @Test
    fun `#02 pets speak`() {
        val actualSounds = loadClasses()
                .subList(1, 4)
                .map { it to it.constructors.first().call() }
                .map { (clazz, pet) ->
                    val speakFunc = clazz.memberFunctions.find { it.name == FUNC_NAME }!!
                    speakFunc.call(pet)
                }
        val expectedSounds = listOf("Bark!", "Meow!", "Squeak!")
        assertEquals(
                expected = expectedSounds,
                actual = actualSounds,
                message = "Expected the following set of sounds: $expectedSounds"
        )
    }
}
