## Mastering the IDE: `iter` Live Template

IntelliJ Idea speeds up the typing of frequent expressions by using
<span class="control">`Live templates`</span>. 
Type `iter` and then press
<span class="shortcut">&shortcut:ExpandLiveTemplateByTab;</span>. 
This live template unfolds into a for expression, so you can type the expression 
you want to iterate over and an index variable name. 
IntelliJ Idea even automatically suggests the variable name that can be iterated 
over if it's available in the context.

```
iter + tab

for (i in iterable) {

}
```

Unfold the `iter` live template to iterate over a string in the example.