## Summary 2 (#7)

Create a `BoringHolder2` class that has a constructor argument to set the
maximum number of `Boring` objects that can be held. Add read-only `size` and
`full` properties. If the user calls `add()` when it's `full`, throw an
`IllegalAccessException`. Test `BoringHolder2` using `atomictest`.