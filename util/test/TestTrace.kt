package util

import org.junit.After
import org.junit.Before

open class TestTrace {
  @Before
  fun beforeEach() { resetTraceContent() }

  @After
  fun afterEach() { resetTraceContent() }
}