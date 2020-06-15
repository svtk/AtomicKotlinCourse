## Polymorphism (#3)

This exercise explores the behavior of constructors when combined with
polymorphism.

Create a base class named `Base` containing two functions, `f1()` and `f2()`.
`f1()` calls `println("Base.f1")`, then calls `f2()`. `f2()` calls
`println("Base.f2")`.

From `Base`, inherit a class called `Derived`. Override `f1()`, first calling
`println("Derived.f1")`, then calling the base-class version of `f1()`.
Override `f2()` the same way.

In `main()`, create a `Derived` object and upcast it to a `Base` reference.
Call `f1()` for this reference and understand the resulting output.

> Solution

```kotlin
// Polymorphism/PolyExercise3.kt
package polymorphismExercise3

open class Base {
  open fun f1() {
    println("Base.f1")
    f2()
  }
  open fun f2() = println("Base.f2")
}

class Derived : Base() {
  override fun f1() {
    println("Derived.f1")
    super.f1()
  }
  override fun f2() {
    println("Derived.f2")
    super.f2()
  }
}

fun main() {
  val base: Base = Derived()
  base.f1()
}
/* Example output:
  Derived.f1
  Base.f1
  Derived.f2
  Base.f2
*/
```