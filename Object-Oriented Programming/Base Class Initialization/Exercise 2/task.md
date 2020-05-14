## Base Class Initialization (#2)

The starter code defines the classes describing the dinner place setting:

- `Plate`, and `DinnerPlate` which inherits from `Plate`; 
- `Utensil`, and then `Spoon`, `Fork` and `Knife` which all inherit from `Utensil`;
- `Custom` (as in "a cultural tradition");
- `PlaceSetting` which definition you need to complete. 

Inherit `PlaceSetting` from `Custom`. Inside `PlaceSetting`, create properties
containing `Spoon`, `Fork`, `Knife` and `DinnerPlate`, in that order.
Run `main` that creates an instance of `PlaceSetting` to see the initialization
order.