## Abstract Classes (#2)

The starter code contains an `abstract` class `Instrument` that contains
an `abstract` member function `play(n: Note)`. `Note` is defined as an enum
with values `A`-`G`. 

The classes `Wind`, `Percussion` and `Stringed` all inherit `Instrument`, 
overriding `play()` in each case to return the string containing the class name,
then `blow` for `Wind`, `strike` for `Percussion`, and `pluck` for `Stringed`,
and finally the `Note` being played.

Add two constructor arguments to the class `Instrument`: `name` and `action`,
and pass the corresponding values in the subclasses. Make `name` and `action`
`val` properties and provide an implementation of the `play` function in the
superclass so that it returned the same value as before for each subclass.
Remove implementations of `play` from the subclasses.