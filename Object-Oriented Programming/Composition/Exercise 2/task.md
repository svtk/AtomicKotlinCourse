## Composition (#2)

The starter code contains implementations of `Stack` and `Queue` classes.

`Stack` provides a last-in-first-out access to elements. You can `push()`
new elements into it, and `pop()` the last element that was added.

`Queue` provides a first-in-first-out access to elements. You can `put()` new
elements into it, while `poll()` returns the first element.

In the starter code, both `Stack` and `Queue` extend `ArrayList`, which opens
too many methods in the public API (for example, you can get the first element
in `Stack`, which contradicts its design). Use composition instead of
inheritance to implement `Stack` and `Queue`.
