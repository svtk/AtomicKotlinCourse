## Manipulating Lists (#4)

Implement the function `friendSuggestions(person: Person)` to return friends of
friends of `person`, excluding those people who are already his or her friends.
Consider the following friend connections:

```text
Alice - Bob
Bob - Charlie
```

`friendSuggestions()` should return Charlie for Alice, because Charlie is a
friend of Alice's friend Bob and isn't yet a friend of Alice.

The following example produces no friend suggestions for Alice, because Bob and
Charlie are already her friends:

```text
Alice - Bob
Alice - Charlie
Bob - Charlie
```
