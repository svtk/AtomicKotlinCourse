## Scope Functions (#3)

The starter code includes a definition for `class Math`. Create a `Math` object
with a `run` scope. Inside that scope, define `val z` which is initialized by
calling `np(11, 7)` with an `apply` scope. Inside that scope call `add() +
subtract()` and after closing the scope, call `calc()`. Use `eq` to check that
the result is 77. The return value from the `run()` scope is `z + add()`; use
`eq` to check that the result is 1077.

<sub> This task doesn't contain the automatic tests,
it's always marked as "Correct" on "Check".
Please compare your solution with the provided one! </sub>