## Constraining Visibility (#1)

Create an `Alien` class with a constructor that initializes `public val name`
and `public val species` properties. Add a `private var planet` property
initialized by the constructor. `planet` can be modified with the
`movePlanet()` member function. `movePlanet()` takes the planet the `Alien` is
moving *to* as its parameter. All properties and parameters are of type
`String`. Override `toString()` to return the `name`, `species` and `planet` in
the format `"Alien $name, $species: $planet"`.

In `main()`, create two `Alien`s and move them from an origin `planet` to a
destination `planet`, testing them using `toString()` along with the data:

| `name`    | `species`  | Origin      | Destination |
|-----------|------------|-------------|-------------|
| Arthricia | Cat Person | PurgePlanet | Earth C-137 |
| Dale      | Giant      | Gearworld   | Parblesnops |

Note that a `val` property is safe to access directly as a `public` property
rather than making it `private`.
