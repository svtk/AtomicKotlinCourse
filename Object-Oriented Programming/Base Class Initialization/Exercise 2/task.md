## Base Class Initialization (#2)

Following the instructions in the previous exercise, create a global `private`
`val trace` initialized to `Trace()`. In every class in this exercise, add an
`init` that calls `trace()` to append the name of the class.

Create a class `Plate` and inherit `DinnerPlate` from it. Create a class
`Utensil` and inherit `Spoon`, `Fork` and `Knife` from it. Create a class
`Custom` (as in "a cultural tradition"), and inherit `PlaceSetting` from it.
Inside `PlaceSetting`, create properties containing `Spoon`, `Fork`, `Knife`
and `DinnerPlate`, in that order. Create an instance of `PlaceSetting` to see
the initialization order.