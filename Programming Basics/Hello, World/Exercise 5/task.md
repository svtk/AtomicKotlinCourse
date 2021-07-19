## Mastering the IDE: Basic Editing

In IntelliJ IDEA you can use typical operating-system shortcuts to perform basic editing:

| Operation | Shortcut                                        | Description                                                   |
|-----------|-------------------------------------------------|---------------------------------------------------------------|
| Cut       | <span class="shortcut">&shortcut:$Cut;</span>   | Cut a current line or a selected code block to the clipboard. |
| Copy      | <span class="shortcut">&shortcut:$Copy;</span>  | Copy a current line or a selected code block to the clipboard.|
| Paste     | <span class="shortcut">&shortcut:$Paste;</span> | Paste from the clipboard to the caret location.               |
| Undo      | <span class="shortcut">&shortcut:$Undo;</span>  | Undo last operation.                                          |
| Redo      | <span class="shortcut">&shortcut:$Redo;</span>  | Redo last undone operation.                                   |

To select text, press the "Shift" key while moving the caret around the text.
Then you can move the caret up, down, left or right, or move it to the end or
the beginning of a line:

| Operation                         | Shortcut                                                              | Description                                                    |
|-----------------------------------|-----------------------------------------------------------------------|----------------------------------------------------------------|
| Up with selection                 | <span class="shortcut">&shortcut:EditorUpWithSelection;</span>        | Move the caret one line up, selecting the text.                |
| Right with selection              | <span class="shortcut">&shortcut:EditorRightWithSelection;</span>     | Move the caret one character to the right, selecting the text. |
| Move to line end with selection   | <span class="shortcut">&shortcut:EditorLineEndWithSelection;</span>   | Move the caret to the end of line, selecting the text.         |
| Move to line start with selection | <span class="shortcut">&shortcut:EditorLineStartWithSelection;</span> | Move the caret to the beginning of line, selecting the text.   |

Duplicate the line `println("Hello, Kotlin!")` in the example by selecting it
and then copy-pasting it.
