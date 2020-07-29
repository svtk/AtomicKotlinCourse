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
    loadClass("complexConstructorsExercise2", "SumChars")
        .apply {
          assertConstructorNumber(1)
          assertParametersOfFirstConstructor(
              "text" to String::class
          )
          loadAssertedMemberProperty(this, "sum", Int::class)
        }
  }

  @Test
  fun `#02 SumChars initialisation block`() {
    val sumCharsClass = loadClass("complexConstructorsExercise2", "SumChars")
    val sumCharsInstance = sumCharsClass.createInstance("What?")
    assertEquals(
        expected = 467,
        actual = sumCharsClass.memberProperties.firstOrNull { it.name == "sum" }?.call(sumCharsInstance),
        message = "SumChars member property 'sum' should be equal to 467"
    )
  }
}
