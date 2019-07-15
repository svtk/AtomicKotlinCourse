package thewithFunction2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestWith2Function {
    @Test
    fun test1Sample() {
        val window = Window("my")
        with2(window) {
            it.x = 10
            it.y = 10
            it.width *= 2
            it.height *= 2
        }
        Assert.assertEquals("Wrong result for sample (x)", 10, window.x)
        Assert.assertEquals("Wrong result for sample (y)", 10, window.y)
        Assert.assertEquals("Wrong result for sample (width)", 400, window.width)
        Assert.assertEquals("Wrong result for sample (height)", 200, window.height)
    }
}