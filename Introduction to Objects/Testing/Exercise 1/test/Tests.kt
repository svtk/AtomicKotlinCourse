package testing1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTesting {

    @Test
    fun test1SquareArea() = Assert.assertEquals(
            """Calling "squareArea(1) eq 1" fails:""", 1, squareArea(1))

    @Test
    fun test2SquareArea() = Assert.assertEquals(
            """Calling "squareArea(2) eq 4" fails:""", 4, squareArea(2))

    @Test
    fun test3SquareArea() = Assert.assertEquals(
            """Calling "squareArea(5) eq 25" fails:""", 25, squareArea(5))

    @Test
    fun test4RectangleArea() = Assert.assertEquals(
            """Calling "rectangleArea(2, 2) eq 4" fails:""", 4, rectangleArea(2, 2))

    @Test
    fun test5RectangleArea() = Assert.assertEquals(
            """Calling "rectangleArea(5, 4) eq 20" fails:""", 20, rectangleArea(5, 4))

    @Test
    fun test6TrapezoidArea() = Assert.assertEquals(
            """Calling "trapezoidArea(2, 2, 4) eq 8.0" fails:""",
            8.0, trapezoidArea(2, 2, 4).toDouble(), 0.00000001)

    @Test
    fun test7TrapezoidArea() = Assert.assertEquals(
            """Calling "trapezoidArea(3, 4, 1) eq 3.5" fails:""",
            3.5, trapezoidArea(3, 4, 1).toDouble(), 0.00000001)
}