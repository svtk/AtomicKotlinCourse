## Properties (#3)

The robot can move in a field with size `100 x 100`. The borders of this field
are "looped": if the robot is in cell `(0, 0)` and moves up one step, it
arrives in cell `(0, 99)`.

```
(0, 0)
// goUp(1)
(0, 99)
// goLeft(10)
(90, 99)
```

Modify `goRight()`, `goLeft()`, `goUp()` and `goDown()` to implement this
behavior.

<div class="hint">

Using auxiliary function for checking the boundaries will remove
code repetition and simplify the resulting code.

</div>