package extensionPropertiesExercise2

import org.junit.Assert
import org.junit.Test
import util.loadFileFacade
import util.loadToplevelPropertyGetter

class TestExtensionPropertiesExercise2 {
  private fun <T> testProp(list: List<T>) {
    val fileFacade = loadFileFacade("extensionPropertiesExercise2")
    val property = loadToplevelPropertyGetter(fileFacade, "reversed")
    Assert.assertTrue("The 'reversed' property must be an *extension* property",
      property.parameters.size == 1)
    Assert.assertTrue("Wrong receiver for 'reversed' property: should be 'List<T>'",
      List::class.java == property.parameters.single().type)
    val actual = property.invoke(Object(), list)
    Assert.assertEquals("Wrong result for $list", list.reversed(), actual)
  }

  @Test
  fun test1() = testProp(listOf(1, 2, 3))

  @Test
  fun test2() = testProp(listOf(4, 9, 11))

  @Test
  fun test3() = testProp(listOf("ab", "cde", "z"))

  @Test
  fun test4() = testProp(('a'..'z').toList())
}