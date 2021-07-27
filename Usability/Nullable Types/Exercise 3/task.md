## Nullable Types (#3)

Create a function called `countHexadecimalNumbers(codes: List<String>)` that
counts hexadecimal numbers contained in `codes`. It returns a `Map<Int, Int>`
where the key is a hexadecimal number and the value is the number of times that
number occurs in `codes`.  If a `String` in `codes` doesn't contain a
hexadecimal number, the function ignores it.

<div class="hint">

Convert a `String` containing a hexadecimal code into an `Int` using
`toIntOrNull(radix: Int)`, an extension function for `String`. Pass `16` as the
radix.

</div>
