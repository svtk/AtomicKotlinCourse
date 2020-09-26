## Creating Generics (#2)

Create a generic class `CrateList` that inherits from an `ArrayList` of
`Crate`. `Crate` has no `toString()`. To solve this problem, create a nested
`private` class called `DecoratedCrate` that takes a generic argument of
`contents` and inherits from `Crate`. Add a `toString()` to `DecoratedCrate`
that produces a `String` consisting of the result of calling `get()` inside
square brackets.

Define a member function `add()` that takes a generic `item` argument, creates
a `DecoratedCrate` with it and adds the result to the `ArrayList`. The code in
`main()` tests your solution.