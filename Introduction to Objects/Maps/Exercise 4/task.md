## Mastering the IDE: Column Selection Mode

When you need to perform the same editing operation on multiple lines, you can
use multiple carets.

Call the action <span class="control">`Column Selection Mode`</span> or press
<span class="shortcut">&shortcut:EditorToggleColumnMode;</span>. You can also
choose <span class="control">`Edit | Column Selection Mode`</span> in the
application menu. Press the same shortcut to disable the mode.

In <span class="control">`Column Selection Mode`</span>, you can add more
carets by moving the caret one line up or down while selecting text. Do this by
pressing <span class="shortcut">&shortcut:EditorUpWithSelection;</span> or
<span class="shortcut">&shortcut:EditorDownWithSelection;</span>.

As an exercise, swap the keys and values in a map (transforming it from
`Map<Int, String>` to `Map<String, Int>`). Select the three lines specifying
the map contents and switch to <span class="control">`Column Selection
Mode`</span>. Note that you now have several carets. Navigate to the beginning
of a line, to the end of a line, or to the end of the word to see how these
operations are applied to all the carets in all lines.
