## Summary 1 (#7)

Write a function that uses a `while` loop to count the occurrences of a given
digit within a decimal number. Place the decimal number in a `var` called
`worker`. Each pass through the loop tests the right-most digit of `worker`,
then at the end of the loop, removes that right-most digit from `worker`. The
`var occurrences` contains the number of occurrences of the digit you seek.

This table shows the values during each loop while finding occurrences of `1`
in `121341`:

| `worker` | Removed | `occurrences` |
|----------|---------|---------------|
| 121341   | -       | 0             |
| 12134    | 1       | 1             |
| 1213     | 41      | 1             |
| 121      | 341     | 1             |
| 12       | 1341    | 2             |
| 1        | 21341   | 2             |
| -        | 121341  | 3             |

The "Removed" values are in the table for clarity, but you don't need a
"Removed" variable in your solution.
