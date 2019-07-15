## Abstract Classes (#1)

A monster traverses a maze following the right-hand rule:
it goes along the walls holding its imaginary right hand on the wall.
On each turn, it tries first to turn right. If this option is
available, it turns right. If there's a wall on the right, it consequently
tries other options: first to go straight, then to turn left, 
and lastly to go back.  
 
Implement the way the monster moves on one turn.

You can use the function `adjustDirection()` to calculate the move.
The monster stores `lastMove`, so you know which direction it currently goes.

[Here](https://en.wikipedia.org/wiki/Maze_solving_algorithm#Wall_follower) you 
can read more about this way of traversing mazes. 

The following example clarifies the difference between "turning right" from the
monster perspective and the `RIGHT` move on a map.
Let's consider the following map:

```text
####
#  #
#M #
#### 
```
  
For simplicity, the initial value for `lastMove` is `UP`.
The monster wants to turn right first; in this case `lastMove.adjustDirection(RIGHT)` 
returns `RIGHT`, the way is free, so the first move is `RIGHT`. 

```text
After moves: RIGHT
####
#  #
# M#
#### 
```

Now `lastMove` is `RIGHT`. Following the right-hand rule, the monster wants 
to turn right. That means it wants to make `DOWN` move (if you look at the map
the move down is indeed the way for a monster to turn right).
Now `lastMove.adjustDirection(RIGHT)` returns `DOWN` respectively.
But there's a wall, so the monster tries the next option: going straight ahead
(which corresponds to `UP` enum value).
`lastMove.adjustDirection(UP)` returns `RIGHT`, but the right direction is also occupied with a wall.
Then the monster tries to turn left.
`lastMove.adjustDirection(LEFT)` returns `UP`, and this way is free, so the monster
makes the next move:

```text
After moves: RIGHT, UP
####
# M#
#  #
#### 
```

The monster made two moves `RIGHT` and `UP`. From its own perspective,
it started by looking up, first turned right (following the right-hand rule), 
and then turned left.