package stringTemplates2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestStringTemplates2 {
    private fun checkRecord(index: Int, status: String, message: String) {
        val record = "$index. [$status] $message\n"
        Assert.assertEquals("""record($index, "$status", "$message") should return $record""",
                record, record(index, status, message))
    }

    @Test fun testRecord1() = checkRecord(1, "OK", "Everything is fine.")

    @Test fun testRecord2() = checkRecord(2, "Fail", "Something has broken.")
}