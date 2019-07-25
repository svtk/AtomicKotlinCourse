## Enumerations (#1)

This task refactors the `Robot` class used in the section II:
it replaces four functions `goRight`, `goLeft`, `goDown` and `goUp` 
with one function `go` that takes a `Direction` argument which specifies 
the direction of movement.

Implement the `go` function.

The location is stored as a pair of coordinates `(x, y)`, where `(0, 0)` is the top-left
corner:

```
(x, y)
(0, 0) (1, 0)
(0, 1) (1, 1)
```

Going right increases `x` coordinate, going down increases `y` coordinate,
going left and up decreases `x` and `y` coordinates accordingly.