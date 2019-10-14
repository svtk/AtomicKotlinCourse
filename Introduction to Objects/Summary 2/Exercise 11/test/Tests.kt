package summaryII11

import org.junit.Assert
import org.junit.Test
import summaryII11.TestTemperature.MeasureSystem.CELSIUS
import summaryII11.TestTemperature.MeasureSystem.FAHRENHEIT
import util.loadMemberProperty
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty

class TestTemperature {
  private enum class MeasureSystem(val title: String) {
    FAHRENHEIT("fahrenheit"), CELSIUS("celsius");

    override fun toString(): String = title
  }

  private class TempValue(val value: Double, val system: MeasureSystem)

  private fun testChange(initial: TempValue, expected: TempValue) {
    val temp = Temperature()
    val initialProp = loadMemberProperty(temp::class, initial.system.title)
    val expectedProp = loadMemberProperty(temp::class, expected.system.title)

    fun assertMutable(tempValue: TempValue, prop: KProperty<*>) {
      Assert.assertTrue("The '${tempValue.system}' property is expected to be mutable", prop is KMutableProperty<*>)
    }
    assertMutable(initial, initialProp)
    assertMutable(expected, expectedProp)

    (initialProp as KMutableProperty<*>).setter.call(temp, initial.value)
    val actual = expectedProp.getter.call(temp)
    Assert.assertEquals("The '${expected.system}' property is expected to be ${expected.value} " +
      "after setting '${initial.system}' to ${initial.value}", expected.value, actual)
  }

  @Test
  fun test1Fahrenheit() {
    testChange(TempValue(90.0, FAHRENHEIT), TempValue(90.0, FAHRENHEIT))
  }

  @Test
  fun test2Celsius() {
    testChange(TempValue(30.0, CELSIUS), TempValue(30.0, CELSIUS))
  }

  @Test
  fun test3Change() {
    testChange(TempValue(86.0, FAHRENHEIT), TempValue(30.0, CELSIUS))
  }

  @Test
  fun test4Change() {
    testChange(TempValue(30.0, CELSIUS), TempValue(86.0, FAHRENHEIT))
  }
}