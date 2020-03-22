## Inheritance & Extensions (#2)

Refactor `BatteryPet2.kt` to improve the design:

- In `Pet`, add an open function `settle()` which calls `trace("")`
- In `Pet`, add an open function `feed()` which calls `energy.replenish()`
- In `Dog`, override `settle()` to call `trace("Sitting...")
- You no longer need `Dog.sit()`
- Change `playWithDog(dog: Dog)` to `playWithPet(pet: Pet)`
- Add a `CatFood` type of `Energy`, and define the associated `Cat` class
- In `main()`, test all types of `Pet`