import libraryhelpers.transformVersion2
import org.junit.Assert
import org.junit.Test
import util.TIMEOUT

class TestScopeFunctionsExercise3 {
  @Test(timeout = TIMEOUT)
  fun testSample() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = listOf(9, 25)
    Assert.assertEquals("Wrong result for $list:",
      transformVersion2(list), result)
  }

  @Test(timeout = TIMEOUT)
  fun testOtherExample() {
    val list = listOf(24, 12, 9, 13, 15)
    val result = listOf(169, 225)
    Assert.assertEquals("Wrong result for $list:",
      transformVersion2(list), result)
  }
}