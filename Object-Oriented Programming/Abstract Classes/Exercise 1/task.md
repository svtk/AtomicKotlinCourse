## Abstract Classes (#1)

Create an `abstract class Shape` with two `abstract` methods, `draw()` and
`erase()`, each producing the default (`Unit`) return type. Inherit `Circle`,
`Square` and `Triangle` from `Shape`, and override the `abstract` methods to
call `trace()` with `"Draw Circle"`, `"Erase Circle"`, etc. `main()` creates a
`List` called `shapes` containing one of each subtype. Call `draw()` for each
object in the `List`, then `erase()` for each object in the `List`, to match the
exercise output.
