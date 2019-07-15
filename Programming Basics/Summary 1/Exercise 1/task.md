## Summary 1 (#1)

Count the number of occurrences of a specified digit in a decimal number using the `while` loop.

Each step should place the first digits of the initial number into an auxiliary
`worker` variable, while the `occurrences` variable should contain the rest of
the number's digits.

The table below demonstrates the values for each loop while finding occurrences
of `1` in `121341`:

| Worker  | Rest   | Occurrences |
| ------- |--------|-------------|
| 121341  | -      | 0           |
| 12134   | 1      | 0           |
| 1213    | 41     | 1           |
| 121     | 341    | 1           |
| 12      | 1341   | 2           |
| 1       | 21341  | 2           |
| -       | 121341 | 3           |

`occurrences` show how many `1` digits are in the `rest` number.
The `rest` number is present in the table for clarity, but you don't need to store it in a separate variable.