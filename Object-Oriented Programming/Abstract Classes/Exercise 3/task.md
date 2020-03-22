## Abstract Classes (#3)

Add classes to the previous example: `Bowed` inherits from `Stringed` and uses
`bow` instead of `plucked` in the output, while `Brass` and `Reed` inherit
from `Wind`. `Brass` and `Reed` do not override `play()`. Make the necessary
modifications to allow each class to accept a `String` argument containing the
class name.