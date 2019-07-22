## Properties (#2)

Now the field the robot can move in is constrained in size to `100 x 100`, but
at the borders of the field the robot teleports: if the robot is in the cell
`(0,0)` and goes up 1 step, he arrives at the cell `(0,99)`:

```
(0,0)
// goUp(1)
(0,99)
// goLeft(10)
(90,99)
```