## Destructuring Declarations (#3)

Create a `data` class `Person` with two properties: `name` and `age`. Implement the `displayPersonInfo` 
function that takes `person` as a argument, then destructures using the following syntax:

```
val (name, age) = person
```
 
Finally, `displayPersonInfo` should display to the console the corresponding values:

```
Name: $name
Age: $age
```

Now add a new second property `surname` between `name` and `age`. `name` should be the first property, `age`
should be the third property now. Don't change the function `displayPersonInfo()`.

Run the modified version in the `main` function and make sure that `displayPersonInfo` now works incorrectly. 