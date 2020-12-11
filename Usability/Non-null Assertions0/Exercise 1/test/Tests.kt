package nonNullAssertionsExercise1

import org.junit.Assert
import org.junit.Test
import util.*
import java.lang.reflect.InvocationTargetException
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

class TestNonNullAssertionsExercise1 {
    @Test fun testRocket() {
        val rocketClass = Rocket::class
        val rocketInstance = rocketClass.createInstance()
        val ignitionFunc = loadMemberFunction(rocketClass, "ignition")
        checkParametersOfMemberFunction(ignitionFunc, listOf())
        assertEquals("Liftoff!", ignitionFunc.call(rocketInstance), "Wrong result after calling 'rocket.ignition()'")
        val launchFunc = ::launch
        checkParametersOfTopLevelFunction(launchFunc, listOf("rocket" to "nonNullAssertionsExercise1.Rocket?"))
        assertEquals("Liftoff!", launchFunc.call(rocketInstance), "Wrong result after calling 'launch(rocket)'")
        try {
            launchFunc.call(null)
            throw AssertionError("Wrong result after calling 'launch(null)', expected NullPointerException")
        } catch (e: InvocationTargetException) {
            Assert.assertEquals("Wrong result after calling 'launch(null)', expected NullPointerException",
              e.targetException::class.simpleName, "NullPointerException")
        }
    }
}