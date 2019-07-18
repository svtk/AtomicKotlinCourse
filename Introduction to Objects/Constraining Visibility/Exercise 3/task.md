## Mastering the IDE: Extend Selection

When you apply refactorings like <span class="control">`Extract Property`</span>, 
you need to select the expression that you'd like to extract, which might be 
quite complicated.

The <span class="control">`Extend Selection`</span> action accessible with the
<span class="shortcut">&shortcut:EditorSelectWord;</span> shortcut is very
helpful here: it selects the outside expression, increasing the selection by
each step. The reverse action is called
<span class="control">`Shrink selection`</span> and is accessible by
<span class="shortcut">&shortcut:EditorUnSelectWord;</span>.

Try putting the caret on line `println("Incorrect input: $x should be
positive")` and extend and shrink the selection to see how it works.
Continue to extend the selection until the whole file is selected.