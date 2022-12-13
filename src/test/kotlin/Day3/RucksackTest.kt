package Day3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RucksackTest {
    private val testRucksack = Rucksack()

    @Test
    fun testGetPriority(){
        val expected = 157

        val result = testRucksack.getPriority("src/test/kotlin/Day3/test.txt")

        assertEquals(expected, result)
    }

    @Test
    fun testGetPriority2(){
        val expected = 70

        val result = testRucksack.getPriority2("src/test/kotlin/Day3/test.txt")

        assertEquals(expected, result)
    }
}
