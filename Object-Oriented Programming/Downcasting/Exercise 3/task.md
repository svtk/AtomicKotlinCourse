## Downcasting (#3)

Create an empty interface `Animal1`. Inherit a class `Worm1` with a member
function `wriggle()` that calls `trace("Wriggle")`. Inherit a class `Snail1`
with a member function `slide()` that calls `trace("Slide")`. Inherit a class
`Beetle1` with a member function `walk()` that calls `trace("Walk")`.

Write a function `move(a1: Animal1)` that uses a `when` to detect each type and
call that type's function. In `main()`, create a `List` of `Animal1` objects and
call `move()` for each one.

Create a duplicate hierarchy from an interface `Animal2`, but in this case make
`move()` a member of `Animal2` and implement it in `Worm2`, `Snail2`, and
`Beetle2`. In `main()`, create a `List` of `Animal2` objects and call `move()`
for each one.

Compare the type-checked hierarchy to the polymorphic hierarchy.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
