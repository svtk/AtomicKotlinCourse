## Lazy Initialization (#2)

Create a class `Outer` containing an `inner class` called `Inner`, both with an
`init` using `trace()` that announces "<class name> constructor". Add three
`lazy` `String` `val`s, each with an initializer tracing "Initializing <class
name>.<property name>": `s1` and `s2` in `Outer`, and `si` in `Inner`. The
initializers produce "Hi" for `s1`, "Hello $s1" for `s2`, and "Howdy $s2" for
`si`. The code in `main()` tests your solution.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
