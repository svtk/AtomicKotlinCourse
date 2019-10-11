## Packages (#1)

Create a `package` named `aaa`, and a file in that `package` containing a `val
x = 10`, a top-level function `fa()` that takes an `Int` parameter and returns
that argument multiplied by `x`, and a class `K` with a `toString()` that
returns `"K"`.

Create a second `package` named `bbb`. `import` all the components from `aaa`
and use them in a function `g()`. The function `g()` should take an `Int`
parameter `i` and return the string literal referring to members from `aaa`:
```
"${K()} $x ${fa(i)}"
```

Test `g()` in `main()`.