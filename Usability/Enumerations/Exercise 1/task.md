## Enumerations (#1)

This exercise refactors the `Robot` class used in section II. Replace the four
functions `right()`, `left()`, `down()` and `up()` with one function `go()`
that takes an additional `Direction` parameter specifying the direction of
movement.

The location is stored as a pair of coordinates `(x, y)`, where `(0, 0)` is the
top-left corner:

```text
(x, y)
(0, 0) (1, 0)
(0, 1) (1, 1)
```

Moving right increases the `x` coordinate, moving down increases the `y`
coordinate, moving left and up decrease the `x` and `y` coordinates.
