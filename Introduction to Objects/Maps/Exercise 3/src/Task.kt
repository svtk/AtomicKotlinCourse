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
}

fun main() {
  val cage = Cage(2)
  cage.put(Hamster("Alice")) eq true
  cage.takeHamsterByName("Alice") eq "Hamster('Alice')"
  capture {
    cage.takeHamsterByName("Bob")
  } eq "NoSuchElementException: " +
      "Key Bob is missing in the map."
}