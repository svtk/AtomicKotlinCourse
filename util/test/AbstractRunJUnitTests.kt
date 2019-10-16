import org.junit.Assert
import org.junit.runner.JUnitCore
import kotlin.reflect.KClass

abstract class AbstractRunJUnitTests {
  private val junit = JUnitCore()

  protected fun testClass(testClass: KClass<*>) {
    val result = junit.run(testClass.java)
    Assert.assertTrue(result.wasSuccessful())
  }
}