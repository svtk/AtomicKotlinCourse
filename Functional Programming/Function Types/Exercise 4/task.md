## Function Types (#4)

Implement `andThen()` function. It combines the actions of two functions.
`f.andThen(g)` should return a new function that first applies `f`, and then 
applies `g` to the result: `{arg -> g(f(arg))}`.
Note that `andThen()` is declared as an extension function on a function type.
