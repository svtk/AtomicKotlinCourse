package polymorphismExercise2

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.assertConstructorNumber
import util.assertInheritance
import util.loadClass
import util.loadTraceContent
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPolymorphismExercise2 {

    private val packageName = "polymorphismExercise2"

    @Test
    fun `#01 classes structure`() {
        loadClass(packageName, "Animal").apply {
            assertConstructorNumber(1)
        }
        loadClass(packageName, "Frog").apply {
            assertConstructorNumber(1)
            assertInheritance(this, listOf("Animal"))
        }
    }

    @Test
    fun `#02 how does the frog jump`() {
        (loadClass(packageName, "Frog").createInstance() as Animal).jump()

        assertEquals(
                message = "Incorrect result of frog jump()",
                actual = loadTraceContent(packageName),
                expected = listOf(
                        "Frog: jump",
                        "Animal: jump",
                        "Frog: talk",
                        "Animal: talk"
                )
        )
    }
}
