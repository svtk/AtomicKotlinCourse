## Resource Cleanup (#2)

Create your own `AutoCloseable` class called `Cleanup`, containing `f()`, `g()`,
`h()` and `close()` that use `println()` to display `"f()"`, `"g()"`, `"h()"`
and `"close()"`, respectively. In `main()`, create a `Cleanup` object and call
`f()`, `g()` and `h()` via `use()`.