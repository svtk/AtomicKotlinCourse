package extensionFunctionsExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestExtensionFunctionsExercise1 {
  private fun checkWrapping(tagName: String, string: String) {
    Assert.assertEquals("Wrong result for $tagName:",
      "<$tagName>$string</$tagName>", string.wrapInTag(tagName))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkWrapping("animal", "cat")

  @Test(timeout = TIMEOUT)
  fun test2() = checkWrapping("data", "tag")
}