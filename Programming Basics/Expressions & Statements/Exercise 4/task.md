## Mastering the IDE: Debug

Debugging is a powerful way to discover what's happening in your code. You can
observe intermediate states of the program and changes between these states.

Click on the icon next to the `main()` function and choose
<span class="control">`Debug`</span>.
Notice there's a special shortcut for that:
<span class="shortcut">&shortcut:DebugClass;</span>.
The program just runs and displays the result,
because you haven't set any points where the execution should be paused.

The points where you want to pause the execution to observe the state of the
variables are called *breakpoints*. To create line breakpoints in the editor
first place the caret on the desired line of the source code. Then do one of
the following:

- Click the left gutter area at a line where you want to toggle a breakpoint.

- On the main menu, choose <span class="control">`Run | Toggle Line Breakpoint`</span>.

- Press <span class="shortcut">&shortcut:ToggleLineBreakpoint;</span>.

Set breakpoints on lines 6 and 7:

```kotlin
x = 2
println(x)
```

Then begin debugging
the program again and  notice how it stops at the first breakpoint.
The debug window below the screen  shows you the values of all the variables.
Continue the process by clicking on
<span class="control">`Resume program`</span> on the left of the debug window
or pressing <span class="shortcut">&shortcut:Resume;</span>.
Notice how the value of the variable `x` changes after the assignment.

To stop debugging, you can either finish the program and see the result or stop
in explicitly. Press the <span class="control">`Stop`</span> button to stop the
debugging process.
