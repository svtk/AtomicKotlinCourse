## Class Delegation (#3)

What happens when you delegate to two interfaces that have one or more
members in common? The starter code contains two interfaces `A` and `B`
that both have a `foo()` member function.

Create a class `AImpl` that implements `A` and traces `"A.foo()"` for `foo()`
and `"A.bar()"` for `bar()`. Create a similar implementation `BImpl` that
implements `B`. Now create a class `Delegation` that delegates to both `A` and
`B`. IntelliJ or the compiler will guide you in resolving the resulting
issues.

<sub> This task doesn't contain the automatic tests,
it's always marked as "Correct" on "Check".
Please compare your solution with the provided one! </sub>