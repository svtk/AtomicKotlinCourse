## Data Types (#2)

{{ :UNTESTABLE It's impossible to analyze the local variables by reflection }}

Remove all the type declarations from `Types.kt` and verify that Kotlin
successfully infers the types. Now define duplicate but typed definitions which
are initialized by the inferred `val`s. Use a trailing underscore for the
duplicate definition, for example `val whole_: Int = whole`. Ensure that all
the typed definitions match the type inference by Kotlin.