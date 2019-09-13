## Properties (#3)

The `Robot` from the previous exercise moves within a square field of size
`fieldSize x fieldSize`. The borders of this field are "looped": for a
`fieldSize` of 100, if the robot is in cell `(0, 0)` and moves up one step, it
arrives in cell `(0, 99)`.

```
(0, 0)
// goUp(1)
(0, 99)
// goLeft(10)
(90, 99)
```

Modify `right()`, `left()`, `up()` and `down()` to implement this behavior. Use
an auxiliary member function named `crossBoundary()` to check the boundaries.
This eliminates repetition and simplifies the resulting code.

Write a `main()` to test `Robot`.