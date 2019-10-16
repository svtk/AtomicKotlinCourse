package extensionsForNullableTypesExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestOrEmpty {
  private fun checkExpectedValue(s: String?, value: String) {
    Assert.assertEquals("Wrong value for $s:", value, s.orEmpty())
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkExpectedValue(null, "")

  @Test(timeout = TIMEOUT)
  fun test2Sample() = checkExpectedValue("abc", "abc")

  @Test(timeout = TIMEOUT)
  fun test3() = checkExpectedValue("s", "s")
}