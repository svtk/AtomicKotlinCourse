package functionsExercise3

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT

class TestFunctions3 {
  private fun checkFunction(s: String) {
    Assert.assertEquals("""duplicate($s) should return "$s$s"""",
        duplicate(s), "$s$s")
  }

  @Test(timeout = TIMEOUT)
  fun test1() = checkFunction("abc")
}