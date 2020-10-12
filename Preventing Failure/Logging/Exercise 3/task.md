## Logging (#3)

Add logging levels to `AtomicLog.kt`. Create an enumeration `Level` with values
`Trace`, `Debug`, `Info`, `Warn` and `Error`. Add an instance of this `enum`
called `debugLevel` at file scope, initialized to `Error`. Inside your new
`Logger` class, modify the `log()` function so its signature is `private fun
log(thisLevel: Level, msg: String)`. This will require small modifications to
some other functions. The code in `main()` tests your solution.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
