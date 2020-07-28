## Scope Functions (#1)

The starter code defines `class NumPair`. In `main()`, create `val np1` and
initialize it with `NumPair(10, 20)` with an `apply` scope that adds 5 to `x`
and 6 to `y`. Use `eq` to verify the result of `np1`. Now create `val np2` and
initialize it with `NumPair(30, 40)` that has an `also` scope that adds 7 to
`x` and 8 to `y`. Use `eq` to verify the result of `np2`.

Define `val result1` initialized with `np1.run` where the lambda sums the
results of `add()`, `subtract()`, and `multiply()`. Use `eq` to check the
result. Duplicate this functionality creating `result2` using `let` and
`result3` using `with`.

> Solution 1

```kotlin
// ScopeFunctions/ScopeFuncSoln1.kt
package scopefuncsoln1
import atomictest.eq

data class NumPair(var x: Int, var y: Int) {
  fun add() = x + y
  fun subtract() = x - y
  fun multiply() = x * y
}

fun main() {
  val np1: NumPair = NumPair(10, 20).apply {
    x += 5
    y += 6
  }
  np1 eq NumPair(15, 26)
  val np2: NumPair = NumPair(30, 40).also {
    it.x += 7
    it.y += 8
  }
  np2 eq NumPair(37, 48)
  val result1: Int = np1.run {
    add() + subtract() + multiply()
  }
  result1 eq 420
  val result2: Int = np1.let {
    it.add() + it.subtract() + it.multiply()
  }
  result2 eq 420
  val result3: Int = with(np1) {
    add() + subtract() + multiply()
  }
  result3 eq 420
}
```