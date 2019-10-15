package nullableTypes.exercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCountingHexadecimalCodes {
  private fun testCountingHexadecimalCodes(codes: List<String>, expected: Map<Int, Int>) {
    Assert.assertEquals("Wrong result for $codes:", expected, countHexadecimalCodes(codes))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = testCountingHexadecimalCodes(
      listOf("1", "3", "7", "8", "A", "B", "F"),
      mapOf(1 to 1, 3 to 1, 7 to 1, 8 to 1, 10 to 1, 11 to 1, 15 to 1))

  @Test(timeout = TIMEOUT)
  fun test2Sample() = testCountingHexadecimalCodes(listOf("1A", "1A", "1A"), mapOf(26 to 3))

  @Test(timeout = TIMEOUT)
  fun test3Sample() = testCountingHexadecimalCodes(listOf("Q"), mapOf())

  @Test(timeout = TIMEOUT)
  fun test4() = testCountingHexadecimalCodes(listOf("11", "11", "11"), mapOf(17 to 3))

  @Test(timeout = TIMEOUT)
  fun test5() = testCountingHexadecimalCodes(listOf("AB", "1AAB", "23"), mapOf(171 to 1, 6827 to 1, 35 to 1))
}