## Polymorphism (#3)

Create an interface named `Connection` with a member function `send(message:
String)`. Implement this interface as `Text`, `Phone` and `Email`. In each
implementation, override `send()` so it calls `trace()` with a `String` such as
`"'$message' via Text"` (for the `Text` class).

Now create a class `Message` that takes as constructor arguments a `val text:
String` and a `val connection: Connection`. Define a `transmit()` member
function that sends the `text`.

The code in `main()` tests your solution.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
