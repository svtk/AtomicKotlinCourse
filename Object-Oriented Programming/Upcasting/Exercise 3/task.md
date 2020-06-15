## Upcasting (#3)

When you combine interfaces to create a class, you can upcast an object of that
class to each different interface.

The starter code contains three interfaces: `Fight` with a function `fight()`,
`Swim` with a function `swim()`, and `Fly` with a function `fly()`, and a class
`ActionCharacter` which has a `fight()` function that returns `"ActionCharacter
fight"`.

Define a class `Hero` that combines `ActionCharacter`, `Fight`, `Swim` and
`Fly`. Notice that the `fight()` in `ActionCharacter` provides the `fight()`
needed by the `Fight` interface. Define `swim()` to return `"Hero swim"` and
`fly()` to return `"Hero fly"`.

Next, implement `tryFight(x: Fight)`, `trySwim(x: Swim)`, `tryFly(x: Fly)`,
and `doAction(x: ActionCharacter)`, so that each function calls the member
function available to its parameter and displays its result on the console.

In `main()`, make a `Hero` object and pass it to each of the functions
`tryFight()`, `trySwim()`, `tryFly()`, and `doAction()`. Run `main()` to check
the output. Notice that passing a `Hero` to each function upcasts it so that,
inside the function, `Hero` loses its specific type and becomes the parameter
type.