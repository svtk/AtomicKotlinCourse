package lambdawithReceiver1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

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

  @Test
  fun test1Sample() = check(3)

  @Test
  fun test2() = check(0)

  @Test
  fun test3() = check(1)

  @Test
  fun test4() = check(5)

  @Test
  fun test5() = check(6)
}