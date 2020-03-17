## Polymorphism (#3)

Create a base class named `Base` containing two functions, `f1()` and `f2()`.
`f1()` uses `atomictest.Trace` to report "Base.f1", then calls `f2()`. `f2()`
traces "Base.f2".

From `Base`, inherit a class called `Derived`. Override `f1()`, first tracing
"Derived.f1", then calling the base-class version of `f1()`. Override `f2()`
the same way.

In `main()`, create a `Derived` object and upcast it to a `Base` reference.
Call `f1()` for this reference and explain the resulting trace.

```kotlin
// Polymorphism/PolyExercise3.kt
package polymorphism
import atomictest.*

private val trace = Trace()

open class Base {
  open fun f1() {
    trace("Base.f1")
    f2()
  }
  open fun f2() = trace("Base.f2")
}

class Derived : Base() {
  override fun f1() {
    trace("Derived.f1")
    super.f1()
  }
  override fun f2() {
    trace("Derived.f2")
    super.f2()
  }
}

fun main() {
  val base: Base = Derived()
  base.f1()
  trace eq """
  Derived.f1
  Base.f1
  Derived.f2
  Base.f2
  """
}
```