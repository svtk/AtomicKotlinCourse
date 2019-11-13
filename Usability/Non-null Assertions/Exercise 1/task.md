## Non-`null` Assertions (#1)

Create a class `Rocket` containing a member function `ignition()` which returns
"Liftoff!". Create a function `launch` that has a nullable `Rocket` parameter.
Use a non-null assertion to call `ignition` on `rocket`.
In `main()`, make sure that `launch` throws an exception if you pass `null`
there.