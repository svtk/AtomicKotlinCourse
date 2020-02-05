## Destructuring Declarations (#3)

Write a function `f()` that returns a `Pair` containing `true` along with a
second nested `Pair` containing "Yes" and 100. In `main()`, attempt to write
a destructuring declaration that unpacks the `Boolean` along with both parts
of the nested `Pair` in a single statement. Now unpack the result of `f()` in
two steps: first capture the two components of the outer `Pair`, then unpack
the two components of the nested `Pair`.

```kotlin
// Destructuring/DestructuringEx3.kt
package destructuringex3
import atomictest.eq

fun f() = Pair(true, Pair("Yes", 100))

fun main() {
  // val (ok, (u, v)) = f()
  val (ok, p) = f()
  ok eq true
  val (u, v) = p
  u eq "Yes"
  v eq 100
}
```