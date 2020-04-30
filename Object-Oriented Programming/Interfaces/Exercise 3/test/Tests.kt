package interfacesExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.loadClass
import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestInterfacesExercise3 {

    companion object {
        private const val PROP_NAME = "sound"
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
                    actual = clazz.memberProperties.map { it.name }.contains(PROP_NAME),
                    message = "Class ${clazz.simpleName} should implement property \"$PROP_NAME\""
            )
        }
    }

    private fun loadClasses(): List<KClass<out Any>> {
        return listOf("Pet", "Dog", "Cat", "Hamster")
                .map { name -> loadClass("interfacesExercise3", name) }
    }

    @Test
    fun `#02 pets sounds`() {
        val actualSounds = loadClasses()
                .subList(1, 4)
                .map { it to it.constructors.first().call() }
                .map { (clazz, pet) ->
                    val soundGetter = clazz.memberProperties.find { it.name == PROP_NAME }!!
                    soundGetter.call(pet)
                }
        val expectedSounds = listOf("Bark!", "Meow!", "Squeak!")
        assertEquals(
                expected = expectedSounds,
                actual = actualSounds,
                message = "Expected the following set of sounds: $expectedSounds"
        )
    }
}
