## Inheritance & Extensions (#1)

The starter code contains `Duck` and `interactWithDuck()` declarations (we
assume they're part of a third-party library). Implement the `mimicDuck()`
function that dynamically adapts an object, accepting a `Crocodile` and
returning a `CrocoDuck`. `CrocoDuck` should implement `Duck` and
delegate both `Duck` member functions to `crocodile.bite()`. Is it possible to
use inheritance, or are you forced to use composition?
