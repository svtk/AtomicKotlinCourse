## Manipulating Lists (#4)

Implement the function `getFriendSuggestions()`. It should return
friends of friends of the person, excluding those people who are his or her
friends already.
For instance, for the following friend connections:

```text
Alice - Bob
Bob - Charlie
```

`getFriendSuggestions()` should return Charlie for Alice, because Charlie
is a friend of Alice's friend Bob and isn't yet a friend of Alice.

No friend suggestions for Alice in the following case, Bob and Charlie are
already her friends:

```text
Alice - Bob
Alice - Charlie
Bob - Charlie
```