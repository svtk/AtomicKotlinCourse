package baseClassInitialization1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestImmovableElement {
    @Test
    fun test1Sample() {
        val wall = Wall()
        Assert.assertEquals("Wrong value for wall.symbol", '#', wall.symbol)
        Assert.assertEquals("Wrong value for wall.preventMovement", true, wall.preventMovement)

        val food = Food()
        Assert.assertEquals("Wrong value for food.symbol", '.', food.symbol)
        Assert.assertEquals("Wrong value for food.preventMovement", false, food.preventMovement)

        val elements: List<Any> = listOf(wall, food)
        Assert.assertTrue("Wall and Food should extend ImmovableElement", elements.all {
            (it is ImmovableElement)
        })
    }
}