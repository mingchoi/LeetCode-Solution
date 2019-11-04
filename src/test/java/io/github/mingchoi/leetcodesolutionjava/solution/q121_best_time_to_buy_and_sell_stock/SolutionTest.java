package io.github.mingchoi.leetcodesolutionjava.solution.q121_best_time_to_buy_and_sell_stock;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProfit() {
        class TestCase {
            public int expected;
            public int[] s;

            public TestCase(int ex, int[] s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(5, new int[]{7, 1, 5, 3, 6, 4}),
                new TestCase(0, new int[]{7, 6, 4, 3, 1}),
                new TestCase(1, new int[]{1, 2}),
                new TestCase(10, new int[]{1, 2, 11, 4, 7}),
                new TestCase(2, new int[]{2, 4, 1})
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().maxProfit(c.s));
        }
    }
}