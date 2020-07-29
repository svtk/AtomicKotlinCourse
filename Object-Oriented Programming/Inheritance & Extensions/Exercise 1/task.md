## Inheritance & Extensions (#1)

The starter code contains `Duck` and `interactWithDuck` declarations (we assume
they're part of the third-party library). Implement the `mimicDuck` function
that dynamically adapts an object, accepting a `Crocodile` and returning an
`IAmHonestlyDuck`. `IAmHonestlyDuck` should implement `Duck` and delegate both
`Duck` member functions to `crocodile.bite()`. Is it possible to use the
inheritance approach, or are you forced to use composition?