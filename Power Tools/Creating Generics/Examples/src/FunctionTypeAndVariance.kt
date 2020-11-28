// CreatingGenerics/FunctionTypeAndVariance.kt
package variance
import atomictest.eq

fun main() {
  val func1: (Pet) -> String =
    { pet: Pet -> "Pet" }
  val func2: (Cat) -> Any = func1
  func2(Cat()) eq "Pet"
}