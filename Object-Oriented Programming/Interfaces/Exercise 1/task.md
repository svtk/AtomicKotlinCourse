## Interfaces (#1)

`GameMatrix` is an auxiliary interface used to implement `MazeImpl`.
It stores elements in a two-dimensional list of the size `height * width`,
which is implemented as a list of Lists (where the outer list is of `height` 
size and each inner list is of `width` size).

In each cell, a set of elements is stored. It's possible to add or remove a given 
element on a specified position. Your task is to implement the
`add(GameElement, Position)` and `remove(GameElement, Position)`
functions that add or remove element on a given position.

Note the `main` function in the `MazeImpl.kt` file that uses
the representation of elements stored in `matrix`.