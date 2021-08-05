## Packages (#2)

The starter code defines three packages `aaa`, `bbb` and `ccc` via the files
`aaa.kt`, `bbb.kt` and `ccc.kt`.

In the first package `aaa`, define:

- `val x = 10`

- A top-level function `fa()` that takes an `Int` parameter and returns that
    argument multiplied by `x`

- A class `K` with a `toString()` that returns `"K"`

In `package bbb`, `import` all the components from `aaa` and use them in a
function `g()`, which takes an `Int` parameter `i` and returns the following
`String` literal using members from `aaa`:

```text
"${K()} ${fa(i)}"
```

Import everything from `bbb` into `package ccc`. In `main()`, call
`println(g(1))`. You can see that without importing the 
components from `package aaa` you cannot access any of them.
