## Composition (#2)

The starter code contains implementations of `Stack` and `Queue` classes.

`Stack` provides last-in-first-out access to elements. You can add ("push")
new elements, and get ("pop") the last element that was added.

`Queue` provides first-in-first-out access to elements. You can add new
elements to it, and get ("poll") returns the first element that was added.

In the starter code, both `Stack` and `Queue` extend `ArrayList`, which opens
too many methods in the public API (for example, you can get the first element
in `Stack`, which contradicts its design). Use composition instead of
inheritance to implement `Stack` and `Queue`.
