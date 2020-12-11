## Composition (#3)

Based on your solution for the previous exercise, modify the implementation of
`Queue` by using `ArrayDeque` from the Kotlin standard library instead of
`MutableList`. `ArrayDeque` is a "double ended queue"; it provides effective
implementations to add last and remove first.

Note how composition allows change to the internal implementation of the class
without changing the code that uses that class.
