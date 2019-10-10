## Exceptions (#3)

Implement a function named `repeatChar()` that takes arguments `c` (the
character to be repeated) and `n` (the number of times to repeat it) and
returns a `String` consisting of `c` repeated `n` times. The function throws an
`IllegalArgumentException` if the caller asks to repeat a character a negative
number of times. The exception message should be `"Count 'n' must be
non-negative, but was x."` where `x` is replaced with the actual number.