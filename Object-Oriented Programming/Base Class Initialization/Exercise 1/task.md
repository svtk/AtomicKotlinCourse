## Base Class Initialization (#1)

Change the implementations of `Wall` and `Food` classes,
so that they extended the `ImmovableElement` class instead
of implementing `GameElement` interface directly.
Pass the corresponding values (for `symbol` and `preventMovement` properties) 
as function arguments.
Note that you no longer need to provide implementation of `interact()`
function: the trivial implementation is inherited from the base class.

The `preventMovement` property specifies whether a movable element like `Robot`
or `Monster` can step at the same cell. For instance, a robot can be on the same
cell with food or bomb (in this case food is eaten or bomb is exploded), but it 
can't share the cell with the wall. The wall occupies the whole cell and 
therefore prevents any movement to this cell.