## Mastering the IDE: Basic Editing

In IntelliJ IDEA you can use typical OS shortcuts to perform basic editing,
like "copy", "paste" or "undo" operations:

| Operation | Shortcut                                        | Description                                                   |
|-----------|-------------------------------------------------|---------------------------------------------------------------|
| Cut       | <span class="shortcut">&shortcut:$Cut;</span>   | Cut a current line or a selected code block to the Clipboard. |
| Copy      | <span class="shortcut">&shortcut:$Copy;</span>  | Copy a current line or a selected code block to the Clipboard.|
| Paste     | <span class="shortcut">&shortcut:$Paste;</span> | Paste from the Clipboard to the caret location.               |
| Undo      | <span class="shortcut">&shortcut:$Undo;</span>  | Undo last operation.                                          |
| Redo      | <span class="shortcut">&shortcut:$Redo;</span>  | Redo last undone operation.                                   |

To select text, press Shift (⇧) while moving the caret around the text. 
Then you can move the caret up, down, left or right with selection, or move it to the end or
to the beginning of a line:

| Operation                         | Shortcut                                                              | Description                                                   |
|-----------------------------------|-----------------------------------------------------------------------|---------------------------------------------------------------|
| Up with Selection                 | <span class="shortcut">&shortcut:EditorUpWithSelection;</span>        | Move the caret one line up selecting the text.                |
| Right with Selection              | <span class="shortcut">&shortcut:EditorRightWithSelection;</span>     | Move the caret one character to the right selecting the text. |
| Move to Line End with Selection   | <span class="shortcut">&shortcut:EditorTextEndWithSelection;</span>   | Move the caret to the end of line, selecting the text.        |
| Move to Line Start with Selection | <span class="shortcut">&shortcut:EditorTextStartWithSelection;</span> | Move the caret to the beginning of line, selecting the text.  |

Duplicate the line `println("Hello, Kotlin!")` in the example by selecting it 
and then copy-pasting it.