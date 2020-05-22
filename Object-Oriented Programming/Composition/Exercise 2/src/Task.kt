package compositionExercise2
import atomictest.*

class Stack<E> {
  private val list = mutableListOf<E>()

  fun push(e: E) {
    list += e
  }

  fun pop(): E = list.removeAt(list.lastIndex)
}

class Queue<E> {
  private val list = mutableListOf<E>()

  fun add(e: E) {
    list += e
  }

  fun poll(): E = list.removeAt(0)
}

fun main() {
  val stack = Stack<Int>()
  stack.push(1)
  stack.push(2)
  stack.push(3)
  stack.push(4)
  stack.pop() eq 4
  stack.pop() eq 3

  // shouldn't be available:
//  stack[0] eq 1

  val queue = Queue<String>()
  queue.add("a")
  queue.add("b")
  queue.add("c")
  queue.add("d")
  queue.poll() eq "a"
  queue.poll() eq "b"

  // shouldn't be available:
//  queue.add(2, "???")
//  queue[2] eq "???"
}