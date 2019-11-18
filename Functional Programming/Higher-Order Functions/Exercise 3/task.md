## Higher-Order Functions (#3)

Write your own version of `mapIndexedNotNull()`. Like `mapNotNull()`, it
applies the given transformation to each element and filters out `null`s. Like
`mapIndexed()` it bases the transformation on both the element and its index.

Note the generic types `R?` (in `(Int, T) -> R?`) and `List<R>`. `R?` means the
lambda's return type is nullable. `mapIndexedNotNull()` returns a list of
non-nullable elements, so the function return type is `List<R>`. To express
that `R` is a non-nullable type, we specify the constraint on the generic type
parameter `R : Any`. Type constraints will be covered in [More about Generics].