## Maps (#2)

The `Cage` class is designed to store hamsters. `Cage` has a fixed size, so you
can't put a hamster in there if it's already full. Implement
`takeHamsterByName()`. It should choose a hamster by a given name, return it
and remove it from the list of hamsters. If the element isn't present in the
list, throw a `NoSuchElementException`.