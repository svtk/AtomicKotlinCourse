## Interfaces (#1)

Create a `Cloud` class which implements `Computer` and contains a `List<Node>`.
`data class Node(result: Int)` also implements `Computer`, and implements
`calculateAnswer()` so that it simply returns `result`.

Write the `Cloud` constructor to take an argument `n` indicating the number of
`Node`s in the cloud. Count up to `n` and place each count as the `result`
value of the `Node` you are currently creating. Implement `Cloud`s
`calculateAnswer()` to return the sum of the `result`s in all the `Node`s.