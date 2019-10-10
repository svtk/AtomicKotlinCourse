## Recursion (#4)

Implement the `City.getAllReachable` function that builds
a set of all cities reachable from a given one:

```kotlin
fun City.getAllReachable(): Set<City>
```

Implement it in two ways: recursive and iterative.

The direct connections for each `City` are stored in `City.connections` property.
The `getAllReachable` function should return all the cities reachable
from the given city via other cities.
We'll say that the city is reachable from itself, so it should be also present
in the resulting set.

For instance, look at the following connections graph:

```text
Cities: Dublin, Liverpool, Manchester, Leeds
Connections: Liverpool - Manchester; Manchester - Leeds
```

Both cities Manchester and Leeds are reachable from Liverpool, while Dublin isn't.
The path from Liverpool to Leeds goes via Manchester.
Thus, `City.getAllReachable` for Liverpool should return the set of
three cities: Liverpool, Manchester, Leeds.