## Class Delegation (#2)

Exercise 1 in [Inheritance & Extensions] uses
composition to adapt `Crocodile` to work with `interactWithDuck()`. This
produces an inconsistency when using `CrocoDuck` with the
`interactWithCrocodile()` function---the composed `crocodile` must be explicitly
named during the call:

```kotlin
interactWithCrocodile(honestlyDuck.crocodile)
```

Modify the solution to that exercise using class delegation so you can call a
function `interactWithCrocodile(honestlyDuck)`. Make the `CrocoDuck`
`crocodile` parameter `private` so you *cannot* expose the property.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
