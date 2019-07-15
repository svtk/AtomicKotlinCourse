package theImportanceofLambdas2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestFilterNonBlank {
    private fun checkList(strings: List<String>) {
        Assert.assertEquals("Wrong result for $strings",
                strings.filter { it.isNotBlank() },
                filterNonBlank(strings))
    }

    @Test
    fun test1Sample() = checkList(listOf("", "a", "  "))

    @Test
    fun test2() = checkList(listOf("a", "  ", "b", "     ", "c"))
}