package propertiesExercise1

import org.junit.Assert
import org.junit.Test
import util.loadClass
import util.loadMemberFunction
import util.loadMemberProperty
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

class TestProperties {
  @Test
  fun testSolution() {
    val xClass = loadClass("properties1", "X")
    val instance = xClass.createInstance()

    testPropertyValue("a", 3, xClass, instance)
    testPropertyValue("b", 42, xClass, instance)
    testPropertyValue("c", 0, xClass, instance)

    val addMethodName = "add"
    val addMethod = loadMemberFunction(xClass, addMethodName)
    val result = addMethod.call(instance)
    val sumValue = 45
    testPropertyValue("c", sumValue, xClass, instance)
    val message = "The value of 'c' property should be '$sumValue' " +
        "after calling $addMethodName()"
    Assert.assertEquals(message, sumValue, result)
  }

  private fun testPropertyValue(propertyName: String, value: Any, someClass: KClass<*>, someInstance: Any?) {
    val property = loadMemberProperty(someClass, propertyName)

    val result = property.call(someInstance)

    val message = "The value of '$propertyName' property should be '$value'"
    Assert.assertEquals(message, value, result)
  }
}