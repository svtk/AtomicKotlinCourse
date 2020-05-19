## Polymorphism (#2)

The starter code contains two classes: `Frog` extends `Animal`. `Animal`
defines two member functions `talk` and `jump`, and `Frog` overrides them.
All the functions record the corresponding information in `trace`. 
Note that our animal always talks right after it jumps.

`main` creates `Frog`, stores it as `Animal` and calls `jump` on it.
Your task is to guess what will be stored in `trace` after this program runs.