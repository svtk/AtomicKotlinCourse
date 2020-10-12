## Lazy Initialization (#3)

Do not use explicit typing in this exercise, to demonstrate that the type is
inferred from the result of the `lazy` initializer.

Create two classes, `A` and `B`, each with an `init` that uses `trace()` to
announce "<class name> constructor". Add the following `lazy` `val` properties:

- `b` in `A`, which lazily initializes a `B` object.
- `i` in `A`, which lazily initializes an `Int` to `1`.
- `j` in `B`, which lazily initializes an `Int` to `2`.

Each lazy initializer traces "Initializing <class name>.<property name>".

In `B`, add `fun g()` that produces `j`. In `A`, add `fun f()` that produces
`i + b.g()`.

In `main()`, add a lazily-initialized `val a` that traces its initialization
as above and then produces an `A` object. The remainder of `main()` is starter
code that tests your solution.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
