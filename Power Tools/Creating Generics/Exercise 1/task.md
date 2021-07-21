## Creating Generics (#1)

Create a generic interface called `Items` with a single function `next()` that
returns an object of the generic type, or `null`. Make `Items` usable for [SAM
conversions].

Create a generic function called `itemIter()` that takes a `vararg items` of the
type parameter and returns an `Items` object produced with a SAM conversion. The
`Items` object closes over a `var index` to indicate the current element in
`items`. Each call to `next()` produces the current element and increments
`index`. When there are no more `items`, `next()` returns `null`.

The code in `main()` tests your solution.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
