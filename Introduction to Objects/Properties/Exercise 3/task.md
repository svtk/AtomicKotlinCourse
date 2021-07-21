## Properties (#3)

A `Robot` can move within a square field of size `100 x 100`. The borders of
this field are "looped": if the robot is in cell `(0, 0)` and moves up one
step, it arrives in cell `(0, 99)`.

```text
(0, 0)
// up(1)
(0, 99)
// left(10)
(90, 99)
```

Modify `right()`, `left()`, `up()` and `down()` to implement this behavior.

<div class="hint">

Write an auxiliary ("helper") member function named `crossBoundary()` to
check the boundaries. This eliminates repetition and simplifies the resulting
code.

</div>
