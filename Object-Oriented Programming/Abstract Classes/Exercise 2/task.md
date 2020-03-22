## Abstract Classes (#2)

Make an `enum` called `Note` with values `A`-`G`. Create an `abstract` class
`Instrument` that takes a `val` class argument `name: String` which holds the
name of the class. Add an `abstract` member function `play(n: Note)`.

Now inherit `Wind`, `Percussion` and `Stringed` from `Instrument`, overriding
`play()` in each case to use `atomictest.Trace` to show the class name, then
`blow` for `Wind`, `strike` for `Percussion`, and `pluck` for `Stringed`, and
finally the `Note` being played.

Add a function `tune()` that takes an `Instrument` parameter and plays that
`Instrument` using `Note.C`.

In `main()`, create an `orchestra` which is a `List<Instrument>` containing an
instance of each type of `Instrument`. Call `tune()` for each `Instrument` in
the `orchestra`, and validate the results using `Trace`.