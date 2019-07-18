## Mastering the IDE: Change signature

You can't safely change the function parameter name:
some callers might call the function specifying this parameter name, and
this code will no longer compile.
Fortunately, IntelliJ IDEA can fix that automatically.
Use the shortcut <span class="shortcut">&shortcut:ChangeSignature;</span>
or choose <span class="control">`Refactor | Change Signature`</span>.
You can change parameter names, or add more parameters to a function,
and all the callers will be updated correspondingly.

Put the caret on the `foo` function and call 
<span class="control">`Change Signature`</span> refactoring. Then press the icon
with the plus symbol (`+`) to add one more parameter. Specify it's name `d` and
it's type `Double`, and the default value `1.0`.
Press <span class="control">`EditorEnter`</span> or click the 
<span class="control">`Refactor`</span> button.
Note how the callers change: the default value is used for all the callers.
Now add the same parameter to the `bar` function without specifying
the default value this time.