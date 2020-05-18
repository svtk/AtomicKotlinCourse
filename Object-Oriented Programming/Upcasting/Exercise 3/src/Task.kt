// Upcasting/UpcastExercise3.kt
package upcastingExercise3

interface Fighter {
  fun fight(): String
}

interface Swimmer {
  fun swim(): String
}

interface Flyer {
  fun fly(): String
}

open class ActionCharacter {
  fun fight(): String = "ActionCharacter fight"
}

class Hero : ActionCharacter(), Fighter, Swimmer, Flyer {
  override fun swim() = "Hero swim"
  override fun fly() = "Hero fly"
}

fun tryFight(x: Fighter) {
  println(x.fight())
}

fun trySwim(x: Swimmer) {
  println(x.swim())
}

fun tryFly(x: Flyer) {
  println(x.fly())
}

fun doAction(x: ActionCharacter) {
  println(x.fight())
}

fun main() {
  val h = Hero()
  tryFight(h) // Treat it as a Fight
  trySwim(h) // Treat it as a Swim
  tryFly(h) // Treat it as a Fly
  doAction(h) // Treat it as an ActionCharacter
}