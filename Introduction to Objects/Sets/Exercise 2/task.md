## Sets (#2)

Write the function `experiment()` to generate random `Int`s from 1 through 25
and place the results in a `Set`. Count the number of randomly-generated
`Int`s required before the `Set` contains all values 1 through 25. Return this
value as a result of the `experiment()` function. Note the results are
different for each `experiment()` call because they depend on random values.

Use `Random.nextInt(25) + 1` to get a random number from 1 to 25.

`main()` repeats your experiment 1000 times and displays the average result.
