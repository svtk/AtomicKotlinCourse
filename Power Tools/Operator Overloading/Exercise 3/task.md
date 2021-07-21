## Operator Overloading (#3)

Create a collection-like `class Repository<T>(val initSize: Int = 10)`. It
contains a `private MutableList` called `list` of initial size `initSize`, with
all the elements initialized to `null`. Provide support for the following
operations for a `Repository` named `r`:

- `r += rv` Places `rv` in the first available `null` location in `list`. If
  there are no `null` locations remaining, appends `rv` to the end of `list`.

- `r[n] = rv` Places `rv` into location `n` in `list`. Requires that `n` be
  greater than or equal to zero and less than `list.size`. Requires that
  `list[n]` be non-`null`.

- `r[n]` Retrieves the value `list[n]`. Requires that `n` be greater than or
  equal to zero and less than `list.size`. Requires that `list[n]` be non-`null`.

Add a `toString()` that produces `list` separated by commas.

The starter code in `main()` tests `Repository` and shows you how the error
messages should appear.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
