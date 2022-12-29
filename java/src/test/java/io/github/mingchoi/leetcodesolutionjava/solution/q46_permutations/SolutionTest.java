package io.github.mingchoi.leetcodesolutionjava.solution.q46_permutations;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void permute() {
        class TestCase {
            public List<List<Integer>> expected;
            public int[] s;

            public TestCase(List<List<Integer>> ex, int[] s) {
                this.expected = ex;
                this.s = s;
            }
        }

        TestCase[] cases = new TestCase[]{
                new TestCase(Arrays.asList(
                        Arrays.asList(1, 2),
                        Arrays.asList(2, 1)
                ), new int[]{1, 2}),
                new TestCase(Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(1, 3, 2),
                        Arrays.asList(2, 1, 3),
                        Arrays.asList(2, 3, 1),
                        Arrays.asList(3, 1, 2),
                        Arrays.asList(3, 2, 1)
                ), new int[]{1, 2, 3})
        };

        for (TestCase c : cases) {
            assertEquals(c.expected, new Solution().permute(c.s));
        }
    }
}