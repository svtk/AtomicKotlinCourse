package variableArgumentListsExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.checkParametersOfTopLevelFunction
import util.runAndCheckSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestVariableArgumentListsExercise2 {
  @Test
  fun test1PrintArgsSignature() {
    val printArgsFunc = ::printArgs
    checkParametersOfTopLevelFunction(printArgsFunc, listOf("" to "kotlin.String", "" to ""))

    val secondParam = printArgsFunc.parameters[1]
    Assert.assertTrue("The second parameter of `printArgs` function is expected to be `vararg`",
      secondParam.isVararg)

    checkParametersOfTopLevelFunction(printArgsFunc, listOf("" to "", "" to "kotlin.IntArray"))
  }

  private fun testPrintArgsInvocation(s: String, vararg args: Int) {
    val printArgsFunc = ::printArgs
    runAndCheckSystemOutput("Wrong output when calling 'printArgs(\"$s\", ${args.joinToString()})'",
      "$s${args.toList()}") {
      printArgsFunc.call(s, args)
    }
  }

  @Test
  fun test2PrintArgsInvocation() {
    testPrintArgsInvocation("Numbers: ", 1, 2, 3)
  }

  @Test
  fun test3PrintArgsInvocation() {
    testPrintArgsInvocation("List: ", 11, 347, -2)
  }
}