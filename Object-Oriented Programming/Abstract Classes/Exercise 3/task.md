## Abstract Classes (#3)

The starter code contains an `abstract` class `Instrument` that contains an
`abstract` member function `play(n: Note)`. `Note` is defined as an `enum` with
values `A`-`G`.

The classes `Wind`, `Percussion` and `Stringed` all inherit `Instrument`,
overriding `play()` in each case so it returns a `String` containing the class
name, then `blow` for `Wind`, `strike` for `Percussion`, and `pluck` for
`Stringed`, and finally the `Note` being played.

Add two constructor arguments to `Instrument`: `name` and `action`, and pass the
corresponding values from the subclasses. Make `name` and `action` `val`
properties and provide an implementation of `play()` in the superclass so that
it returns the same value that was previously produced by the `play()` in each
subclass. Remove implementations of `play()` from the subclasses.
