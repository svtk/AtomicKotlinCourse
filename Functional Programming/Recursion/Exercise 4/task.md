## Recursion (#4)

The starter code provides a class `City`. Implement an extension function
`City.allReachable()` that builds a set of all cities reachable from the current
`City`. Implement it both recursively and iteratively.

The direct connections for each `City` are stored in its `connections` property.
`allReachable()` should return all the cities reachable from the given city via
other cities. The city is reachable from itself, so it should be also present in
the resulting set.

For example, consider the following connections graph:

```text
Cities: Dublin, Liverpool, Manchester, Leeds
Connections: Liverpool - Manchester; Manchester - Leeds
```

Both Manchester and Leeds are reachable from Liverpool, while Dublin isn't. The
path from Liverpool to Leeds goes via Manchester. Thus, `allReachable()` for
Liverpool should return the set of three cities: Liverpool, Manchester, Leeds.
