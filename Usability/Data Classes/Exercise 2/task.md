## Data Classes (#2)

Create an extension function called `transferTicket()` that copies an
`AirlineTicket` object, replacing `firstName` and `lastName` with the new
values during the copy:

```kotlin
fun AirlineTicket.transferTicket(
  otherFirstName: String,
  otherLastName: String
): AirlineTicket
```
