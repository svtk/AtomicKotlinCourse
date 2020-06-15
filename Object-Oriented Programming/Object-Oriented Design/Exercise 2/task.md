## Object-Oriented Design (#2)

Make a new version of `RobotExplorer.kt` which keeps track of the number of
moves the user makes to solve the maze. An allowed number of moves is initally
allocated, and this value is displayed using the `console()` function, placing
it after the `Robot`'s `energy`. Decrease the number of moves available after
each move (the moves can become negative). Calculate the allocated number of
moves by counting all the `Food` items in the maze, dividing by two and adding
50.

The goal of the player is to reach the end of the maze before running out of
moves, while at the same time maximizing the `energy` value.