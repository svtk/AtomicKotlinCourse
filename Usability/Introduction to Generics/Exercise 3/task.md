## Introduction to Generics (#3)

Create a generic class called `CountingSet` that counts how many times
each element was added to it. Implement it using a `private Map`. It should
define three member functions:

- `add(element: T)` adds a new element. If the client programmer tries to `add()`
an element that is already in the `CountingSet`, the corresponding counter should
be increased.

- `count(element: T)` returns the number of times each element was added to the
`CountingSet`.

- `toSet()` returns a set of stored elements.