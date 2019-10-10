package testing3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTesting {

  @Test(timeout = TIMEOUT)
  fun test1SquareArea() = Assert.assertEquals(
      """Calling "squareArea(1) eq 1" fails:""", 1, squareArea(1))

  @Test(timeout = TIMEOUT)
  fun test2SquareArea() = Assert.assertEquals(
      """Calling "squareArea(2) eq 4" fails:""", 4, squareArea(2))

  @Test(timeout = TIMEOUT)
  fun test3SquareArea() = Assert.assertEquals(
      """Calling "squareArea(5) eq 25" fails:""", 25, squareArea(5))

  @Test(timeout = TIMEOUT)
  fun test4RectangleArea() = Assert.assertEquals(
      """Calling "rectangleArea(2, 2) eq 4" fails:""", 4, rectangleArea(2, 2))

  @Test(timeout = TIMEOUT)
  fun test5RectangleArea() = Assert.assertEquals(
      """Calling "rectangleArea(5, 4) eq 20" fails:""", 20, rectangleArea(5, 4))

  @Test(timeout = TIMEOUT)
  fun test6TrapezoidArea() = Assert.assertEquals(
      """Calling "trapezoidArea(2, 2, 4) eq 8.0" fails:""",
      8.0, trapezoidArea(2, 2, 4).toDouble(), 0.00000001)

  @Test(timeout = TIMEOUT)
  fun test7TrapezoidArea() = Assert.assertEquals(
      """Calling "trapezoidArea(3, 4, 1) eq 3.5" fails:""",
      3.5, trapezoidArea(3, 4, 1).toDouble(), 0.00000001)
}