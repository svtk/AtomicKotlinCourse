## Logging (#2)

Starting with the solution from Exercise 3 in [Exception
Handling](#exception-handling), use `AtomicLog.kt` to log exceptions into the
`Logger` file `"LoggingSoln1.txt"`. You will need to modify `transact()`:

- Add a call to `Logger`s `error()` function before any exception is thrown
  from `transact()`.

- Replace unrecoverable exceptions with `error()` calls.

- Look for code where none of the exceptions are recoverable, and compact it if
  you can to log to `error()` and fail, rather than having multiple `catch`
  clauses.

<sub> This task doesn't contain the automatic tests,
it's always marked as "Correct" on "Check".
Please compare your solution with the provided one! </sub>