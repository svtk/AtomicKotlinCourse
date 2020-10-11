## Creating Classes (#2)

Create a class `Giraffe` with a single member function `displayID()` that
displays the address of the object. Call `String`s `substringAfter()` to
extract the address from the default object representation. Run the following
code and compare the addresses:

```kotlin
val giraffe1 = Giraffe()
val giraffe2 = Giraffe()
val giraffe3 = Giraffe()
giraffe1.displayID()
giraffe2.displayID()
giraffe3.displayID()
```
