## Class Delegation (#2)

Exercise 3 in [Inheritance & Extensions](#inheritance-and-extensions) uses
composition to adapt `Crocodile` to work with `interactWithDuck`.
This produces an inconsistency when using `IAmHonestlyDuck` with the
`interactWithCrocodile()` function: the composed `crocodile` must be explicitly
named during the call:

```kotlin
interactWithCrocodile(honestlyDuck.crocodile)
```

Modify the solution to that exercise using class delegation so you can call a
function `interactWithCrocodile(honestlyDuck)`. Make the `crocodile` argument to
`IAmHonestlyDuck` `private` so you *cannot* expose `field`.