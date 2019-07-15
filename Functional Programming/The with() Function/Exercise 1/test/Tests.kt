package thewithFunction1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.text.buildString as buildStringLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBuildStringViaWith {
    private fun check(
            message: String,
            action: StringBuilder.() -> Unit
    ) {
        Assert.assertEquals(message,
                buildStringLibrary(action),
                buildString(action))

    }

    @Test
    fun test1Sample() = check("Wrong result for sample") {
        append("Alphabet: ")
        for (ch in 'a'..'z') {
            append(ch)
        }
    }

    @Test
    fun test2() = check("""Wrong result for 'buildString { append("hi!") }'""") {
        append("hi!")
    }
}