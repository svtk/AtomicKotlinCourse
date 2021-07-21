## Check Instructions (#3)

This exercise further explores ranges, introduced in [Looping &
Ranges], and shows how they can be used with check
instructions.

Create a class `Level` with two constructor arguments: `val range: IntRange`,
and `private var level: Int`. `level` has a default argument that is the bottom
value of `range`. The constructor should ensure that `level` is one of the
values in `range`.

Add a read-only `value` property that produces the value of `level`.

Add a function `up()` that increments `level` only if the result is within
`range`, and a function `down()` that decrements `level` only if the result is
within `range`. Finally, add a function `set(new: Int)` that first ensures that
`new` is within `range` and then assigns `new` to `level`.

`Level` is tested by the starter code in `main()`.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
