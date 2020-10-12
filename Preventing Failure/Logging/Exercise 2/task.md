## Logging (#2)

Starting with the solution from Exercise 3 from the Exception
Handling atom, use `AtomicLog.kt` to log exceptions into the
`Logger` file `"LoggingSoln1.txt"`. You will need to modify `transact()`:

- Add a call to `Logger`s `error()` function before any exception is thrown
  from `transact()`.

- Replace unrecoverable exceptions with `error()` calls.

- Look for code where none of the exceptions are recoverable, and compact it if
  you can to log to `error()` and fail, rather than having multiple `catch`
  clauses.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
