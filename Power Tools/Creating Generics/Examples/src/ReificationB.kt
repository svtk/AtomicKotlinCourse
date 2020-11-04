// CreatingGenerics/ReificationB.kt
package creatinggenerics

// Doesn't compile because of erasure:
// fun <T: Any> b() = a(T::class)