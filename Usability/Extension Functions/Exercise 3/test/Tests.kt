package extensionFunctions3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRectangle {
    private fun message(rectangle: Rectangle, expected: Boolean) =
            "Wrong result for rectangle $rectangle; it should${if (expected) "" else "n't"} cover zero:"

    private fun checkCovering(rectangle: Rectangle, expected: Boolean) {
        Assert.assertEquals(message(rectangle, expected), expected, rectangle.coversZero())
    }

    @Test
    fun test1Sample() = checkCovering(Rectangle(-1, -1, 2, 2), true)

    @Test
    fun test2Sample() = checkCovering(Rectangle(1, 1, 2, 2), false)

    @Test
    fun test3() = checkCovering(Rectangle(-10, -10, 10, 10), true)

    @Test
    fun test4() = checkCovering(Rectangle(-10, -10, 9, 9), false)

    @Test
    fun test5() = checkCovering(Rectangle(-10, -10, 11, 9), false)
}