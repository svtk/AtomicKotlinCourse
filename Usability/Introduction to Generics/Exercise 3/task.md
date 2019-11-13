## Introduction to Generics (#3)

Create a generic class called `Set` containing a `private List` and two member
functions:

- `add()` to add a new element. If the client programmer tries to `add()` an
element that is already in the `Set`, ignore it.

- `list()` which returns a copy of the internal `List`.

Test your `Set` using `data class Dog(name: String)` and
`data class Ball(radius: Int, color: String)`.