## Member References (#1)

The starter code includes a `data` class called `Pet` containing a `var String`
property `name` and an `enum` property `habitat`. The `Habitat` enumeration can
be `LAND`, `WATER` or `AMPHIBIOUS`, and it also contains a member function
`livesIn(pet: Pet)` that tests to see whether `pet` lives in a particular
`Habitat`.

The `main()` starter code creates a `List<Pet>`. Using `filter()` together with
member references, implement three functions `liveOnLand()`, `liveInWater()`
and `areAmphibious()` that discover which pets in the list live on land, in the
water, or are amphibious. Lastly, use `partition()` to implement the
`partitionAmphibious()` function that divides the pets into those that are
amphibious and those that are not.
