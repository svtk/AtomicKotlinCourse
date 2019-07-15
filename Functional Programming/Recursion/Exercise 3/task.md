## Recursion (#3)

Complete the implementations of two functions `isReachableRecursive()` and 
`isReachableIterative()` which both check whether a city is reachable from 
another city.

The direct connections for each `City` are stored in `connections` property.
`isReachable` functions should check whether a city is reachable via non
direct connections. 

For instance, look at the following connections graph:

```text
Cities: Dublin, Liverpool, Manchester, Leeds
Connections: Liverpool - Manchester; Manchester - Leeds
```

Both cities Manchester and Leeds are reachable from Liverpool, while Dublin isn't.
The path from Liverpool to Leeds goes via Manchester.