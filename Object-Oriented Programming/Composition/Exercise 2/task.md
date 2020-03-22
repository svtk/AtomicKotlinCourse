## Composition (#2)

Modify `House3.kt` to replace all the `interface`s with classes, and add a
`name` property to each. Using the same form, add `Bedroom` and `Bathroom`
classes, and a `List<Bathroom>` and `List<Bedroom>` to `House`. Create a
`House` named "Our House", with `Kitchen`s called "Main" and "Guest".  Add
`Bathroom`s called "Master", "Shared", and "Guest". Add `Bedroom`s called
"Master", "Son", "Daughter", and "Guest". Use `atomictest.Trace` to capture all
the class names and `name` properties as the `House` is constructed. Also
notice the order of construction.