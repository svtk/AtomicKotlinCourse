## Higher-Order Functions (#2)

Rewrite the following function using a single call to `mapNotNull()`:

```kotlin
fun List<Int>.transform(): List<Int> =
  filter { it % 2 == 0 }.map { it * it }
```
