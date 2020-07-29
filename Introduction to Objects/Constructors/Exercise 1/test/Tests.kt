package constructorsExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestConstructorsExercise1 {
  @Test(timeout = TIMEOUT)
  fun test1() {
    val floatingClass = loadClass("constructorsExercise1", "Floating")
        .apply {
          assertParametersOfFirstConstructor(
              "d" to Double::class
          )
        }
    val floatingInstance = floatingClass.constructors.first().call(1.0)
    Assert.assertEquals("Wrong value for 'Floating(1.0).toString()", "1.0", floatingInstance.toString())
  }

  @Test(timeout = TIMEOUT)
  fun test2() {
    checkMainIsImplemented(::main)
  }
}