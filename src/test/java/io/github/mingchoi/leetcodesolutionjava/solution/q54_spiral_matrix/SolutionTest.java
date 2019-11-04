package io.github.mingchoi.leetcodesolutionjava.solution.q54_spiral_matrix;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void spiralOrder() {
        class TestCase {
            public List<Integer> expected;
            public int[][] s;

            public TestCase(List<Integer> ex, int[][] s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), new int[][]{
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }),
                new TestCase(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                })
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().spiralOrder(c.s));
        }
    }
}