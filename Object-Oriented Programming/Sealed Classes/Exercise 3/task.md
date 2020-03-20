## Sealed Classes (#3)

Modify `SealedSubclasses.kt` so that all the subclasses of `Top` are nested
within `Top`. Create a seeded random-number generator by defining `val rand =
Random(17)`. Use this generator to randomly select a subclass of `Top` and
display its `simpleName`.

```kotlin
// SealedClasses/SealedEx3.kt
package sealedclassesex3
import atomictest.eq
import kotlin.random.Random

sealed class Top {
  class Middle1 : Top()
  class Middle2 : Top()
  open class Middle3 : Top()
  class Bottom3 : Middle3()
}

fun main() {
  Top::class.sealedSubclasses
    .map { it.simpleName } eq
    "[Middle1, Middle2, Middle3]"
  val rand = Random(17)
  Top::class.sealedSubclasses
    .random(rand).simpleName eq "Middle3"
}
```