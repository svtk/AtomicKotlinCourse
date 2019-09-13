## Constraining Visibility (#1)

Create an `Alien` class containing `public val name` and `public val species`
properties, initialized by the constructor. Add a `private var planet` property
initialized by the constructor. `planet` can be modified with the
`movePlanet()` member function. `movePlanet()` takes the planet the `Alien` is
moving to as its argument. All properties and arguments are of type `String`.
Override `toString()` to return the `name`, `species` and `planet` in the
format `"Alien $name, $species: $planet"`.

In `main()`, create two `Alien`s and move them from an origin `planet` to a
destination `planet`, testing them using `toString()` with the data:

| `name`    | `species`  | Origin     | Destination |
|-----------|------------|------------|-------------|
| Arthricia | Cat Person | PurgeWorld | Earth C-137 |
| Dale      | Giant      | Gearworld  | Parblesnops |

Notice that a `val` property is safe to access directly as a `public` property
rather than making it `private`.