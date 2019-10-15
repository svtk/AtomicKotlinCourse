package baseClassInitialization.exercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestStaticElement {
  @Test(timeout = TIMEOUT)
  fun test1Sample() {
    val wall = Wall()
    Assert.assertEquals("Wrong value for wall.symbol", '#', wall.symbol)
    Assert.assertEquals("Wrong value for wall.sharesCell", false, wall.sharesCell)

    val food = Food()
    Assert.assertEquals("Wrong value for food.symbol", '.', food.symbol)
    Assert.assertEquals("Wrong value for food.sharesCell", true, food.sharesCell)

    val elements: List<Any> = listOf(wall, food)
    Assert.assertTrue("Wall and Food should extend StaticElement", elements.all {
      (it is StaticElement)
    })
  }
}