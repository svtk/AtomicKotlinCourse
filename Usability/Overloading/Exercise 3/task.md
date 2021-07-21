## Overloading (#3)

Implement overloaded versions of a function called `myJoinToString()`. Pass
default values for arguments in each overloaded function invocation, without
using the language support for this feature.

Why can't you define both following functions at the same time?

```text
fun List<Int>.myJoinToString(separator: String, prefix: String): String
fun List<Int>.myJoinToString(prefix: String, postfix: String): String
```

Uncomment the `myJoinToString(prefix: String, postfix: String)` function in
the starter code, and see what error you get.
