## Mastering the IDE: Column Selection Mode

When you need to perform the same editing operation on each line among many,
it's very convenient to use several carets.

Call the action <span class="control">`Column Selection Mode`</span>
or press <span class="shortcut">&shortcut:EditorToggleColumnMode;</span>. 
Alternatively, you can choose 
<span class="control">`Edit | Column Selection Mode`</span> in the application
menu. Press the same shortcut to disable the mode.

Moving the caret one line up or down selecting the text (by pressing
<span class="shortcut">&shortcut:EditorUpWithSelection;</span>
or <span class="shortcut">&shortcut:EditorDownWithSelection;</span>) in
the <span class="control">`Column Selection Mode`</span> adds more carets. 

Swap keys and values in a map (transforming it from `Map<Int, String>` to 
`Map<String, Int>`) working in
<span class="control">`Column Selection Mode`</span>.

Select the three lines specifying the map contents and switch to the 
<span class="control">`Column Selection Mode`</span>. 
Note that you now have several carets. 
Try to navigate to the beginning of a line, to the end of a line, or to the end
of the word to see how these operations are applied to all the carets in all 
lines.