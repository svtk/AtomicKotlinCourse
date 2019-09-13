## Interfaces (#1)

The `MazeImpl` class implements the `Maze` interface.
It stores game elements in a "table" of the size `height * width`,
which is backed by a list of Lists (where the outer list is of `height` 
size and each inner list is of `width` size).
In each cell, a set of elements is stored. 
`MazeImpl` additionally keeps the record of positions of all the elements
by storing a `positions` map from an element to position.

Your task is to implement the `add(GameElement, Position)` and
`remove(GameElement, Position)` functions that add or remove element
on a given position.