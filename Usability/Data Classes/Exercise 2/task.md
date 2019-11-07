## Data Classes (#2)

Create an extension function `transferTicket` that copies an `AirlineTicket`
object, replacing `firstName` and `lastName` with the new values during the copy:

```
fun AirlineTicket.transferTicket(
  otherFirstName: String, 
  otherLastName: String
): AirlineTicket
```