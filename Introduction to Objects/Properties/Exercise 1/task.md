## Properties (#1)

Implement the member functions of the `Robot` class. A `Robot` starts in the
`(0, 0)` cell and can move to the right, to the left, down and up. Its location
is stored as a pair of coordinates `(x, y)`, where `(0, 0)` is the top-left
corner:

```
(x,y)
(0,0) (1,0)
(0,1) (1,1)
```

Going right increases `x` coordinate, going down increases `y` coordinate,
going left and up decreases `x` and `y` coordinates accordingly.

Implement `goRight()`, `goLeft()`, `goUp()`, `goDown()` and `getLocation()`
member functions. `getLocation()` should return the coordinates as a string
`(x, y)`.