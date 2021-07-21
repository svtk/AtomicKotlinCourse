// FoldingLists/ReduceAndReduceRight.kt
import atomictest.eq

fun main() {
  val chars = "A B C D E".split(" ")
  chars.fold("*") { acc, e -> "$acc $e" } eq
    "* A B C D E"
  chars
    .foldRight("*") { e, acc -> "$acc $e" } eq
    "* E D C B A"
  chars.reduce { acc, e -> "$acc $e" } eq
    "A B C D E"
  chars.reduceRight { e, acc -> "$acc $e" } eq
    "E D C B A"
}