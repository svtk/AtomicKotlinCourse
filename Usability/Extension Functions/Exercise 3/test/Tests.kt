package extensionFunctionsExercise3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestExtensionFunctionsExercise3 {
  private fun message(rectangle: Rectangle, expected: Boolean) =
    "Wrong result for rectangle $rectangle; it should${if (expected) "" else "n't"} cover zero:"

  private fun checkCovering(rectangle: Rectangle, expected: Boolean) {
    Assert.assertEquals(message(rectangle, expected), expected, rectangle.coversZero())
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkCovering(Rectangle(-1, -1, 2, 2), true)

  @Test(timeout = TIMEOUT)
  fun test2Sample() = checkCovering(Rectangle(1, 1, 2, 2), false)

  @Test(timeout = TIMEOUT)
  fun test3() = checkCovering(Rectangle(-10, -10, 10, 10), true)

  @Test(timeout = TIMEOUT)
  fun test4() = checkCovering(Rectangle(-10, -10, 9, 9), false)

  @Test(timeout = TIMEOUT)
  fun test5() = checkCovering(Rectangle(-10, -10, 11, 9), false)
}