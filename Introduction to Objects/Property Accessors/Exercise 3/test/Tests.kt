package propertyAccessorsExercise3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.KClass
import kotlin.reflect.KVisibility
import kotlin.reflect.full.createInstance

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPropertyAccessorsExercise3 {

    private fun loadMessageStorageClass(): KClass<*> =
      loadClass("propertyAccessorsExercise3", "MessageStorage")

    @Test
    fun test1PrivateProp() {
        val msClass = loadMessageStorageClass()
        val privateMessagesProp = loadMemberProperty(msClass, "_messages")
        Assert.assertTrue("'_messages' property should be private", privateMessagesProp.visibility == KVisibility.PRIVATE)

        Assert.assertEquals("The type of '_messages' should be 'MutableList<String>'",
          privateMessagesProp.returnType.toString(), "kotlin.collections.MutableList<kotlin.String>")
    }

    @Test
    fun test2PublicProp() {
        val msClass = loadMessageStorageClass()
        val publicMessagesProp = loadMemberProperty(msClass, "messages")
        Assert.assertTrue("'messages' property should be public", publicMessagesProp.visibility == KVisibility.PUBLIC)

        Assert.assertEquals("The type of 'messages' should be 'List<String>'",
          publicMessagesProp.returnType.toString(), "kotlin.collections.List<kotlin.String>")
    }

    @Test
    fun test3AddMessage() {
        val msClass = loadMessageStorageClass()
        val addMsgFunction = loadMemberFunction(msClass, "addMessage")
        checkParametersOfMemberFunction(addMsgFunction, listOf("" to "kotlin.String"))

        Assert.assertTrue("'addMessage' function should be public", addMsgFunction.visibility == KVisibility.PUBLIC)
    }

    @Test
    fun test4Access() {
        val msClass = loadMessageStorageClass()
        val instance = msClass.createInstance()

        val addMsgFunction = loadMemberFunction(msClass, "addMessage")
        val publicMessagesProp = loadMemberProperty(msClass, "messages")

        addMsgFunction.call(instance, "first message")
        addMsgFunction.call(instance, "second message")

        val messages = publicMessagesProp.getter.call(instance)

        Assert.assertEquals("Wrong value for 'messages' after adding two messages \"first message\", \"second message\"",
          listOf("first message", "second message"), messages)
    }
}