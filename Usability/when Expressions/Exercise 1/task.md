## `when` Expressions (#1)

Create a method `getCloudinessDescription` providing the description based 
on the percentage of cloudiness:

* "Sunny" (for the cloudiness in a range 81..100),
* "Mostly Sunny" (61..80), 
* "Partly Sunny" (41..60),
* "Mostly Cloudy" (21..40),
* and "Cloudy" (0..20).

For the argument not in a range `0..100` the function should throw `IllegalArgumentException`.