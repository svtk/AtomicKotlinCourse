package listsExercise3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestListsExercise3 {
  private fun testAnagrams(word: String, anagram: String) =
    Assert.assertTrue("'$word' and '$anagram' should be anagrams", checkAnagrams(word, anagram))

  private fun testNotAnagrams(word: String, other: String) =
    Assert.assertFalse("'$word' and '$other' should not be anagrams", checkAnagrams(word, other))

  @Test(timeout = TIMEOUT)
  fun testAnagrams1() = testAnagrams("thing", "night")

  @Test(timeout = TIMEOUT)
  fun testAnagrams2() = testAnagrams("leader", "dealer")

  @Test(timeout = TIMEOUT)
  fun testAnagrams3() = testAnagrams("sector", "escort")

  @Test(timeout = TIMEOUT)
  fun testAnagrams4() = testAnagrams("tablet", "battle")

  @Test(timeout = TIMEOUT)
  fun testAnagrams5() = testAnagrams("friend", "finder")

  @Test(timeout = TIMEOUT)
  fun testAnagrams6() = testAnagrams("senator", "treason")

  @Test(timeout = TIMEOUT)
  fun testAnagrams7() = testAnagrams("terrain", "trainer")

  @Test(timeout = TIMEOUT)
  fun testAnagrams8() = testAnagrams("teaching", "cheating")

  @Test(timeout = TIMEOUT)
  fun testNotAnagrams1() = testNotAnagrams("pots", "stops")

  @Test(timeout = TIMEOUT)
  fun testNotAnagrams2() = testNotAnagrams("escort", "sectors")

  @Test(timeout = TIMEOUT)
  fun testNotAnagrams3() = testNotAnagrams("sections", "notices")
}