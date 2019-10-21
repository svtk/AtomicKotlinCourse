package summaryIIExercise8

import org.junit.Assert
import org.junit.Test
import util.checkParametersOfMemberFunction
import util.loadClass
import util.loadMemberFunction
import util.loadMemberProperty
import java.lang.reflect.InvocationTargetException
import kotlin.reflect.KFunction
import kotlin.reflect.KProperty
import kotlin.reflect.full.createInstance

class TestSummaryIIExercise8 {
  private fun testDictionary(
    test: (
      instance: Any?,
      addTranslationsFunc: KFunction<*>,
      translationsProp: KProperty<*>
    ) -> Unit
  ) {
    val dictionaryClass = loadClass("summaryIIExercise8", "Dictionary")
    val addTranslationsFunc = loadMemberFunction(dictionaryClass, "addTranslations")
      checkParametersOfMemberFunction(addTranslationsFunc, listOf("" to "kotlin.String", "" to "kotlin.String"))
    val translationsProperty = loadMemberProperty(dictionaryClass, "translations")

    val instance = dictionaryClass.createInstance()
    test(instance, addTranslationsFunc, translationsProperty)
  }

  private fun testAddingValues(expected: Map<String, List<String>>) =
    testDictionary { instance, addTranslationsFunc, translationsProp ->
      // cat Katze
      // tree Baum
      // party Party Fest Partei
      // doubt zweifeln bezweifeln anzweifeln

      for ((key, values) in expected) {
        addTranslationsFunc.call(instance, key, values.joinToString(" "))
      }
      val code = buildString {
        for ((key, values) in expected) {
          appendln("addTranslations(\"$key\", \"${values.joinToString(" ")}\")")
        }
      }

      val actual = translationsProp.getter.call(instance)
      Assert.assertEquals("Wrong result after applying\n$code",
        expected, actual)
    }

  @Test
  fun testOneValue() = testAddingValues(mapOf("cat" to listOf("Katze")))

  @Test
  fun testTwoValues() = testAddingValues(mapOf("cat" to listOf("Katze"), "tree" to listOf("Baum")))

  @Test
  fun testManyTranslations() = testAddingValues(mapOf("party" to listOf("Party", "Fest", "Partei")))

  @Test
  fun testRepetitiveValues() {
      testDictionary { instance, addTranslationsFunc, translationsProp ->
          addTranslationsFunc.call(instance, "cat", "Katze")
          try {
              addTranslationsFunc.call(instance, "cat", "Katze")
              throw AssertionError("'addTranslations()' function should throw an exception for repetitive key")
          } catch (e: InvocationTargetException) {
              Assert.assertEquals("Wrong exception message",
                "Dictionary already has translations for 'cat'",
                e.targetException.message)
          }
      }
  }
}