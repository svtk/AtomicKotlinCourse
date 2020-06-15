// PropertyDelegation/Configuration.kt
package propertydelegation
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import checkinstructions.DataFile
import atomictest.eq

open class FileDelegate<T> :
  ReadWriteProperty<T, String> {
  override fun getValue(
    thisRef: T,
    property: KProperty<*>
  ): String {
    val file =
      DataFile(property.name + ".txt")
    return if (file.exists())
      file.readText()
    else ""
  }
  override fun setValue(
    thisRef: T,
    property: KProperty<*>, value: String
  ) {
    DataFile(property.name + ".txt")
      .writeText(value)
  }
}

class Configuration {
  object Delegate :
    FileDelegate<Configuration>()
  var user: String by Delegate
  var id: String by Delegate
}

fun main() {
  val config = Configuration()
  config.user = "Luciano"
  config.id = "Ramalho47"
  DataFile("user.txt").readText() eq "Luciano"
  DataFile("id.txt").readText() eq "Ramalho47"
}