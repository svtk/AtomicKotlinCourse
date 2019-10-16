package expressionsAndStatementsExercise2

import org.junit.Assert
import org.junit.Test
import util.checkMainIsImplemented
import util.checkParametersOfTopLevelFunction
import util.runAndCheckSystemOutput

class Test {
    @Test
    fun test1f() {
        val fFunc = ::f
        checkParametersOfTopLevelFunction(fFunc, listOf())
        runAndCheckSystemOutput("Wrong output after calling 'f()'", "f()") {
            fFunc.call()
        }
    }

    @Test
    fun test2g() {
        val gFunc = ::g
        checkParametersOfTopLevelFunction(gFunc, listOf("" to "kotlin.Int", "" to "kotlin.Int"))
        Assert.assertEquals("Wrong result for 'g(1, 2)' call", 3, gFunc.call(1, 2))
    }

    @Test
    fun test3h() {
        val hFunc = ::h
        checkParametersOfTopLevelFunction(hFunc, listOf("" to "kotlin.String", "" to "kotlin.String"))
        Assert.assertEquals("""Wrong result for 'h("a", "bc")' call""", "abc", hFunc.call("a", "bc"))
    }

    @Test
    fun test4Main() {
        checkMainIsImplemented(::main)
    }
}