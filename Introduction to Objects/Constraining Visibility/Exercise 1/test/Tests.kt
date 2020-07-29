package constrainingVisibilityExercise1

import org.junit.Assert
import org.junit.Test
import util.*

class TestConstrainingVisibilityExercise1 {
  @Test(timeout = TIMEOUT)
  fun test1() {
    val alienClass = loadClass("constrainingVisibilityExercise1", "Alien")
        .apply {
          assertParametersOfFirstConstructor(
              "name" to String::class,
              "species" to String::class,
              "planet" to String::class
          )
        }

    val alienInstance = alienClass.constructors.first().call("Arthricia", "Cat Person", "PurgeWorld")
    Assert.assertEquals("Wrong 'toString' result after 'Alien' creation",
        "Alien Arthricia, Cat Person: PurgeWorld", alienInstance.toString())

    val movePlanetFunc = loadMemberFunction(alienClass, "movePlanet")
    checkParametersOfMemberFunction(movePlanetFunc, listOf("" to "kotlin.String"))
    movePlanetFunc.call(alienInstance, "Earth C-137")

    Assert.assertEquals("Wrong result after moving planet",
        "Alien Arthricia, Cat Person: Earth C-137", alienInstance.toString())
  }
}