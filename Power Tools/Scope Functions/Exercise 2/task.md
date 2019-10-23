## Library Helpers (#2)

Implement all the helper functions `with`, `run`, `let`, `apply`, `also`.

|                                      | Take lambda with receiver:<br>`{ .. this .. }` | Take regular lambda:<br>`{ .. it .. }` |
|:------------------------------------:|:----------------------------------------------:|:--------------------------------------:|
| **Return result <br>of the lambda**  | `with`, `run`                                          | `let`                                  |
| **Return receiver**                  | `apply`                                        | `also`                                 |