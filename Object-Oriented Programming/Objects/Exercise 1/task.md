## Objects (#1)

Create a file-level `private fun f()` and `private val p`. The starter code in
`main()` will show you how to write these. Now duplicate `f()` and `p` inside
`object Space` and again in `private object Space2`, and get these to work
according to the code in `main()`. Notice the changes you need to make so that
`f()` is available in `main()`. Compare the different approaches.

```kotlin
// Objects/ObjectEx1.kt
package objectex1
import atomictest.*

private val trace = Trace()

private fun f() = trace("f() $p")
private val p = "p"

object Space {
  fun f() = trace("Space.f() $p")
  private val p = "Space.p"
}

private object Space2 {
  fun f() = trace("Space2.f() $p")
  private val p = "Space2.p"
}

fun main() {
  f()
  Space.f()
  Space2.f()
  trace eq """
  f() p
  Space.f() Space.p
  Space2.f() Space2.p
  """
}
```