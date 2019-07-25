## Library Helpers (#3)

Rewrite the following function using one of the library helpers 
to have only one call chain:

```kotlin
fun transform(list: List<Int>): List<Int> {
  val intermediateResult = list
      .filter { it % 2 == 1 }
      .map { it * it }
  return intermediateResult.subList(
      1, intermediateResult.size)
}
```