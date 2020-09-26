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