// ScopeFunctions/Nesting.kt
package scopefunctions
import atomictest.eq

fun nesting(s: String, i: Int): String =
  with(s) {
    with(i) {
      toString()
    }
  } +
  s.let {
    i.let {
      it.toString()
    }
  } +
  s.run {
    i.run {
      toString()
    }
  } +
  s.apply {
    i.apply {
      toString()
    }
  } +
  s.also {
    i.also {
      it.toString()
    }
  }

fun main() {
  nesting("X", 7) eq "777XX"
}