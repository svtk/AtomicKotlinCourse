## Mastering the IDE: Extract Property

How many times did you use the constant `100` in the code for the previous
task? It's better to place constants in `val`s so they are easy to change. If
the requirements change so that the field's size is `1000 x 1000`, it's
error-prone to change the constant in more than one place. It's too easy to
change it in one place and forget to change elsewhere, which can lead to
difficult-to-find bugs.

When a constant appears in multiple places in your code, it's wise to extract
it into a property. IntelliJ IDEA allows you to do this automatically. Select
the constant `10` in the code sample, and call <span class="control">`Extract
Property`</span> action. You can also use the
<span class="shortcut">&shortcut:IntroduceField;</span> shortcut or choose
<span class="control">`Refactor | Extract | Property`</span> from the main menu.

Select `Counter` as the target code block in the opened menu,
make sure that <span class="control">`Replace all occurrences(2)`</span> is
chosen, then press `Enter`. You'll see the constant is now declared as a
property, which is referenced from member functions. The property is declared
with the `private` modifier, which we discuss in one of the next atoms.
