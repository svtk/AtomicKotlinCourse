## Composition (#3)

Based on your solution for the previous exercise, 
modify the implementation of `Queue` by using the class `ArrayDeque` from the
Kotlin standard library instead of `MutableList`. `ArrayDeque` represents
a "double ended queue", so it naturally provides member functions to add last
and remove first elements.

Note how with composition you can change the internal implementation of the
class without changing the code that uses this class.

`ArrayDeque` is so far experimental in the Kotlin library, and we add
`@OptIn(ExperimentalStdlibApi::class)` to explicitly "agree" that we're using
the experimental functionality.