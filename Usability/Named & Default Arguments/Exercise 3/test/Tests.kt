package namedAndDefaultArgumentsExercise3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestComments {
  private fun testJoiningComments(expected: String, string: String) {
    Assert.assertEquals("Wrong result for $string:", expected, joinComments(string))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = testJoiningComments("first; second; third", """
        // first
        // second
        // third
        """)

  @Test(timeout = TIMEOUT)
  fun test2() = testJoiningComments("a; b; c; d", """
        // a
        // b
        // c
        // d""")

  @Test(timeout = TIMEOUT)
  fun test3() = testJoiningComments("a", "// a")
}