// PropertyDelegation/FibonacciProperty.kt
package propertydelegation
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import recursion.fibonacci
import atomictest.eq

class Fibonacci :
  ReadWriteProperty<Any?, Long> {
  private var current: Long = 0
  override operator fun getValue(
    thisRef: Any?,
    property: KProperty<*>
  ) = current
  override operator fun setValue(
    thisRef: Any?,
    property: KProperty<*>,
    value: Long
  ) {
    current = fibonacci(value.toInt())
  }
}

fun main() {
  var f by Fibonacci()
  f eq 0L
  f = 22L
  f eq 17711L
  f = 90L
  f eq 2880067194370816120L
}