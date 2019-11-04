package io.github.mingchoi.leetcodesolutionjava.solution.q62_unique_paths;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void uniquePaths() {
        class TestCase {
            public int expected;
            public int num1;
            public int num2;

            public TestCase(int ex, int num1, int num2) {
                this.expected = ex;
                this.num1 = num1;
                this.num2 = num2;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(3, 3, 2),
                new TestCase(28, 7, 3),
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().uniquePaths(c.num1, c.num2));
        }
    }
}