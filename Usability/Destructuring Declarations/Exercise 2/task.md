## Destructuring Declarations (#2)

If you do not define a class as a `data` class, you must add extra functions to
allow that class to be used in a destructuring declaration. Start with
`Computation.kt` and remove the `data` from the definition of `Computation`. The
code no longer compiles. IntelliJ IDEA will prompt you and automatically fill in
the skeleton definitions for `operator fun component1()` and `operator fun
component2()`, or you may do this by hand. (Note: we do not cover the `operator`
keyword until [Operator Overloading], but you don't need
to understand it for this exercise). Provide the correct bodies for these
functions and show that the rest of the code still works without modifying it.
Consider how much more work (and visual noise) results from more fields in the
class, and how much effort is saved by using `data` classes.
