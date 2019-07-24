package maps3

import atomictest.capture
import atomictest.eq

class Hamster(val name: String) {
  override fun toString(): String {
    return "Hamster('$name')"
  }
}

class Cage(private val maxCapacity: Int) {
  private val hamsters: MutableMap<String, Hamster> =
      mutableMapOf()

  fun put(hamster: Hamster): Boolean =
      if (hamsters.size == maxCapacity)
        false
      else {
        hamsters[hamster.name] = hamster
        true
      }

  fun takeHamsterByName(name: String): Hamster =
      hamsters.getValue(name)

  fun removeHamster(name: String) =
      hamsters.remove(name)
}

fun main() {
  val cage = Cage(2)
  cage.put(Hamster("Alice")) eq true
  cage.takeHamsterByName("Alice") eq "Hamster('Alice')"
  cage.removeHamster("Alice")
  capture {
    cage.takeHamsterByName("Alice")
  } eq "NoSuchElementException: " +
      "Key Alice is missing in the map."
}