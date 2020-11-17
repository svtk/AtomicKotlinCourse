// DelegationTools/MapAccessors.kt
package delegationtools
import kotlin.reflect.KProperty

operator fun MutableMap<String, Any>.getValue(
  thisRef: Any?, property: KProperty<*>
): Any? {
  return this[property.name]
}

operator fun MutableMap<String, Any>.setValue(
  thisRef: Any?, property: KProperty<*>,
  value: Any
) {
  this[property.name] = value
}