## Summary 2 (#8)

Create a class `MapList` containing a property which is a `Map` of `List`s
containing `String`s. The keys for the `Map` are also `String`s. The solution
provides a function `initialize()` which, every time you call it, returns a
`String` of space-separated words. Split those and use the first word for the
key, and the remaining words as elements in that key's `List`. When
`initialize()` is out of data, it returns an empty `String`. Use `initialize()`
to load your `Map`. Write a `toString()` to display each key-value entry on its
own line, with the words separated by single spaces.