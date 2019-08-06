## Complex Constructors (#1)

Modify the primary constructor of the `MazeImpl` class to 
initialize a maze contents using only the maze representation in a string.
Calculate `width` and `height` properties based on the maze representation.
Use the auxiliary function `createGameElement()` (defined in `GameElements.kt`)
to create an element by using a given character.

For a start, you can reuse the implementation given in the atom text.
Note, however, that only one element is stored in a cell there, and in a real
game several elements can be stored in one cell. Also, the maze representation
with empty cells at the end of lines isn't supported in the implementation
in the book. Fix this problem.