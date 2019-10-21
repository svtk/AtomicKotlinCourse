package setsExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.runAndGetSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSetsExercise2 {
  @Test
  fun test1Experiment() {
    Assert.assertTrue("The 'experiment' function should return a positive number", experiment() > 0)
  }

  @Test
  fun test2Main() {
    val output = runAndGetSystemOutput {
      main()
    }.trim()
    val value = output.toDoubleOrNull()
    Assert.assertTrue("The 'main' function should print an double value. Was: $output", value != null)
    Assert.assertTrue("Expected the average result of the experiment", value!! in 80.0..110.0)
  }
}