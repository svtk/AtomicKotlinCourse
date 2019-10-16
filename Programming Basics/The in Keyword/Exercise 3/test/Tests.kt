package theInKeywordExercise3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTheInKeywordExercise3 {
  @Test(timeout = TIMEOUT)
  fun test1LowerCaseC() {
    Assert.assertTrue("'c' is a lower case letter", isLowerCase('c'))
  }

  @Test(timeout = TIMEOUT)
  fun test2LowerCaseA() {
    Assert.assertTrue("'a' is a lower case letter", isLowerCase('a'))
  }

  @Test(timeout = TIMEOUT)
  fun test3LowerCaseZ() {
    Assert.assertTrue("'z' is a lower case letter", isLowerCase('z'))
  }

  @Test(timeout = TIMEOUT)
  fun test4UpperCase() {
    Assert.assertFalse("'A' is an upper case letter", isLowerCase('A'))
  }

  @Test(timeout = TIMEOUT)
  fun test5Digit() {
    Assert.assertFalse("'1' is not a lower case letter", isLowerCase('1'))
  }
}