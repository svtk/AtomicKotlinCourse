## Complex Constructors (#3)

Show that multiple init sections are executed in declaration order. Create a
class containing an uninitialized `var result: String`, then initialize
`result` to `one two three` in three different `init` blocks. Note that
`result` cannot be a `val` in this case.

```kotlin
// ComplexConstructors/Exercise3.kt
package complexconstructors
import atomictest.eq

class MultipleInit() {
  var result: String
  init {
    result = "one "
  }
  init {
    result += "two "
  }
  init {
    result += "three"
  }
}

fun main() {
  MultipleInit().result eq "one two three"
}
```