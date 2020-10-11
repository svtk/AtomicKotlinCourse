## Summary 2 (#7)

Convert a natural number into a number in the Roman numeral system.

| Roman | Decimal |
|-------|---------|
| I     |   1     |
| IV    |   4     |
| V     |   5     |
| IX    |   9     |
| X     |   10    |
| XL    |   40    |
| L     |   50    |
| XC    |   90    |
| C     |   100   |
| CD    |   400   |
| D     |   500   |
| CM    |   900   |
| M     |   1000  |

For example: 23 = XXIII, 44 = XLIV, 100 = C.

<div class="hint">

Perform the conversion in steps. Use an auxiliary `remainder` variable to store
the remaining part of the converted integer and a `result` variable to store
the resulting Roman numeral representation. For each step, the initial `number`
equals the sum of `remainder` and `result`.

Store the Roman numerals in a mapping from `Int` to the associated `String`
representation. For each pair `int = roman` starting from `1000 = M`:

-   Divide `remainder` into `int` to discover how many times you need to repeat
    `roman` in the `result`.

-   Subtract the result from `remainder` to update it:
    `remainder -= remainder / int`.

</div>
