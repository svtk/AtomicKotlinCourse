## Maps (#2)

`Cage` objects store `Hamster`s. `Cage` has a fixed size, so you can't put
another `Hamster` in a `Cage` if it's already full.

For this exercise, `Hamster`s are stored in a `List`. In the next exercise,
`Map` will be used instead of `List`.

Implement `get(name: String)` as a member function for `Cage` so it returns the
`Hamster` with `name`. If there's no `Hamster` with that `name`, throw
`NoSuchElementException`.
