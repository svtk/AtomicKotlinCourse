package safeCallsAndTheElvisOperatorExercise1

import org.junit.Assert
import org.junit.Test
import util.checkParametersOfTopLevelFunction

class TestSafeCallsAndTheElvisOperatorExercise1 {
    private fun testDowncase(s: String?) {
        val downcaseFunc = ::downcase
        checkParametersOfTopLevelFunction(downcaseFunc, listOf("" to "kotlin.String?"))
        val actual = downcaseFunc.call(s)
        Assert.assertEquals("Wrong result for calling downcase(\"$s\")", s?.lowercase() ?: "", actual)
    }

    @Test
    fun test1() = testDowncase("abc")

    @Test
    fun test2() = testDowncase("ABC")

    @Test
    fun test3() = testDowncase("Hello!")

    @Test
    fun test4() = testDowncase(null)
}