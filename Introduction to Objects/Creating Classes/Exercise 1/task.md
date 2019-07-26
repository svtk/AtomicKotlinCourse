## Creating Classes (#1)

Implement an `isPalindrome()` function taking an instance of `SimpleString` as
an argument. `SimpleString` is a toy class used for these tasks that only has
two members: `length()` returning a length of a string  and `get(Int)`
returning a character by its index. Note that indexing starts with zero, as
with regular `String`s.

<div class="hint">

For every character make sure that it equals the character standing
on the same place from the end. 

For example, for the string `"abcba"` of length 5 you compare:
- the first character and the last one: `s[0]='a'` with `s[4]='a'`
- the second character and the second from the end: `s[1]='b'` with `s[3]='b'`
- the third character and the third from the end: `s[2]='c'` with `s[2]='c'`

Since all the corresponding characters are equal, the given string is
a palindrome.

</div>