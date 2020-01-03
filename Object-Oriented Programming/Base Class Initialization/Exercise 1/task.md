## Base Class Initialization (#1)

Create a global `private` `var trace` initialized to an empty `String`. Create
a class `A`; inside its `init`, append the name of the class to `trace`.
Inherit `B` from `A` and `C` from `B`, and give them similar `init`s. Create
an instance of `C` to see the initialization order.

```kotlin
// BaseClassInit/BCIExercise1.kt
package baseclassinit
import atomictest.eq

private var trace = ""

open class A {
  init {
    trace += "A"
  }
}

open class B : A() {
  init {
    trace += "B"
  }
}

class C : B() {
  init {
    trace += "C"
  }
}

fun main() {
  C()
  trace eq "ABC"
}
```