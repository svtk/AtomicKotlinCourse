## Scope Functions (#2)

Import the `SpaceShipControls` class from
`ClassDelegation/SpaceShipControls.kt`. Start your `main()` with:

```kotlin
fun main() {
  var velocity = 1
  with(SpaceShipControls()) {
    trace(forward(velocity))
```

also calling `right(velocity)` and `down(velocity)`, tracing the results of
each. At the closing `}` of the scope function, chain the result to a `let`
block, which increments `velocity`, then performs the same operations. At the
end of that block, chain to a `run` block, then an `apply` block and an `also`
block, performing the same operations in each block. Use `trace` to verify the
output.

> Solution 2

```kotlin
// ScopeFunctions/ScopeFuncSoln2.kt
import classdelegation.SpaceShipControls
import atomictest.*

fun main() {
  var velocity = 1
  with(SpaceShipControls()) {
    trace(forward(velocity))
    trace(right(velocity))
    trace(down(velocity))
    this
  }.let {
    velocity++
    trace(it.forward(velocity))
    trace(it.right(velocity))
    trace(it.down(velocity))
    it
  }.run {
    velocity++
    trace(forward(velocity))
    trace(right(velocity))
    trace(down(velocity))
    this
  }.apply {
    velocity++
    trace(forward(velocity))
    trace(right(velocity))
    trace(down(velocity))
  }.also {
    velocity++
    trace(it.forward(velocity))
    trace(it.right(velocity))
    trace(it.down(velocity))
  }
  trace eq """
    forward 1
    right 1
    down 1
    forward 2
    right 2
    down 2
    forward 3
    right 3
    down 3
    forward 4
    right 4
    down 4
    forward 5
    right 5
    down 5
  """
}
```