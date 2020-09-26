## The `Nothing` Type (#1)

Create an exception class called `Failure` that takes a `msg: String` parameter
and passes it to the base-class constructor. Write a function `fail(msg:
String)` that passes `msg` to `trace()`, and then throws a `Failure`.

Now write your own versions of `require()` and `check()` (from [Check
Instructions](#check-instructions)) that use `fail()`. The starter code in
`main()` tests your functions.