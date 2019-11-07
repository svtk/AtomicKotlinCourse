## `break` & `continue` (#2)

Complete implementation of two functions: `analyzeStrings1` and
`analyzeStrings2` provided in the accompanying code. Both take a list of lists
of strings as an argument and display its contents to the console. If the inner
list contains the word `"stop"`, all the following elements in this list
shouldn't be displayed. The `analyzeStrings1` function uses `break`, while
`analyzeString2` uses `continue`. Add the missing labels for `break` and
`continue` to get the  desired output.

After that, rewrite this solution without using labels.

<div class="hint">

You don't need labeled loops here: you can remove all the labels from
`analyzeStrings1`: `break` will jump from the closest inner loop, so this loop
doesn't need a label.

</div>