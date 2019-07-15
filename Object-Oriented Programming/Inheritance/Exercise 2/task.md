## Inheritance (#2)

Implement a more powerful version of the bomb: the one with a diameter of 
the explosion. All the cells that are close enough to the bomb except walls
must be destroyed. Walls are strong enough not to be exploded.

Note that the bomb should explode only when another element steps at the same 
cell.

Use the auxiliary function `isCloseToBomb()` to check whether an element
is close enough to the bomb to be destroyed.