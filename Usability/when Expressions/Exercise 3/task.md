## `when` Expressions (#3)

Implement the function `isBalanced` that takes an argument of a string consisting
of parentheses like `()(())` and checks whether each opening symbol has
a corresponding closing symbol and the pairs of parentheses are properly
nested.

An input string can contain whitespaces which should be ignored.
If it contains any other characters besides parentheses and whitespaces,
`IllegalArgumentException` should be thrown.

Some examples:

* `()` is balanced
* `(()` is unbalanced
* `)(` is unbalanced
* `( ()() )` is balanced
* `*()` leads to `IllegalArgumentException`

HINT: Iterate over the string and count the number of left braces which are
unmatched on each step. At the end, this number should be 0. If it is less than
zero at some point, the string is unbalanced.
