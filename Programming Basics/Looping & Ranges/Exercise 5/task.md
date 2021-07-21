## Mastering the IDE: `iter` Live Template

IntelliJ IDEA rapidly creates frequent-used expressions using
<span class="control">`Live templates`</span>. Type `iter` and then press
<span class="shortcut">&shortcut:ExpandLiveTemplateByTab;</span>. This live template
expands into a `for` expression. You type the expression you want to iterate
over, along with the name for the index variable. IntelliJ IDEA automatically
suggests the variable name to iterate over if it's available in the context.

```text
iter + tab

for (i in iterable) {

}
```

Expand the `iter` live template to iterate over a string in the example.
