## Sealed Classes (#2)

Use `sealedSubclasses` to iterate through the classes in the previous
exercise. For each class, `trace()` its `simpleName`.

```kotlin
// SealedClasses/SealedEx2.kt
package sealedclassesex1
import atomictest.*

private val trace = Trace()

fun main() {
  Transport::class.sealedSubclasses
    .map { it.simpleName }
    .forEach { trace(it) }
  trace eq """
  Train
  Bus
  Tram
  Plane
  """
}
```