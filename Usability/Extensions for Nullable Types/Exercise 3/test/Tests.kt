package extensionsForNullableTypesExercise3

import org.junit.Assert
import org.junit.Test
import util.*

class TestExtensionsForNullableTypesExercise3 {
    private fun testContainer(contents: Any?, contentsString: String) {
        val containerClass = Container::class
        val containerInstance = Container(contents)

        val fileFacade = loadFileFacade("extensionsForNullableTypesExercise3")

        val emptyFunc = loadToplevelFunction(fileFacade, "empty")
        checkFunctionIsExtension(emptyFunc, containerClass)
        val actualEmpty = emptyFunc.invoke(Object(), containerInstance)
        Assert.assertEquals("Wrong result for calling 'Container($contentsString).empty()'",
          contents == null, actualEmpty)
        val nullEmpty = emptyFunc.invoke(Object(), null)
        Assert.assertEquals("Wrong result for calling 'container.empty()' if container reference is 'null'",
          true, nullEmpty)

        val fullFunc = loadToplevelFunction(fileFacade, "full")
        checkFunctionIsExtension(fullFunc, containerClass)
        val actualFull = fullFunc.invoke(Object(), containerInstance)
        Assert.assertEquals("Wrong result for calling 'Container($contentsString).full()'",
          contents != null, actualFull)

        val nullFull = emptyFunc.invoke(Object(), null)
        Assert.assertEquals("Wrong result for calling 'container.full()' if container reference is 'null'",
          true, nullFull)
    }

    @Test
    fun test1() = testContainer(null, "null")

    @Test
    fun test2() = testContainer(123, "123")

    @Test
    fun test3() = testContainer("abc", "\"abc\"")
}