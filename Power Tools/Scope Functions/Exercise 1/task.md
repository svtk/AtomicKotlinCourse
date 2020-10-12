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

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
