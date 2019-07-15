package theinKeyword3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestForLoops3 {
    @Test fun test1LowerCaseC() {
        Assert.assertTrue("'c' is a lower case letter", isLowerCase('c'))
    }

    @Test fun test2LowerCaseA() {
        Assert.assertTrue("'a' is a lower case letter", isLowerCase('a'))
    }

    @Test fun test3LowerCaseZ() {
        Assert.assertTrue("'z' is a lower case letter", isLowerCase('z'))
    }

    @Test fun test4UpperCase() {
        Assert.assertFalse("'A' is an upper case letter", isLowerCase('A'))
    }

    @Test fun test5Digit() {
        Assert.assertFalse("'1' is not a lower case letter", isLowerCase('1'))
    }
}