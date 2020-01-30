## Abstract Classes (#1)

Abstract classes can have parameters and constructors just like ordinary
classes. Create an abstract class `WithParams` with class parameters `val i:
Int` and `var s: String = ""`. Inherit a class `Concrete` from `WithParams`.
Provide constructors for both that use `atomictest.Trace` to show the class
name and arguments. Create an instance of `Concrete` and verify the order of
the constructor calls.

```kotlin
// Abstract/AbsExercise1.kt
package abstractclasses
import atomictest.*

private var trace = Trace()

abstract class WithParams(
  val i: Int,
  var s: String = ""
) {
  init {
    trace("WithParams $i $s")
  }
}

class Concrete(i: Int, s: String):
  WithParams(i, s) {
  init {
    trace("Concrete $i $s")
  }
}

fun main() {
  Concrete(11, "One Louder")
  trace eq """
    WithParams 11 One Louder
    Concrete 11 One Louder
  """
}
```