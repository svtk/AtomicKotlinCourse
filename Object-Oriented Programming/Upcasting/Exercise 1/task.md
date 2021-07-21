## Upcasting (#1)

The starter code contains a `Rodent` interface and its two implementations:
`Mouse` and `KangarooRat`. `Rodent` declares the functions `eat()` and
`speak()`, which must be implemented in the subclasses. `KangarooRat` adds a
`jump()` function.

Create a function `upcast(rodent: Rodent)` that displays the result of `eat()`
and `speak()` using `trace()`. Show that the compiler won't allow you to call
`jump()`.

`main()` creates an instance of `Mouse` and `KangarooRat`, and shows that you
can call `jump()` for the latter and pass both objects into `upcast()`. Guess
the output of `main()`, then run `main()` to check your guess.
