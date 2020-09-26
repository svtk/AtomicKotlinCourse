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