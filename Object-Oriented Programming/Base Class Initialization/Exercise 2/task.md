## Base Class Initialization (#2)

The starter code defines classes describing a dinner place setting:

- `Plate`, and `DinnerPlate` inherit from `Plate`
- `Utensil`, and then `Spoon`, `Fork` and `Knife` that all inherit from `Utensil`
- `Custom` (as in "a cultural tradition")

Inherit `PlaceSetting` from `Custom`. Inside `PlaceSetting`, create properties
of type `Spoon`, `Fork`, `Knife` and `DinnerPlate`, in that order. `main()`
creates an instance of `PlaceSetting` to show the initialization order.
