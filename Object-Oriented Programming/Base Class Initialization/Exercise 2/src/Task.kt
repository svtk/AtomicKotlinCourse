package baseClassInitializationExercise4

open class Plate(description: String) {
  init {
    println("Plate-$description")
  }
}

class DinnerPlate : Plate("DinnerPlate")

open class Utensil(description: String) {
  init {
    println("Utensil-$description")
  }
}

class Spoon : Utensil("Spoon")

class Fork : Utensil("Fork")

class Knife : Utensil("Knife")

open class Custom {
  init {
    println("Custom")
  }
}

class PlaceSetting : Custom() {
  val spoon = Spoon()
  val fork = Fork()
  val knife = Knife()
  val plate = DinnerPlate()
  init {
    println("PlaceSetting")
  }
}

fun main() {
  PlaceSetting()
}