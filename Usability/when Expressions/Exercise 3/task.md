## `when` Expressions (#3)

Implement the function `balanced()` that takes a `String` parameter. The
argument must consist of parentheses and optional spaces; for example:
`"()(())"`. When you pass this argument to `balanced()`, it checks whether each
opening parenthesis has a corresponding closing parenthesis and if all
parentheses are properly nested.

Ignore whitespace in the input `String`. If the `String` contains characters
other than parentheses and whitespace, throw an `IllegalArgumentException`.

Some examples:

- `"()"` is balanced

- `"(()"` is unbalanced

- `")("` is unbalanced

- `"( ()() )"` is balanced

- `"*()"` produces an `IllegalArgumentException`

<div class="hint">

Iterate over the `String` and count the number of left parentheses that
are unmatched after each step. At the end, this number should be 0. If at some
point the number is less than zero, the `String` is unbalanced.

</div>
