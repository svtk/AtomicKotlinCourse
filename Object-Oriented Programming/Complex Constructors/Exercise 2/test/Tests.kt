package complexConstructorsExercise2

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.full.memberProperties
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestComplexConstructorsExercise2 {

    @Test
    fun `#01 SumChars class structure`() {
        val sumCharsClass = loadClass("complexConstructorsExercise2", "SumChars")
        sumCharsClass.assertConstructorNumber(1)
        val sumCharsConstructor = sumCharsClass.constructors.first()
        checkParametersOfConstructor(sumCharsConstructor, sumCharsClass, listOf("text" to "kotlin.String"))
        loadAssertedMemberProperty(sumCharsClass, "sum", Int::class)
    }

    @Test
    fun `#02 SumChars initialisation block`() {
        val sumCharsClass = loadClass("complexConstructorsExercise2", "SumChars")
        val sumCharsInstance = sumCharsClass.constructors.first().call("What?")
        assertEquals(
                expected = 467,
                actual = sumCharsClass.memberProperties.firstOrNull { it.name == "sum" }?.call(sumCharsInstance),
                message = "SumChars member property 'sum' should be equal to 467"
        )
    }
}
