## Interfaces (#1)

`ElementsMatrix` is an auxiliary interface used to implement `MazeImpl`.
It stores elements in a two-dimensional list of the size `height * width`,
which is implemented as a list of Lists (where the outer list is of `height` 
size and each inner list is of `width` size).

In each cell, a set of elements is stored. It's possible to add or remove a given 
element in a specified position. Your task is to implement `addElement()` and
 `removeElement()` functions.

The sample shows the representation of elements stored in `matrix`.

Especially for the tasks in this section, make sure you add your solution only
inside the answer box. Then the following tasks will be able to reuse it 
correctly.