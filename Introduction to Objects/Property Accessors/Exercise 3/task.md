## Property Accessors (#3)

Create a class `MessageStorage` with two properties: a `private` one named
`_messages` of type `MutableList<String>` and a `public` one named `messages`
of type `List<String>`. The custom getter for `messages` returns `_messages`.

Because `_messages` is `private` its contents can be only changed within the
`MessageStorage` class. Define an `addMessage()` member function that takes a
`String` parameter and adds it to the `_messages` list.
