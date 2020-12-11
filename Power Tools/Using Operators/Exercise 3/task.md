## Using Operators (#3)

Create a `data class N(var n: Int)` and make it `Comparable`. Make `N` produce a
`String` representation of `"N($n)"`. In `main()`, create a `key` initialized to
`N(11)`, and a `map` initialized to a `MutableMap` containing a single entry,
with `key` mapped to `47`. Trace `map[key]`. Now increment `n` and trace
`map[key]` again.

Create a `List<N>` of size five, automatically initialized to `N(it)`, and
shuffle it using the provided `Random` object. Display the `List`, then convert
it to a `SortedSet` and display that to see that it is indeed sorted. Find the
minimum value and add two to its `n`. Display the set again to see what
happened.

Adapt your code until it produces the same output as seen in the output trace.

The calculation in `compareTo()` impacts numerous operations including those for
using the object as a key in a `Map` and an element in a `Set`. As this exercise
shows, you should be very reluctant to allow the values used in the
`compareTo()` calculation to vary.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
