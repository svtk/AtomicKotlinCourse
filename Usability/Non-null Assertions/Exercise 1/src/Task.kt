package nonNullAssertionsExercise1

class Rocket {
  fun ignition() = "Liftoff!"
}

fun launch(rocket: Rocket?) {
  rocket!!.ignition()
}

fun main() {
  val rocket = Rocket()
  launch(rocket)
  // launch(null)
}