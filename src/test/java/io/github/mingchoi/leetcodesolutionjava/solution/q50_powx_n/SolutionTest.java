package io.github.mingchoi.leetcodesolutionjava.solution.q50_powx_n;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void myPow() {
        class TestCase {
            public double expected;
            public double num1;
            public int num2;

            public TestCase(double ex, double num1, int num2) {
                this.expected = ex;
                this.num1 = num1;
                this.num2 = num2;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(1024.00000, 2.00000, 10),
                new TestCase(9.26100, 2.10000, 3),
                new TestCase(1.00000, 9.00000, 0),
                new TestCase(0, 2.00000, -2147483648),
                new TestCase(1, 1.00000, -2147483648),
                new TestCase(1, -1.00000, -2147483648),
                new TestCase(-1, -1.00000, 2147483647)
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().myPow(c.num1, c.num2), 0.000009);
        }
    }
}