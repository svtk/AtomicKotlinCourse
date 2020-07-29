import org.junit.After
import org.junit.Assert
import org.junit.runner.JUnitCore
import util.loadTraceContent
import util.resetTraceContent
import util.runAndCheckSystemOutput
import java.io.File
import kotlin.reflect.KClass

abstract class AbstractTestExercises {
  private val junit = JUnitCore()

  protected fun testClass(testClass: KClass<*>) {
    val result = junit.run(testClass.java)
    Assert.assertTrue(result.wasSuccessful())
  }

  @After
  fun tearDown() {
    resetTraceContent()
  }

  protected fun testOutput(outputFileName: String, main: () -> Unit) {
    val expected = File(outputFileName).readText()
    runAndCheckSystemOutput("Wrong output", expected, main)
  }
}