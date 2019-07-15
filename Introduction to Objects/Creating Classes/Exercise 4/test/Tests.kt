package creatingClasses4

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCapitalize() {
    private fun testString(s: String) {
        Assert.assertEquals("""Wrong result for task("$s"):""", s.capitalize(), task(s))
    }

    @Test fun test1() = testString("abc")

    @Test fun test2() = testString("Abc")

    @Test fun test3() = testString("ABC")

    @Test fun test4() = testString("aBc")

    @Test fun test5() = testString("abC")
}