package mapsExercise2

import atomictest.capture
import atomictest.eq

class Hamster(val name: String) {
  override fun toString(): String {
    return "Hamster('$name')"
  }
}

class Cage(private val maxCapacity: Int) {
  private val hamsters =
      mutableListOf<Hamster>()

  fun put(hamster: Hamster): Boolean =
      if (hamsters.size == maxCapacity)
        false
      else {
        hamsters += hamster
        true
      }

  fun get(name: String): Hamster {
    for (hamster in hamsters) {
      if (hamster.name == name) {
        return hamster
      }
    }
    throw NoSuchElementException("No hamster called $name")
  }

  fun remove(name: String) {
    var hamsterWithGivenName: Hamster? = null
    for (hamster in hamsters) {
      if (hamster.name == name) {
        hamsterWithGivenName = hamster
      }
    }
    hamsters.remove(hamsterWithGivenName)
  }
}

fun main() {
  val cage = Cage(2)
  cage.put(Hamster("Alice")) eq true
  cage.get("Alice") eq "Hamster('Alice')"
  cage.remove("Alice")
  capture {
    cage.get("Alice")
  } eq "NoSuchElementException: " +
      "No hamster called Alice"
}