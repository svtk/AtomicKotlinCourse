package nonNullAssertionsExercise1

import org.junit.Assert
import org.junit.Test
import util.*
import java.lang.reflect.InvocationTargetException
import kotlin.reflect.full.createInstance

class TestNonNullAssertionsExercise1 {
    @Test fun testRocket() {
        unimplementedTest()
/*
        val rocketClass = Rocket::class
        val rocketInstance = rocketClass.createInstance()
        val ignitionFunc = loadMemberFunction(rocketClass, "ignition")
        checkParametersOfMemberFunction(ignitionFunc, listOf())
        runAndCheckSystemOutput("Wrong output after calling 'rocket.ignition()'", "Liftoff!") {
            ignitionFunc.call(rocketInstance)
        }
        val launchFunc = ::launch
        checkParametersOfTopLevelFunction(launchFunc, listOf("rocket" to "nonNullAssertionsExercise1.Rocket?"))
        runAndCheckSystemOutput("Wrong output after calling 'launch(rocket)'", "Liftoff!") {
            launchFunc.call(rocketInstance)
        }
        try {
            launchFunc.call(null)
            throw AssertionError("Wrong result after calling 'launch(null)', expected NullPointerException")
        } catch (e: InvocationTargetException) {
            Assert.assertEquals("Wrong result after calling 'launch(null)', expected NullPointerException",
              e.targetException::class.simpleName, "NullPointerException")
        }
*/
    }
}