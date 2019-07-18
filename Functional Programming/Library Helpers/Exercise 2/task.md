## Library Helpers (#2)

Implement all the helper functions `run`, `let`, `apply`, `also`.

| `receiver.<helper function> { ... }` | Take lambda with receiver:<br>`{ .. this .. }` | Take regular lambda:<br>`{ .. it .. }` |
|:------------------------------------:|:----------------------------------------------:|:--------------------------------------:|
| **Return result of the lambda**      | `run`                                          | `let`                                  |
| **Return receiver**                  | `apply`                                        | `also`                                 |