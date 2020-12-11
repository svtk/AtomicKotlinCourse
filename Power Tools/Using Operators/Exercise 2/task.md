## Using Operators (#2)

Define a function `create()` that produces a `MutableList` containing ten
`Int`s, initialized to the values 0-9.

Each remaining function first traces its function name.

- `assignAppendIncrementContains()`:  Call `create()` and capture the result in
  `list`. Set the last element of `list` to 99, then append 100 to `list`.
  Increment this new last element, and trace the list. Finally, trace
  whether 101 is present in `list`.

- `minus()`: Call `create()` and capture the result in `val list`. Trace the
  `list` with the element 5 removed. Trace the list with the elements 5, 6, 7
  and 8 removed. Trace the list with the element 10 removed. Use the
  "decrement-equals" to remove the elements 0, 1 and -1 and trace the result.

- `plus()`: Create a `var list` by adding 11, 12 and 13 to the result of
  `create()`. Use the "increment-equals" to append 14, and trace the result.

The starter code in `main()` tests your work.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
