package propertyAccessorsExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.loadClass
import util.loadMemberProperty
import util.runAndCheckSystemOutput
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty
import kotlin.reflect.full.createInstance

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPropertyAccessorsExercise2 {
  private fun testAccessibleInstance(
    test: (
      mutableProperty: KMutableProperty<*>,
      readOnlyProperty: KProperty<*>,
      instance: Any?
    ) -> Unit) {
    val accessibleClass = loadClass("propertyAccessorsExercise2", "Accessible")
    val mutableProperty = loadMemberProperty(accessibleClass, "mutable")
    val readOnlyProperty = loadMemberProperty(accessibleClass, "readOnly")

    Assert.assertTrue("'mutable' property should be mutable", mutableProperty is KMutableProperty<*>)
    Assert.assertTrue("'readOnly' property should be read-only", readOnlyProperty !is KMutableProperty<*>)

    Assert.assertEquals("'mutable' property should be of type 'String'", "kotlin.String", mutableProperty.returnType.toString())
    Assert.assertEquals("'readOnly' property should be of type 'String'", "kotlin.String", readOnlyProperty.returnType.toString())

    mutableProperty as KMutableProperty<*>

    val instance = accessibleClass.createInstance()
    test(mutableProperty, readOnlyProperty, instance)
  }

  @Test(timeout = TIMEOUT)
  fun test1MutableSetter() = testAccessibleInstance { mutableProperty, _, instance ->
    runAndCheckSystemOutput("Setter of 'mutable' property should display 'mutable:set'", "mutable:set") {
      mutableProperty.setter.call(instance, "abc")
    }
  }

  @Test(timeout = TIMEOUT)
  fun test2MutableGetter() = testAccessibleInstance { mutableProperty, _, instance ->
    runAndCheckSystemOutput("Getter of 'mutable' property should display 'mutable:get'", "mutable:get") {
      mutableProperty.getter.call(instance)
    }
  }

  @Test(timeout = TIMEOUT)
  fun test3ReadOnlyGetter() = testAccessibleInstance { _, readOnlyProperty, instance ->
    runAndCheckSystemOutput("Getter of 'readOnly' property should first display 'readOnly:get' " +
      "and then call getter of 'mutable' ", "readOnly:get\nmutable:get") {
      readOnlyProperty.getter.call(instance)
    }
  }

  @Test(timeout = TIMEOUT)
  fun test4Modification() = testAccessibleInstance { mutableProperty, _, instance ->
    mutableProperty.setter.call(instance, "abc")
    val value = mutableProperty.getter.call(instance)
    Assert.assertEquals("The value of 'mutable' should be changed by its setter and returned by its getter:\n" +
      "  val accessible = Accessible()\n" +
      "  accessible.mutable = \"abc\"\n" +
      "  accessible.mutable eq \"abc\"",
      "abc", value)
  }

  @Test(timeout = TIMEOUT)
  fun test5ReadOnlyAccess() = testAccessibleInstance { mutableProperty, readOnlyProperty, instance ->
    mutableProperty.setter.call(instance, "abc")
    val value = readOnlyProperty.getter.call(instance)
    Assert.assertEquals("The value of 'mutable' should be returned by accessing 'readOnly':\n" +
      "  val accessible = Accessible()\n" +
      "  accessible.mutable = \"abc\"\n" +
      "  accessible.readOnly eq \"abc\"",
      "abc", value)
  }
}