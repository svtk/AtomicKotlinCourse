## Destructuring Declarations (#1)

Using `Pairs.kt` as a model, write a function `calculate(n1: Int, n2: Int)`
which returns a `Triple` containing a `Boolean` and two `Int`s. If either `n1`
or `n2` is less than zero, it returns `false` and two zeros. Otherwise, it
returns a `Triple` containing:

- `true`
- The sum of `n1` and `n2`
- `n1` multiplied by `n2`

The starter code contains a `main()` with tests, showing the different between
unpacking the `Triple` using `first`, `second` and `third` versus a
destructuring declaration.

```kotlin
// Destructuring/DestructuringEx1.kt
package destructuringex1
import atomictest.eq

fun calculate(n1: Int, n2: Int):
  Triple<Boolean, Int, Int> {
  if(n1 < 0 || n2 < 0)
    return Triple(false, 0, 0)
  return Triple(true, n1 + n2, n1 * n2)
}

fun main() {
  val result = calculate(5, 7)
  result.first eq true
  result.second eq 12
  result.third eq 35
  val (success, plus, multiply) =
    calculate(11, 13)
  success eq true
  plus eq 24
  multiply eq 143
}
```