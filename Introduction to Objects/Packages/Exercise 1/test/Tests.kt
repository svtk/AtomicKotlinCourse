package packages.exercise1

import org.junit.Assert
import org.junit.Test
import util.loadClass
import util.loadFileFacade
import util.loadToplevelFunction
import util.loadToplevelPropertyGetter
import kotlin.reflect.full.createInstance

class TestDifferentPackages {
  @Test
  fun test1Val() {
    val aaaFileFacade = loadFileFacade("aaa", "aaa")
    val property = loadToplevelPropertyGetter(aaaFileFacade, "x")
    val actual = property.invoke(Object())
    Assert.assertEquals("Expected 'val x = 10' in package 'aaa'", 10, actual)
  }

  @Test
  fun test2Fun() {
    val aaaFileFacade = loadFileFacade("aaa", "aaa")
    val function = loadToplevelFunction(aaaFileFacade, "fa")
    val actual = function.invoke(Object(), 10)
    Assert.assertEquals("Wrong result for 'fa(10)'", 100, actual)
  }

  @Test
  fun test3Class() {
    val kClass = loadClass("aaa", "K")
    val kInstance = kClass.createInstance()
    Assert.assertEquals("Wrong `toString` for `K()`", "K", kInstance.toString())

  }

  @Test
  fun test4OtherPackage() {
    val bbbFileFacade = loadFileFacade(packageName = "bbb", fileName = "bbb")
    val gFun = loadToplevelFunction(bbbFileFacade, "g")
    val actual = gFun.invoke(Object(), 10)

    Assert.assertEquals("Wrong result for calling 'bbb.g()'", "K 10 100", actual)
  }
}