package namedandDefaultArguments2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestComments {
    private fun testJoiningComments(expected: String, string: String) {
        Assert.assertEquals("Wrong result for $string:", expected, joinComments(string))
    }

    @Test
    fun test1Sample() = testJoiningComments("first; second; third", """
        // first
        // second
        // third
        """)

    @Test
    fun test2() = testJoiningComments("a; b; c; d", """
        // a
        // b
        // c
        // d""")

    @Test
    fun test3() = testJoiningComments("a", "// a")
}