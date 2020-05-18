## Upcasting (#1)

The starter code contains a `Rodent` interface and its two implementations:
`Mouse` and `KangarooRat`. The `Rodent` defines `eat()` and `speak()`
functions, which are implemented in subclasses. `KangarooRat` adds a `jump()`
function.

Create a function `upcast(rodent: Rodent)` which displays the result of `eat()`
and `speak()` to the console (each on its own line). Show that the compiler
won't allow you to call `jump()`.

`main()` creates an instance of `Mouse` and `KangarooRat`, and shows that
you can call `jump()` for the latter and pass both objects into `upcast()`.
Make your guess of what is the output of `main()`, and then run `main()` and
check your guess.