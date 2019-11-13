## `break` & `continue` (#2)

Complete the implementation of the functions `analyzeStrings1()` and
`analyzeStrings2()` provided in the starter code. Both take a
`List<List<String>>` as an argument and display its contents to the console. If
a `String` is the word `"stop"`, don't display any more elements from the
current (inner) `List`. `analyzeStrings1()` uses `break`, while
`analyzeStrings2()` uses `continue`. Add the missing labels for `break` and
`continue`.

Next, rewrite `analyzeStrings1()` without using labels.

<div class="hint">

You can remove all the labels from `analyzeStrings1()` and `break` will
jump from the closest inner loop, so this loop doesn't need labels.

</div>