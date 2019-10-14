package nameAndDefaultArguments1

import org.junit.Assert
import org.junit.Test
import kotlin.reflect.KParameter

class TestRectangle {
  @Test
  fun testBuildingClass() {
    val rectangleClass = Rectangle::class
    val constructor = rectangleClass.constructors.first()
    val parameters = constructor.parameters
    Assert.assertEquals("Expected 3 parameters for 'Rectangle' constructor", 3, parameters.size)

    fun checkParameter(ordinal: String, name: String, type: String, param: KParameter) {
      Assert.assertEquals("Expected the $ordinal parameter named '$name'",
        name, param.name)
      Assert.assertEquals("Expected the parameter '$name' of type '$type'",
        type, param.type.toString())
    }
    val (side1, side2, color) = parameters
    checkParameter("first", "side1", "kotlin.Double", side1)
    checkParameter("second", "side2", "kotlin.Double", side2)
    checkParameter("third", "color", "kotlin.String", color)

    fun testValues(map: Map<String, Any>) {
      val paramMap = map.mapKeys { (paramName, _) ->
        when (paramName) {
          "side1" -> side1
          "side2" -> side2
          "color" -> color
          else -> throw AssertionError("Unknown parameter $paramName")
        }
      }
      val instance = constructor.callBy(paramMap)
      val side1Value = map["side1"] ?: 1.0
      val side2Value = map["side2"] ?: 2.0
      val colorValue = map["color"] ?: "yellow"
      val expected = "Rectangle ${side1Value}x$side2Value of '$colorValue' color"
      val message = "Wrong result for " + if (map.isEmpty()) "no parameters" else "parameters $map"
      Assert.assertEquals(message, expected, instance.toString())
    }

    testValues(mapOf())
    testValues(mapOf("side1" to 1.1))
    testValues(mapOf("side2" to 2.2))
    testValues(mapOf("color" to "blue"))
    testValues(mapOf("side1" to 1.1, "color" to "blue"))
    testValues(mapOf("side1" to 1.1, "side2" to 2.2))
    testValues(mapOf("side2" to 2.2, "color" to "blue"))
  }
}