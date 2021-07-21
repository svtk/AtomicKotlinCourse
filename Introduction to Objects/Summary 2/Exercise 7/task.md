## Summary 2 (#7)

Convert a natural number into a number in the Roman numeral system.

Roman numerals:
1000 = M, 900 = CM, 500 = D, 400 = CD, 100 = C, 90 = XC,
50 = L, 40 = XL, 10 = X, 9 = IX, 5 = V, 4 = IV, 1 = I.

For example: 23 = XXIII, 44 = XLIV, 100 = C.

<div class="hint">

Perform the conversion in steps. Use an auxiliary `remainder`
variable to store the remaining part of the converted integer and the `result`
variable to store the resulting Roman numeral representation. For each step,
the initial `number` equals the sum of the `remainder` and `result`.

Store the Roman numerals in a mapping from `Int` to the associated `String`
representation. For each pair `int = roman` starting from `1000 = M`:

- Divide `remainder` into `int` to discover how many times you need to repeat
  `roman` in the `result`.

- Subtract the result from `remainder` to update it:
  `remainder -= remainder / int`.

</div>
