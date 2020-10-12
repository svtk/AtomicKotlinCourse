## Class Delegation (#2)

Exercise 1 from the Inheritance & Extensions atom uses
composition to adapt `Crocodile` to work with `interactWithDuck()`. This
produces an inconsistency when using `IAmHonestlyDuck` with the
`interactWithCrocodile()` function---the composed `crocodile` must be
explicitly named during the call:

```kotlin
interactWithCrocodile(honestlyDuck.crocodile)
```

Modify the solution to that exercise using class delegation so you can call a
function `interactWithCrocodile(honestlyDuck)`. Make the `IAmHonestlyDuck`
`crocodile` parameter `private` so you *cannot* expose `field`.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
