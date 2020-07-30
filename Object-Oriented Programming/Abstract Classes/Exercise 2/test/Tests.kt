package abstractClassesExercise2

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestAbstractClassesExercise2 {

    private val packageName = "abstractClassesExercise2"

    private fun loadClass(className: String): KClass<*> = loadClass(packageName, className)

    @Test
    fun `#01 classes structure`() {
        loadClass("Movable").apply {
            assertInterface()
            assertDeclaredMemberFunction("move")
        }
        loadClass("Sleepable").apply {
            assertInterface()
            assertDeclaredMemberFunction("sleepOn")
        }
        loadClass("Sofa").apply {
            assertNoDeclaredMemberFunction("move")
            assertNoDeclaredMemberFunction("sleepOn")
            assertInheritance("Movable", "Sleepable")
        }
    }

    @Test
    fun `#02 sofa operations`() {
        loadClass("Sofa").apply {
            val sofa = createInstance()
            assertEquals(
                message = "Incorrect result of sofa.move() call",
                actual = assertMemberFunction("move").call(sofa),
                expected = "move"
            )
            assertEquals(
                message = "Incorrect result of sofa.sleepOn() call",
                actual = assertMemberFunction("sleepOn").call(sofa),
                expected = "sleep"
            )
        }
    }
}