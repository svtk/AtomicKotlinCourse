## Interfaces (#1)

Create a `Cloud` class that implements `Computer` and contains a `List<Node>`.
The `class Node(private val result: Int)` should also implement `Computer`, and should
implement `calculateAnswer()` so it simply returns `result`.

Write the `Cloud` constructor to take an argument `n` indicating the number of
`Node`s in the cloud. Count up to `n` and place each count as the `result` value
of the `Node` you are currently creating. Implement `Cloud`s `calculateAnswer()`
to return the sum of the answers in all the `Node`s.
