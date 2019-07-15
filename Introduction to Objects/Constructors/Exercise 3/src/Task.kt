package constructors3

class Human(
        val name: String,
        val age: Int
) {
    override fun toString(): String {
        return "Human(name='$name', age=$age)"
    }
}

fun main(args: Array<String>) {
    val human = Human("Rick", 70)
    println(human)
}
/* Expected output:
Human(name='Rick', age=70)
*/