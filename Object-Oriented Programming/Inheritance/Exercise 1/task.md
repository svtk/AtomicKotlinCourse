## Inheritance (#1)

`MazeImpl` additionally keeps the record of positions of all the elements added to
`GameMatrix` by storing a `positions` map from an element to position.

Implement the `Maze.destroy(GameElement)` function which should remove
the element both from `matrix` and from the auxiliary `positions` map.