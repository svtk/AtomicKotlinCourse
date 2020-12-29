// BaseClassInit/Task1.kt
package baseClassInitializationExercise1

open class A(open val s: String)
open class B(override val s: String) : A(s)
class C(override val s: String) : B(s)