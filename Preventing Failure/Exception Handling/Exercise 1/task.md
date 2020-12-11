## Exception Handling (#1)

Create `Hamster` as a `data class` with a constructor parameter of `val name:
String`.

Now create a class `HamsterCageException` that inherits `Exception`.
`HamsterCageException` takes a constructor parameter `val msg: String` and
overrides `toString()` so it produces `"HamsterCageException: $msg"`. Create
three exceptions inherited from `HamsterCageException`:

- `CageFullException(val limit: Int)`: Calls the base-class constructor with
  `"Cage full > $limit"`.

- `NoSuchHamsterException(val id: String)`: Calls the base-class constructor
  with `"No Hamster $id"`.

- `OutOfWaterException`: Calls the base-class constructor with `"Cage out of
  water"`.

Create class `HamsterCage(val capacity: Int)`. You can't put another `Hamster`
in a `HamsterCage` if it has reached `capacity`.

In `HamsterCage`, store the `Hamsters` in a `HashSet`. Write the following
member functions:

- `add(h: Hamster)` throws `CageFullException(capacity)` if the cage has reached
  `capacity`.

- `get(name: String)` throws `NoSuchHamsterException(name)` if a `Hamster` by
  that `name` can't be found.

- `feed()` generates a random number between 0 and 10 and throws
  `OutOfWaterException()` if the result is greater than 8. If it succeeds, it
  returns `"Feeding complete"`.

The starter code contains an initialized `List` of `Hamsters`. Write a function
`test(hc: HamsterCage)` that exercises each member function:

- `add()` by attempting to add each object in `hamsters`.

- `get()` using for `name` the first `Hamster` in `hamsters`, then use `"Morty"`.

- Call `feed()` three times.

`test()` calls `trace()` for any operation that produces a result. In each
case, catch the potential exception, and call `trace()` on that exception.

`main()` contains starter code passing a `HamsterCage` to `test()`, and the
expected output for `trace`.

Consider the complexity of the resulting code, and evaluate which exceptions
could be replaced with ordinary non-exceptional code.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
