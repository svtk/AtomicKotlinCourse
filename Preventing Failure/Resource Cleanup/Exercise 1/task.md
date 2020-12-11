## Resource Cleanup (#1)

The starter code defines a `String` called `text`. Define a `writeAndRead()`
function that uses `java.io.File`. Create a `File` object initialized to
`"DataFiles/CleanupSoln1.txt"`. Delete the file if it exists. Then create it and
add `text` to the file (IntelliJ IDEA will give you hints to help choose the
member functions to call for `File`). Use `useLines()` to read the file and
capture it with `trace()`, then use `forEachLine()` to read the file and capture
it with `trace()`. The starter code in `main()` tests `writeAndRead()`.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
