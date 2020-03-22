## Destructuring Declarations (#3)

Create a `data` class `Person` with two properties: `name: String` and
`age: Int`. Write a `displayPersonInfo()` function that takes a parameter of
`person: Person`, which it destructures using the following syntax:

```
val (name, age) = person
```

`displayPersonInfo()` should display the corresponding values on the console:

```
Name: $name
Age: $age
```

Add a new second property `surname` between `name` and `age` in `Person`.
`name` should be the first property, `age` should be the third property. Don't
modify `displayPersonInfo()`. In `main()`, show that `displayPersonInfo()` now
works incorrectly.