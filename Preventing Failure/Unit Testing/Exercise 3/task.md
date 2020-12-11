## Unit Testing (#3)

Test the `SpaceShipControls` class from `ClassDelegation/SpaceShipControls.kt`.
Use a velocity of 10 for each test. Verify that a new test object is created for
each test by printing "init" each time a test object is created.

Instead of calling `assertEquals()` from `kotlin.test` directly, add the
following generic function at file scope:

```kotlin
infix fun <T> T.aeq(actual: T) = assertEquals(this, actual)
```

To use `aeq`: *expectedValue* `aeq` *actualValue*.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
