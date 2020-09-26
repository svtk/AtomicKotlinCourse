## Creating Generics (#3)

Convert `InCrate` and `OutCrate` to interfaces. Create a new version of `Crate`
that implements both `InCrate` and `OutCrate`. The code in `main()` tests your
solution by upcasting from `Crate<Grape>` to `OutCrate<Can>` and from
`Crate<Can>` to `InCrate<Grape>`.