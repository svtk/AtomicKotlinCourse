## Summary 1 (#10)

Create a function `showSnake(rows: Int, columns: Int)` that displays a table
filled with sequential numbers in a form of snake. For example, `showSnake(3,
3)` should produce the following:

```text
 0 1 2
 5 4 3
 6 7 8
```

For proper alignment, use a format string such as `"%3d".format(number)` to
place additional spaces before the number. The number before `d` indicates how
many characters the number should occupy together with the additional spaces.
It depends on the biggest number, the last one: put exactly one space before it.

<div class="hint">

Use the string `"%${width}d".format(value)`, where the `width` variable stores
the width of each number cell, to format the value based on the actual input
(`rows` and `columns`).

</div>
