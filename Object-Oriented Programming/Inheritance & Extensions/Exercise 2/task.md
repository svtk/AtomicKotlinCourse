## Inheritance & Extensions (#2)

The starter code defines the following hierarchy: a superclass `Dog` and two
subclasses, `ToyDog` and `RealDog`. Implement an extension function `play` to
`Dog` which first calls `speak()`, then `sit()`.

Implement two more extension functions with the same name `play` to `RealDog`
and to `ToyDog`. Both functions should call `Dog.play()` first, then
`RealdDog.play()` should call `feed()`, while `ToyDog.play()` should call
`changeBatteries()`.

Guess what the code in `main()` will trace and then check yourself.

<div class="hint">

To call a `Dog.play` function inside an extension to a `Dog` subclass 
(e.g. inside `ToyDog.play()`), cast `this` to `Dog` explicitly:

```kotlin
(this as Dog).play()
```

</div>