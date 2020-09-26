## Extension Lambdas (#1)

Define the following functions so they behave the same as their standard
library counterparts:

- `createString()` behaves like `buildString()`. Start by creating a new
instance of `StringBuilder`, call the extension lambda argument on it, then
return the `String` result.

- `createList()` behaves like `buildList()`. This function has one generic
parameter. Create an `ArrayList<T>`, call the extension lambda argument on it,
and return the `List` in immutable form.

- `createMap()` behaves like `buildMap()`. This function has two generic
parameters. Create a `HashMap<K, V>`, call the extension lambda argument on it,
and return the `Map` in immutable form.

The code in `main()` tests your functions against the standard library
versions. Notice that `buildList()` and `buildMap()` infer their generic
parameters.