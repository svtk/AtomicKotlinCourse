## Mastering the IDE: Rename

The IDE simplifies a lot of typical actions. For instance, suppose you want
to rename a declaration. Inventing a good name for a `val` or a function is
difficult, so it's often an iterative process. You may create and use a
function, but then think up a better name for it.

<span class="control">`Find`</span> and <span class="control">`Replace`</span>
may lead to unexpected results, because the name might
appear in different contexts, for instance inside strings or comments. In the
code example you may see the `answer` as a name of `val`, which is a part of the
string literal as well. If we're talking about renaming functions, it's even
more complicated, because the function might be used in many files, and doing
rename properly in many places by hand is a complicated task.

IDE allows to rename a declaration automatically.
Put the caret on the `val` name and press
<span class="shortcut">&shortcut:RenameElement;</span>.
Alternatively, you may choose <span class="control">`Refactor`</span>
from the application menu, then choose <span class="control">`Rename`</span>.

Rename the `val` name to `result` without renaming "answer" in the string
literal.