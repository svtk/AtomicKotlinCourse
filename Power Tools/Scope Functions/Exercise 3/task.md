## Scope Functions (#3)

The starter code includes a definition for `class Math`. Create a `Math` object
with a `run` scope. Inside that scope, define `val z` which is initialized by
calling `np(11, 7)` with an `apply` scope. Inside that scope call `add() +
subtract()` and after closing the scope, call `calc()`. Use `eq` to check that
the result is 77. The return value from the `run()` scope is `z + add()`; use
`eq` to check that the result is 1077.

> Solution 3

```kotlin
// ScopeFunctions/ScopeFuncSoln3.kt
package scopefuncsoln3
import atomictest.eq
import scopefuncsoln1.NumPair

class Math {
  fun np(x: Int, y: Int) = NumPair(x, y)
  fun add() = 1000
  fun subtract() = -1000
  fun NumPair.calc() = multiply()
}

fun main() {
  Math().run {
    val z = np(11, 7).apply {
      add() + subtract()
    }.calc()
    z eq 77
    z + add()
  } eq 1077
}
```