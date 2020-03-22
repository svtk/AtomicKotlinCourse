## Base Class Initialization (#1)

`atomictest` includes a class called `Trace` and an accompanying `eq` to
compare a `Trace` object to a multiline `String`. Create a global `private`
`val trace` initialized to `Trace()`. Create a class `A`; inside its `init`,
and call `trace(className)` to append the name of the class to `trace`.
Inherit `B` from `A` and `C` from `B`, and give them similar `init`s. Create
an instance of `C` to see the initialization order.

```kotlin
// BaseClassInit/BCIExercise1.kt
package baseclassinit
import atomictest.*

private val trace = Trace()

open class A {
  init {
    trace("A")
  }
}

open class B : A() {
  init {
    trace("B")
  }
}

class C : B() {
  init {
    trace("C")
  }
}

fun main() {
  C()
  trace eq "A B C"
}
```