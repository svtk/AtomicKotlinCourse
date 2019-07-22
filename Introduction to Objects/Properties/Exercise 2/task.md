## Properties (#2)

Now the field the robot can move in is constrained in size to `100 x 100`, but
the borders of the field are "looped": if the robot is in the cell
`(0, 0)` and goes up 1 step, it arrives at the cell `(0, 99)`.

```
(0, 0)
// goUp(1)
(0, 99)
// goLeft(10)
(90, 99)
```

Modify all the functions `goRight`, `goLeft`, `goDown` and `goUp` to 
support this behavior.

HINT: Using auxiliary function for checking the boundaries will remove
code repetition and simplify the resulting code.