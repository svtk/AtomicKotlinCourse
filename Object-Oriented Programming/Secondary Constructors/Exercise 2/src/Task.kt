// SecondaryConstructors/Task2.kt
package secondaryConstructorsExercise2
import atomictest.eq

data class SpaceShip(val name: String) {
    constructor(shipClass: String, model: Int)
      : this("$shipClass-$model")
}

fun main() {
    SpaceShip("SuperhighspeedShip") eq
      "SpaceShip(name=SuperhighspeedShip)"
    SpaceShip("MClass", 29321) eq
      "SpaceShip(name=MClass-29321)"
}