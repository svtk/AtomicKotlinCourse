package enumerationsExercise3

import enumerationsExercise3.Result.*
import enumerationsExercise3.Rochambeau.*
import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestEnumerationsExercise3 {
  private fun checkResult(first: Rochambeau, second: Rochambeau, expected: Result) {
    Assert.assertEquals("Wrong answer for 'findWinner($first, $second)':",
      expected, findWinner(first, second))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() {
    checkResult(ROCK, SCISSORS, FIRST_WINS)
    checkResult(SCISSORS, ROCK, SECOND_WINS)
    checkResult(PAPER, PAPER, DRAW)
  }

  @Test(timeout = TIMEOUT)
  fun test2FirstWins() {
    checkResult(PAPER, ROCK, FIRST_WINS)
    checkResult(ROCK, SCISSORS, FIRST_WINS)
    checkResult(SCISSORS, PAPER, FIRST_WINS)
  }

  @Test(timeout = TIMEOUT)
  fun test3FirstWins() {
    checkResult(ROCK, PAPER, SECOND_WINS)
    checkResult(SCISSORS, ROCK, SECOND_WINS)
    checkResult(PAPER, SCISSORS, SECOND_WINS)
  }

  @Test(timeout = TIMEOUT)
  fun test4Draw() {
    checkResult(ROCK, ROCK, DRAW)
    checkResult(SCISSORS, SCISSORS, DRAW)
    checkResult(PAPER, PAPER, DRAW)
  }
}