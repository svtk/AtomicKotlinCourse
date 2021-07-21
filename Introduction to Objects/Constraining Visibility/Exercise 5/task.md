## Mastering the IDE: Extract Function

IntelliJ IDEA allows you to extract repetitive code into a function. Select the
following code in the body of the first function:

```text
if (x <= 0) {
    println("Incorrect input: $x should be positive")
    return
}
```

Type the <span class="control">`Extract Function`</span> action,
or use the shortcut <span class="shortcut">&shortcut:ExtractMethod;</span>,
or click on the main menu to choose
<span class="control">`Refactor | Extract | Function`</span>.
Type the new function name `checkArgument` and press
<span class="shortcut">&shortcut:EditorEnter;</span>.

Agree to <span class="control">`Process Duplicates`</span>, so that the second
occurrence of the same piece of code is also extracted.
