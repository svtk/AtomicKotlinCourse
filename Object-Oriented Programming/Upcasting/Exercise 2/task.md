## Upcasting (#2)

Upcasting also happens when you add an object of a derived type into a
container that holds the base type.

Make a `private var counter = 0` at file scope. Create an `abstract` class
`Apple` that takes an argument `val type: String` to hold the type of apple.
Add a `private val id` which is initialized by getting the value of `counter`
and incrementing it. Inside `init`, use `atomictest.Trace` to record the
`type` and `id`.

Add an `abstract fun consume()` to `Apple`.

From `Apple`, inherit `GrannySmith`, `Gala`, `Fuji` and `Braeburn`. Override
`consume()` so, respectively, they call `trace()` with `chomp GrannySmith`,
`bite Gala`, `press Fuji` and `peel Braeburn`.

In `main()`, make a `List<Apple>` and populate it with the specific types of
`Apple`. Iterate through the list calling `consume()` for each object.