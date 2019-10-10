## `when` Expressions (#1)

Create a function `getCloudinessDescription()` that returns a description based
on the percentage of cloudiness: "Sunny" (for the cloudiness in a range
81..100), "Mostly Sunny" (61..80), "Partly Sunny" (41..60), "Mostly Cloudy"
(21..40), and "Cloudy" (0..20). If the argument is not in the range 0..100,
throw `IllegalArgumentException`.