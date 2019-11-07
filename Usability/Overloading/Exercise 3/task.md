## Overloading (#3)

Implement overloaded versions of the `myJoinToString()` function. Pass default
values for arguments in each overloaded function invocation, without using the
language support for this feature.

Why can't you define the following overloaded functions?

```text
fun List<Int>.myJoinToString(separator: String, prefix: String): String
fun List<Int>.myJoinToString(prefix: String, postfix: String): String
```

Uncomment the `myJoinToString()` function in the solution guide, and see what
error you get.