## Nested Classes (#1)

In `FillIt.kt`, `State` is only used to determine when there are no more
`BLANK` spaces in `grid`. Simplify the program by removing `State` and
returning a `Boolean` from `turn()`. Once you have that working, add a third
player by changing  `enum class Mark { BLANK, X ,O }` to `enum class Mark {
BLANK, X, Y, Z }`. In `turn()`, use a `when` expression to move to the next
`player` value.