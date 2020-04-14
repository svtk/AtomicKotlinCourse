package localFunctionsExercise3

import atomictest.eq
import kotlin.reflect.KFunction0
import kotlin.reflect.KFunction1

fun createContainer(): Pair<KFunction1<Int, Unit>, KFunction0<Int?>> {
    var i: Int? = null
    fun add(value: Int) {
        i = value
    }
    fun remove(): Int? {
        val result = i
        i = null
        return result
    }
    return Pair(::add, ::remove)
}

fun main() {
    val (add, remove) = createContainer()
    add(42)
    remove() eq 42
    remove() eq null
    add(121)
    remove() eq 121
}