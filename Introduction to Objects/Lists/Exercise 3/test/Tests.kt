package lists3

import org.junit.Assert
import org.junit.Test

class TestAnagrams {
    fun testAnagrams(word: String, anagram: String) =
            Assert.assertTrue("'$word' and '$anagram' should be anagrams", checkAnagrams(word, anagram))

    fun testNotAnagrams(word: String, other: String) =
            Assert.assertFalse("'$word' and '$other' should not be anagrams", checkAnagrams(word, other))

    @Test
    fun testAnagrams1() = testAnagrams("thing", "night")

    @Test
    fun testAnagrams2() = testAnagrams("leader", "dealer")

    @Test
    fun testAnagrams3() = testAnagrams("sector", "escort")

    @Test
    fun testAnagrams4() = testAnagrams("tablet", "battle")

    @Test
    fun testAnagrams5() = testAnagrams("friend", "finder")

    @Test
    fun testAnagrams6() = testAnagrams("senator", "treason")

    @Test
    fun testAnagrams7() = testAnagrams("terrain", "trainer")

    @Test
    fun testAnagrams8() = testAnagrams("teaching", "cheating")

    @Test
    fun testNotAnagrams1() = testNotAnagrams("pots", "stops")

    @Test
    fun testNotAnagrams2() = testNotAnagrams("escort", "sectors")

    @Test
    fun testNotAnagrams3() = testNotAnagrams("sections", "notices")
}