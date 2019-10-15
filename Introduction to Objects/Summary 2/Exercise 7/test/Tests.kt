package summaryII.exercise7

import org.junit.Assert
import org.junit.Test
import util.*
import java.lang.reflect.InvocationTargetException
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KProperty

class TestFixedSizeHolder {
  private inline fun testHolderClass(
    size: Int,
    action: (
      holderClass: KClass<*>,
      holderInstance: Any,
      addFunction: KFunction<*>,
      fullProperty: KProperty<*>
    ) -> Unit
  ) {
    val holderClass = loadClass("summaryII7", "FixedSizeHolder")
    val constructor = holderClass.constructors.first()
    checkParametersOfConstructor(constructor, holderClass, listOf("" to "kotlin.Int"))
    val holderInstance = constructor.call(size)

    val addFunction = loadMemberFunction(holderClass, "add")
    checkParametersOfMemberFunction(addFunction, listOf("" to "kotlin.Any"))
    val fullProperty = loadMemberProperty(holderClass, "full")
    action(holderClass, holderInstance, addFunction, fullProperty)
  }

  @Test
  fun test1() = testHolderClass(2) { holderClass, holderInstance, addFunction, fullProperty ->
    addFunction.call(holderInstance, "abc")
    Assert.assertEquals("The holder of size 2 is expected to be not full after adding one element",
      false, fullProperty.getter.call(holderInstance))

    addFunction.call(holderInstance, 2)
    Assert.assertEquals("The holder of size 2 is expected to be full after adding two elements",
      true, fullProperty.getter.call(holderInstance))

    val message = "The holder is expected to throw 'IllegalStateException' " +
      "on adding a new element when it's full"

    try {
      addFunction.call(holderInstance, '3')
      throw AssertionError(message)
    } catch (e: InvocationTargetException) {
      if (e.targetException !is IllegalStateException) {
        // different exceptions
        throw AssertionError(message + " Was: ${e.targetException::class}")
      }
    }
  }

  @Test
  fun test2() = testHolderClass(10) { holderClass, holderInstance, addFunction, fullProperty ->
      repeat(5) {
        addFunction.call(holderInstance, it)
      }
      Assert.assertEquals("The holder of size 2 is expected to be not full after adding five elements",
        false, fullProperty.getter.call(holderInstance))

      repeat(5) {
          addFunction.call(holderInstance, "$it")
      }

      Assert.assertEquals("The holder of size 10 is expected to be full after adding ten elements",
      true, fullProperty.getter.call(holderInstance))

    val message = "The holder is expected to throw 'IllegalStateException' " +
      "on adding a new element when it's full"

    try {
      addFunction.call(holderInstance, 11)
      throw AssertionError(message)
    } catch (e: InvocationTargetException) {
      if (e.targetException !is IllegalStateException) {
        // different exceptions
        throw AssertionError(message + " Was: ${e.targetException::class}")
      }
    }
  }

}