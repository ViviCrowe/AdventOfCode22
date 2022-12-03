package Day1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CaloriesTest {
    private val testCalories: Calories = Calories()

    @Test
    fun testMostCalories() {
        val expected = 24000

        val result = testCalories.findMostCalories("src/test/kotlin/Day1/test.txt")

        assertEquals(expected, result)
    }

    @Test
    fun testThirdMostCaloriesTotal() {
        val expected = 45000

        val result = testCalories.findThirdMostCaloriesTotal("src/test/kotlin/Day1/test.txt")

        assertEquals(expected, result)
    }
}