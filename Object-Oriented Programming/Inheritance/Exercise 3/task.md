## Inheritance (#3)

The starter code contains the class hierarchy: `Game`, `BoardGame` which
inherits `Game` and `Chess` which inherits `BoardGame`.
Add a property `val initOrder = mutableListOf<String>()` to `Game`.
Give each class an `init` clause that appends its class name to `initOrder`.
Now create a `Chess` object and show the order of initialization of base
classes.