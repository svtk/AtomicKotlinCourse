## Class Delegation (#2)

Exercise 3 in [Inheritance & Extensions] uses
composition to adapt `MyClass` to work with `UsefulLibrary`. This produces an
inconsistency when using `MyClass` with the `useMyClass()` function: the
composed `field` must be explicitly named during the call:

```kotlin
useMyClass(mc.field)
```

Modify the solution to that exercise using class delegation so you can call a
function `useMyType(mc)`. Make the `field` argument to `MyClassAdaptedForLib`
`private` so you *cannot* expose `field`.

Because class delegation works with interfaces, you must first create an
interface `MyType` for `MyClass`. If you're using IntelliJ IDEA, you can do
this by right-clicking `MyClass`, selecting "Refactor," then choosing "Extract
Interface." Modify the rest of the code to use `MyType` whenever possible,
rather than `MyClass`, and rename `useMyClass()` to `useMyType()`.

Now modify `MyClassAdaptedForLib` so that `field` is `private` and is the
delegate for `MyType`.