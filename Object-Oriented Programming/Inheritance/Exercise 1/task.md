## Inheritance (#1)

`MazeImpl` keeps the record of positions of all the elements added to
`ElementMatrix` by storing a map from an element to position.

Note that the logic reading the maze was moved from its representation to `MazeImpl` 
class, so that information about elements was added correctly to both
`matrix` and `elementToPosition` Map. Edit it if necessary by using 
the private member function `addElement()`. 

Implement the `destroyElement()` function which should remove the element both
from `matrix` and from the auxiliary `elementToPosition` map.