package hashingExercise1

data class Contact(
  val name: String,
  val number: String
)

class Person(val name: String)

fun main() {
  val set1 = setOf(
    Person("Alice"),
    Person("Alice"))
  val set2 = setOf(
    Contact("Alice", "123-456"),
    Contact("Alice", "123-456"))
  set1.size  // 1 or 2? Write you guess below.
  set2.size  // 1 or 2? Write you guess below.
}

fun getSet1Size(): Int = 2
fun getSet2Size(): Int = 1