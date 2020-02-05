## Upcasting (#1)

Create a `Rodent` interface containing `eat()` and `speak()` functions. Make
two implementations of `Rodent`: `Mouse` and `KangarooRat`. For each function,
use `atomictest.Trace` to  record the name of the class, a dot, and the name of
the function. In `KangarooRat`, add a `jump()` function which follows the form
of the other functions.

Create a function `upcast(rodent: Rodent)` which calls `eat()` and `speak()`.
Show that the compiler won't allow you to call `jump()`.

In `main()`, create an instance of `Mouse` and `KangarooRat`, and show that
you can call `jump()` for the latter. Pass both objects into `upcast()`, and
use `trace` to verify the output.

```kotlin
// Upcasting/UpcastExercise1.kt
package upcasting
import atomictest.*

private var trace = Trace()

interface Rodent {
  fun eat()
  fun speak()
}

class Mouse: Rodent {
  override fun eat() =
    trace("Mouse.eat")
  override fun speak() =
    trace("Mouse.speak")
}

class KangarooRat: Rodent {
  override fun eat() =
    trace("KangarooRat.eat")
  override fun speak() =
    trace("KangarooRat.speak")
  fun jump() =
    trace("KangarooRat.jump")
}

fun upcast(rodent: Rodent) {
  rodent.eat()
  rodent.speak()
  // rodent.jump() // Won't compile
}

fun main() {
  val mouse = Mouse()
  val kangarooRat = KangarooRat()
  kangarooRat.jump()
  upcast(mouse)
  upcast(kangarooRat)
  trace eq """
    KangarooRat.jump
    Mouse.eat
    Mouse.speak
    KangarooRat.eat
    KangarooRat.speak
  """
}
```