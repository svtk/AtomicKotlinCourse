## Companion Objects (#1)

The idea of the *Factory* shown in `CompanionFactory.kt` becomes more
interesting when you introduce multiple factories, so the same configuration can
easily create different types of objects.

Start with two interfaces:

```kotlin
interface Vendor {
  fun pencil()
  fun pen()
}

interface VendorFactory {
  fun create(): Vendor
}
```

Create `Vendor1` and `Vendor2` that implement `Vendor`. The member functions use
`trace()` to report the `Vendor` class name and "pencil" or "pen". Each `Vendor`
implementation also has a companion object with a `factory` property containing
an anonymous inner class that implements `VendorFactory`.

Now write a standalone function `consumer(factory: VendorFactory)` that uses
`factory` to create a `Vendor`. Use that `Vendor` to call `pencil()` and
`pen()`. The starter code in `main()` will validate your solution.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
