## Composition (#3)

The starter code provides:

```kotlin
interface DataBase {
  fun write(key: String, value: String)
  fun read(key: String): String
}
```

The starter code also provides `class Holder(val db: DataBase)`. `Holder` uses
composition by containing a `DataBase`. `Holder` contains a `test()` function
which is used in `main()` to test three different `DataBase` classes, which
you write:

-   `NonRelational`, implemented with a `mutableListOf<Pair<String, String>>()`

-   `InMemory`, implemented with a `mutableMapOf<String, String>()`

-   `Mock`, implemented with two `String` `var`s.

Write these classes so they pass the tests given in `main()`.