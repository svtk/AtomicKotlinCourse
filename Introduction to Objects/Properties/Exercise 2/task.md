## Properties (#2)

A `Robot` object starts in the `(0, 0)` cell and can move right, left, up and
down. Its location is stored as a pair of coordinates `(x, y)`, where `(0, 0)`
is the top-left corner:

```text
(x, y)
(0, 0) (1, 0)
(0, 1) (1, 1)
```

Moving right increases the `x` coordinate, moving down increases the `y`
coordinate, while moving left and up decrease the `x` and `y` coordinates.

Implement `Robot`'s member functions `right()`, `left()`, `up()` and `down()`,
each of which takes a `steps` parameter. Also implement `getLocation()` which
returns the `Robot`'s coordinates as a `String` in the form `(x, y)`.
