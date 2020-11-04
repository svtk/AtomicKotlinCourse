// CreatingGenerics/ReificationA.kt
package creatinggenerics
import kotlin.reflect.KClass

fun <T: Any> a(kClass: KClass<T>) {
  // Uses KClass<T>
}