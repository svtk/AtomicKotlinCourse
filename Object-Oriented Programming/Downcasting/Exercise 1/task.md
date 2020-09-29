## Downcasting (#1)

Modify `NarrowingUpcast.kt` to call the functions in the extended interface.
First, changed `Derived1` and `Derived2` by adding calls to `trace` for each
function. The `trace` argument is the class name and function; for example
`fun h() = trace("Derived2.h()")`.

Now write a function `checkAndCall(b: Base)` so that it calls the polymorphic
member function, then uses a `when` to downcast and call the extended-interface
functions.

<sub> This task doesn't contain the automatic tests,
it's always marked as "Correct" on "Check".
Please compare your solution with the provided one! </sub>