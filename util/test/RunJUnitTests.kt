import org.junit.Test

class RunJUnitTests : AbstractRunJUnitTests() {
  @Test
  fun testIfExpressions2() = testClass(ifExpressionsExercise2.TestIfExpressions2::class)

  @Test
  fun testIfExpressions3() = testClass(ifExpressionsExercise3.TestIfExpressions3::class)
}