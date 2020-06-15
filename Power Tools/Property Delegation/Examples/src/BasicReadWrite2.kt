// PropertyDelegation/BasicReadWrite2.kt
package propertydelegation
import atomictest.eq
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class ReadWritable2(var i: Int) {
  var msg = ""
  var value: String by BasicReadWrite2()
}

class BasicReadWrite2 {
  operator fun getValue(
    rw: ReadWritable2, prop: KProperty<*>
  ) = "getValue: ${rw.i}"
  operator fun setValue(
    rw: ReadWritable2,
    property: KProperty<*>,
    s: String
  ) {
    rw.i = s.toIntOrNull() ?: 0
    rw.msg = "setValue to ${rw.i}"
  }
}

fun main() {
  val x = ReadWritable2(11)
  x.value eq "getValue: 11"
  x.value = "99"
  x.msg eq "setValue to 99"
  x.value eq "getValue: 99"
}