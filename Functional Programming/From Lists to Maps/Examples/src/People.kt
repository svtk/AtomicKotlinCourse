// FromListsToMaps/People.kt
package fromliststomaps

data class Person(
  val name: String,
  val age: Int
)

fun people(): List<Person> {
  val names = listOf("Alice", "Arthricia",
    "Bob", "Bill", "Birdperson", "Charlie",
    "Crocubot", "Franz", "Revolio")
  val ages = listOf(21, 15, 25, 25, 42, 21,
    42, 21, 33)
  return names.zip(ages) { name, age ->
    Person(name, age)
  }
}