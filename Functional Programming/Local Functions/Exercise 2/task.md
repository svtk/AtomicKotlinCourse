## Local Functions (#2)

The `createCounter()` function creates a pair of functions for managing a
`counter`. Instead of creating a class, we manipulate the `counter` using only
functions.

In `createCounter()` define a local variable `counter`. Then define two local
functions:

+ `inc()`: increases the `counter` value by one

+ `value()`: returns the value of `counter`

Finally, return a pair of function references to these local functions:

`return Pair(::inc, ::value)`

The two local functions capture the same local variable `counter`. This style
of managing state is commonly used in pure functional programming languages
that don't have classes.
