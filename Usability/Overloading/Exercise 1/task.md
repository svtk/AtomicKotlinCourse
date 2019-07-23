## Overloading (#1)

Implement overloaded versions of `myJoinToString()` function.
Pass default values for arguments in each overloaded function invocation,
without using the language support for this feature.

Why it's not possible to define the following overloaded functions?

```text
fun List<Int>.myJoinToString(separator: String, prefix: String): String
fun List<Int>.myJoinToString(prefix: String, postfix: String): String
```

Uncomment the commented `myJoinToString()` function and see the error the 
compiler gives.