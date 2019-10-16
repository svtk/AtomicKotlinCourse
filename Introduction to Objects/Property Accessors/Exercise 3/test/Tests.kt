package propertyAccessorsExercise3

import org.junit.Assert
import org.junit.Test
import util.loadClass
import util.loadMemberFunction
import util.loadMemberProperty
import util.runAndCheckSystemOutput
import kotlin.reflect.KClass
import kotlin.reflect.KVisibility
import kotlin.reflect.full.createInstance

class TestPropertyAccessors3 {

    private fun loadGSClass(): KClass<*> =
      loadClass("propertyAccessorsExercise3", "GS")

    @Test
    fun test1Private() {
        val gsClass = loadGSClass()
        val iProp = loadMemberProperty(gsClass, "i")
        Assert.assertTrue("i property should be private", iProp.visibility == KVisibility.PRIVATE)
    }

    @Test
    fun test2ToString() {
        val gsClass = loadGSClass()
        val instance = gsClass.createInstance()
        Assert.assertEquals("'toString' should return the value of 'i'", "0", instance.toString())
    }

    @Test
    fun test3Change() {
        val gsClass = loadGSClass()
        val change = loadMemberFunction(gsClass, "change")
        val instance = gsClass.createInstance()
        change.call(instance, 11)
        Assert.assertEquals("'change(11)' should set the 'i' value to 11", "11", instance.toString())
    }

    @Test
    fun test3Main() {
        runAndCheckSystemOutput("Wrong expected output",
          "set(2)\n" +
            "get()\n" +
            "2") {
            main()
        }
    }
}