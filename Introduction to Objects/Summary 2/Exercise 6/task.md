## Summary 2 (#6)

{{ :UNTESTABLE Don't really understand what solution is expected here.
Adding a new element to a read-only list is an anti-pattern because it
creates a new collection under the hood; don't think it's a good idea to show
such code in exercises. 
The second part about atomictest is untestable without specific values }}

Create a class called `BoringHolder` which has a property `list` of the type
`List<Boring>`. Make the setter for this property `private`. Make the getter
return a copy of the `List`. Include an `add()` member function that appends
its argument to the `List`. Test `BoringHolder` using `atomictest`.