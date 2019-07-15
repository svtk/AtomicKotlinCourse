## Member References (#2)

To illustrate different types of member references, we'll consider three
characteristics of natural numbers: whether a number is even, whether it's
prime (doesn't have divisors other than 1 and itself), and whether it's
perfect. The last one means that the sum of all the divisors excluding 
the number equals the number itself. For instance, 6 is the perfect number:
`6 = 1 + 2 + 3`, where 1, 2, 3 are the divisors.

`isEven` is declared as extension property, `isPrime` as extension function
and `isPerfect` as top-level function. Note that we have this inconsistency
only to illustrate different types of member references.

You task is to complete the implementations, and pass the corresponding
property or function reference to different filter invocations in `main`. 
