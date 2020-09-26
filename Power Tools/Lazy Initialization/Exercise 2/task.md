## Lazy Initialization (#2)

Create a class `Outer` containing an `inner class` called `Inner`, both with an
`init` using `trace()` to announce "<class name> constructor". Add three `lazy`
`String` `val`s, each with an initializer tracing "Initializing <class
name>.<property name>": `s1` and `s2` in `Outer`, and `si` in `Inner`. The
initializers produce "Hi" for `s1`, "Hello $s1" for `s2`, and "Howdy $s2" for
`si`. The starter code in `main()` tests your solution.