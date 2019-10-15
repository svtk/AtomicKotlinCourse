package theImportanceOfLambdas2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestFilterNonBlank {
  private fun checkList(strings: List<String>) {
    Assert.assertEquals("Wrong result for $strings",
        strings.filter { it.isNotBlank() },
        filterNonBlank(strings))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkList(listOf("", "a", "  "))

  @Test(timeout = TIMEOUT)
  fun test2() = checkList(listOf("a", "  ", "b", "     ", "c"))
}