// PropertyDelegation/BasicRead2.kt
package propertydelegation
import atomictest.eq
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class Readable2(val i: Int) {
  val value: String by BasicRead2()
}

class BasicRead2 {
  operator fun getValue(
    r: Readable2, prop: KProperty<*>
  ) = "getValue: ${r.i}"
}

fun main() {
  val x = Readable2(11)
  val y = Readable2(17)
  x.value eq "getValue: 11"
  y.value eq "getValue: 17"
}