## Upcasting (#1)

Create a `Rodent` interface containing `eat()` and `speak()` functions. Make
two implementations of `Rodent`: `Mouse` and `KangarooRat`. For each function,
use `atomictest.Trace` to  record the name of the class, a dot, and the name of
the function. In `KangarooRat`, add a `jump()` function which follows the form
of the other functions.

Create a function `upcast(rodent: Rodent)` which calls `eat()` and `speak()`.
Show that the compiler won't allow you to call `jump()`.

In `main()`, create an instance of `Mouse` and `KangarooRat`, and show that
you can call `jump()` for the latter. Pass both objects into `upcast()`, and
use `trace` to verify the output.