## Extensions for Nullable Types (#2)

Implement `and` and `or` functions that extend a nullable `Boolean`. These take
another nullable `Boolean` as a parameter and return `null` if either the
receiver or the argument is `null`. For non-`null` values these functions
behave the same as ordinary `and` and `or` operations.