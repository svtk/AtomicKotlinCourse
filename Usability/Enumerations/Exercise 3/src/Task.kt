package enumerations3

import atomictest.eq
import enumerations3.Result.*
import enumerations3.Rochambeau.*

enum class Rochambeau {
  ROCK, PAPER, SCISSORS
}

enum class Result {
  DRAW, FIRST_WINS, SECOND_WINS
}

fun findWinner(first: Rochambeau, second: Rochambeau): Result {
  if (first == second) return DRAW
  val winningCombinations = mapOf(
      ROCK to SCISSORS,
      SCISSORS to PAPER,
      PAPER to ROCK)
  if (winningCombinations[first] == second) {
    return FIRST_WINS
  }
  return SECOND_WINS
}

fun main() {
  findWinner(ROCK, SCISSORS) eq FIRST_WINS
  findWinner(SCISSORS, ROCK) eq SECOND_WINS
  findWinner(PAPER, PAPER) eq DRAW
}