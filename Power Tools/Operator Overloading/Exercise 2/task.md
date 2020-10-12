## Operator Overloading (#2)

Starting with:

```kotlin
enum class Count {
  Eeny, Meeny, Miney, Moe;
  companion object {
    val max = Moe
  }
}
```

Create extension functions to perform the operations `++` and `--` on a `Count`
such that if `++` tries to go past `Moe`, it wraps around to `Eeny`, and if
`--` tries to go below `Eeny`, it wraps around to `Moe`. The starter code
in `main()` will check your work.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
