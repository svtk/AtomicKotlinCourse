package constructors1

import org.junit.Assert
import org.junit.Test
import util.checkMainIsImplemented
import util.checkParameters
import util.loadClass

class TestFloating {
  @Test
  fun test1() {
    val floatingClass = loadClass("constructors1", "Floating")
    val floatingConstructor = floatingClass.constructors.first()
    checkParameters(floatingConstructor, listOf("d" to "kotlin.Double"), "'Floating' constructor")
    val floatingInstance = floatingConstructor.call(1.0)
    Assert.assertEquals("Wrong value for 'Floating(1.0).toString()", "1.0", floatingInstance.toString())
  }

  @Test
  fun test2() {
    checkMainIsImplemented(::main)
  }
}