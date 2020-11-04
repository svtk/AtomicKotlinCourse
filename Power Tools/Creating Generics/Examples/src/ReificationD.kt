// CreatingGenerics/ReificationD.kt
package creatinggenerics

inline fun <reified T: Any> d() = a(T::class)

val kd = d<K>()