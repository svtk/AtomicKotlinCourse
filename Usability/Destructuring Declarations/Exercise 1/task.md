## Destructuring Declarations (#1)

Using `Pairs.kt` as a model, write a function `calculate(n1: Int, n2: Int)`
which returns a `Triple` containing a `Boolean` and two `Int`s. If either `n1`
or `n2` is less than zero, it returns a `Triple` containing `false` and two
zeros. Otherwise, it returns a `Triple` containing:

+ `true`

+ The sum of `n1` and `n2`

+ `n1` multiplied by `n2`

The starter code contains a `main()` with tests, showing the difference between
unpacking the `Triple` using `first`, `second` and `third` versus a
destructuring declaration.
