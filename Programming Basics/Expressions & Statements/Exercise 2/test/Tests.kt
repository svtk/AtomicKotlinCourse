package expressionsAndStatementsExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestExpressionsAndStatementsExercise2 {

  @Test(timeout = TIMEOUT)
  fun test1f() {
    val fFunc = ::f
    checkParametersOfTopLevelFunction(fFunc, listOf("" to "kotlin.Int", "" to "kotlin.Int"))
    Assert.assertEquals("Wrong result for 'f(1, 2)' call", 3, fFunc.call(1, 2))
  }

  @Test(timeout = TIMEOUT)
  fun test2g() {
    val gFunc = ::g
    checkParametersOfTopLevelFunction(gFunc, listOf("" to "kotlin.String", "" to "kotlin.String"))
    Assert.assertEquals("""Wrong result for 'g("a", "bc")' call""", "abc", gFunc.call("a", "bc"))
  }

  @Test(timeout = TIMEOUT)
  fun test3h() {
    val hFunc = ::h
    checkParametersOfTopLevelFunction(hFunc, listOf())
    runAndCheckSystemOutput("Wrong output after calling 'h()'", "h()") {
      hFunc.call()
    }
  }

  @Test(timeout = TIMEOUT)
  fun test4Main() {
    checkMainIsImplemented(::main)
    val output = runAndGetSystemOutput(::main)
    Assert.assertTrue("main() should call 'h()'", "h()" in output)
    fun checkType(type: String, func: String) {
      Assert.assertTrue("The return type of '$func()' is '$type'; " +
        "'$type' should be printed to the console", type in output)
    }
    checkType("Int", "g")
    checkType("String", "h")
    checkType("Unit", "f")
  }
}