package destructuringDeclarationsExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestDestructuringDeclarationsExercise3 {

    @Test
    fun `#01 class name`() {
        loadClass("destructuringDeclarationsExercise3", "Person")
    }

    @Test
    fun `#02 class declaration`() {
        val actualClass = Person::class
        assertTrue(
                actual = actualClass.isData,
                message = "Class Person has to be declared as a data class"
        )
        loadAssertedMemberProperty(actualClass, "name", String::class)
        loadAssertedMemberProperty(actualClass, "surname", String::class)
        loadAssertedMemberProperty(actualClass, "age", Int::class)
    }

    @Test
    fun `#03 main output`() {
        val person = createInstance<Person>("Alice", "Johnson", 30)
        val expected = "Name: Alice\nAge: Johnson\n"
        runAndCheckSystemOutput(
                expectedOutput = expected,
                message = "Incorrect result of class destructuring, expected output:\n$expected"
        ) {
            displayPersonInfo(person)
        }
    }
}
