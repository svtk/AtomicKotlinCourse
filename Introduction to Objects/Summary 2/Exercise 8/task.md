## Summary 2 (#8)

Convert from a Roman number into a natural number. For
example: XXIII = 23, XLIV = 44, C = 100.

<div class="hint">

Simply iterate over each digit in the Roman number and calculate the
answer. Traverse a Roman number in reverse order, a single digit at a time (for
example, `IV` contains two digits) and store the maximum value found so far. If
the next Roman digit is greater than or equal to the current maximum value, add
it to the result. If it's less than the maximum, subtract it instead. For
example, to convert `XLIV = 44`, iterate over `VILX` which is the reverse of
`XLIV`. You add `5`(`V`) and subtract `1`(`I`) because it's less than the
current maximum `5`(`V`), then and `50`(`L`) and subtract `10`(`X`) because it's
less than the updated maximum `10`(`X`):

| numeral | current maximum | action |
| ------- |-----------------|--------|
| V       | 5               | + 5    |
| I       | 5               | - 1    |
| L       | 50              | + 50   |
| X       | 50              | - 10   |

The result is `+ 5 - 1 + 50 - 10 = 44`

</div>
