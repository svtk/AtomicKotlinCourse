package `064_Secondary_Constructors`.Exercise1

import org.junit.Assert
import org.junit.Test

class TestGardenItem {
    @Test
    fun test() {
        Assert.assertEquals("GardenItem class should define only one constructor",
                1,
                GardenItem::class.constructors.size)
    }
}