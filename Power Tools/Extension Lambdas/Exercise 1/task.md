## Extension Lambdas (#1)

Define the following functions so they behave the same as their standard
library counterparts:

- `createString()` behaves like `buildString()`. Start by creating a new
  instance of `StringBuilder`, call the extension lambda argument on it, then
  return the `String` result.

- `createList()` behaves like `buildList()`. This function has one generic
  parameter. Create an `ArrayList<T>`, call the extension lambda argument on it,
  and return a read-only `List`.

- `createMap()` behaves like `buildMap()`. This function has two generic
  parameters. Create a `HashMap<K, V>`, call the extension lambda argument on
  it, and return a read-only `Map`.

The code in `main()` tests your functions against the standard library
versions. Notice that `buildList()` and `buildMap()` infer their generic
parameters.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
