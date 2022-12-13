package Day4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CleanupTest {
    private val testCleanup = Cleanup()


    @Test
    fun testFindPairs() {
        val expected = 2

        val result = testCleanup.findPairs("src/test/kotlin/Day4/test.txt")

        assertEquals(expected, result)
    }

    @Test
    fun testFindOverlaps() {
        val expected = 4

        val result = testCleanup.findOverlaps("src/test/kotlin/Day4/test.txt")

        assertEquals(expected, result)
    }
}
