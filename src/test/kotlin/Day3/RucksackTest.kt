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
}
