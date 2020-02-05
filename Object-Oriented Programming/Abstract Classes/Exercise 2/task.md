## Abstract Classes (#2)

Make an `enum` called `Note` with values `A`-`G`. Create an `abstract` class
`Instrument` that takes a `val` class argument `name: String` which holds the
name of the class. Add an `abstract` member function `play(n: Note)`.

Now inherit `Wind`, `Percussion` and `Stringed` from `Instrument`, overriding
`play()` in each case to use `atomictest.Trace` to show the class name, then
`blow` for `Wind`, `strike` for `Percussion`, and `pluck` for `Stringed`, and
finally the `Note` being played.

Add a function `tune()` that takes an `Instrument` parameter and plays that
`Instrument` using `Note.C`.

In `main()`, create an `orchestra` which is a `List<Instrument>` containing an
instance of each type of `Instrument`. Call `tune()` for each `Instrument` in
the `orchestra`, and validate the results using `Trace`.

```kotlin
// Abstract/AbsExercise2.kt
package abstractclasses2
import atomictest.*

private val trace = Trace()

enum class Note {
  A, B, C, D, E, F, G
}

abstract class Instrument(val name: String) {
  abstract fun play(n: Note)
}

open class Wind : Instrument("Wind") {
  override fun play(n: Note) {
    trace("$name blow $n")
  }
}

class Percussion : Instrument("Percussion") {
  override fun play(n: Note) {
    trace("$name strike $n")
  }
}

class Stringed : Instrument("Stringed") {
  override fun play(n: Note) {
    trace("$name pluck $n")
  }
}

fun tune(i: Instrument) = i.play(Note.C)

fun main() {
  val orchestra = listOf(
    Wind(),
    Percussion(),
    Stringed()
  )
  orchestra.forEach { tune(it) }
  trace eq """
    Wind blow C
    Percussion strike C
    Stringed pluck C
  """
}
```