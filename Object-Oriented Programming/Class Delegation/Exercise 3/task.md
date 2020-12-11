## Class Delegation (#3)

What happens when you delegate to two interfaces that have one or more members
in common? The starter code contains two interfaces `A` and `B` that both have a
`foo()` member function.

Create a class `AA` that implements `A` and traces `"A.foo()"` for `foo()` and
`"A.bar()"` for `bar()`. Create a similar implementation `BB` that implements
`B`. Now create a class `Delegation` that delegates to both `A` and `B`. The
code in `main()` tests your solution. IntelliJ or the compiler will guide you in
resolving the resulting issues.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
