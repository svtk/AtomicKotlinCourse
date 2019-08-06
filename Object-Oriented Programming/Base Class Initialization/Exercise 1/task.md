## Base Class Initialization (#1)

Change the implementations of `Wall` and `Food` classes,
so that they extended the `StaticElement` class instead
of implementing `GameElement` interface directly.
Pass the corresponding values for `symbol` and `sharesCell` properties 
as function arguments.
Note that you no longer need to provide implementation of `playTurn()`
function: the trivial implementation is inherited from the base class.

The `sharesCell` property specifies whether a mobile element like `Robot`
or `Monster` can step at the same cell. For instance, a robot can be on the same
cell with food or bomb (in this case food is eaten or bomb is exploded), but it 
can't share the cell with the wall. The wall occupies the whole cell and 
doesn't allow any movement to this cell.