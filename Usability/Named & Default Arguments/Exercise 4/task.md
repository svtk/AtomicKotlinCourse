## Mastering the IDE: Change signature

You can't safely change a function parameter name because a caller can specify
this parameter name, so their code will no longer compile with the new name.
IntelliJ IDEA can automatically fix this. Use the shortcut
<span class="shortcut">&shortcut:ChangeSignature;</span> or choose
<span class="control">`Refactor | Change Signature`</span>. You can change
parameter names, or add more parameters to a function, and all the callers will
be updated correspondingly.

Put the caret on `foo()` and select the <span class="control">`Change
Signature`</span> refactoring. Press the icon with the plus symbol (`+`) to add
one more parameter. Specify its name as `d` and its type as `Double` with a
default value of `1.0`. Press <span class="control">`Enter`</span> or
click the <span class="control">`Refactor`</span> button. Note how the callers
change: the default value is now used for all the callers. Add the same
parameter to `bar()` without specifying the default value.
