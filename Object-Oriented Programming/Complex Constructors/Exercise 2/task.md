## Complex Constructors (#2)

Create a class called `SumChars` that takes `text: String` as a class
argument. Add an un-initialized property `val sum: Int`. Inside `init`,
define a local function `calc()` that sums up the integer values of each
of the characters in `text`. Call `calc()` and assign the result to `sum`.

```kotlin
// ComplexConstructors/Exercise2.kt
package complexconstructors
import atomictest.eq

class SumChars(text: String) {
  val sum: Int
  init {
    fun calc() =
      text.fold(0, {s, c -> s + c.toInt() })
    sum = calc()
  }
}

fun main() {
  SumChars("What?").sum eq 467
}
```