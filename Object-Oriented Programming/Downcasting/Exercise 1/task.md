## Downcasting (#1)

Modify `NarrowingUpcast.kt` to call the functions in the extended interface.
First, changed `Derived1` and `Derived2` by adding calls to `trace` for each
function. The `trace` argument is the class name and function. For example `fun
h() = trace("Derived2.h()")`.

Now write a function `checkAndCall(b: Base)` that calls the polymorphic member
function, then uses a `when` to downcast and call the extended-interface
functions.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
