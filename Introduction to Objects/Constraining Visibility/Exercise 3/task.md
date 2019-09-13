## Constraining Visibility (#2)

A `Robot` can only move forward. Check that the `steps` argument is a positive
number. If `steps` is negative or zero, each of the functions  `goRight()`,
`goLeft()`, `goDown()` and `goUp()` shouldn't update the location and should
only display on the console: `"Incorrect input: $steps, the number of steps
should be positive."`