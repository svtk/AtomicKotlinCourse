## Late Initialization (#3)

The starter code provides:

```kotlin
data class Generator(val id: Int)

class Turbine(val id: Int) {
  private lateinit var _generator: Generator
  val generator: Generator
...
```

Add a `get()` for `generator` that checks to see if `_generator` has been
initialized, and if not initializes it before returning `_generator`. Add a
`toString()` that starts with "Generator $id running: " and then indicates
if the generator is running.

The starter code provides:

```kotlin
class PowerPlant(nTurbines: Int = 4) {
  private val turbines: List<Turbine> =
...
```

Finish the initialization for `turbines`, then add
`fun generator(number: Int): Generator` which checks to make sure `number`
is in range, then returns the desired generator. Finally, add a `status()`
member function that uses `forEach` to show the status of each generator in the
`PowerPlant`. The code in `main()` tests your solution.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
