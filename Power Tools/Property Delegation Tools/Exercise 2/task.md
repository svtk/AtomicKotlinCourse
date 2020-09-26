## Property Delegation Tools (#2)

Create a generic function `observe()` that uses `trace()` to capture
`"$propertyName $oldValue to $newValue"` whenever a property changes. Ensure
that it works with:

```kotlin
class Product(nm: String = "<0>", id: Int = -1) {
  var name by observable(nm, ::observe)
  var ident by observable(id, ::observe)
  override fun toString() = "$name $ident"
}
```

And that the starter code in `main()` successfully executes.