// FoldingLists/ReduceAndReduceRight.kt
import atomictest.eq

fun main() {
  val chars = "A B C D E F G H I".split(" ")
  chars.fold("X") { a, e -> "$a $e"} eq
    "X A B C D E F G H I"
  chars.foldRight("X") { e, a -> "$a $e" } eq
    "X I H G F E D C B A"
  chars.reduce { a, e -> "$a $e" } eq
    "A B C D E F G H I"
  chars.reduceRight { e, a -> "$a $e" } eq
    "I H G F E D C B A"
}