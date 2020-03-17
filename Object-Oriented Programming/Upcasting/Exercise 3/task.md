## Upcasting (#3)

When you combine interfaces to create a class, you can upcast an object of
that class to each different interface.

Create three interfaces: `Fight` with a function `fight()`, `Swim` with a
function `swim()`, and `Fly` with a function `fly()`. Create a class
`ActionCharacter` which has a `fight()` function that uses `atomictest.Trace`
to report  `"ActionCharacter fight"`.

Now define a class `Hero` that combines `ActionCharacter`, `Fight`, `Swim` and
`Fly`. Notice that the `fight()` in `ActionCharacter` provides the `fight()`
needed by the `Fight` interface. Define `swim()` to trace `"Hero swim"`
and `fly()` to trace `"Hero fly"`.

Next, define `t(x: Fight)`, `u(x: Swim)`, `v(x: Fly)`, and `w(x: ActionCharacter)`,
so that each function calls the member function avalable to its parameter.

In `main()`, make a `Hero` object and pass it to each of the functions `t()`,
`u()`, `v()`, and `w()` and validate the output using `trace`. Notice how
passing a `Hero` to each of the functions upcasts it so that, inside the
function, the `Hero` becomes only the type of that parameter.


```kotlin
// Upcasting/UpcastExercise3.kt
package upcasting
import atomictest.*

private val trace = Trace()

interface Fight {
  fun fight()
}

interface Swim {
  fun swim()
}

interface Fly {
  fun fly()
}

open class ActionCharacter {
  fun fight() =
    trace("ActionCharacter fight")
}

class Hero :
  ActionCharacter(), Fight, Swim, Fly {
  override fun swim() = trace("Hero swim")
  override fun fly() = trace("Hero fly")
}

fun t(x: Fight) = x.fight()
fun u(x: Swim) = x.swim()
fun v(x: Fly) = x.fly()
fun w(x: ActionCharacter) = x.fight()

fun main() {
  val h = Hero()
  t(h) // Treat it as a Fight
  u(h) // Treat it as a Swim
  v(h) // Treat it as a Fly
  w(h) // Treat it as an ActionCharacter
  trace eq """
    ActionCharacter fight
    Hero swim
    Hero fly
    ActionCharacter fight
  """
}
```