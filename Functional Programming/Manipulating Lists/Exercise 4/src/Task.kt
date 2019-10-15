package manipulatingLists.exercise4

import atomictest.eq

class Person(
    val name: String
) {
  val friends: MutableList<Person> = mutableListOf()

  override fun toString() = "($name, friends: ${friends.map { it.name }})"
}

fun getFriendSuggestions(person: Person): Set<Person> {
  return (person.friends.flatMap { it.friends }.toSet()
      - person.friends - person)
}

fun main() {
  val alice = Person("Alice")
  val bob = Person("Bob")
  val charlie = Person("Charlie")

  alice.friends += bob
  bob.friends += alice
  bob.friends += charlie
  charlie.friends += bob

  getFriendSuggestions(alice) eq setOf(charlie)
}