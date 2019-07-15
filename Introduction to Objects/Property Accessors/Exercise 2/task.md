## Property Accessors (#2)

Implement a strange property `accesses` which counts how many times this
property was accessed.  Note that it returns a new value each time.

HINT: Introduce an auxiliary `private` property to store the value and
increment this value in a getter of the `accesses` property on each access. The
Kotlin style guide recommends naming such auxiliary property starting with an
underscore: `_accesses`.
