package hashingExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSetsSize {
  @Test(timeout = TIMEOUT)
  fun testSizeOfFirstSet() {
    Assert.assertTrue("Wrong answer for set1", getSet1Size() == 2)
  }

  @Test(timeout = TIMEOUT)
  fun testSizeOfSecondSet() {
    Assert.assertTrue("Wrong answer for set2", getSet2Size() == 1)
  }
}