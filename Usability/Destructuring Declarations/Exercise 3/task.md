## Destructuring Declarations (#3)

The starter code contains a `data` class `Person` with two properties: `name:
String` and `age: Int`. Write a `displayPersonInfo()` function that takes a
parameter of `person: Person`, which it destructures using the following syntax:

```kotlin
val (name, age) = person
```

`displayPersonInfo()` should display the corresponding values on the console:

```text
Name: $name
Age: $age
```

Add a new second property `surname` between `name` and `age` in `Person`. The
first property should be `name` and the third property should be `age`. Don't
modify `displayPersonInfo()`. In `main()`, show that `displayPersonInfo()` now
works incorrectly.
