## Resource Cleanup (#2)

Create your own `AutoCloseable` class called `Cleanup`, containing `f()`, `g()`,
`h()` and `close()` that use `trace()` to display `"f()"`, `"g()"`, `"h()"`
and `"close()"`, respectively. In `main()`, create a `Cleanup` object and call
`f()`, `g()` and `h()` via `use()`.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
