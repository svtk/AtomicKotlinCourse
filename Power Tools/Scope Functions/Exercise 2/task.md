## Scope Functions (#2)

The starter code uses the `SpaceShipControls` class from
`ClassDelegation/SpaceShipControls.kt`. It contains a `main()` that starts with:

```kotlin
fun main() {
  var velocity = 1
  with(SpaceShipControls()) {
    trace(forward(velocity))
```

Add `right(velocity)` and `down(velocity)` calls, tracing the results of
each. At the closing `}` of the scope function, chain the result to a `let`
block, which increments `velocity`, then performs the same operations. At the
end of that block, chain to a `run` block, then an `apply` block and an `also`
block, performing the same operations in each block. Use `trace` to verify the
output.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
