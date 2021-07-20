## Overloading (#3)

Implement overloaded versions of a function called `myJoinToString()`. Pass
default values for arguments in each overloaded function invocation, without
using the language support for this feature.

Why can't you define the following overloaded functions in addition to those already defined?

```text
fun List<Int>.myJoinToString(separator: String, prefix: String): String
fun List<Int>.myJoinToString(prefix: String, postfix: String): String
```

Uncomment the `myJoinToString()` function in the starter code, and see what
error you get.
