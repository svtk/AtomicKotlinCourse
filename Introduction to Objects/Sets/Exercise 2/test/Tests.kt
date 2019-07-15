package sets2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestUniqueCharacters {
    private fun checkUniqueCharacters(s: String, isUnique: Boolean) {
        val message = if (isUnique) {
            "This string $s has unique characters"
        }
        else {
            "This string $s has not unique characters"
        }
        Assert.assertEquals(message, isUnique, hasUniqueCharacters(s))
    }

    @Test
    fun test1OneCharacter() = checkUniqueCharacters("a", true)

    @Test
    fun test2TwoCharacters() = checkUniqueCharacters("aa", false)

    @Test
    fun test3Sample() = checkUniqueCharacters("abcd", true)

    @Test
    fun test4Sample() = checkUniqueCharacters("abcb", false)

    @Test
    fun test5Alphabet() = checkUniqueCharacters(('a'..'z').joinToString(""), true)

    @Test
    fun test6Comma() = checkUniqueCharacters(('a'..'c').joinToString(), false)
}