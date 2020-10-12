## Higher-Order Functions (#4)

Implement `andThen()` to combine the actions of two functions. `f.andThen(g)`
returns a new function that first applies `f` and then applies `g` to the
result: `{arg -> g(f(arg))}`. Define `andThen()` as an extension function on a
function type.
