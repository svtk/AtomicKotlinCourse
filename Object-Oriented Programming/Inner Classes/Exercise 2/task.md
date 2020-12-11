## Inner Classes (#2)

Although an inner class contains a reference to the outer-class object that
creates it, the reverse is not true. If the outer class needs a reference to the
inner-class object, it must create and initialize that reference itself.

Create a `class Box(contains: String, label: String)`, with `inner` classes
`Contents` holding `contains` as a `val`, and `Destination` holding `label` as a
`val`. Make two `private` references: `contents` and `destination`, initialized
to instances of their associated `inner` classes.

Now create a `private val x` that is initialized to an object of an anonymous
inner class. In this case, however, the base-class is `Any`. Include a member
function `f()` that returns `"Any-based"`.

Add a member function `manifest()` that produces a `String` containing the
properties `contains` and `label` and the output of `f()`. The starter code in
`main()` tests your solution.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
