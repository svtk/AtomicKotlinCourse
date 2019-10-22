package creatingClassesExercise5

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCreatingClassesExercise5 {
  private fun testString(s: String) {
    Assert.assertEquals("""Wrong result for task("$s"):""", s.capitalize(), cap(s))
  }

  @Test(timeout = TIMEOUT)
  fun test1() = testString("abc")

  @Test(timeout = TIMEOUT)
  fun test2() = testString("Abc")

  @Test(timeout = TIMEOUT)
  fun test3() = testString("ABC")

  @Test(timeout = TIMEOUT)
  fun test4() = testString("aBc")

  @Test(timeout = TIMEOUT)
  fun test5() = testString("abC")
}