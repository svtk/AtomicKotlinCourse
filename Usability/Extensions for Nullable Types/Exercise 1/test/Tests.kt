package extensionsforNullableTypes1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestOrEmpty {
    private fun checkExpectedValue(s: String?, value: String) {
        Assert.assertEquals("Wrong value for $s:", value, s.orEmpty())
    }

    @Test fun test1Sample() = checkExpectedValue(null, "")

    @Test fun test2Sample() = checkExpectedValue("abc", "abc")

    @Test fun test3() = checkExpectedValue("s", "s")
}