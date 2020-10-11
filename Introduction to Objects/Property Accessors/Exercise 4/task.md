## Property Accessors (#4)

Create a class `AccessCounter` containing a property `accesses` which tells how
many times this property was accessed.

<div class="hint">

`accesses` calculates a new value each time it is accessed.

</div>

<div class="hint">

Introduce an auxiliary `private _accesses` property to store the number
of accesses. For each access, increment `_accesses` in its getter. The Kotlin
style guide recommends naming auxiliary properties with a leading underscore.

</div>
