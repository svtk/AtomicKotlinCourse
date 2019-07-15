## Maps (#3)

If you commonly select an element from a `List` using a key, it makes sense to
optimize it and use `Map` to store the elements instead of a `List`. At worst,
finding the right element in the `List` requires you to iterate over all the
elements, while `Map` does the same job in constant time.

Change the internal implementation of the `Cage` class to store elements in a
`Map` rather than a `List`. To get an element use the `getValue()` member
function, which throws a `NoSuchElementException` if the key is missing.