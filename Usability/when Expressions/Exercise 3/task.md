## `when` Expressions (#3)

Implement the function `isBalanced()` that takes a `String` parameter
consisting of parentheses like `()(())`. `isBalanced()` checks whether each
opening symbol has a corresponding closing symbol and if the pairs of
parentheses are properly nested.

Ignore whitespaces in the input string. If it contains any other characters
besides parentheses and whitespaces, throw `IllegalArgumentException`.

Some examples:

* `()` is balanced
* `(()` is unbalanced
* `)(` is unbalanced
* `( ()() )` is balanced
* `*()` leads to `IllegalArgumentException`

<div class="hint">

Iterate over the string and count the number of left braces which are
unmatched on each step. At the end, this number should be 0. If the number is
ever less than zero, the string is unbalanced.

</div>