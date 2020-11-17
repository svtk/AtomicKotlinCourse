## Maps (#3)

If you commonly select elements from a `List` using keys, it makes sense to
optimize by using a `Map` instead of a `List`.

Change the internal implementation of the `Cage` class to store elements in a
`Map` rather than a `List`. To get an element use the `getValue()` member
function, which throws `NoSuchElementException` if the key is missing.
