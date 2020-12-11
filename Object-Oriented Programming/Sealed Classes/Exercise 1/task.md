## Sealed Classes (#1)

Modify `SealedClasses.kt`. First, move the `capacity` property from `Bus` into
the `Transport` class and add `trace("size ${transport.capacity}")` after the
`when` expression in `travel()`. Then add new subclasses:

- `Tram`, containing a `val route: String`
- `Plane` containing a `val flightNumber: String`

Modify `travel()` to accommodate these new subclasses. Add `Tram` and `Plane` to
the `List` in `main()`.
