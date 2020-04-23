## Complex Constructors (#3)

Show that multiple init sections are executed in declaration order. The 
`MultipleInit` class contains a `val list = mutableListOf<String>()`. Add the
strings `"one"`, `"two"` and `"three"` to it in three different `init` blocks.