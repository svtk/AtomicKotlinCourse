## Function Types (#2)

Rewrite the following function by using only one `mapNotNull` call:

```kotlin
fun List<Int>.transform(): List<Int> = 
    filter { it % 2 == 0 }.map { it * it }
```

It's possible to replace the code calling first `filter()`, then `map()`
with one invocation of the function `mapNotNull()`.