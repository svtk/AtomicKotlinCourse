## Object-Oriented Design (#2)

Make a new version of `RobotExplorer.kt` which allocates a number of moves for
the user to solve the maze, and displays this value after the `Robot`'s
`energy` (as originally shown) using the `console()` function. Decrease the
number of moves available after each move (the moves can become negative).
Calculate the allocated number of moves by counting all the `Food` items in the
maze, dividing by two and adding 50.

The goal of the player is to reach the end of the maze before running out of
moves while maximizing the `energy` value.