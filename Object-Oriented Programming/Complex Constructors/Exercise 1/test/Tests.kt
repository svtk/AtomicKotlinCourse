package complexConstructorsExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.full.memberProperties
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestComplexConstructorsExercise1 {

    @Test
    fun `#01 Alien class structure`() {
        val alienClass = loadClass("complexConstructorsExercise1", "Alien")
        alienClass.assertConstructorNumber(1)
        val alienConstructor = alienClass.constructors.first()
        checkParametersOfConstructor(alienConstructor, alienClass, listOf("name" to "kotlin.String"))
        loadAssertedMemberProperty(alienClass, "myName", String::class)
        assertNoMemberProperty(alienClass, "name")
    }

    @Test
    fun `#02 Alien initialisation block`() {
        val alienClass = loadClass("complexConstructorsExercise1", "Alien")
        val alienInstance = alienClass.constructors.first().call("Pencilvester")
        assertEquals(
                expected = "Pencilvester",
                actual = alienClass.memberProperties.firstOrNull { it.name == "myName" }?.call(alienInstance),
                message = "Alien member property 'myName' should be equal to 'Pencilvester'"
        )

    }
}
