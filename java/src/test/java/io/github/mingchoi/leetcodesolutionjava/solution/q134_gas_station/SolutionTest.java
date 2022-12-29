package io.github.mingchoi.leetcodesolutionjava.solution.q134_gas_station;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canCompleteCircuit() {
        class TestCase {
            int ex;
            int[] gas;
            int[] cost;

            public TestCase(int ex, int[] gas, int[] cost) {
                this.ex = ex;
                this.gas = gas;
                this.cost = cost;
            }
        }

        TestCase[] testCases = new TestCase[]{
                new TestCase(3, new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}),
                new TestCase(-1, new int[]{2, 3, 4}, new int[]{3, 4, 3})
        };

        for (TestCase testCase : testCases) {
            assertEquals(testCase.ex, new Solution().canCompleteCircuit(testCase.gas, testCase.cost));
        }
    }
}