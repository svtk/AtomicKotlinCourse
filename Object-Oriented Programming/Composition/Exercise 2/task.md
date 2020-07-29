## Composition (#2)

The starter code contains implementations of `Stack` and `Queue` classes.

`Stack` provides a last-in-first-out access to elements. You can add ("push") 
new elements to it, and get ("pop") the last one which was added.

`Queue` provides a first-in-first-out access to elements. You can add new
elements to it, and get ("poll") returns you the first one which was added.

In the starter code, both `Stack` and `Queue` extend `ArrayList`, which
opens too many methods in public API (for example, you can get the first element
in `Stack` which contradicts its design).

Use composition instead of inheritance to implement `Stack` and `Queue`.