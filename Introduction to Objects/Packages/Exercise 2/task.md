## Packages (#1)

We'll work with three packages `aaa`, `bbb` and `ccc` defined in the files
`aaa.kt`, `bbb.kt` and `ccc.kt` correspondingly in the accompanying code.

In the first package `aaa` define a `val x = 10`, a top-level function `fa()`
that takes an `Int` parameter and returns that argument multiplied by `x`,
and a class `K` with a `toString()` that returns `"K"`.

In a second `package` named `bbb` `import` all the components from `aaa`
and use them in a function `g()`. The function `g()` should take an `Int`
parameter `i` and return the following string literal using members
from `aaa`:

```
"${K()} ${fa(i)}"
```

Create a third `package ccc` and import everything from `bbb`. In `main()`, call
`println(g(1))` and make sure you cannot access any of the components from
`package aaa` without importing them.