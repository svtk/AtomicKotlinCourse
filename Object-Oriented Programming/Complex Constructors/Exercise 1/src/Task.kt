// ComplexConstructors/Exercise1.kt
package complexConstructorsExercise1
import atomictest.eq

class Alien(name: String) {
  val myName: String
  init {
    myName = name
  }
}

fun main() {
  val alien = Alien("Pencilvester")
  alien.myName eq "Pencilvester"
}