## Nested Classes (#1)

In `FillIt.kt`, `State` is only used to determine when there are no more `Blank`
spaces in `grid`. Simplify the program by removing `State` and returning a
`Boolean` from `turn()`. Once you have that working, add a third player by
changing `enum class Mark { Blank, X ,O }` to `enum class Mark {Blank, X, Y, Z
}`. In `turn()`, use a `when` expression to move to the next `player` value.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
