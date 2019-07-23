## Nullable Types (#2)

Implement the `countHexadecimalCodes` function which counts the number 
of times a hexadecimal code occurs in the `codes` list.
It returns a map from an integer corresponding to each hexadecimal code in 
`codes` to a number of its occurrences in `codes`.
The function ignores the strings in input which don't represent hexadecimal
codes.

<div class="hint">

To convert a string representing a hexadecimal code to a number use 
the `toIntOrNull(radix: Int)` extension function on String, passing 
`16` as an argument.

</div>