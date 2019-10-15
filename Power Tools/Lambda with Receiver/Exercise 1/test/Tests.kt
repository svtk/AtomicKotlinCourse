package lambdaWithReceiver.exercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestDrawSquare {
  private fun check(width: Int) {
    Assert.assertEquals("Wrong result for width = $width:",
        buildString {
          repeat(width) {
            appendln("*".repeat(width))
          }
        }.trim(),
        drawSquare(width))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = check(3)

  @Test(timeout = TIMEOUT)
  fun test2() = check(0)

  @Test(timeout = TIMEOUT)
  fun test3() = check(1)

  @Test(timeout = TIMEOUT)
  fun test4() = check(5)

  @Test(timeout = TIMEOUT)
  fun test5() = check(6)
}