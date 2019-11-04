package io.github.mingchoi.leetcodesolutionjava.solution.q122_best_time_to_buy_and_sell_stock_ii;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProfit() {
        class TestCase {
            public int expected;
            public int[] a;

            public TestCase(int ex, int[] a) {
                this.expected = ex;
                this.a = a;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(7, new int[]{7, 1, 5, 3, 6, 4}),
                new TestCase(4, new int[]{1, 2, 3, 4, 5}),
                new TestCase(0, new int[]{7, 6, 4, 3, 1}),
                new TestCase(7, new int[]{7, 1, 5, 3, 6, 4}),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().maxProfit(c.a));
        }
    }
}