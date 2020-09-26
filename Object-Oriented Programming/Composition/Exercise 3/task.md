## Composition (#3)

Based on your solution for the previous exercise, modify the implementation of
`Queue` by using `ArrayDeque` from the Kotlin standard library instead of
`MutableList`. `ArrayDeque` represents a "double ended queue", so it provides
member functions to add last and remove first elements.

Note how with composition you can change the internal implementation of the
class without changing the code that uses that class.

`ArrayDeque` is currently experimental in the Kotlin library, so we must add
`@OptIn(ExperimentalStdlibApi::class)` to turn off the warnings about using
experimental functionality.