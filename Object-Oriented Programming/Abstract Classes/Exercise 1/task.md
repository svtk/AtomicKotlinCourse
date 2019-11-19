## Abstract Classes (#1)

Implement the `move` function of the `Robot` class.
It should return the new cell for `Robot` to step in.
If the robot can't make a move because the cell is already
occupied with a `Wall` or another element that can't share cell, return `null`.

You can use utility functions `Maze.isPassable` and `Cell.applyMove`
defined in `MazeEx.kt`.