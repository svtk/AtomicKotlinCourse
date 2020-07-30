package abstractClassesExercise2

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestAbstractClassesExercise2 {

    private val packageName = "abstractClassesExercise2"

    @Test
    fun `#01 classes structure`() {
        loadClass(packageName, "Movable").apply {
            assertEquals(
                message = "$simpleName should be an interface",
                expected = true,
                actual = isAbstract
            )
            assertDeclaredMemberFunction("move")
        }
        loadClass(packageName, "Sleepable").apply {
            assertEquals(
                message = "$simpleName should be an interface",
                expected = true,
                actual = isAbstract
            )
            assertDeclaredMemberFunction("sleepOn")
        }
        loadClass(packageName, "Sofa").apply {
            assertNoDeclaredMemberFunction("move")
            assertNoDeclaredMemberFunction("sleepOn")
            assertInheritance("Movable", "Sleepable")
        }
    }

    @Test
    fun `#02 sofa operations`() {
        loadClass(packageName, "Sofa").apply {
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