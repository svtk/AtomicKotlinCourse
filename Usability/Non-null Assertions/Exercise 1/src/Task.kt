package nonNullAssertionsExercise1

class Rocket {
  fun ignition() {
    println("Liftoff!")
  }
}

fun launch(rocket: Rocket?) {
  rocket!!.ignition()
}

fun main() {
/*
  val rocket = Rocket()
  launch(rocket)
  // throws exception:
  // launch(null)
*/
}