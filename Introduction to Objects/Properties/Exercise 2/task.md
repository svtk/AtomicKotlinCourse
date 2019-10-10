## Properties (#2)

Create a `Robot` class. A `Robot` starts in the `(0, 0)` cell and can move
right, left, up and down. Its location is stored as a pair of coordinates
`(x, y)`, where `(0, 0)` is the top-left corner:

```
(x, y)
(0, 0) (1, 0)
(0, 1) (1, 1)
```

Moving right increases the `x` coordinate, moving down increases the `y`
coordinate, while moving left and up decrease the `x` and `y` coordinates.

Create the member functions `right()`, `left()`, `up()` and `down()`, each of
which takes a `steps` argument. Create another member function `getLocation()`
that returns the coordinates as a string `(x, y)`. Write a `main()` to test
`Robot`.