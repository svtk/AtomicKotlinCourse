## Exception Handling (#3)

The starter code contains a `DataBase` class and associated exceptions, and a
`NetConnection` class and associated exceptions. There's also a `Status`
enumeration to report `Success` and `Failed` as an alternative to exceptions.

Your goal is to complete the `transact()` function, which contains references
to a `DataBase` and two `NetConnection`s. The starter code shows how to open
the `DataBase`.

In the nested function `transfer(net: NetConnection): Status` you must write
code to open `net`, read from it, and write the results to the `DataBase`. You
must also catch exceptions and return `Failed` if any occur. As the last part
of `transfer()`, the `finally` clause closes `net` and handles exceptions from
that. If you successfully make it through `transfer()`, it returns `Success`.

The remainder of `transact()` calls `transfer()` for each of the
`NetConnection` objects, checking the result and returning `Failed` from
`transact()` if `transfer()` returns `Failed`. Lastly, a `finally` clause
attempts to close the `DataBase` object.

Many of the member functions for `DataBase` and `NetConnection` take parameters
of `id: Int` and `level: Int`. The `id` is a different number for each
different call, and `transact()` takes a `level` parameter that is passed to
each call. In the member function definitions you'll see that the `id` is
compared to `level` to decide whether to throw an exception. This way, all the
different exception possibilities are tested one at a time, by passing
different values of `level` in `main()`'s starter code.

You must consider whether an operation throws an exception, *and* if you can do
anything to recover from that exception. For example, if opening the database
fails inside `transact()`, we haven't lost any data, so we can just `return
Failed` and the program can try again. But if closing the database fails, it
means we don't know the state of the database and should probably throw the
exception rather than returning `Failed`. In contrast, a failure when closing a
network connection isn't particularly problematic.

Again, notice how rapidly things get complicated when attempting to recover
from all possible failures.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
