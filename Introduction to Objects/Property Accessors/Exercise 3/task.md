## Property Accessors (#3)

Create a class `MessageStorage` that should have two properties: a private one 
`_messages` of type `MutableList<String>` and a public one `messages` of type 
`List<String>`. The custom getter of `messages` should return `_messages`.

Since `_messages` is private, its contents can be only changed inside
`MessageStorage` class. Specifically, declare a `addMessage` member function 
that takes a `String` parameter and adds it to the `_messages` list.

Note that it's impossible to modify the list of messages outside of the class
in a different way other than adding a new message: you can't remove or change 
messages, because the `MutableList` property is private.