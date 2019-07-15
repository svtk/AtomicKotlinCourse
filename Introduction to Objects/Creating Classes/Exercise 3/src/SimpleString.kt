package creatingClasses3

/**
 * The `SimpleString` class is a toy class
 * for representing strings used in AtomicKotlin course.
 */
class SimpleString(private val s: String) {

    /** Returns the `Char` value at the specified [index].
     */
    fun get(index: Int): Char = s[index]

    /**
     * Returns the length of this string.
     */
    fun length() = s.length
}