## Hashing (#1)

Check your understanding of how sets store instances of data classes. Guess the
size of sets `set1` and `set2` in the following code:

```kotlin
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
  set1.size  // 1 or 2?
  set2.size  // 1 or 2?
}
```

You can easily check your guess by printing the contents of the sets.