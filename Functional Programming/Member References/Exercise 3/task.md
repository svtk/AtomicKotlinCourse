## Member References (#3)

To illustrate different types of member references, consider three
characteristics of natural numbers: whether a number is even, whether it's prime
(doesn't have divisors other than 1 and itself), and whether it's *perfect*. A
perfect number means that the sum of all the divisors (excluding the number
itself) equals the number. For example, 6 is a perfect number: `6 = 1 + 2 + 3`,
where 1, 2, 3 are the divisors.

`isEven` is an extension property, `isPrime()` is an extension function and
`isPerfect()` is a top-level function. Your task is to complete the
implementations and pass the corresponding property or function reference to
different filter invocations in `main()`.
