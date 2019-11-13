package extensionPropertiesExercise3

import org.junit.Assert
import org.junit.Test
import util.*

class TestExtensionPropertiesExercise3 {
  private fun testRectangle(width: Int, height: Int) {
    val rectangleClass = loadClass("extensionPropertiesExercise3", "Rectangle")
    val constructor = rectangleClass.constructors.first()
    checkParametersOfConstructor(constructor, rectangleClass,
      listOf("width" to "kotlin.Int", "height" to "kotlin.Int"))
    val rectangleInstance = constructor.call(width, height)

    val fileFacade = loadFileFacade("extensionPropertiesExercise3")
    val property = loadToplevelPropertyGetter(fileFacade, "isSquare")

    checkPropertyIsExtension(property, rectangleClass)

    val actual = property.invoke(Object(), rectangleInstance)
    Assert.assertEquals("Wrong result for 'isSquare' for Rectangle($width, $height)",
      width == height, actual)
  }

  @Test
  fun test1() = testRectangle(1, 1)

  @Test
  fun test2() = testRectangle(2, 3)

  @Test
  fun test3() = testRectangle(-1, 3)

  @Test
  fun test4() = testRectangle(4, 4)
}