package dataTypes1

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Tests {
  @Test(timeout = TIMEOUT)
  fun checkOutput() {
    val byteArrayOutputStream = ByteArrayOutputStream()
    System.setOut(PrintStream(byteArrayOutputStream))
    main()

    val output = byteArrayOutputStream.toString().trim()
    Assert.assertTrue("The first line of the error the compiler produces is expected",
        output.isNotEmpty())
  }

  @Test(timeout = TIMEOUT)
  fun checkTypeMismatch() {
    val byteArrayOutputStream = ByteArrayOutputStream()
    System.setOut(PrintStream(byteArrayOutputStream))
    main()

    val output = byteArrayOutputStream.toString().toLowerCase()
    Assert.assertTrue("The first line of the error the compiler produces is expected: Type mismatch",
        output.contains("type")
            && output.contains("mismatch"))
  }
}