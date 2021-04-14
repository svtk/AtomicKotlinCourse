## Non-Null Assertions (#1)

Create a class `Rocket` containing a member function `ignition()` that returns
"Liftoff!". Create a function `launch()` that has a nullable `Rocket` parameter.
Use a non-null assertion to call `ignition` on `rocket` and return the result.
In `main()`, ensure that `launch()` throws an exception if you pass it a `null`.
