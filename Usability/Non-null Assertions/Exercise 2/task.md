## Non-Null Assertions (#2)

Define an extension function `List<Int>.headPlusTail()` that returns a `Triple`
containing (1) the first element in the `List<Int>`, (2) the last element in the
`List<Int>`, (3) the sum of the first and last elements. If the `List<Int>` is
empty, return `null` for all three entries of the `Triple`. If the `List<Int>`
consists of a single element, return that element as the first entry, followed
by `null`, followed by that element as the result.

In `main()`, create a `mutableListOf<Int>` called `ints`. Call
`trace(ints.headPlusTail())`. Next, create a `for` loop that steps `n` through
the range `-2..10`, skipping every other element. The loop calls `ints.add(n)`,
then `trace(ints.headPlusTail())`, and finally it selects the result of the call
to `ints.headPlusTail()` using a non-null assertion.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
