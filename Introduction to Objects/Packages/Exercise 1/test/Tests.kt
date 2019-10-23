package packagesExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.full.createInstance
import ccc.main as cccmain

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPackagesExercise1 {
  @Test(timeout = TIMEOUT)
  fun test1Val() {
    val aaaFileFacade = loadFileFacade("aaa", "aaa")
    val property = loadToplevelPropertyGetter(aaaFileFacade, "x")
    val actual = property.invoke(Object())
    Assert.assertEquals("Expected 'val x = 10' in package 'aaa'", 10, actual)
  }

  @Test(timeout = TIMEOUT)
  fun test2Fun() {
    val aaaFileFacade = loadFileFacade("aaa", "aaa")
    val function = loadToplevelFunction(aaaFileFacade, "fa")
    val actual = function.invoke(Object(), 10)
    Assert.assertEquals("Wrong result for 'fa(10)'", 100, actual)
  }

  @Test(timeout = TIMEOUT)
  fun test3Class() {
    val kClass = loadClass("aaa", "K")
    val kInstance = kClass.createInstance()
    Assert.assertEquals("Wrong `toString` for `K()`", "K", kInstance.toString())

  }

  @Test(timeout = TIMEOUT)
  fun test4BbbPackage() {
    val bbbFileFacade = loadFileFacade(packageName = "bbb", fileName = "bbb")
    val gFun = loadToplevelFunction(bbbFileFacade, "g")
    val actual = gFun.invoke(Object(), 2)

    Assert.assertEquals("Wrong result for calling 'bbb.g(2)'", "K 20", actual)
  }

  @Test(timeout = TIMEOUT)
  fun test5CccPackage(){
    runAndCheckSystemOutput("Wrong output for calling 'main' in 'ccc'",
      "K 10", ::cccmain)
  }
}