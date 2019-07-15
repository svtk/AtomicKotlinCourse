package functionTypes4

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestAndThen {
    private fun <A, B, C> check(
            arg: A,
            f: (A) -> B,
            g: (B) -> C,
            fStr: String,
            gStr: String
    ) {
        Assert.assertEquals("Wrong result for f(g(arg))\n" +
                "arg = $arg\n" +
                "f = $fStr\n" +
                "g = $gStr",
                g(f(arg)),
                f.andThen(g)(arg))
    }

    @Test
    fun test1() = check("123",
            f = { s: String -> s.toInt() },
            g = { i: Int -> i + 1 },
            fStr = "{ s: String -> s.toInt() }",
            gStr = "{ i: Int -> i + 1 }")

    @Test
    fun test2() = check(111,
            f = { i: Int -> i + 1 },
            g = { i: Int -> i.toString() },
            fStr = "{ i: Int -> i + 1 }",
            gStr = "{ i: Int -> i.toString() }")

    @Test
    fun test3() = check(listOf(1, 2, 3),
            f = { l: List<Int> -> l.map { it + 1 } },
            g = { l: List<Int> -> l.joinToString() },
            fStr = "{ l: List<Int> -> l.map { it + 1 } }",
            gStr = "{ l: List<Int> -> l.joinToString() }")

    @Test
    fun test4() = check("ABC",
            f = { s: String -> s.toIntOrNull() },
            g = { i: Int? -> i ?: 0 },
            fStr = "{ s: String -> s.toIntOrNull() }",
            gStr = "{ i: Int? -> i ?: 0 }")
}