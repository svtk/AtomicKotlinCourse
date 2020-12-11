## Upcasting (#2)

Upcasting also happens when you add an object of a derived type into a container
that holds the base type.

The starter code contains an interface `Apple` containing an abstract member
function `consume()`. From `Apple`, inherit `GrannySmith`, `Gala`, `Fuji` and
`Braeburn`. Override `consume()` so, respectively, they return `chomp
GrannySmith`, `bite Gala`, `press Fuji` and `peel Braeburn`.

`main()` creates a `List<Apple>` and populates it with the specific types of
`Apple`. Use `map()` to apply `consume()` on each object.
