package sets1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestGroceryCart {
    private fun checkPercentage(
            percentage: Double,
            groceryCart: Set<String>,
            percentFunction: (Set<String>) -> Double,
            functionName: String
    ) {
        Assert.assertEquals("$functionName is wrong for $groceryCart", percentage, percentFunction(groceryCart), 0.000000001)
    }

    private fun checkMeatPercentage(percentage: Double, groceryCart: Set<String>) {
        checkPercentage(percentage, groceryCart, ::percentMeat, "percentMeat")
    }

    private fun checkFruitPercentage(percentage: Double, groceryCart: Set<String>) {
        checkPercentage(percentage, groceryCart, ::percentFruit, "percentFruit")
    }

    private fun checkVeggiesPercentage(percentage: Double, groceryCart: Set<String>) {
        checkPercentage(percentage, groceryCart, ::percentVeggies, "percentVeggies")
    }

    private fun checkOtherPercentage(percentage: Double, groceryCart: Set<String>) {
        checkPercentage(percentage, groceryCart, ::percentOther, "percentOther")
    }

    @Test
    fun test1Sample() {
        val groceryCart = setOf("apple", "pretzels", "bread", "orange", "beef",
                "beans", "asparagus", "sweet potatoes", "spinach", "carrots")

        checkMeatPercentage(10.0, groceryCart)
        checkFruitPercentage(20.0, groceryCart)
        checkVeggiesPercentage(50.0, groceryCart)
        checkOtherPercentage(20.0, groceryCart)
    }

    @Test
    fun test2Trivial() {
        val groceryCart = setOf("beef", "apple", "beans", "vodka")

        checkMeatPercentage(25.0, groceryCart)
        checkFruitPercentage(25.0, groceryCart)
        checkVeggiesPercentage(25.0, groceryCart)
        checkOtherPercentage(25.0, groceryCart)
    }

    @Test
    fun test3Another() {
        val groceryCart = setOf("apple", "orange", "kiwi",
                "sweet potatoes", "asparagus", "spinach", "buckwheat", "condensed milk")
        checkMeatPercentage(0.0, groceryCart)
        checkFruitPercentage(37.5, groceryCart)
        checkVeggiesPercentage(37.5, groceryCart)
        checkOtherPercentage(25.0, groceryCart)
    }
}