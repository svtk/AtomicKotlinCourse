## Summary 2 (#4)

Create a `Dictionary` class that stores translations for words. It includes a
member function `addTranslations(word: String, translations: String)`. The
`translations` for `word` are delimited by whitespace. If `word` is already
present in the `Dictionary`, `addTranslations()` throws an
`IllegalArgumentException` with the message
`"Dictionary already has translations for '$word'"`.

`Dictionary` also contains a read-only `translations` property that is a `Map`
of `List`s containing `String`s. The keys for the `Map` are also `String`s.

<div class="hint">

Use `split(" ")` on `String` to split words by whitespace.

</div>

<div class="hint">

Define an auxiliary property called `_translations` containing a mutable
`Map` of translations. Reading the `translations` property should simply return
`_translations` as a read-only `Map`.

</div>
