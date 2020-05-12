## Polymorphism (#3)

Create a base class named `Base` containing two functions, `f1()` and `f2()`.
Make `f1()` use `atomictest.Trace` to report "Base.f1", then call `f2()`.
Calling `f2()` traces "Base.f2".

From `Base`, inherit a class called `Derived`. Override `f1()`, first tracing
"Derived.f1", then calling the base-class version of `f1()`. Override `f2()`
the same way.

In `main()`, create a `Derived` object and upcast it to a `Base` reference.
Call `f1()` for this reference and explain the resulting trace.