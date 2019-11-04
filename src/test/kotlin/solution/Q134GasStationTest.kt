package solution

import org.junit.Test

import org.junit.Assert.*
import kotlin.math.exp

class Q134GasStationTest {

    data class TestCase(
        val gas: IntArray,
        val cost: IntArray,
        val expected: Int
    )

    @Test
    fun TestCanCompleteCircuit() {
        val testCases = listOf(
            TestCase(
                intArrayOf(1, 2, 3, 4, 5),
                intArrayOf(3, 4, 5, 1, 2),
                3
            ),
            TestCase(
                intArrayOf(2, 3, 4),
                intArrayOf(3, 4, 3),
                -1
            ),
            TestCase(
                intArrayOf(1, 2, 3, 4, 5, 5, 70),
                intArrayOf(2, 3, 4, 3, 9, 6, 2),
                6
            )
        )

        testCases.forEach {
            assertEquals(it.expected, Q14GasStation().canCompleteCircuit(it.gas, it.cost))
        }
    }
}