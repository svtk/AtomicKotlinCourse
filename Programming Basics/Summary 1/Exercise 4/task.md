## Summary 1 (#4)

This exercise modifies `Overflow.kt` to test `Long` and `Double`. Implement
`testLong()` to display the `Long` maximum value incremented by `1`. Make
`testDouble()` display the `Double` maximum value incremented by `1`. Make
`testDouble2()` display the result of checking whether `Double.MAX_VALUE` and
`Double.MAX_VALUE + 1` are equal.

The `Double` type usually occupies 64 bits in memory.
Because of memory constraints, `Double` represents numbers with some
precision. 
You can read more about its internal representation on 
[Wikipedia](https://en.wikipedia.org/wiki/Double-precision_floating-point_format).

The `Double.MAX_VALUE` constant has a special meaning: it holds the largest
positive finite value of `Double`. You can't increase it; if you try to add
a positive number to it, it results in the same maximum value. It works somewhat 
similarly to `Double.POSITIVE_INFINITY`: it's a constant with special treatment
holding the positive infinity value of `Double`. You can use these constants
for comparisons with regular `Double` values.
