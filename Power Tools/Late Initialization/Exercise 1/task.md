## Late Initialization (#1)

Start with an empty `PowerPlant` interface, and from that create classes
`ElectricMotor` and `CombustionEngine`. Create a `Vehicle` class containing
a `lateinit` property `powerPlant`.

Create a `lateinit` `car` at file scope, and a `lateinit` `truck` inside
`main()`. Initialize `car` inside `main()`, giving it an electric motor,
then initialize `truck`, giving it a combustion engine.