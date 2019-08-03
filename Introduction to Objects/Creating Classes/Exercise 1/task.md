## Creating Classes (#1)

Implement an `isPalindrome()` function that takes a `String` argument. Your
implementation should use the `length` property to discover the length of the
string and the `get(Int)` function that returns the character at that index.
Remember that indexing starts at zero.

<div class="hint">

Start at the left end of the string, taking each character and verifying
that it is equivalent to the character that is the same distance from the right
end. For example, for the string `"abcba"` of length 5 you compare:

- the first character and the last one: `s[0]='a'` with `s[4]='a'`
- the second character and the second from the end: `s[1]='b'` with `s[3]='b'`
- the third character and the third from the end: `s[2]='c'` with `s[2]='c'`

Since all the corresponding characters are equal, `"abcba"` is a palindrome.

</div>