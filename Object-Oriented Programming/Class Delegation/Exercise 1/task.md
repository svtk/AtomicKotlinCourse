## Class Delegation (#1)

Modify `ModelingMI.kt` by adding `fun resize(scale: Int): Int` to `Rectangle`,
which just returns `scale`. Add a `fun rightClicked(): Boolean` to
`MouseManager`. Call the new functions in `main()` and verify that `Button`
needs no modifications to support the new interfaces.
