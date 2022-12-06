package Day2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RockPaperScissorsTest {
    private val testRockPaperScissors =  RockPaperScissors()

    @Test
    fun testHowManyPoints(){
        val expected = 15

        val result = testRockPaperScissors.howManyPoints("src/test/kotlin/Day2/test.txt")

        assertEquals(expected, result)
    }

    @Test
    fun testHowManyPoints2(){
        val expected = 12

        val result = testRockPaperScissors.howManyPoints2("src/test/kotlin/Day2/test.txt")

        assertEquals(expected, result)
    }
}
