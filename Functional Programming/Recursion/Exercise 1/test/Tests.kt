package recursionExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.checkParametersOfTopLevelFunction
import util.runAndCheckSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRecursionExercise1 {
  private fun expectedOutput(group: String, n: Int) = buildString {
    (n downTo 0).forEach {
      appendln("Simulation: $group Reality: $it")
    }
  }

  @Test(timeout = TIMEOUT)
  fun test() {
    testSimulation("FOO", 8)
    testSimulation("bar", 13)
    testSimulation("bar", 0)
  }

  private fun testSimulation(group: String, level: Int) {
    val simulationFunction = ::simulation
    checkParametersOfTopLevelFunction(simulationFunction, listOf("group" to "kotlin.String", "level" to "kotlin.Int"))

    runAndCheckSystemOutput("Wrong result for 'simulation(\"$group\", $level)'",
      expectedOutput(group, level)) {
      simulationFunction.call(group, level)
    }
  }
}