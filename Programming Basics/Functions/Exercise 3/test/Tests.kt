package functions3

import org.junit.Assert
import org.junit.Test

class TestFunctions3 {
    private fun checkFunction(s: String) {
        Assert.assertEquals("""duplicate($s) should return "$s$s"""",
                duplicate(s), "$s$s")
    }

    @Test fun test1() = checkFunction("abc")
}
