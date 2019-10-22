## Summary 2 (#4)

Create a `Dictionary` class that stores the translations for the given words.
It should define `addTranslations` member function taking two `String` parameters:
the first one is the word, the second one is the translations for this word
separated by a whitespace. If the word is already present in the dictionary,
`addTranslations` should throw `IllegalArgumentException` with the message 
`"Dictionary already has translations for '$word'"`.

`Dictionary` also should define `translations` member property which is a
read-only `Map` of `List`s containing `String`s. The keys for the `Map` are
also `String`s. Note that the contents of the dictionary isn't expected to be
modified via this property, therefore it's read-only.

<div class="hint">

Use `split(" ")` on `String` to split words by a whitespace.

</div>

<div class="hint">

Define a second auxiliary property `_translations` to store a mutable map
of translations. `translations` should simply return the value of 
`_translations` but have a different type, read-only Map.

</div>