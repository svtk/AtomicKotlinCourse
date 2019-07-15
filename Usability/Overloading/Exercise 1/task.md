## Overloading (#1)

1. Implement overloaded versions of `myJoinToString()` function passing default
values for arguments in each overloaded function invocation, without the 
language support for this feature.

2. Which error occurs if you try to define the following two overloaded functions:

```text
fun List<Int>.myJoinToString(separator: String, prefix: String): String
fun List<Int>.myJoinToString(prefix: String, postfix: String): String
```

Uncomment the commented `myJoinToString()` function and see the error the 
compiler gives.

3. How many functions does one need to provide to imitate a function providing 
default values for three arguments? Open a hint to see an answer. 

HINT: To cover all the possible combinations of parameters, you'd need to
provide six more overloaded functions:

```text
main: joinToString(separator, prefix, postfix)
1 - joinToString(separator, prefix)
2 - joinToString(separator, postfix)
3 - joinToString(prefix, postfix)
4 - joinToString(separator)
5 - joinToString(prefix)
6 - joinToString(postfix)
```

However, due to the same signatures of functions 1-3 (`joinToString(String): String`) 
and 4-6 (`joinToString(String, String): String`), you can only define one in
each case. Thus, without the support for default arguments, you wouldn't be able
to specify only the value of the last `postfix` argument, you'd need to provide
the values for the previous arguments as well.