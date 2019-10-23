## Mastering the IDE: Extract Variable

IntelliJ IDEA can extract a `val` or `var` automatically.
Select the expression `getFooResult()` inside a string template
and then do one of the following:
* invoke <span class="control">`Find action`</span> (by pressing <span class="shortcut">&shortcut:GotoAction;</span>),
then type `Extract variable` to find the corresponding action;
* press <span class="shortcut">&shortcut:IntroduceVariable;</span>;
* or choose <span class="control">`Refactor | Extract | Variable...`</span>
in the application menu.

Type the name of the new variable. IntelliJ IDEA tries to suggest a name
based on the expression. Press
<span class="shortcut">&shortcut:EditorEnter;</span> to finish.