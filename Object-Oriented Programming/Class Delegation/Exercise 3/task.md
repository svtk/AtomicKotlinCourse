## Class Delegation (#3)

What happens when you delegate to two interfaces that have one or more
members in common? The started code contains two interfaces `A` and `B`
that both have `foo()` member function. 

Create a class `AImpl` that implements `A`, that traces `"A.foo()"` for `foo()`
and `"A.bar()"` for `bar()`. Create a similar implementation `BImpl`
implementing `B`. Now create a class `Delegation` which delegates to both `A`
and `B`. IntelliJ or the compiler will guide you in resolving the collisions. 