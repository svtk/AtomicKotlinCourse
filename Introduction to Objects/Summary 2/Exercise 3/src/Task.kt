package summaryII.exercise3

import summaryII.exercise2.Boring

fun main() {
  val list = listOf(Boring(), Boring(), Boring())
//  list.add(Boring())
  val mutableList = mutableListOf<Boring>()
  mutableList += Boring()
  mutableList += Boring()
  mutableList += Boring()
}