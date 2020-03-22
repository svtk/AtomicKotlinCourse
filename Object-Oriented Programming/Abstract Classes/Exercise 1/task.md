## Abstract Classes (#1)

Abstract classes can have parameters and constructors just like ordinary
classes. Create an abstract class `WithParams` with class parameters `val i:
Int` and `var s: String = ""`. Inherit a class `Concrete` from `WithParams`.
Provide constructors for both that use `atomictest.Trace` to show the class
name and arguments. Create an instance of `Concrete` and verify the order of
the constructor calls.