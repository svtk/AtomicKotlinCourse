## Composition (#3)

The starter code provides:

```kotlin
interface DataBase {
  fun write(key: String, value: String)
  fun read(key: String): String
}
```

`class Holder(val db: DataBase)` is defined in the starter code. `Holder`
contains a `DataBase` using composition. `Holder` contains a `test()` function
which is used in `main()` to test three different `DataBase` classes, which you
write:

-   `NonRelational`, implemented with a `mutableListOf<Pair<String, String>>()`

-   `InMemory`, implemented with a `mutableMapOf<String, String>()`

-   `Mock`, implemented with two `String` `var`s.

Write these classes so they pass the tests given in `main()`.