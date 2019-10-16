package numberTypesExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestNumberTypes2 {
  @Test(timeout = TIMEOUT)
  fun test1Million() {
    Assert.assertEquals(1_000_000, million)
  }

  @Test(timeout = TIMEOUT)
  fun test2Billion() {
    Assert.assertEquals(1_000_000_000, billion)
  }

  @Test(timeout = TIMEOUT)
  fun test3Trillion() {
    Assert.assertEquals(1_000_000_000_000, trillion)
  }

  @Test(timeout = TIMEOUT)
  fun test4Quintillion() {
    Assert.assertEquals(1_000_000_000_000_000_000, quintillion)
  }

  @Test(timeout = TIMEOUT)
  fun test5MillionType() {
    Assert.assertEquals("Int", millionType)
  }

  @Test(timeout = TIMEOUT)
  fun test6BillionType() {
    Assert.assertEquals("Int", billionType)
  }

  @Test(timeout = TIMEOUT)
  fun test7TrillionType() {
    Assert.assertEquals("Long", trillionType)
  }

  @Test(timeout = TIMEOUT)
  fun test8QuintillionType() {
    Assert.assertEquals("Long", quintillionType)
  }
}