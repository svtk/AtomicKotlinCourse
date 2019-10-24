## Scope Functions (#2)

Implement all the scope functions `with`, `run`, `let`, `apply`, `also`.

|                              | Lambda with receiver arg:<br>`{ .. this .. }`| Regular lambda arg:<br>`{ .. it .. }`|
|:----------------------------:|:----------------:|:---------------:|
| **Return result of lambda**  | `with`, `run`    | `let`           |
| **Return receiver**          | `apply`          | `also`          |